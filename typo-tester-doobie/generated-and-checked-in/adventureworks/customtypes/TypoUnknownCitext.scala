/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package customtypes

import cats.data.NonEmptyList
import doobie.util.Get
import doobie.util.Put
import io.circe.Decoder
import io.circe.Encoder
import typo.dsl.Bijection

/** This is a type typo does not know how to handle yet. This falls back to casting to string and crossing fingers. Time to file an issue! :] */
case class TypoUnknownCitext(value: String)

object TypoUnknownCitext {
  implicit lazy val arrayGet: Get[Array[TypoUnknownCitext]] = Get.Advanced.array[AnyRef](NonEmptyList.one("_citext"))
    .map(_.map(v => TypoUnknownCitext(v.asInstanceOf[String])))
  implicit lazy val arrayPut: Put[Array[TypoUnknownCitext]] = Put.Advanced.array[AnyRef](NonEmptyList.one("_citext"), "citext")
    .contramap(_.map(v => v.value))
  implicit lazy val bijection: Bijection[TypoUnknownCitext, String] = Bijection[TypoUnknownCitext, String](_.value)(TypoUnknownCitext.apply)
  implicit lazy val decoder: Decoder[TypoUnknownCitext] = Decoder.decodeString.map(TypoUnknownCitext.apply)
  implicit lazy val encoder: Encoder[TypoUnknownCitext] = Encoder.encodeString.contramap(_.value)
  implicit lazy val get: Get[TypoUnknownCitext] = Get.Advanced.other[String](NonEmptyList.one("citext"))
    .map(v => TypoUnknownCitext(v))
  implicit lazy val ordering: Ordering[TypoUnknownCitext] = Ordering.by(_.value)
  implicit lazy val put: Put[TypoUnknownCitext] = Put.Advanced.other[String](NonEmptyList.one("citext")).contramap(v => v.value)
}
