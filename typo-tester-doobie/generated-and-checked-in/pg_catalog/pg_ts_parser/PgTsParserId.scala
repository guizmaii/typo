/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_parser

import doobie.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Type for the primary key of table `pg_catalog.pg_ts_parser` */
case class PgTsParserId(value: /* oid */ Long) extends AnyVal
object PgTsParserId {
  implicit val ordering: Ordering[PgTsParserId] = Ordering.by(_.value)
  implicit val encoder: Encoder[PgTsParserId] =
    Encoder[/* oid */ Long].contramap(_.value)
  implicit val decoder: Decoder[PgTsParserId] =
    Decoder[/* oid */ Long].map(PgTsParserId(_))
  implicit val meta: Meta[PgTsParserId] = Meta[/* oid */ Long].imap(PgTsParserId.apply)(_.value)
  implicit val metaArray: Meta[Array[PgTsParserId]] = Meta[Array[/* oid */ Long]].imap(_.map(PgTsParserId.apply))(_.map(_.value))
}
