/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package addresstype

import adventureworks.Defaulted
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToSql
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime
import java.util.UUID

object AddresstypeRepoImpl extends AddresstypeRepo {
  override def delete(addresstypeid: AddresstypeId)(implicit c: Connection): Boolean = {
    SQL"delete from person.addresstype where addresstypeid = $addresstypeid".executeUpdate() > 0
  }
  override def insert(unsaved: AddresstypeRowUnsaved)(implicit c: Connection): AddresstypeId = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name))),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into person.addresstype(${namedParameters.map(_.name).mkString(", ")})
          values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
          returning addresstypeid
       """
      .on(namedParameters :_*)
      .executeInsert(idRowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[AddresstypeRow] = {
    SQL"""select addresstypeid, name, rowguid, modifieddate
          from person.addresstype
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[AddresstypeFieldOrIdValue[_]])(implicit c: Connection): List[AddresstypeRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case AddresstypeFieldValue.addresstypeid(value) => NamedParameter("addresstypeid", ParameterValue.from(value))
          case AddresstypeFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case AddresstypeFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case AddresstypeFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from person.addresstype
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(addresstypeid: AddresstypeId)(implicit c: Connection): Option[AddresstypeRow] = {
    SQL"""select addresstypeid, name, rowguid, modifieddate
          from person.addresstype
          where addresstypeid = $addresstypeid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(addresstypeids: Array[AddresstypeId])(implicit c: Connection): List[AddresstypeRow] = {
    implicit val arrayToSql: ToSql[Array[AddresstypeId]] = _ => ("?", 1) // fix wrong instance from anorm
    implicit val toStatement: ToStatement[Array[AddresstypeId]] =
      (s: PreparedStatement, index: Int, v: Array[AddresstypeId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select addresstypeid, name, rowguid, modifieddate
          from person.addresstype
          where addresstypeid = ANY($addresstypeids)
       """.as(rowParser.*)
  
  }
  override def update(row: AddresstypeRow)(implicit c: Connection): Boolean = {
    val addresstypeid = row.addresstypeid
    SQL"""update person.addresstype
          set name = ${row.name},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where addresstypeid = $addresstypeid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(addresstypeid: AddresstypeId, fieldValues: List[AddresstypeFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case AddresstypeFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case AddresstypeFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case AddresstypeFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update person.addresstype
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where addresstypeid = $addresstypeid
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[AddresstypeRow] =
    RowParser[AddresstypeRow] { row =>
      Success(
        AddresstypeRow(
          addresstypeid = row[AddresstypeId]("addresstypeid"),
          name = row[Name]("name"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[AddresstypeId] =
    SqlParser.get[AddresstypeId]("addresstypeid")
}
