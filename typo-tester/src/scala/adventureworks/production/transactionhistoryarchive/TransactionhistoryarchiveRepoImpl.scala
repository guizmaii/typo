/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package transactionhistoryarchive

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

object TransactionhistoryarchiveRepoImpl extends TransactionhistoryarchiveRepo {
  override def delete(transactionid: TransactionhistoryarchiveId)(implicit c: Connection): Boolean = {
    SQL"delete from production.transactionhistoryarchive where transactionid = $transactionid".executeUpdate() > 0
  }
  override def insert(transactionid: TransactionhistoryarchiveId, unsaved: TransactionhistoryarchiveRowUnsaved)(implicit c: Connection): TransactionhistoryarchiveRow = {
    val namedParameters = List(
      Some((NamedParameter("productid", ParameterValue.from(unsaved.productid)), "::int4")),
      Some((NamedParameter("referenceorderid", ParameterValue.from(unsaved.referenceorderid)), "::int4")),
      unsaved.referenceorderlineid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("referenceorderlineid", ParameterValue.from[Int](value)), "::int4"))
      },
      unsaved.transactiondate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("transactiondate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      },
      Some((NamedParameter("transactiontype", ParameterValue.from(unsaved.transactiontype)), "::bpchar")),
      Some((NamedParameter("quantity", ParameterValue.from(unsaved.quantity)), "::int4")),
      Some((NamedParameter("actualcost", ParameterValue.from(unsaved.actualcost)), "::numeric")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val q = s"""insert into production.transactionhistoryarchive(transactionid, ${namedParameters.map(x => "\"" + x._1.name + "\"").mkString(", ")})
                values ({transactionid}::int4, ${namedParameters.map{case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate
             """
    // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
    import anorm._
    SQL(q)
      .on(namedParameters.map(_._1) :_*)
      .on(NamedParameter("transactionid", ParameterValue.from(transactionid)))
      .executeInsert(rowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate
          from production.transactionhistoryarchive
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[TransactionhistoryarchiveFieldOrIdValue[_]])(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case TransactionhistoryarchiveFieldValue.transactionid(value) => NamedParameter("transactionid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.referenceorderid(value) => NamedParameter("referenceorderid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.referenceorderlineid(value) => NamedParameter("referenceorderlineid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.transactiondate(value) => NamedParameter("transactiondate", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.transactiontype(value) => NamedParameter("transactiontype", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.quantity(value) => NamedParameter("quantity", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.actualcost(value) => NamedParameter("actualcost", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate
                    from production.transactionhistoryarchive
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(transactionid: TransactionhistoryarchiveId)(implicit c: Connection): Option[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate
          from production.transactionhistoryarchive
          where transactionid = $transactionid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(transactionids: Array[TransactionhistoryarchiveId])(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    implicit val toStatement: ToStatement[Array[TransactionhistoryarchiveId]] =
      (s: PreparedStatement, index: Int, v: Array[TransactionhistoryarchiveId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate
          from production.transactionhistoryarchive
          where transactionid = ANY($transactionids)
       """.as(rowParser.*)
  
  }
  override def update(row: TransactionhistoryarchiveRow)(implicit c: Connection): Boolean = {
    val transactionid = row.transactionid
    SQL"""update production.transactionhistoryarchive
          set productid = ${row.productid}::int4,
              referenceorderid = ${row.referenceorderid}::int4,
              referenceorderlineid = ${row.referenceorderlineid}::int4,
              transactiondate = ${row.transactiondate}::timestamp,
              transactiontype = ${row.transactiontype}::bpchar,
              quantity = ${row.quantity}::int4,
              actualcost = ${row.actualcost}::numeric,
              modifieddate = ${row.modifieddate}::timestamp
          where transactionid = $transactionid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(transactionid: TransactionhistoryarchiveId, fieldValues: List[TransactionhistoryarchiveFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case TransactionhistoryarchiveFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.referenceorderid(value) => NamedParameter("referenceorderid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.referenceorderlineid(value) => NamedParameter("referenceorderlineid", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.transactiondate(value) => NamedParameter("transactiondate", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.transactiontype(value) => NamedParameter("transactiontype", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.quantity(value) => NamedParameter("quantity", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.actualcost(value) => NamedParameter("actualcost", ParameterValue.from(value))
          case TransactionhistoryarchiveFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.transactionhistoryarchive
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where transactionid = {transactionid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("transactionid", ParameterValue.from(transactionid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[TransactionhistoryarchiveRow] =
    RowParser[TransactionhistoryarchiveRow] { row =>
      Success(
        TransactionhistoryarchiveRow(
          transactionid = row[TransactionhistoryarchiveId]("transactionid"),
          productid = row[Int]("productid"),
          referenceorderid = row[Int]("referenceorderid"),
          referenceorderlineid = row[Int]("referenceorderlineid"),
          transactiondate = row[LocalDateTime]("transactiondate"),
          transactiontype = row[/* bpchar */ String]("transactiontype"),
          quantity = row[Int]("quantity"),
          actualcost = row[BigDecimal]("actualcost"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
