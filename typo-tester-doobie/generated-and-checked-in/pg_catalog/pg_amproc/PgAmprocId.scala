/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_amproc

import doobie.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Type for the primary key of table `pg_catalog.pg_amproc` */
case class PgAmprocId(value: /* oid */ Long) extends AnyVal
object PgAmprocId {
  implicit val ordering: Ordering[PgAmprocId] = Ordering.by(_.value)
  implicit val encoder: Encoder[PgAmprocId] =
    Encoder[/* oid */ Long].contramap(_.value)
  implicit val decoder: Decoder[PgAmprocId] =
    Decoder[/* oid */ Long].map(PgAmprocId(_))
  implicit val meta: Meta[PgAmprocId] = Meta[/* oid */ Long].imap(PgAmprocId.apply)(_.value)
  implicit val metaArray: Meta[Array[PgAmprocId]] = Meta[Array[/* oid */ Long]].imap(_.map(PgAmprocId.apply))(_.map(_.value))
}
