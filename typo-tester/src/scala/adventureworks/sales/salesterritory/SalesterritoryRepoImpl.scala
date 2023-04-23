/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritory

import adventureworks.Defaulted
import adventureworks.person.countryregion.CountryregionId
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

object SalesterritoryRepoImpl extends SalesterritoryRepo {
  override def delete(territoryid: SalesterritoryId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.salesterritory where territoryid = $territoryid".executeUpdate() > 0
  }
  override def insert(unsaved: SalesterritoryRowUnsaved)(implicit c: Connection): SalesterritoryRow = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name))),
      Some(NamedParameter("countryregioncode", ParameterValue.from(unsaved.countryregioncode))),
      Some(NamedParameter("group", ParameterValue.from(unsaved.group))),
      unsaved.salesytd match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("salesytd", ParameterValue.from[BigDecimal](value)))
      },
      unsaved.saleslastyear match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("saleslastyear", ParameterValue.from[BigDecimal](value)))
      },
      unsaved.costytd match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("costytd", ParameterValue.from[BigDecimal](value)))
      },
      unsaved.costlastyear match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("costlastyear", ParameterValue.from[BigDecimal](value)))
      },
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
      SQL"""insert into sales.salesterritory default values
            returning territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into sales.salesterritory(${namedParameters.map(x => "\"" + x.name + "\"").mkString(", ")})
                  values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
                  returning territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[SalesterritoryRow] = {
    SQL"""select territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
          from sales.salesterritory
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[SalesterritoryFieldOrIdValue[_]])(implicit c: Connection): List[SalesterritoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesterritoryFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalesterritoryFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case SalesterritoryFieldValue.countryregioncode(value) => NamedParameter("countryregioncode", ParameterValue.from(value))
          case SalesterritoryFieldValue.group(value) => NamedParameter("group", ParameterValue.from(value))
          case SalesterritoryFieldValue.salesytd(value) => NamedParameter("salesytd", ParameterValue.from(value))
          case SalesterritoryFieldValue.saleslastyear(value) => NamedParameter("saleslastyear", ParameterValue.from(value))
          case SalesterritoryFieldValue.costytd(value) => NamedParameter("costytd", ParameterValue.from(value))
          case SalesterritoryFieldValue.costlastyear(value) => NamedParameter("costlastyear", ParameterValue.from(value))
          case SalesterritoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesterritoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
                    from sales.salesterritory
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(territoryid: SalesterritoryId)(implicit c: Connection): Option[SalesterritoryRow] = {
    SQL"""select territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
          from sales.salesterritory
          where territoryid = $territoryid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(territoryids: Array[SalesterritoryId])(implicit c: Connection): List[SalesterritoryRow] = {
    implicit val arrayToSql: ToSql[Array[SalesterritoryId]] = _ => ("?", 1) // fix wrong instance from anorm
    implicit val toStatement: ToStatement[Array[SalesterritoryId]] =
      (s: PreparedStatement, index: Int, v: Array[SalesterritoryId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
          from sales.salesterritory
          where territoryid = ANY($territoryids)
       """.as(rowParser.*)
  
  }
  override def update(row: SalesterritoryRow)(implicit c: Connection): Boolean = {
    val territoryid = row.territoryid
    SQL"""update sales.salesterritory
          set "name" = ${row.name},
              countryregioncode = ${row.countryregioncode},
              "group" = ${row.group},
              salesytd = ${row.salesytd},
              saleslastyear = ${row.saleslastyear},
              costytd = ${row.costytd},
              costlastyear = ${row.costlastyear},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where territoryid = $territoryid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(territoryid: SalesterritoryId, fieldValues: List[SalesterritoryFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesterritoryFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case SalesterritoryFieldValue.countryregioncode(value) => NamedParameter("countryregioncode", ParameterValue.from(value))
          case SalesterritoryFieldValue.group(value) => NamedParameter("group", ParameterValue.from(value))
          case SalesterritoryFieldValue.salesytd(value) => NamedParameter("salesytd", ParameterValue.from(value))
          case SalesterritoryFieldValue.saleslastyear(value) => NamedParameter("saleslastyear", ParameterValue.from(value))
          case SalesterritoryFieldValue.costytd(value) => NamedParameter("costytd", ParameterValue.from(value))
          case SalesterritoryFieldValue.costlastyear(value) => NamedParameter("costlastyear", ParameterValue.from(value))
          case SalesterritoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesterritoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.salesterritory
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where territoryid = {territoryid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("territoryid", ParameterValue.from(territoryid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[SalesterritoryRow] =
    RowParser[SalesterritoryRow] { row =>
      Success(
        SalesterritoryRow(
          territoryid = row[SalesterritoryId]("territoryid"),
          name = row[Name]("name"),
          countryregioncode = row[CountryregionId]("countryregioncode"),
          group = row[String]("group"),
          salesytd = row[BigDecimal]("salesytd"),
          saleslastyear = row[BigDecimal]("saleslastyear"),
          costytd = row[BigDecimal]("costytd"),
          costlastyear = row[BigDecimal]("costlastyear"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
