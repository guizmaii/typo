/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package transactionhistoryarchive

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object TransactionhistoryarchiveRepoImpl extends TransactionhistoryarchiveRepo {
  override def delete(transactionid: TransactionhistoryarchiveId)(implicit c: Connection): Boolean = {
    SQL"delete from production.transactionhistoryarchive where transactionid = $transactionid".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[TransactionhistoryarchiveFields, TransactionhistoryarchiveRow] = {
    DeleteBuilder("production.transactionhistoryarchive", TransactionhistoryarchiveFields)
  }
  override def insert(unsaved: TransactionhistoryarchiveRow)(implicit c: Connection): TransactionhistoryarchiveRow = {
    SQL"""insert into production.transactionhistoryarchive(transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate)
          values (${unsaved.transactionid}::int4, ${unsaved.productid}::int4, ${unsaved.referenceorderid}::int4, ${unsaved.referenceorderlineid}::int4, ${unsaved.transactiondate}::timestamp, ${unsaved.transactiontype}::bpchar, ${unsaved.quantity}::int4, ${unsaved.actualcost}::numeric, ${unsaved.modifieddate}::timestamp)
          returning transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
       """
      .executeInsert(TransactionhistoryarchiveRow.rowParser(1).single)
    
  }
  override def insert(unsaved: TransactionhistoryarchiveRowUnsaved)(implicit c: Connection): TransactionhistoryarchiveRow = {
    val namedParameters = List(
      Some((NamedParameter("transactionid", ParameterValue.from(unsaved.transactionid)), "::int4")),
      Some((NamedParameter("productid", ParameterValue.from(unsaved.productid)), "::int4")),
      Some((NamedParameter("referenceorderid", ParameterValue.from(unsaved.referenceorderid)), "::int4")),
      Some((NamedParameter("transactiontype", ParameterValue.from(unsaved.transactiontype)), "::bpchar")),
      Some((NamedParameter("quantity", ParameterValue.from(unsaved.quantity)), "::int4")),
      Some((NamedParameter("actualcost", ParameterValue.from(unsaved.actualcost)), "::numeric")),
      unsaved.referenceorderlineid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("referenceorderlineid", ParameterValue.from[Int](value)), "::int4"))
      },
      unsaved.transactiondate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("transactiondate", ParameterValue.from[TypoLocalDateTime](value)), "::timestamp"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[TypoLocalDateTime](value)), "::timestamp"))
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
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
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
          where transactionid = $transactionid
       """.as(TransactionhistoryarchiveRow.rowParser(1).singleOpt)
  }
  override def selectByIds(transactionids: Array[TransactionhistoryarchiveId])(implicit c: Connection): List[TransactionhistoryarchiveRow] = {
    SQL"""select transactionid, productid, referenceorderid, referenceorderlineid, transactiondate::text, transactiontype, quantity, actualcost, modifieddate::text
          from production.transactionhistoryarchive
          where transactionid = ANY($transactionids)
       """.as(TransactionhistoryarchiveRow.rowParser(1).*)
    
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
  override def update: UpdateBuilder[TransactionhistoryarchiveFields, TransactionhistoryarchiveRow] = {
    UpdateBuilder("production.transactionhistoryarchive", TransactionhistoryarchiveFields, TransactionhistoryarchiveRow.rowParser)
  }
  override def upsert(unsaved: TransactionhistoryarchiveRow)(implicit c: Connection): TransactionhistoryarchiveRow = {
    SQL"""insert into production.transactionhistoryarchive(transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate)
          values (
            ${unsaved.transactionid}::int4,
            ${unsaved.productid}::int4,
            ${unsaved.referenceorderid}::int4,
            ${unsaved.referenceorderlineid}::int4,
            ${unsaved.transactiondate}::timestamp,
            ${unsaved.transactiontype}::bpchar,
            ${unsaved.quantity}::int4,
            ${unsaved.actualcost}::numeric,
            ${unsaved.modifieddate}::timestamp
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
