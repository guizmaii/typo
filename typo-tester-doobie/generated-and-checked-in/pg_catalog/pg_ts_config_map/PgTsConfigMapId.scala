/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_config_map

import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

/** Type for the composite primary key of table `pg_catalog.pg_ts_config_map` */
case class PgTsConfigMapId(mapcfg: /* oid */ Long, maptokentype: Int, mapseqno: Int)
object PgTsConfigMapId {
  implicit val ordering: Ordering[PgTsConfigMapId] = Ordering.by(x => (x.mapcfg, x.maptokentype, x.mapseqno))
  implicit val decoder: Decoder[PgTsConfigMapId] =
    (c: HCursor) =>
      for {
        mapcfg <- c.downField("mapcfg").as[/* oid */ Long]
        maptokentype <- c.downField("maptokentype").as[Int]
        mapseqno <- c.downField("mapseqno").as[Int]
      } yield PgTsConfigMapId(mapcfg, maptokentype, mapseqno)
  implicit val encoder: Encoder[PgTsConfigMapId] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "mapcfg" := row.mapcfg,
        "maptokentype" := row.maptokentype,
        "mapseqno" := row.mapseqno
      )}
}
