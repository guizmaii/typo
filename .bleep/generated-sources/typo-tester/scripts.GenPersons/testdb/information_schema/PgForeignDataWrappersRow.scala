package testdb.information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgForeignDataWrappersRow(
  /** Points to [[testdb.pg_catalog.PgForeignDataWrapperRow.oid]] */
  oid: Long,
  /** Points to [[testdb.pg_catalog.PgForeignDataWrapperRow.fdwowner]] */
  fdwowner: Long,
  /** Points to [[testdb.pg_catalog.PgForeignDataWrapperRow.fdwoptions]] */
  fdwoptions: Option[Array[String]],
  foreignDataWrapperCatalog: /* unknown nullability */ Option[String],
  foreignDataWrapperName: /* unknown nullability */ Option[String],
  authorizationIdentifier: /* unknown nullability */ Option[String],
  foreignDataWrapperLanguage: /* unknown nullability */ Option[String]
)

object PgForeignDataWrappersRow {
  implicit val rowParser: RowParser[PgForeignDataWrappersRow] = { row =>
    Success(
      PgForeignDataWrappersRow(
        oid = row[Long]("oid"),
        fdwowner = row[Long]("fdwowner"),
        fdwoptions = row[Option[Array[String]]]("fdwoptions"),
        foreignDataWrapperCatalog = row[/* unknown nullability */ Option[String]]("foreign_data_wrapper_catalog"),
        foreignDataWrapperName = row[/* unknown nullability */ Option[String]]("foreign_data_wrapper_name"),
        authorizationIdentifier = row[/* unknown nullability */ Option[String]]("authorization_identifier"),
        foreignDataWrapperLanguage = row[/* unknown nullability */ Option[String]]("foreign_data_wrapper_language")
      )
    )
  }

  implicit val oFormat: OFormat[PgForeignDataWrappersRow] = new OFormat[PgForeignDataWrappersRow]{
    override def writes(o: PgForeignDataWrappersRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "fdwowner" -> o.fdwowner,
      "fdwoptions" -> o.fdwoptions,
      "foreign_data_wrapper_catalog" -> o.foreignDataWrapperCatalog,
      "foreign_data_wrapper_name" -> o.foreignDataWrapperName,
      "authorization_identifier" -> o.authorizationIdentifier,
      "foreign_data_wrapper_language" -> o.foreignDataWrapperLanguage
      )

    override def reads(json: JsValue): JsResult[PgForeignDataWrappersRow] = {
      JsResult.fromTry(
        Try(
          PgForeignDataWrappersRow(
            oid = json.\("oid").as[Long],
            fdwowner = json.\("fdwowner").as[Long],
            fdwoptions = json.\("fdwoptions").toOption.map(_.as[Array[String]]),
            foreignDataWrapperCatalog = json.\("foreign_data_wrapper_catalog").toOption.map(_.as[String]),
            foreignDataWrapperName = json.\("foreign_data_wrapper_name").toOption.map(_.as[String]),
            authorizationIdentifier = json.\("authorization_identifier").toOption.map(_.as[String]),
            foreignDataWrapperLanguage = json.\("foreign_data_wrapper_language").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
