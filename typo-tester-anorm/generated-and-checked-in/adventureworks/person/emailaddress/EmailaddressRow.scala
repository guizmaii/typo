/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package emailaddress

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import anorm.Column
import anorm.RowParser
import anorm.Success
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class EmailaddressRow(
  /** Primary key. Person associated with this email address.  Foreign key to Person.BusinessEntityID
      Points to [[person.PersonRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Primary key. ID of this email address. */
  emailaddressid: Int,
  /** E-mail address for the person. */
  emailaddress: Option[/* max 50 chars */ String],
  rowguid: UUID,
  modifieddate: TypoLocalDateTime
){
   val compositeId: EmailaddressId = EmailaddressId(businessentityid, emailaddressid)
 }

object EmailaddressRow {
  implicit lazy val reads: Reads[EmailaddressRow] = Reads[EmailaddressRow](json => JsResult.fromTry(
      Try(
        EmailaddressRow(
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          emailaddressid = json.\("emailaddressid").as(Reads.IntReads),
          emailaddress = json.\("emailaddress").toOption.map(_.as(Reads.StringReads)),
          rowguid = json.\("rowguid").as(Reads.uuidReads),
          modifieddate = json.\("modifieddate").as(TypoLocalDateTime.reads)
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[EmailaddressRow] = RowParser[EmailaddressRow] { row =>
    Success(
      EmailaddressRow(
        businessentityid = row(idx + 0)(BusinessentityId.column),
        emailaddressid = row(idx + 1)(Column.columnToInt),
        emailaddress = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        rowguid = row(idx + 3)(Column.columnToUUID),
        modifieddate = row(idx + 4)(TypoLocalDateTime.column)
      )
    )
  }
  implicit lazy val writes: OWrites[EmailaddressRow] = OWrites[EmailaddressRow](o =>
    new JsObject(ListMap[String, JsValue](
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "emailaddressid" -> Writes.IntWrites.writes(o.emailaddressid),
      "emailaddress" -> Writes.OptionWrites(Writes.StringWrites).writes(o.emailaddress),
      "rowguid" -> Writes.UuidWrites.writes(o.rowguid),
      "modifieddate" -> TypoLocalDateTime.writes.writes(o.modifieddate)
    ))
  )
}
