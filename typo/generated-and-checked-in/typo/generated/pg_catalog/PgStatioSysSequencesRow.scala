/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatioSysSequencesRow(
  /** Points to [[PgStatioAllSequencesRow.relid]] */
  relid: Option[Long] /* {"baseColumnName":"relid","baseRelationName":"pg_catalog.pg_statio_all_sequences","columnClassName":"java.lang.Long","columnDisplaySize":10,"columnLabel":"relid","columnName":"relid","columnType":"BigInt","columnTypeName":"oid","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":10,"scale":0,"tableName":"pg_statio_all_sequences"} */,
  /** Points to [[PgStatioAllSequencesRow.schemaname]] */
  schemaname: Option[String] /* {"baseColumnName":"schemaname","baseRelationName":"pg_catalog.pg_statio_all_sequences","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"schemaname","columnName":"schemaname","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_statio_all_sequences"} */,
  /** Points to [[PgStatioAllSequencesRow.relname]] */
  relname: Option[String] /* {"baseColumnName":"relname","baseRelationName":"pg_catalog.pg_statio_all_sequences","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"relname","columnName":"relname","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_statio_all_sequences"} */,
  /** Points to [[PgStatioAllSequencesRow.blksRead]] */
  blksRead: Option[Long] /* {"baseColumnName":"blks_read","baseRelationName":"pg_catalog.pg_statio_all_sequences","columnClassName":"java.lang.Long","columnDisplaySize":20,"columnLabel":"blks_read","columnName":"blks_read","columnType":"BigInt","columnTypeName":"int8","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":19,"scale":0,"tableName":"pg_statio_all_sequences"} */,
  /** Points to [[PgStatioAllSequencesRow.blksHit]] */
  blksHit: Option[Long] /* {"baseColumnName":"blks_hit","baseRelationName":"pg_catalog.pg_statio_all_sequences","columnClassName":"java.lang.Long","columnDisplaySize":20,"columnLabel":"blks_hit","columnName":"blks_hit","columnType":"BigInt","columnTypeName":"int8","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":19,"scale":0,"tableName":"pg_statio_all_sequences"} */
)

object PgStatioSysSequencesRow {
  implicit val rowParser: RowParser[PgStatioSysSequencesRow] = { row =>
    Success(
      PgStatioSysSequencesRow(
        relid = row[Option[Long]]("relid"),
        schemaname = row[Option[String]]("schemaname"),
        relname = row[Option[String]]("relname"),
        blksRead = row[Option[Long]]("blks_read"),
        blksHit = row[Option[Long]]("blks_hit")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatioSysSequencesRow] = new OFormat[PgStatioSysSequencesRow]{
    override def writes(o: PgStatioSysSequencesRow): JsObject =
      Json.obj(
        "relid" -> o.relid,
      "schemaname" -> o.schemaname,
      "relname" -> o.relname,
      "blks_read" -> o.blksRead,
      "blks_hit" -> o.blksHit
      )

    override def reads(json: JsValue): JsResult[PgStatioSysSequencesRow] = {
      JsResult.fromTry(
        Try(
          PgStatioSysSequencesRow(
            relid = json.\("relid").toOption.map(_.as[Long]),
            schemaname = json.\("schemaname").toOption.map(_.as[String]),
            relname = json.\("relname").toOption.map(_.as[String]),
            blksRead = json.\("blks_read").toOption.map(_.as[Long]),
            blksHit = json.\("blks_hit").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
