/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currency

import doobie.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Type for the primary key of table `sales.currency` */
case class CurrencyId(value: /* bpchar */ String) extends AnyVal
object CurrencyId {
  implicit val ordering: Ordering[CurrencyId] = Ordering.by(_.value)
  implicit val encoder: Encoder[CurrencyId] =
    Encoder[/* bpchar */ String].contramap(_.value)
  implicit val decoder: Decoder[CurrencyId] =
    Decoder[/* bpchar */ String].map(CurrencyId(_))
  implicit val meta: Meta[CurrencyId] = Meta[/* bpchar */ String].imap(CurrencyId.apply)(_.value)
  implicit val metaArray: Meta[Array[CurrencyId]] = Meta[Array[/* bpchar */ String]].imap(_.map(CurrencyId.apply))(_.map(_.value))
}
