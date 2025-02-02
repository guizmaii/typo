/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currencyrate

import doobie.util.Get
import doobie.util.Put
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import typo.dsl.Bijection

/** Type for the primary key of table `sales.currencyrate` */
case class CurrencyrateId(value: Int) extends AnyVal
object CurrencyrateId {
  implicit lazy val arrayGet: Get[Array[CurrencyrateId]] = adventureworks.IntegerArrayMeta.get.map(_.map(CurrencyrateId.apply))
  implicit lazy val arrayPut: Put[Array[CurrencyrateId]] = adventureworks.IntegerArrayMeta.put.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[CurrencyrateId, Int] = Bijection[CurrencyrateId, Int](_.value)(CurrencyrateId.apply)
  implicit lazy val decoder: Decoder[CurrencyrateId] = Decoder.decodeInt.map(CurrencyrateId.apply)
  implicit lazy val encoder: Encoder[CurrencyrateId] = Encoder.encodeInt.contramap(_.value)
  implicit lazy val get: Get[CurrencyrateId] = Meta.IntMeta.get.map(CurrencyrateId.apply)
  implicit lazy val ordering: Ordering[CurrencyrateId] = Ordering.by(_.value)
  implicit lazy val put: Put[CurrencyrateId] = Meta.IntMeta.put.contramap(_.value)
}
