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

case class PgReplicationSlotsRow(
  slotName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"slot_name","columnName":"slot_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  plugin: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"plugin","columnName":"plugin","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  slotType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"slot_type","columnName":"slot_type","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  datoid: /* unknown nullability */ Option[Long] /* {"columnClassName":"java.lang.Long","columnDisplaySize":10,"columnLabel":"datoid","columnName":"datoid","columnType":"BigInt","columnTypeName":"oid","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":10,"scale":0} */,
  /** Points to [[PgDatabaseRow.datname]] */
  database: String /* {"baseColumnName":"datname","baseRelationName":"pg_catalog.pg_database","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"database","columnName":"database","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_database"} */,
  temporary: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"temporary","columnName":"temporary","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  active: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"active","columnName":"active","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  activePid: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"active_pid","columnName":"active_pid","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  xmin: /* unknown nullability */ Option[/* xid */ String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"xmin","columnName":"xmin","columnType":"Other","columnTypeName":"xid","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  catalogXmin: /* unknown nullability */ Option[/* xid */ String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"catalog_xmin","columnName":"catalog_xmin","columnType":"Other","columnTypeName":"xid","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  restartLsn: /* unknown nullability */ Option[/* pg_lsn */ String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"restart_lsn","columnName":"restart_lsn","columnType":"Other","columnTypeName":"pg_lsn","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  confirmedFlushLsn: /* unknown nullability */ Option[/* pg_lsn */ String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"confirmed_flush_lsn","columnName":"confirmed_flush_lsn","columnType":"Other","columnTypeName":"pg_lsn","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  walStatus: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"wal_status","columnName":"wal_status","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  safeWalSize: /* unknown nullability */ Option[Long] /* {"columnClassName":"java.lang.Long","columnDisplaySize":20,"columnLabel":"safe_wal_size","columnName":"safe_wal_size","columnType":"BigInt","columnTypeName":"int8","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":19,"scale":0} */,
  twoPhase: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"two_phase","columnName":"two_phase","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */
)

object PgReplicationSlotsRow {
  implicit val rowParser: RowParser[PgReplicationSlotsRow] = { row =>
    Success(
      PgReplicationSlotsRow(
        slotName = row[/* unknown nullability */ Option[String]]("slot_name"),
        plugin = row[/* unknown nullability */ Option[String]]("plugin"),
        slotType = row[/* unknown nullability */ Option[String]]("slot_type"),
        datoid = row[/* unknown nullability */ Option[Long]]("datoid"),
        database = row[String]("database"),
        temporary = row[/* unknown nullability */ Option[Boolean]]("temporary"),
        active = row[/* unknown nullability */ Option[Boolean]]("active"),
        activePid = row[/* unknown nullability */ Option[Int]]("active_pid"),
        xmin = row[/* unknown nullability */ Option[/* xid */ String]]("xmin"),
        catalogXmin = row[/* unknown nullability */ Option[/* xid */ String]]("catalog_xmin"),
        restartLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("restart_lsn"),
        confirmedFlushLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("confirmed_flush_lsn"),
        walStatus = row[/* unknown nullability */ Option[String]]("wal_status"),
        safeWalSize = row[/* unknown nullability */ Option[Long]]("safe_wal_size"),
        twoPhase = row[/* unknown nullability */ Option[Boolean]]("two_phase")
      )
    )
  }

  implicit val oFormat: OFormat[PgReplicationSlotsRow] = new OFormat[PgReplicationSlotsRow]{
    override def writes(o: PgReplicationSlotsRow): JsObject =
      Json.obj(
        "slot_name" -> o.slotName,
      "plugin" -> o.plugin,
      "slot_type" -> o.slotType,
      "datoid" -> o.datoid,
      "database" -> o.database,
      "temporary" -> o.temporary,
      "active" -> o.active,
      "active_pid" -> o.activePid,
      "xmin" -> o.xmin,
      "catalog_xmin" -> o.catalogXmin,
      "restart_lsn" -> o.restartLsn,
      "confirmed_flush_lsn" -> o.confirmedFlushLsn,
      "wal_status" -> o.walStatus,
      "safe_wal_size" -> o.safeWalSize,
      "two_phase" -> o.twoPhase
      )

    override def reads(json: JsValue): JsResult[PgReplicationSlotsRow] = {
      JsResult.fromTry(
        Try(
          PgReplicationSlotsRow(
            slotName = json.\("slot_name").toOption.map(_.as[String]),
            plugin = json.\("plugin").toOption.map(_.as[String]),
            slotType = json.\("slot_type").toOption.map(_.as[String]),
            datoid = json.\("datoid").toOption.map(_.as[Long]),
            database = json.\("database").as[String],
            temporary = json.\("temporary").toOption.map(_.as[Boolean]),
            active = json.\("active").toOption.map(_.as[Boolean]),
            activePid = json.\("active_pid").toOption.map(_.as[Int]),
            xmin = json.\("xmin").toOption.map(_.as[/* xid */ String]),
            catalogXmin = json.\("catalog_xmin").toOption.map(_.as[/* xid */ String]),
            restartLsn = json.\("restart_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            confirmedFlushLsn = json.\("confirmed_flush_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            walStatus = json.\("wal_status").toOption.map(_.as[String]),
            safeWalSize = json.\("safe_wal_size").toOption.map(_.as[Long]),
            twoPhase = json.\("two_phase").toOption.map(_.as[Boolean])
          )
        )
      )
    }
  }
}
