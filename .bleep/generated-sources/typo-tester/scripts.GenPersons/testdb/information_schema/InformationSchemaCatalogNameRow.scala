package testdb
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class InformationSchemaCatalogNameRow(
  catalogName: /* unknown nullability */ Option[String]
)

object InformationSchemaCatalogNameRow {
  implicit val rowParser: RowParser[InformationSchemaCatalogNameRow] = { row =>
    Success(
      InformationSchemaCatalogNameRow(
        catalogName = row[/* unknown nullability */ Option[String]]("catalog_name")
      )
    )
  }

  implicit val oFormat: OFormat[InformationSchemaCatalogNameRow] = new OFormat[InformationSchemaCatalogNameRow]{
    override def writes(o: InformationSchemaCatalogNameRow): JsObject =
      Json.obj(
        "catalog_name" -> o.catalogName
      )

    override def reads(json: JsValue): JsResult[InformationSchemaCatalogNameRow] = {
      JsResult.fromTry(
        Try(
          InformationSchemaCatalogNameRow(
            catalogName = json.\("catalog_name").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
