/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesperson

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime
import java.util.UUID

object SalespersonRepoImpl extends SalespersonRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.salesperson where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def insert(unsaved: SalespersonRow)(implicit c: Connection): SalespersonRow = {
    SQL"""insert into sales.salesperson(businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate)
          values (${unsaved.businessentityid}::int4, ${unsaved.territoryid}::int4, ${unsaved.salesquota}::numeric, ${unsaved.bonus}::numeric, ${unsaved.commissionpct}::numeric, ${unsaved.salesytd}::numeric, ${unsaved.saleslastyear}::numeric, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
       """
      .executeInsert(rowParser.single)
  
  }
  override def insert(unsaved: SalespersonRowUnsaved)(implicit c: Connection): SalespersonRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue.from(unsaved.businessentityid)), "::int4")),
      Some((NamedParameter("territoryid", ParameterValue.from(unsaved.territoryid)), "::int4")),
      Some((NamedParameter("salesquota", ParameterValue.from(unsaved.salesquota)), "::numeric")),
      unsaved.bonus match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("bonus", ParameterValue.from[BigDecimal](value)), "::numeric"))
      },
      unsaved.commissionpct match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("commissionpct", ParameterValue.from[BigDecimal](value)), "::numeric"))
      },
      unsaved.salesytd match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("salesytd", ParameterValue.from[BigDecimal](value)), "::numeric"))
      },
      unsaved.saleslastyear match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("saleslastyear", ParameterValue.from[BigDecimal](value)), "::numeric"))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into sales.salesperson default values
            returning businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into sales.salesperson(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[SalespersonRow] = {
    SQL"""select businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
          from sales.salesperson
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[SalespersonFieldOrIdValue[_]])(implicit c: Connection): List[SalespersonRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case SalespersonFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalespersonFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonFieldValue.bonus(value) => NamedParameter("bonus", ParameterValue.from(value))
          case SalespersonFieldValue.commissionpct(value) => NamedParameter("commissionpct", ParameterValue.from(value))
          case SalespersonFieldValue.salesytd(value) => NamedParameter("salesytd", ParameterValue.from(value))
          case SalespersonFieldValue.saleslastyear(value) => NamedParameter("saleslastyear", ParameterValue.from(value))
          case SalespersonFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
                    from sales.salesperson
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[SalespersonRow] = {
    SQL"""select businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
          from sales.salesperson
          where businessentityid = $businessentityid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[SalespersonRow] = {
    implicit val toStatement: ToStatement[Array[BusinessentityId]] =
      (s: PreparedStatement, index: Int, v: Array[BusinessentityId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate
          from sales.salesperson
          where businessentityid = ANY($businessentityids)
       """.as(rowParser.*)
  
  }
  override def update(row: SalespersonRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update sales.salesperson
          set territoryid = ${row.territoryid}::int4,
              salesquota = ${row.salesquota}::numeric,
              bonus = ${row.bonus}::numeric,
              commissionpct = ${row.commissionpct}::numeric,
              salesytd = ${row.salesytd}::numeric,
              saleslastyear = ${row.saleslastyear}::numeric,
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = $businessentityid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(businessentityid: BusinessentityId, fieldValues: List[SalespersonFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalespersonFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonFieldValue.bonus(value) => NamedParameter("bonus", ParameterValue.from(value))
          case SalespersonFieldValue.commissionpct(value) => NamedParameter("commissionpct", ParameterValue.from(value))
          case SalespersonFieldValue.salesytd(value) => NamedParameter("salesytd", ParameterValue.from(value))
          case SalespersonFieldValue.saleslastyear(value) => NamedParameter("saleslastyear", ParameterValue.from(value))
          case SalespersonFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update sales.salesperson
                    set ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where businessentityid = {businessentityid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("businessentityid", ParameterValue.from(businessentityid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[SalespersonRow] =
    RowParser[SalespersonRow] { row =>
      Success(
        SalespersonRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          territoryid = row[Option[SalesterritoryId]]("territoryid"),
          salesquota = row[Option[BigDecimal]]("salesquota"),
          bonus = row[BigDecimal]("bonus"),
          commissionpct = row[BigDecimal]("commissionpct"),
          salesytd = row[BigDecimal]("salesytd"),
          saleslastyear = row[BigDecimal]("saleslastyear"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
