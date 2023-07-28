/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_largeobject

import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

/** Type for the composite primary key of table `pg_catalog.pg_largeobject` */
case class PgLargeobjectId(loid: /* oid */ Long, pageno: Int)
object PgLargeobjectId {
  implicit val ordering: Ordering[PgLargeobjectId] = Ordering.by(x => (x.loid, x.pageno))
  implicit val decoder: Decoder[PgLargeobjectId] =
    (c: HCursor) =>
      for {
        loid <- c.downField("loid").as[/* oid */ Long]
        pageno <- c.downField("pageno").as[Int]
      } yield PgLargeobjectId(loid, pageno)
  implicit val encoder: Encoder[PgLargeobjectId] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "loid" := row.loid,
        "pageno" := row.pageno
      )}
}
