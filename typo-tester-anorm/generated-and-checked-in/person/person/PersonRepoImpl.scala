/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.Defaulted
import adventureworks.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.NameStyle
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.util.UUID
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PersonRepoImpl extends PersonRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from person.person where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PersonFields, PersonRow] = {
    DeleteBuilder("person.person", PersonFields)
  }
  override def insert(unsaved: PersonRow)(implicit c: Connection): PersonRow = {
    SQL"""insert into person.person(businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate)
          values (${unsaved.businessentityid}::int4, ${unsaved.persontype}::bpchar, ${unsaved.namestyle}::"public".NameStyle, ${unsaved.title}, ${unsaved.firstname}::"public"."Name", ${unsaved.middlename}::"public"."Name", ${unsaved.lastname}::"public"."Name", ${unsaved.suffix}, ${unsaved.emailpromotion}::int4, ${unsaved.additionalcontactinfo}::xml, ${unsaved.demographics}::xml, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
       """
      .executeInsert(PersonRow.rowParser(1).single)
    
  }
  override def insert(unsaved: PersonRowUnsaved)(implicit c: Connection): PersonRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue.from(unsaved.businessentityid)), "::int4")),
      Some((NamedParameter("persontype", ParameterValue.from(unsaved.persontype)), "::bpchar")),
      Some((NamedParameter("title", ParameterValue.from(unsaved.title)), "")),
      Some((NamedParameter("firstname", ParameterValue.from(unsaved.firstname)), """::"public"."Name"""")),
      Some((NamedParameter("middlename", ParameterValue.from(unsaved.middlename)), """::"public"."Name"""")),
      Some((NamedParameter("lastname", ParameterValue.from(unsaved.lastname)), """::"public"."Name"""")),
      Some((NamedParameter("suffix", ParameterValue.from(unsaved.suffix)), "")),
      Some((NamedParameter("additionalcontactinfo", ParameterValue.from(unsaved.additionalcontactinfo)), "::xml")),
      Some((NamedParameter("demographics", ParameterValue.from(unsaved.demographics)), "::xml")),
      unsaved.namestyle match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("namestyle", ParameterValue.from[NameStyle](value)), """::"public".NameStyle"""))
      },
      unsaved.emailpromotion match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("emailpromotion", ParameterValue.from[Int](value)), "::int4"))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[TypoLocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into person.person default values
            returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
         """
        .executeInsert(PersonRow.rowParser(1).single)
    } else {
      val q = s"""insert into person.person(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(PersonRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[PersonFields, PersonRow] = {
    SelectBuilderSql("person.person", PersonFields, PersonRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PersonRow] = {
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
          from person.person
       """.as(PersonRow.rowParser(1).*)
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[PersonRow] = {
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
          from person.person
          where businessentityid = $businessentityid
       """.as(PersonRow.rowParser(1).singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[PersonRow] = {
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
          from person.person
          where businessentityid = ANY($businessentityids)
       """.as(PersonRow.rowParser(1).*)
    
  }
  override def update(row: PersonRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update person.person
          set persontype = ${row.persontype}::bpchar,
              namestyle = ${row.namestyle}::"public".NameStyle,
              title = ${row.title},
              firstname = ${row.firstname}::"public"."Name",
              middlename = ${row.middlename}::"public"."Name",
              lastname = ${row.lastname}::"public"."Name",
              suffix = ${row.suffix},
              emailpromotion = ${row.emailpromotion}::int4,
              additionalcontactinfo = ${row.additionalcontactinfo}::xml,
              demographics = ${row.demographics}::xml,
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = $businessentityid
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PersonFields, PersonRow] = {
    UpdateBuilder("person.person", PersonFields, PersonRow.rowParser)
  }
  override def upsert(unsaved: PersonRow)(implicit c: Connection): PersonRow = {
    SQL"""insert into person.person(businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate)
          values (
            ${unsaved.businessentityid}::int4,
            ${unsaved.persontype}::bpchar,
            ${unsaved.namestyle}::"public".NameStyle,
            ${unsaved.title},
            ${unsaved.firstname}::"public"."Name",
            ${unsaved.middlename}::"public"."Name",
            ${unsaved.lastname}::"public"."Name",
            ${unsaved.suffix},
            ${unsaved.emailpromotion}::int4,
            ${unsaved.additionalcontactinfo}::xml,
            ${unsaved.demographics}::xml,
            ${unsaved.rowguid}::uuid,
            ${unsaved.modifieddate}::timestamp
          )
          on conflict (businessentityid)
          do update set
            persontype = EXCLUDED.persontype,
            namestyle = EXCLUDED.namestyle,
            title = EXCLUDED.title,
            firstname = EXCLUDED.firstname,
            middlename = EXCLUDED.middlename,
            lastname = EXCLUDED.lastname,
            suffix = EXCLUDED.suffix,
            emailpromotion = EXCLUDED.emailpromotion,
            additionalcontactinfo = EXCLUDED.additionalcontactinfo,
            demographics = EXCLUDED.demographics,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate::text
       """
      .executeInsert(PersonRow.rowParser(1).single)
    
  }
}
