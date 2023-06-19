/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.Defaulted
import adventureworks.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.NameStyle
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToStatement
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime
import java.util.UUID

object PersonRepoImpl extends PersonRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from person.person where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def insert(unsaved: PersonRow)(implicit c: Connection): PersonRow = {
    SQL"""insert into person.person(businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate)
          values (${unsaved.businessentityid}::int4, ${unsaved.persontype}::bpchar, ${unsaved.namestyle}::"public".NameStyle, ${unsaved.title}, ${unsaved.firstname}::"public"."Name", ${unsaved.middlename}::"public"."Name", ${unsaved.lastname}::"public"."Name", ${unsaved.suffix}, ${unsaved.emailpromotion}::int4, ${unsaved.additionalcontactinfo}::xml, ${unsaved.demographics}::xml, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
       """
      .executeInsert(rowParser.single)
  
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
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into person.person default values
            returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into person.person(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[PersonRow] = {
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
          from person.person
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PersonFieldOrIdValue[_]])(implicit c: Connection): List[PersonRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case PersonFieldValue.persontype(value) => NamedParameter("persontype", ParameterValue.from(value))
          case PersonFieldValue.namestyle(value) => NamedParameter("namestyle", ParameterValue.from(value))
          case PersonFieldValue.title(value) => NamedParameter("title", ParameterValue.from(value))
          case PersonFieldValue.firstname(value) => NamedParameter("firstname", ParameterValue.from(value))
          case PersonFieldValue.middlename(value) => NamedParameter("middlename", ParameterValue.from(value))
          case PersonFieldValue.lastname(value) => NamedParameter("lastname", ParameterValue.from(value))
          case PersonFieldValue.suffix(value) => NamedParameter("suffix", ParameterValue.from(value))
          case PersonFieldValue.emailpromotion(value) => NamedParameter("emailpromotion", ParameterValue.from(value))
          case PersonFieldValue.additionalcontactinfo(value) => NamedParameter("additionalcontactinfo", ParameterValue.from(value))
          case PersonFieldValue.demographics(value) => NamedParameter("demographics", ParameterValue.from(value))
          case PersonFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case PersonFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
                    from person.person
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[PersonRow] = {
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
          from person.person
          where businessentityid = $businessentityid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[PersonRow] = {
    implicit val toStatement: ToStatement[Array[BusinessentityId]] =
      (s: PreparedStatement, index: Int, v: Array[BusinessentityId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
          from person.person
          where businessentityid = ANY($businessentityids)
       """.as(rowParser.*)
  
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
  override def updateFieldValues(businessentityid: BusinessentityId, fieldValues: List[PersonFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonFieldValue.persontype(value) => NamedParameter("persontype", ParameterValue.from(value))
          case PersonFieldValue.namestyle(value) => NamedParameter("namestyle", ParameterValue.from(value))
          case PersonFieldValue.title(value) => NamedParameter("title", ParameterValue.from(value))
          case PersonFieldValue.firstname(value) => NamedParameter("firstname", ParameterValue.from(value))
          case PersonFieldValue.middlename(value) => NamedParameter("middlename", ParameterValue.from(value))
          case PersonFieldValue.lastname(value) => NamedParameter("lastname", ParameterValue.from(value))
          case PersonFieldValue.suffix(value) => NamedParameter("suffix", ParameterValue.from(value))
          case PersonFieldValue.emailpromotion(value) => NamedParameter("emailpromotion", ParameterValue.from(value))
          case PersonFieldValue.additionalcontactinfo(value) => NamedParameter("additionalcontactinfo", ParameterValue.from(value))
          case PersonFieldValue.demographics(value) => NamedParameter("demographics", ParameterValue.from(value))
          case PersonFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case PersonFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update person.person
                    set ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where businessentityid = {businessentityid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("businessentityid", ParameterValue.from(businessentityid)))
          .executeUpdate() > 0
    }
  
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
          returning businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate
       """
      .executeInsert(rowParser.single)
  
  }
  val rowParser: RowParser[PersonRow] =
    RowParser[PersonRow] { row =>
      Success(
        PersonRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          persontype = row[/* bpchar */ String]("persontype"),
          namestyle = row[NameStyle]("namestyle"),
          title = row[Option[/* max 8 chars */ String]]("title"),
          firstname = row[Name]("firstname"),
          middlename = row[Option[Name]]("middlename"),
          lastname = row[Name]("lastname"),
          suffix = row[Option[/* max 10 chars */ String]]("suffix"),
          emailpromotion = row[Int]("emailpromotion"),
          additionalcontactinfo = row[Option[TypoXml]]("additionalcontactinfo"),
          demographics = row[Option[TypoXml]]("demographics"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
