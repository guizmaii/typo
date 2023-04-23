/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package creditcard

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

object CreditcardRepoImpl extends CreditcardRepo {
  override def delete(creditcardid: CreditcardId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.creditcard where creditcardid = $creditcardid".executeUpdate() > 0
  }
  override def insert(unsaved: CreditcardRowUnsaved)(implicit c: Connection): CreditcardRow = {
    val namedParameters = List(
      Some((NamedParameter("cardtype", ParameterValue.from(unsaved.cardtype)), "")),
      Some((NamedParameter("cardnumber", ParameterValue.from(unsaved.cardnumber)), "")),
      Some((NamedParameter("expmonth", ParameterValue.from(unsaved.expmonth)), "::int2")),
      Some((NamedParameter("expyear", ParameterValue.from(unsaved.expyear)), "::int2")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    
    if (namedParameters.isEmpty) {
      SQL"""insert into sales.creditcard default values
            returning creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into sales.creditcard(${namedParameters.map{case (x, _) => "\"" + x.name + "\""}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[CreditcardRow] = {
    SQL"""select creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
          from sales.creditcard
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[CreditcardFieldOrIdValue[_]])(implicit c: Connection): List[CreditcardRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CreditcardFieldValue.creditcardid(value) => NamedParameter("creditcardid", ParameterValue.from(value))
          case CreditcardFieldValue.cardtype(value) => NamedParameter("cardtype", ParameterValue.from(value))
          case CreditcardFieldValue.cardnumber(value) => NamedParameter("cardnumber", ParameterValue.from(value))
          case CreditcardFieldValue.expmonth(value) => NamedParameter("expmonth", ParameterValue.from(value))
          case CreditcardFieldValue.expyear(value) => NamedParameter("expyear", ParameterValue.from(value))
          case CreditcardFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
                    from sales.creditcard
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(creditcardid: CreditcardId)(implicit c: Connection): Option[CreditcardRow] = {
    SQL"""select creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
          from sales.creditcard
          where creditcardid = $creditcardid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(creditcardids: Array[CreditcardId])(implicit c: Connection): List[CreditcardRow] = {
    implicit val toStatement: ToStatement[Array[CreditcardId]] =
      (s: PreparedStatement, index: Int, v: Array[CreditcardId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select creditcardid, cardtype, cardnumber, expmonth, expyear, modifieddate
          from sales.creditcard
          where creditcardid = ANY($creditcardids)
       """.as(rowParser.*)
  
  }
  override def update(row: CreditcardRow)(implicit c: Connection): Boolean = {
    val creditcardid = row.creditcardid
    SQL"""update sales.creditcard
          set cardtype = ${row.cardtype},
              cardnumber = ${row.cardnumber},
              expmonth = ${row.expmonth}::int2,
              expyear = ${row.expyear}::int2,
              modifieddate = ${row.modifieddate}::timestamp
          where creditcardid = $creditcardid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(creditcardid: CreditcardId, fieldValues: List[CreditcardFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CreditcardFieldValue.cardtype(value) => NamedParameter("cardtype", ParameterValue.from(value))
          case CreditcardFieldValue.cardnumber(value) => NamedParameter("cardnumber", ParameterValue.from(value))
          case CreditcardFieldValue.expmonth(value) => NamedParameter("expmonth", ParameterValue.from(value))
          case CreditcardFieldValue.expyear(value) => NamedParameter("expyear", ParameterValue.from(value))
          case CreditcardFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.creditcard
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where creditcardid = {creditcardid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("creditcardid", ParameterValue.from(creditcardid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[CreditcardRow] =
    RowParser[CreditcardRow] { row =>
      Success(
        CreditcardRow(
          creditcardid = row[CreditcardId]("creditcardid"),
          cardtype = row[String]("cardtype"),
          cardnumber = row[String]("cardnumber"),
          expmonth = row[Int]("expmonth"),
          expyear = row[Int]("expyear"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
