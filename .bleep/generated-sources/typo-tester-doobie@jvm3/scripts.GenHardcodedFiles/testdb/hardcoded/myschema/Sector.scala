/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package hardcoded
package myschema

import doobie.util.Get
import doobie.util.Put
import doobie.util.Read
import doobie.util.Write
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Enum `myschema.sector`
  *  - PUBLIC
  *  - PRIVATE
  *  - OTHER
  */
sealed abstract class Sector(val value: String)

object Sector {
  def apply(str: String): Either[String, Sector] =
    ByName.get(str).toRight(s"'$str' does not match any of the following legal values: $Names")
  def force(str: String): Sector =
    apply(str) match {
      case Left(msg) => sys.error(msg)
      case Right(value) => value
    }
  case object `_public` extends Sector("PUBLIC")
  case object `_private` extends Sector("PRIVATE")
  case object `_other` extends Sector("OTHER")
  val All: List[Sector] = List(`_public`, `_private`, `_other`)
  val Names: String = All.map(_.value).mkString(", ")
  val ByName: Map[String, Sector] = All.map(x => (x.value, x)).toMap
              
  implicit lazy val arrayGet: Get[Array[Sector]] = testdb.hardcoded.StringArrayMeta.get.map(_.map(force))
  implicit lazy val arrayPut: Put[Array[Sector]] = testdb.hardcoded.StringArrayMeta.put.contramap(_.map(_.value))
  implicit lazy val decoder: Decoder[Sector] = Decoder.decodeString.emap(Sector.apply)
  implicit lazy val encoder: Encoder[Sector] = Encoder.encodeString.contramap(_.value)
  implicit lazy val get: Get[Sector] = Meta.StringMeta.get.temap(Sector.apply)
  implicit lazy val ordering: Ordering[Sector] = Ordering.by(_.value)
  implicit lazy val put: Put[Sector] = Meta.StringMeta.put.contramap(_.value)
  implicit lazy val read: Read[Sector] = Read.fromGet(get)
  implicit lazy val write: Write[Sector] = Write.fromPut(put)
}
