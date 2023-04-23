/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

import adventureworks.Defaulted
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToSql
import anorm.ToStatement
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime

object UnitmeasureRepoImpl extends UnitmeasureRepo {
  override def delete(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Boolean = {
    SQL"delete from production.unitmeasure where unitmeasurecode = $unitmeasurecode".executeUpdate() > 0
  }
  override def insert(unitmeasurecode: UnitmeasureId, unsaved: UnitmeasureRowUnsaved)(implicit c: Connection): UnitmeasureRow = {
    val namedParameters = List(
      Some((NamedParameter("name", ParameterValue.from(unsaved.name)), """::"public"."Name"""")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val q = s"""insert into production.unitmeasure(unitmeasurecode, ${namedParameters.map(x => "\"" + x._1.name + "\"").mkString(", ")})
                values ({unitmeasurecode}::bpchar, ${namedParameters.map{case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                returning unitmeasurecode, "name", modifieddate
             """
    // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
    import anorm._
    SQL(q)
      .on(namedParameters.map(_._1) :_*)
      .on(NamedParameter("unitmeasurecode", ParameterValue.from(unitmeasurecode)))
      .executeInsert(rowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[UnitmeasureRow] = {
    SQL"""select unitmeasurecode, "name", modifieddate
          from production.unitmeasure
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[UnitmeasureFieldOrIdValue[_]])(implicit c: Connection): List[UnitmeasureRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UnitmeasureFieldValue.unitmeasurecode(value) => NamedParameter("unitmeasurecode", ParameterValue.from(value))
          case UnitmeasureFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case UnitmeasureFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select unitmeasurecode, "name", modifieddate
                    from production.unitmeasure
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Option[UnitmeasureRow] = {
    SQL"""select unitmeasurecode, "name", modifieddate
          from production.unitmeasure
          where unitmeasurecode = $unitmeasurecode
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(unitmeasurecodes: Array[UnitmeasureId])(implicit c: Connection): List[UnitmeasureRow] = {
    implicit val arrayToSql: ToSql[Array[UnitmeasureId]] = _ => ("?", 1) // fix wrong instance from anorm
    implicit val toStatement: ToStatement[Array[UnitmeasureId]] =
      (s: PreparedStatement, index: Int, v: Array[UnitmeasureId]) =>
        s.setArray(index, s.getConnection.createArrayOf("bpchar", v.map(x => x.value)))
    
    SQL"""select unitmeasurecode, "name", modifieddate
          from production.unitmeasure
          where unitmeasurecode = ANY($unitmeasurecodes)
       """.as(rowParser.*)
  
  }
  override def update(row: UnitmeasureRow)(implicit c: Connection): Boolean = {
    val unitmeasurecode = row.unitmeasurecode
    SQL"""update production.unitmeasure
          set "name" = ${row.name},
              modifieddate = ${row.modifieddate}
          where unitmeasurecode = $unitmeasurecode
       """.executeUpdate() > 0
  }
  override def updateFieldValues(unitmeasurecode: UnitmeasureId, fieldValues: List[UnitmeasureFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UnitmeasureFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case UnitmeasureFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.unitmeasure
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where unitmeasurecode = {unitmeasurecode}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("unitmeasurecode", ParameterValue.from(unitmeasurecode)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[UnitmeasureRow] =
    RowParser[UnitmeasureRow] { row =>
      Success(
        UnitmeasureRow(
          unitmeasurecode = row[UnitmeasureId]("unitmeasurecode"),
          name = row[Name]("name"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
