/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodel

import adventureworks.Defaulted
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToSql
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime
import java.util.UUID
import org.postgresql.jdbc.PgSQLXML

object ProductmodelRepoImpl extends ProductmodelRepo {
  override def delete(productmodelid: ProductmodelId)(implicit c: Connection): Boolean = {
    SQL"delete from production.productmodel where productmodelid = $productmodelid".executeUpdate() > 0
  }
  override def insert(unsaved: ProductmodelRowUnsaved)(implicit c: Connection): ProductmodelRow = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name))),
      Some(NamedParameter("catalogdescription", ParameterValue.from(unsaved.catalogdescription))),
      Some(NamedParameter("instructions", ParameterValue.from(unsaved.instructions))),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productmodel default values
            returning productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into production.productmodel(${namedParameters.map(x => "\"" + x.name + "\"").mkString(", ")})
                  values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
                  returning productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[ProductmodelRow] = {
    SQL"""select productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
          from production.productmodel
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ProductmodelFieldOrIdValue[_]])(implicit c: Connection): List[ProductmodelRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductmodelFieldValue.productmodelid(value) => NamedParameter("productmodelid", ParameterValue.from(value))
          case ProductmodelFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case ProductmodelFieldValue.catalogdescription(value) => NamedParameter("catalogdescription", ParameterValue.from(value))
          case ProductmodelFieldValue.instructions(value) => NamedParameter("instructions", ParameterValue.from(value))
          case ProductmodelFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case ProductmodelFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
                    from production.productmodel
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(productmodelid: ProductmodelId)(implicit c: Connection): Option[ProductmodelRow] = {
    SQL"""select productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
          from production.productmodel
          where productmodelid = $productmodelid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(productmodelids: Array[ProductmodelId])(implicit c: Connection): List[ProductmodelRow] = {
    implicit val arrayToSql: ToSql[Array[ProductmodelId]] = _ => ("?", 1) // fix wrong instance from anorm
    implicit val toStatement: ToStatement[Array[ProductmodelId]] =
      (s: PreparedStatement, index: Int, v: Array[ProductmodelId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select productmodelid, "name", catalogdescription, instructions, rowguid, modifieddate
          from production.productmodel
          where productmodelid = ANY($productmodelids)
       """.as(rowParser.*)
  
  }
  override def update(row: ProductmodelRow)(implicit c: Connection): Boolean = {
    val productmodelid = row.productmodelid
    SQL"""update production.productmodel
          set "name" = ${row.name},
              catalogdescription = ${row.catalogdescription},
              instructions = ${row.instructions},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where productmodelid = $productmodelid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(productmodelid: ProductmodelId, fieldValues: List[ProductmodelFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductmodelFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case ProductmodelFieldValue.catalogdescription(value) => NamedParameter("catalogdescription", ParameterValue.from(value))
          case ProductmodelFieldValue.instructions(value) => NamedParameter("instructions", ParameterValue.from(value))
          case ProductmodelFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case ProductmodelFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.productmodel
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where productmodelid = {productmodelid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("productmodelid", ParameterValue.from(productmodelid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[ProductmodelRow] =
    RowParser[ProductmodelRow] { row =>
      Success(
        ProductmodelRow(
          productmodelid = row[ProductmodelId]("productmodelid"),
          name = row[Name]("name"),
          catalogdescription = row[Option[PgSQLXML]]("catalogdescription"),
          instructions = row[Option[PgSQLXML]]("instructions"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
