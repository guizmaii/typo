/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks

import cats.data.NonEmptyList
import doobie.Get
import doobie.Meta
import doobie.Put
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import org.postgresql.util.PGobject

/** json (via PGObject) */
case class TypoJson(value: String)
object TypoJson {
  implicit val decoder: Decoder[TypoJson] =
    (c: HCursor) =>
      for {
        value <- c.downField("value").as[String]
      } yield TypoJson(value)
  implicit val encoder: Encoder[TypoJson] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "value" := row.value
      )}
  implicit val get: Get[TypoJson] =
    Get.Advanced.other[PGobject](cats.data.NonEmptyList.one("json"))
      .map(v => TypoJson(v.getValue))
  
  implicit val put: Put[TypoJson] =
    Put.Advanced.other[PGobject](NonEmptyList.one("json"))
      .contramap(v => {
                        val obj = new PGobject
                        obj.setType("json")
                        obj.setValue(v.value)
                        obj
                      })
  
  implicit val meta: Meta[TypoJson] = new Meta(get, put)
  val gets: Get[Array[TypoJson]] =
    Get.Advanced.array[AnyRef](NonEmptyList.one("_json"))
      .map(_.map(v => TypoJson(v.asInstanceOf[String])))
  
  val puts: Put[Array[TypoJson]] =
    Put.Advanced.array[AnyRef](NonEmptyList.one("_json"), "json")
      .contramap(_.map(v => {
                              val obj = new PGobject
                              obj.setType("json")
                              obj.setValue(v.value)
                              obj
                            }))
  
  implicit val metas: Meta[Array[TypoJson]] = new Meta(gets, puts)
}
