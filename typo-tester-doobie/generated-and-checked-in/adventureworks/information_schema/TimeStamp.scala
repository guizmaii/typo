/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema

import adventureworks.customtypes.TypoOffsetDateTime
import doobie.util.Get
import doobie.util.Put
import io.circe.Decoder
import io.circe.Encoder
import typo.dsl.Bijection

/** Domain `information_schema.time_stamp`
  * No constraint
  */
case class TimeStamp(value: TypoOffsetDateTime) extends AnyVal
object TimeStamp {
  implicit lazy val arrayGet: Get[Array[TimeStamp]] = TypoOffsetDateTime.arrayGet.map(_.map(TimeStamp.apply))
  implicit lazy val arrayPut: Put[Array[TimeStamp]] = TypoOffsetDateTime.arrayPut.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[TimeStamp, TypoOffsetDateTime] = Bijection[TimeStamp, TypoOffsetDateTime](_.value)(TimeStamp.apply)
  implicit lazy val decoder: Decoder[TimeStamp] = TypoOffsetDateTime.decoder.map(TimeStamp.apply)
  implicit lazy val encoder: Encoder[TimeStamp] = TypoOffsetDateTime.encoder.contramap(_.value)
  implicit lazy val get: Get[TimeStamp] = TypoOffsetDateTime.get.map(TimeStamp.apply)
  implicit def ordering(implicit O0: Ordering[TypoOffsetDateTime]): Ordering[TimeStamp] = Ordering.by(_.value)
  implicit lazy val put: Put[TimeStamp] = TypoOffsetDateTime.put.contramap(_.value)
}