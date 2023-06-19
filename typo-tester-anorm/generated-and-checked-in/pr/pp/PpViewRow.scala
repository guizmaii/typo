/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pp

import adventureworks.production.productphoto.ProductphotoId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PpViewRow(
  id: Option[Int],
  /** Points to [[production.productphoto.ProductphotoRow.productphotoid]] */
  productphotoid: Option[ProductphotoId],
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphoto]] */
  thumbnailphoto: Option[Byte],
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphotofilename]] */
  thumbnailphotofilename: Option[/* max 50 chars */ String],
  /** Points to [[production.productphoto.ProductphotoRow.largephoto]] */
  largephoto: Option[Byte],
  /** Points to [[production.productphoto.ProductphotoRow.largephotofilename]] */
  largephotofilename: Option[/* max 50 chars */ String],
  /** Points to [[production.productphoto.ProductphotoRow.modifieddate]] */
  modifieddate: Option[LocalDateTime]
)

object PpViewRow {
  implicit val oFormat: OFormat[PpViewRow] = new OFormat[PpViewRow]{
    override def writes(o: PpViewRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "productphotoid" -> o.productphotoid,
        "thumbnailphoto" -> o.thumbnailphoto,
        "thumbnailphotofilename" -> o.thumbnailphotofilename,
        "largephoto" -> o.largephoto,
        "largephotofilename" -> o.largephotofilename,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PpViewRow] = {
      JsResult.fromTry(
        Try(
          PpViewRow(
            id = json.\("id").toOption.map(_.as[Int]),
            productphotoid = json.\("productphotoid").toOption.map(_.as[ProductphotoId]),
            thumbnailphoto = json.\("thumbnailphoto").toOption.map(_.as[Byte]),
            thumbnailphotofilename = json.\("thumbnailphotofilename").toOption.map(_.as[/* max 50 chars */ String]),
            largephoto = json.\("largephoto").toOption.map(_.as[Byte]),
            largephotofilename = json.\("largephotofilename").toOption.map(_.as[/* max 50 chars */ String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
