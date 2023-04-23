/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salespersonquotahistory

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object SalespersonquotahistoryRepoImpl extends SalespersonquotahistoryRepo {
  override def delete(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.salespersonquotahistory where businessentityid = ${compositeId.businessentityid} AND quotadate = ${compositeId.quotadate}".executeUpdate() > 0
  }
  override def insert(compositeId: SalespersonquotahistoryId, unsaved: SalespersonquotahistoryRowUnsaved)(implicit c: Connection): SalespersonquotahistoryRow = {
    val namedParameters = List(
      Some((NamedParameter("salesquota", ParameterValue.from(unsaved.salesquota)), "::numeric")),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val q = s"""insert into sales.salespersonquotahistory(businessentityid, quotadate, ${namedParameters.map(x => "\"" + x._1.name + "\"").mkString(", ")})
                values ({businessentityid}::int4, {quotadate}::timestamp, ${namedParameters.map{case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                returning businessentityid, quotadate, salesquota, rowguid, modifieddate
             """
    // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
    import anorm._
    SQL(q)
      .on(namedParameters.map(_._1) :_*)
      .on(NamedParameter("businessentityid", ParameterValue.from(compositeId.businessentityid)), NamedParameter("quotadate", ParameterValue.from(compositeId.quotadate)))
      .executeInsert(rowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[SalespersonquotahistoryRow] = {
    SQL"""select businessentityid, quotadate, salesquota, rowguid, modifieddate
          from sales.salespersonquotahistory
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[SalespersonquotahistoryFieldOrIdValue[_]])(implicit c: Connection): List[SalespersonquotahistoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonquotahistoryFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.quotadate(value) => NamedParameter("quotadate", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select businessentityid, quotadate, salesquota, rowguid, modifieddate
                    from sales.salespersonquotahistory
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Option[SalespersonquotahistoryRow] = {
    SQL"""select businessentityid, quotadate, salesquota, rowguid, modifieddate
          from sales.salespersonquotahistory
          where businessentityid = ${compositeId.businessentityid} AND quotadate = ${compositeId.quotadate}
       """.as(rowParser.singleOpt)
  }
  override def update(row: SalespersonquotahistoryRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update sales.salespersonquotahistory
          set salesquota = ${row.salesquota}::numeric,
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = ${compositeId.businessentityid} AND quotadate = ${compositeId.quotadate}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: SalespersonquotahistoryId, fieldValues: List[SalespersonquotahistoryFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonquotahistoryFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.salespersonquotahistory
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where businessentityid = {businessentityid} AND quotadate = {quotadate}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("businessentityid", ParameterValue.from(compositeId.businessentityid)), NamedParameter("quotadate", ParameterValue.from(compositeId.quotadate)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[SalespersonquotahistoryRow] =
    RowParser[SalespersonquotahistoryRow] { row =>
      Success(
        SalespersonquotahistoryRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          quotadate = row[LocalDateTime]("quotadate"),
          salesquota = row[BigDecimal]("salesquota"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
