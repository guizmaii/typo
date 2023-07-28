/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentity

import adventureworks.Defaulted
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object BusinessentityRepoImpl extends BusinessentityRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from person.businessentity where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def insert(unsaved: BusinessentityRow)(implicit c: Connection): BusinessentityRow = {
    SQL"""insert into person.businessentity(businessentityid, rowguid, modifieddate)
          values (${unsaved.businessentityid}::int4, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning businessentityid, rowguid, modifieddate
       """
      .executeInsert(BusinessentityRow.rowParser(1).single)
  
  }
  override def insert(unsaved: BusinessentityRowUnsaved)(implicit c: Connection): BusinessentityRow = {
    val namedParameters = List(
      unsaved.businessentityid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("businessentityid", ParameterValue.from[BusinessentityId](value)), "::int4"))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into person.businessentity default values
            returning businessentityid, rowguid, modifieddate
         """
        .executeInsert(BusinessentityRow.rowParser(1).single)
    } else {
      val q = s"""insert into person.businessentity(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(BusinessentityRow.rowParser(1).single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
       """.as(BusinessentityRow.rowParser(1).*)
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
          where businessentityid = $businessentityid
       """.as(BusinessentityRow.rowParser(1).singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate
          from person.businessentity
          where businessentityid = ANY($businessentityids)
       """.as(BusinessentityRow.rowParser(1).*)
  
  }
  override def update(row: BusinessentityRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update person.businessentity
          set rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = $businessentityid
       """.executeUpdate() > 0
  }
  override def upsert(unsaved: BusinessentityRow)(implicit c: Connection): BusinessentityRow = {
    SQL"""insert into person.businessentity(businessentityid, rowguid, modifieddate)
          values (
            ${unsaved.businessentityid}::int4,
            ${unsaved.rowguid}::uuid,
            ${unsaved.modifieddate}::timestamp
          )
          on conflict (businessentityid)
          do update set
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, rowguid, modifieddate
       """
      .executeInsert(BusinessentityRow.rowParser(1).single)
  
  }
}
