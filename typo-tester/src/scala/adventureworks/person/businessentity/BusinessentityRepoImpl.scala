/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentity

import adventureworks.Defaulted
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

object BusinessentityRepoImpl extends BusinessentityRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from person.businessentity where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def insert(unsaved: BusinessentityRowUnsaved)(implicit c: Connection): BusinessentityRow = {
    val namedParameters = List(
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    
    if (namedParameters.isEmpty) {
      SQL"""insert into person.businessentity default values
            returning businessentityid, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into person.businessentity(${namedParameters.map{case (x, _) => "\"" + x.name + "\""}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[BusinessentityFieldOrIdValue[_]])(implicit c: Connection): List[BusinessentityRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentityFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case BusinessentityFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentityFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select businessentityid, rowguid, modifieddate
                    from person.businessentity
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
          where businessentityid = $businessentityid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[BusinessentityRow] = {
    implicit val toStatement: ToStatement[Array[BusinessentityId]] =
      (s: PreparedStatement, index: Int, v: Array[BusinessentityId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
          where businessentityid = ANY($businessentityids)
       """.as(rowParser.*)
  
  }
  override def update(row: BusinessentityRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update person.businessentity
          set rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = $businessentityid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(businessentityid: BusinessentityId, fieldValues: List[BusinessentityFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentityFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentityFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update person.businessentity
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
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
  val rowParser: RowParser[BusinessentityRow] =
    RowParser[BusinessentityRow] { row =>
      Success(
        BusinessentityRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
