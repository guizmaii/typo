/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package countryregioncurrency

import adventureworks.Defaulted
import adventureworks.person.countryregion.CountryregionId
import adventureworks.sales.currency.CurrencyId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object CountryregioncurrencyRepoImpl extends CountryregioncurrencyRepo {
  override def delete(compositeId: CountryregioncurrencyId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.countryregioncurrency where countryregioncode = ${compositeId.countryregioncode}, currencycode = ${compositeId.currencycode}".executeUpdate() > 0
  }
  override def insert(compositeId: CountryregioncurrencyId, unsaved: CountryregioncurrencyRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into sales.countryregioncurrency(countryregioncode, currencycode, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.countryregioncode}, ${compositeId.currencycode}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
       """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[CountryregioncurrencyRow] = {
    SQL"""select countryregioncode, currencycode, modifieddate
          from sales.countryregioncurrency
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[CountryregioncurrencyFieldOrIdValue[_]])(implicit c: Connection): List[CountryregioncurrencyRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CountryregioncurrencyFieldValue.countryregioncode(value) => NamedParameter("countryregioncode", ParameterValue.from(value))
          case CountryregioncurrencyFieldValue.currencycode(value) => NamedParameter("currencycode", ParameterValue.from(value))
          case CountryregioncurrencyFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from sales.countryregioncurrency
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: CountryregioncurrencyId)(implicit c: Connection): Option[CountryregioncurrencyRow] = {
    SQL"""select countryregioncode, currencycode, modifieddate
          from sales.countryregioncurrency
          where countryregioncode = ${compositeId.countryregioncode}, currencycode = ${compositeId.currencycode}
       """.as(rowParser.singleOpt)
  }
  override def update(row: CountryregioncurrencyRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update sales.countryregioncurrency
          set modifieddate = ${row.modifieddate}
          where countryregioncode = ${compositeId.countryregioncode}, currencycode = ${compositeId.currencycode}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: CountryregioncurrencyId, fieldValues: List[CountryregioncurrencyFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CountryregioncurrencyFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.countryregioncurrency
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where countryregioncode = ${compositeId.countryregioncode}, currencycode = ${compositeId.currencycode}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[CountryregioncurrencyRow] =
    RowParser[CountryregioncurrencyRow] { row =>
      Success(
        CountryregioncurrencyRow(
          countryregioncode = row[CountryregionId]("countryregioncode"),
          currencycode = row[CurrencyId]("currencycode"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[CountryregioncurrencyId] =
    RowParser[CountryregioncurrencyId] { row =>
      Success(
        CountryregioncurrencyId(
          countryregioncode = row[CountryregionId]("countryregioncode"),
          currencycode = row[CurrencyId]("currencycode")
        )
      )
    }
}
