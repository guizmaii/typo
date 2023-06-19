/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package specialoffer

import adventureworks.Defaulted
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

/** This class corresponds to a row in table `sales.specialoffer` which has not been persisted yet */
case class SpecialofferRowUnsaved(
  /** Discount description. */
  description: /* max 255 chars */ String,
  /** Discount type category. */
  `type`: /* max 50 chars */ String,
  /** Group the discount applies to such as Reseller or Customer. */
  category: /* max 50 chars */ String,
  /** Discount start date. */
  startdate: LocalDateTime,
  /** Discount end date. */
  enddate: LocalDateTime,
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
  modifieddate: Defaulted[LocalDateTime] = Defaulted.UseDefault
) {
  def toRow(specialofferidDefault: => SpecialofferId, discountpctDefault: => BigDecimal, minqtyDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => LocalDateTime): SpecialofferRow =
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
  implicit val decoder: Decoder[SpecialofferRowUnsaved] =
    (c: HCursor) =>
      for {
        description <- c.downField("description").as[/* max 255 chars */ String]
        `type` <- c.downField("type").as[/* max 50 chars */ String]
        category <- c.downField("category").as[/* max 50 chars */ String]
        startdate <- c.downField("startdate").as[LocalDateTime]
        enddate <- c.downField("enddate").as[LocalDateTime]
        maxqty <- c.downField("maxqty").as[Option[Int]]
        specialofferid <- c.downField("specialofferid").as[Defaulted[SpecialofferId]]
        discountpct <- c.downField("discountpct").as[Defaulted[BigDecimal]]
        minqty <- c.downField("minqty").as[Defaulted[Int]]
        rowguid <- c.downField("rowguid").as[Defaulted[UUID]]
        modifieddate <- c.downField("modifieddate").as[Defaulted[LocalDateTime]]
      } yield SpecialofferRowUnsaved(description, `type`, category, startdate, enddate, maxqty, specialofferid, discountpct, minqty, rowguid, modifieddate)
  implicit val encoder: Encoder[SpecialofferRowUnsaved] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "description" := row.description,
        "type" := row.`type`,
        "category" := row.category,
        "startdate" := row.startdate,
        "enddate" := row.enddate,
        "maxqty" := row.maxqty,
        "specialofferid" := row.specialofferid,
        "discountpct" := row.discountpct,
        "minqty" := row.minqty,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate
      )}
}
