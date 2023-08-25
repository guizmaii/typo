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
import io.circe.Decoder
import io.circe.Encoder
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
  implicit lazy val decoder: Decoder[SpecialofferRowUnsaved] = Decoder.forProduct11[SpecialofferRowUnsaved, /* max 255 chars */ String, /* max 50 chars */ String, /* max 50 chars */ String, TypoLocalDateTime, TypoLocalDateTime, Option[Int], Defaulted[SpecialofferId], Defaulted[BigDecimal], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("description", "type", "category", "startdate", "enddate", "maxqty", "specialofferid", "discountpct", "minqty", "rowguid", "modifieddate")(SpecialofferRowUnsaved.apply)(Decoder.decodeString, Decoder.decodeString, Decoder.decodeString, TypoLocalDateTime.decoder, TypoLocalDateTime.decoder, Decoder.decodeOption(Decoder.decodeInt), Defaulted.decoder(SpecialofferId.decoder), Defaulted.decoder(Decoder.decodeBigDecimal), Defaulted.decoder(Decoder.decodeInt), Defaulted.decoder(Decoder.decodeUUID), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SpecialofferRowUnsaved] = Encoder.forProduct11[SpecialofferRowUnsaved, /* max 255 chars */ String, /* max 50 chars */ String, /* max 50 chars */ String, TypoLocalDateTime, TypoLocalDateTime, Option[Int], Defaulted[SpecialofferId], Defaulted[BigDecimal], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("description", "type", "category", "startdate", "enddate", "maxqty", "specialofferid", "discountpct", "minqty", "rowguid", "modifieddate")(x => (x.description, x.`type`, x.category, x.startdate, x.enddate, x.maxqty, x.specialofferid, x.discountpct, x.minqty, x.rowguid, x.modifieddate))(Encoder.encodeString, Encoder.encodeString, Encoder.encodeString, TypoLocalDateTime.encoder, TypoLocalDateTime.encoder, Encoder.encodeOption(Encoder.encodeInt), Defaulted.encoder(SpecialofferId.encoder), Defaulted.encoder(Encoder.encodeBigDecimal), Defaulted.encoder(Encoder.encodeInt), Defaulted.encoder(Encoder.encodeUUID), Defaulted.encoder(TypoLocalDateTime.encoder))
}
