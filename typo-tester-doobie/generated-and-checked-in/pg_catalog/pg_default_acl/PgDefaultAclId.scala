/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_default_acl

import doobie.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Type for the primary key of table `pg_catalog.pg_default_acl` */
case class PgDefaultAclId(value: /* oid */ Long) extends AnyVal
object PgDefaultAclId {
  implicit val ordering: Ordering[PgDefaultAclId] = Ordering.by(_.value)
  implicit val encoder: Encoder[PgDefaultAclId] =
    Encoder[/* oid */ Long].contramap(_.value)
  implicit val decoder: Decoder[PgDefaultAclId] =
    Decoder[/* oid */ Long].map(PgDefaultAclId(_))
  implicit val meta: Meta[PgDefaultAclId] = Meta[/* oid */ Long].imap(PgDefaultAclId.apply)(_.value)
  implicit val metaArray: Meta[Array[PgDefaultAclId]] = Meta[Array[/* oid */ Long]].imap(_.map(PgDefaultAclId.apply))(_.map(_.value))
}
