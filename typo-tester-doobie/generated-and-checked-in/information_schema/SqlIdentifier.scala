/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema

import doobie.util.Get
import doobie.util.Put
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import typo.dsl.Bijection

/** Domain `information_schema.sql_identifier`
  * No constraint
  */
case class SqlIdentifier(value: String) extends AnyVal
object SqlIdentifier {
  implicit lazy val arrayGet: Get[Array[SqlIdentifier]] = adventureworks.StringArrayMeta.get.map(_.map(SqlIdentifier.apply))
  implicit lazy val arrayPut: Put[Array[SqlIdentifier]] = adventureworks.StringArrayMeta.put.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[SqlIdentifier, String] = Bijection[SqlIdentifier, String](_.value)(SqlIdentifier.apply)
  implicit lazy val decoder: Decoder[SqlIdentifier] = Decoder.decodeString.map(SqlIdentifier.apply)
  implicit lazy val encoder: Encoder[SqlIdentifier] = Encoder.encodeString.contramap(_.value)
  implicit lazy val get: Get[SqlIdentifier] = Meta.StringMeta.get.map(SqlIdentifier.apply)
  implicit lazy val ordering: Ordering[SqlIdentifier] = Ordering.by(_.value)
  implicit lazy val put: Put[SqlIdentifier] = Meta.StringMeta.put.contramap(_.value)
}