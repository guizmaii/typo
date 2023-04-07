/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.Defaulted
import adventureworks.public.Name
import adventureworks.public.NameStyle
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.person` which has not been persisted yet */
case class PersonRowUnsaved(
  persontype: /* bpchar */ String,
  namestyle: Defaulted[NameStyle],
  title: Option[String],
  firstname: Name,
  middlename: Option[Name],
  lastname: Name,
  suffix: Option[String],
  emailpromotion: Defaulted[Int],
  additionalcontactinfo: Option[/* xml */ String],
  demographics: Option[/* xml */ String],
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object PersonRowUnsaved {
  implicit val oFormat: OFormat[PersonRowUnsaved] = new OFormat[PersonRowUnsaved]{
    override def writes(o: PersonRowUnsaved): JsObject =
      Json.obj(
        "persontype" -> o.persontype,
        "namestyle" -> o.namestyle,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "emailpromotion" -> o.emailpromotion,
        "additionalcontactinfo" -> o.additionalcontactinfo,
        "demographics" -> o.demographics,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PersonRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PersonRowUnsaved(
            persontype = json.\("persontype").as[/* bpchar */ String],
            namestyle = json.\("namestyle").as[Defaulted[NameStyle]],
            title = json.\("title").toOption.map(_.as[String]),
            firstname = json.\("firstname").as[Name],
            middlename = json.\("middlename").toOption.map(_.as[Name]),
            lastname = json.\("lastname").as[Name],
            suffix = json.\("suffix").toOption.map(_.as[String]),
            emailpromotion = json.\("emailpromotion").as[Defaulted[Int]],
            additionalcontactinfo = json.\("additionalcontactinfo").toOption.map(_.as[/* xml */ String]),
            demographics = json.\("demographics").toOption.map(_.as[/* xml */ String]),
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
