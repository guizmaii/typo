/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentity

import doobie.util.Get
import doobie.util.Put
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import typo.dsl.Bijection

/** Type for the primary key of table `person.businessentity` */
case class BusinessentityId(value: Int) extends AnyVal
object BusinessentityId {
  implicit lazy val arrayGet: Get[Array[BusinessentityId]] = adventureworks.IntegerArrayMeta.get.map(_.map(BusinessentityId.apply))
  implicit lazy val arrayPut: Put[Array[BusinessentityId]] = adventureworks.IntegerArrayMeta.put.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[BusinessentityId, Int] = Bijection[BusinessentityId, Int](_.value)(BusinessentityId.apply)
  implicit lazy val decoder: Decoder[BusinessentityId] = Decoder.decodeInt.map(BusinessentityId.apply)
  implicit lazy val encoder: Encoder[BusinessentityId] = Encoder.encodeInt.contramap(_.value)
  implicit lazy val get: Get[BusinessentityId] = Meta.IntMeta.get.map(BusinessentityId.apply)
  implicit lazy val ordering: Ordering[BusinessentityId] = Ordering.by(_.value)
  implicit lazy val put: Put[BusinessentityId] = Meta.IntMeta.put.contramap(_.value)
}
