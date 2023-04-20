/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package personcreditcard

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.creditcard.CreditcardId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object PersoncreditcardRepoImpl extends PersoncreditcardRepo {
  override def delete(compositeId: PersoncreditcardId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.personcreditcard where businessentityid = ${compositeId.businessentityid}, creditcardid = ${compositeId.creditcardid}".executeUpdate() > 0
  }
  override def insert(compositeId: PersoncreditcardId, unsaved: PersoncreditcardRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into sales.personcreditcard(businessentityid, creditcardid, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.businessentityid}, ${compositeId.creditcardid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
       """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[PersoncreditcardRow] = {
    SQL"""select businessentityid, creditcardid, modifieddate
          from sales.personcreditcard
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PersoncreditcardFieldOrIdValue[_]])(implicit c: Connection): List[PersoncreditcardRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersoncreditcardFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case PersoncreditcardFieldValue.creditcardid(value) => NamedParameter("creditcardid", ParameterValue.from(value))
          case PersoncreditcardFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from sales.personcreditcard
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: PersoncreditcardId)(implicit c: Connection): Option[PersoncreditcardRow] = {
    SQL"""select businessentityid, creditcardid, modifieddate
          from sales.personcreditcard
          where businessentityid = ${compositeId.businessentityid}, creditcardid = ${compositeId.creditcardid}
       """.as(rowParser.singleOpt)
  }
  override def update(row: PersoncreditcardRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update sales.personcreditcard
          set modifieddate = ${row.modifieddate}
          where businessentityid = ${compositeId.businessentityid}, creditcardid = ${compositeId.creditcardid}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: PersoncreditcardId, fieldValues: List[PersoncreditcardFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersoncreditcardFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.personcreditcard
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = ${compositeId.businessentityid}, creditcardid = ${compositeId.creditcardid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[PersoncreditcardRow] =
    RowParser[PersoncreditcardRow] { row =>
      Success(
        PersoncreditcardRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          creditcardid = row[CreditcardId]("creditcardid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[PersoncreditcardId] =
    RowParser[PersoncreditcardId] { row =>
      Success(
        PersoncreditcardId(
          businessentityid = row[BusinessentityId]("businessentityid"),
          creditcardid = row[CreditcardId]("creditcardid")
        )
      )
    }
}
