/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package transactionhistoryarchive

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object TransactionhistoryarchiveRepoImpl extends TransactionhistoryarchiveRepo {
  override def delete(transactionid: TransactionhistoryarchiveId)(implicit c: Connection): Boolean = {
    SQL"delete from production.transactionhistoryarchive where transactionid = ${ParameterValue(transactionid, null, TransactionhistoryarchiveId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[TransactionhistoryarchiveFields, TransactionhistoryarchiveRow] = {
    DeleteBuilder("production.transactionhistoryarchive", TransactionhistoryarchiveFields)
  }
  override def insert(unsaved: TransactionhistoryarchiveRow)(implicit c: Connection): TransactionhistoryarchiveRow = {
    SQL"""insert into production.transactionhistoryarchive(transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate)
          values (${ParameterValue(unsaved.transactionid, null, TransactionhistoryarchiveId.toStatement)}::int4, ${ParameterValue(unsaved.productid, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.referenceorderid, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.referenceorderlineid, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.transactiondate, null, TypoLocalDateTime.toStatement)}::timestamp, ${ParameterValue(unsaved.transactiontype, null, ToStatement.stringToStatement)}::bpchar, ${ParameterValue(unsaved.quantity, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.actualcost, null, ToStatement.scalaBigDecimalToStatement)}::numeric, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
       """
      .executeInsert(TransactionhistoryarchiveRow.rowParser(1).single)
    
  }
  override def insert(unsaved: TransactionhistoryarchiveRowUnsaved)(implicit c: Connection): TransactionhistoryarchiveRow = {
    val namedParameters = List(
      Some((NamedParameter("transactionid", ParameterValue(unsaved.transactionid, null, TransactionhistoryarchiveId.toStatement)), "::int4")),
      Some((NamedParameter("productid", ParameterValue(unsaved.productid, null, ToStatement.intToStatement)), "::int4")),
      Some((NamedParameter("referenceorderid", ParameterValue(unsaved.referenceorderid, null, ToStatement.intToStatement)), "::int4")),
      Some((NamedParameter("transactiontype", ParameterValue(unsaved.transactiontype, null, ToStatement.stringToStatement)), "::bpchar")),
      Some((NamedParameter("quantity", ParameterValue(unsaved.quantity, null, ToStatement.intToStatement)), "::int4")),
      Some((NamedParameter("actualcost", ParameterValue(unsaved.actualcost, null, ToStatement.scalaBigDecimalToStatement)), "::numeric")),
      unsaved.referenceorderlineid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("referenceorderlineid", ParameterValue(value, null, ToStatement.intToStatement)), "::int4"))
      },
      unsaved.transactiondate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("transactiondate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.transactionhistoryarchive default values
            returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
         """
        .executeInsert(TransactionhistoryarchiveRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.transactionhistoryarchive(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(TransactionhistoryarchiveRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[TransactionhistoryarchiveFields, TransactionhistoryarchiveRow] = {
    SelectBuilderSql("production.transactionhistoryarchive", TransactionhistoryarchiveFields, TransactionhistoryarchiveRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
          from production.transactionhistoryarchive
       """.as(TransactionhistoryarchiveRow.rowParser(1).*)
  }
  override def selectById(transactionid: TransactionhistoryarchiveId)(implicit c: Connection): Option[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
          from production.transactionhistoryarchive
          where transactionid = ${ParameterValue(transactionid, null, TransactionhistoryarchiveId.toStatement)}
       """.as(TransactionhistoryarchiveRow.rowParser(1).singleOpt)
  }
  override def selectByIds(transactionids: Array[TransactionhistoryarchiveId])(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
          from production.transactionhistoryarchive
          where transactionid = ANY(${transactionids})
       """.as(TransactionhistoryarchiveRow.rowParser(1).*)
    
  }
  override def update(row: TransactionhistoryarchiveRow)(implicit c: Connection): Boolean = {
    val transactionid = row.transactionid
    SQL"""update production.transactionhistoryarchive
          set productid = ${ParameterValue(row.productid, null, ToStatement.intToStatement)}::int4,
              referenceorderid = ${ParameterValue(row.referenceorderid, null, ToStatement.intToStatement)}::int4,
              referenceorderlineid = ${ParameterValue(row.referenceorderlineid, null, ToStatement.intToStatement)}::int4,
              transactiondate = ${ParameterValue(row.transactiondate, null, TypoLocalDateTime.toStatement)}::timestamp,
              transactiontype = ${ParameterValue(row.transactiontype, null, ToStatement.stringToStatement)}::bpchar,
              quantity = ${ParameterValue(row.quantity, null, ToStatement.intToStatement)}::int4,
              actualcost = ${ParameterValue(row.actualcost, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where transactionid = ${ParameterValue(transactionid, null, TransactionhistoryarchiveId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[TransactionhistoryarchiveFields, TransactionhistoryarchiveRow] = {
    UpdateBuilder("production.transactionhistoryarchive", TransactionhistoryarchiveFields, TransactionhistoryarchiveRow.rowParser)
  }
  override def upsert(unsaved: TransactionhistoryarchiveRow)(implicit c: Connection): TransactionhistoryarchiveRow = {
    SQL"""insert into production.transactionhistoryarchive(transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate)
          values (
            ${ParameterValue(unsaved.transactionid, null, TransactionhistoryarchiveId.toStatement)}::int4,
            ${ParameterValue(unsaved.productid, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.referenceorderid, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.referenceorderlineid, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.transactiondate, null, TypoLocalDateTime.toStatement)}::timestamp,
            ${ParameterValue(unsaved.transactiontype, null, ToStatement.stringToStatement)}::bpchar,
            ${ParameterValue(unsaved.quantity, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.actualcost, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (transactionid)
          do update set
            productid = EXCLUDED.productid,
            referenceorderid = EXCLUDED.referenceorderid,
            referenceorderlineid = EXCLUDED.referenceorderlineid,
            transactiondate = EXCLUDED.transactiondate,
            transactiontype = EXCLUDED.transactiontype,
            quantity = EXCLUDED.quantity,
            actualcost = EXCLUDED.actualcost,
            modifieddate = EXCLUDED.modifieddate
          returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
       """
      .executeInsert(TransactionhistoryarchiveRow.rowParser(1).single)
    
  }
}
