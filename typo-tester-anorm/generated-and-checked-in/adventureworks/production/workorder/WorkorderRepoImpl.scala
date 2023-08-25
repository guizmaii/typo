/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package workorder

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.scrapreason.ScrapreasonId
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

object WorkorderRepoImpl extends WorkorderRepo {
  override def delete(workorderid: WorkorderId)(implicit c: Connection): Boolean = {
    SQL"delete from production.workorder where workorderid = ${ParameterValue(workorderid, null, WorkorderId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[WorkorderFields, WorkorderRow] = {
    DeleteBuilder("production.workorder", WorkorderFields)
  }
  override def insert(unsaved: WorkorderRow)(implicit c: Connection): WorkorderRow = {
    SQL"""insert into production.workorder(workorderid, productid, orderqty, scrappedqty, startdate, enddate, duedate, scrapreasonid, modifieddate)
          values (${ParameterValue(unsaved.workorderid, null, WorkorderId.toStatement)}::int4, ${ParameterValue(unsaved.productid, null, ProductId.toStatement)}::int4, ${ParameterValue(unsaved.orderqty, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.scrappedqty, null, ToStatement.intToStatement)}::int2, ${ParameterValue(unsaved.startdate, null, TypoLocalDateTime.toStatement)}::timestamp, ${ParameterValue(unsaved.enddate, null, ToStatement.optionToStatement(TypoLocalDateTime.toStatement, TypoLocalDateTime.parameterMetadata))}::timestamp, ${ParameterValue(unsaved.duedate, null, TypoLocalDateTime.toStatement)}::timestamp, ${ParameterValue(unsaved.scrapreasonid, null, ToStatement.optionToStatement(ScrapreasonId.toStatement, ScrapreasonId.parameterMetadata))}::int2, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
       """
      .executeInsert(WorkorderRow.rowParser(1).single)
    
  }
  override def insert(unsaved: WorkorderRowUnsaved)(implicit c: Connection): WorkorderRow = {
    val namedParameters = List(
      Some((NamedParameter("productid", ParameterValue(unsaved.productid, null, ProductId.toStatement)), "::int4")),
      Some((NamedParameter("orderqty", ParameterValue(unsaved.orderqty, null, ToStatement.intToStatement)), "::int4")),
      Some((NamedParameter("scrappedqty", ParameterValue(unsaved.scrappedqty, null, ToStatement.intToStatement)), "::int2")),
      Some((NamedParameter("startdate", ParameterValue(unsaved.startdate, null, TypoLocalDateTime.toStatement)), "::timestamp")),
      Some((NamedParameter("enddate", ParameterValue(unsaved.enddate, null, ToStatement.optionToStatement(TypoLocalDateTime.toStatement, TypoLocalDateTime.parameterMetadata))), "::timestamp")),
      Some((NamedParameter("duedate", ParameterValue(unsaved.duedate, null, TypoLocalDateTime.toStatement)), "::timestamp")),
      Some((NamedParameter("scrapreasonid", ParameterValue(unsaved.scrapreasonid, null, ToStatement.optionToStatement(ScrapreasonId.toStatement, ScrapreasonId.parameterMetadata))), "::int2")),
      unsaved.workorderid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("workorderid", ParameterValue(value, null, WorkorderId.toStatement)), "::int4"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.workorder default values
            returning workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
         """
        .executeInsert(WorkorderRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.workorder(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(WorkorderRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[WorkorderFields, WorkorderRow] = {
    SelectBuilderSql("production.workorder", WorkorderFields, WorkorderRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[WorkorderRow] = {
    SQL"""select workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
          from production.workorder
       """.as(WorkorderRow.rowParser(1).*)
  }
  override def selectById(workorderid: WorkorderId)(implicit c: Connection): Option[WorkorderRow] = {
    SQL"""select workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
          from production.workorder
          where workorderid = ${ParameterValue(workorderid, null, WorkorderId.toStatement)}
       """.as(WorkorderRow.rowParser(1).singleOpt)
  }
  override def selectByIds(workorderids: Array[WorkorderId])(implicit c: Connection): List[WorkorderRow] = {
    SQL"""select workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
          from production.workorder
          where workorderid = ANY(${workorderids})
       """.as(WorkorderRow.rowParser(1).*)
    
  }
  override def update(row: WorkorderRow)(implicit c: Connection): Boolean = {
    val workorderid = row.workorderid
    SQL"""update production.workorder
          set productid = ${ParameterValue(row.productid, null, ProductId.toStatement)}::int4,
              orderqty = ${ParameterValue(row.orderqty, null, ToStatement.intToStatement)}::int4,
              scrappedqty = ${ParameterValue(row.scrappedqty, null, ToStatement.intToStatement)}::int2,
              startdate = ${ParameterValue(row.startdate, null, TypoLocalDateTime.toStatement)}::timestamp,
              enddate = ${ParameterValue(row.enddate, null, ToStatement.optionToStatement(TypoLocalDateTime.toStatement, TypoLocalDateTime.parameterMetadata))}::timestamp,
              duedate = ${ParameterValue(row.duedate, null, TypoLocalDateTime.toStatement)}::timestamp,
              scrapreasonid = ${ParameterValue(row.scrapreasonid, null, ToStatement.optionToStatement(ScrapreasonId.toStatement, ScrapreasonId.parameterMetadata))}::int2,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where workorderid = ${ParameterValue(workorderid, null, WorkorderId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[WorkorderFields, WorkorderRow] = {
    UpdateBuilder("production.workorder", WorkorderFields, WorkorderRow.rowParser)
  }
  override def upsert(unsaved: WorkorderRow)(implicit c: Connection): WorkorderRow = {
    SQL"""insert into production.workorder(workorderid, productid, orderqty, scrappedqty, startdate, enddate, duedate, scrapreasonid, modifieddate)
          values (
            ${ParameterValue(unsaved.workorderid, null, WorkorderId.toStatement)}::int4,
            ${ParameterValue(unsaved.productid, null, ProductId.toStatement)}::int4,
            ${ParameterValue(unsaved.orderqty, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.scrappedqty, null, ToStatement.intToStatement)}::int2,
            ${ParameterValue(unsaved.startdate, null, TypoLocalDateTime.toStatement)}::timestamp,
            ${ParameterValue(unsaved.enddate, null, ToStatement.optionToStatement(TypoLocalDateTime.toStatement, TypoLocalDateTime.parameterMetadata))}::timestamp,
            ${ParameterValue(unsaved.duedate, null, TypoLocalDateTime.toStatement)}::timestamp,
            ${ParameterValue(unsaved.scrapreasonid, null, ToStatement.optionToStatement(ScrapreasonId.toStatement, ScrapreasonId.parameterMetadata))}::int2,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (workorderid)
          do update set
            productid = EXCLUDED.productid,
            orderqty = EXCLUDED.orderqty,
            scrappedqty = EXCLUDED.scrappedqty,
            startdate = EXCLUDED.startdate,
            enddate = EXCLUDED.enddate,
            duedate = EXCLUDED.duedate,
            scrapreasonid = EXCLUDED.scrapreasonid,
            modifieddate = EXCLUDED.modifieddate
          returning workorderid, productid, orderqty, scrappedqty, startdate::text, enddate::text, duedate::text, scrapreasonid, modifieddate::text
       """
      .executeInsert(WorkorderRow.rowParser(1).single)
    
  }
}
