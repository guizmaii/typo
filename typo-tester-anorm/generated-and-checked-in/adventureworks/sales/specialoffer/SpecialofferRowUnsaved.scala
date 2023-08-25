/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package specialoffer

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `sales.specialoffer` which has not been persisted yet */
case class SpecialofferRowUnsaved(
  /** Discount description. */
  description: /* max 255 chars */ String,
  /** Discount type category. */
  `type`: /* max 50 chars */ String,
  /** Group the discount applies to such as Reseller or Customer. */
  category: /* max 50 chars */ String,
  /** Discount start date. */
  startdate: TypoLocalDateTime,
  /** Discount end date. */
  enddate: TypoLocalDateTime,
  /** Maximum discount percent allowed. */
  maxqty: Option[Int],
  /** Default: nextval('sales.specialoffer_specialofferid_seq'::regclass)
      Primary key for SpecialOffer records. */
  specialofferid: Defaulted[SpecialofferId] = Defaulted.UseDefault,
  /** Default: 0.00
      Discount precentage. */
  discountpct: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0
      Minimum discount percent allowed. */
  minqty: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(specialofferidDefault: => SpecialofferId, discountpctDefault: => BigDecimal, minqtyDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): SpecialofferRow =
    SpecialofferRow(
      description = description,
      `type` = `type`,
      category = category,
      startdate = startdate,
      enddate = enddate,
      maxqty = maxqty,
      specialofferid = specialofferid match {
                         case Defaulted.UseDefault => specialofferidDefault
                         case Defaulted.Provided(value) => value
                       },
      discountpct = discountpct match {
                      case Defaulted.UseDefault => discountpctDefault
                      case Defaulted.Provided(value) => value
                    },
      minqty = minqty match {
                 case Defaulted.UseDefault => minqtyDefault
                 case Defaulted.Provided(value) => value
               },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object SpecialofferRowUnsaved {
  implicit lazy val reads: Reads[SpecialofferRowUnsaved] = Reads[SpecialofferRowUnsaved](json => JsResult.fromTry(
      Try(
        SpecialofferRowUnsaved(
          description = json.\("description").as(Reads.StringReads),
          `type` = json.\("type").as(Reads.StringReads),
          category = json.\("category").as(Reads.StringReads),
          startdate = json.\("startdate").as(TypoLocalDateTime.reads),
          enddate = json.\("enddate").as(TypoLocalDateTime.reads),
          maxqty = json.\("maxqty").toOption.map(_.as(Reads.IntReads)),
          specialofferid = json.\("specialofferid").as(Defaulted.reads(SpecialofferId.reads)),
          discountpct = json.\("discountpct").as(Defaulted.reads(Reads.bigDecReads)),
          minqty = json.\("minqty").as(Defaulted.reads(Reads.IntReads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[SpecialofferRowUnsaved] = OWrites[SpecialofferRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "description" -> Writes.StringWrites.writes(o.description),
      "type" -> Writes.StringWrites.writes(o.`type`),
      "category" -> Writes.StringWrites.writes(o.category),
      "startdate" -> TypoLocalDateTime.writes.writes(o.startdate),
      "enddate" -> TypoLocalDateTime.writes.writes(o.enddate),
      "maxqty" -> Writes.OptionWrites(Writes.IntWrites).writes(o.maxqty),
      "specialofferid" -> Defaulted.writes(SpecialofferId.writes).writes(o.specialofferid),
      "discountpct" -> Defaulted.writes(Writes.BigDecimalWrites).writes(o.discountpct),
      "minqty" -> Defaulted.writes(Writes.IntWrites).writes(o.minqty),
      "rowguid" -> Defaulted.writes(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
