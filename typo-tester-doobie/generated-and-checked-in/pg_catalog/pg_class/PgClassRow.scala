/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_class

import adventureworks.TypoAclItem
import adventureworks.TypoPgNodeTree
import adventureworks.TypoXid
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgClassRow(
  oid: PgClassId,
  relname: String,
  relnamespace: /* oid */ Long,
  reltype: /* oid */ Long,
  reloftype: /* oid */ Long,
  relowner: /* oid */ Long,
  relam: /* oid */ Long,
  relfilenode: /* oid */ Long,
  reltablespace: /* oid */ Long,
  relpages: Int,
  reltuples: Float,
  relallvisible: Int,
  reltoastrelid: /* oid */ Long,
  relhasindex: Boolean,
  relisshared: Boolean,
  relpersistence: String,
  relkind: String,
  relnatts: Int,
  relchecks: Int,
  relhasrules: Boolean,
  relhastriggers: Boolean,
  relhassubclass: Boolean,
  relrowsecurity: Boolean,
  relforcerowsecurity: Boolean,
  relispopulated: Boolean,
  relreplident: String,
  relispartition: Boolean,
  relrewrite: /* oid */ Long,
  relfrozenxid: TypoXid,
  relminmxid: TypoXid,
  relacl: Option[Array[TypoAclItem]],
  reloptions: Option[Array[String]],
  relpartbound: Option[TypoPgNodeTree]
)

object PgClassRow {
  implicit val decoder: Decoder[PgClassRow] =
    (c: HCursor) =>
      for {
        oid <- c.downField("oid").as[PgClassId]
        relname <- c.downField("relname").as[String]
        relnamespace <- c.downField("relnamespace").as[/* oid */ Long]
        reltype <- c.downField("reltype").as[/* oid */ Long]
        reloftype <- c.downField("reloftype").as[/* oid */ Long]
        relowner <- c.downField("relowner").as[/* oid */ Long]
        relam <- c.downField("relam").as[/* oid */ Long]
        relfilenode <- c.downField("relfilenode").as[/* oid */ Long]
        reltablespace <- c.downField("reltablespace").as[/* oid */ Long]
        relpages <- c.downField("relpages").as[Int]
        reltuples <- c.downField("reltuples").as[Float]
        relallvisible <- c.downField("relallvisible").as[Int]
        reltoastrelid <- c.downField("reltoastrelid").as[/* oid */ Long]
        relhasindex <- c.downField("relhasindex").as[Boolean]
        relisshared <- c.downField("relisshared").as[Boolean]
        relpersistence <- c.downField("relpersistence").as[String]
        relkind <- c.downField("relkind").as[String]
        relnatts <- c.downField("relnatts").as[Int]
        relchecks <- c.downField("relchecks").as[Int]
        relhasrules <- c.downField("relhasrules").as[Boolean]
        relhastriggers <- c.downField("relhastriggers").as[Boolean]
        relhassubclass <- c.downField("relhassubclass").as[Boolean]
        relrowsecurity <- c.downField("relrowsecurity").as[Boolean]
        relforcerowsecurity <- c.downField("relforcerowsecurity").as[Boolean]
        relispopulated <- c.downField("relispopulated").as[Boolean]
        relreplident <- c.downField("relreplident").as[String]
        relispartition <- c.downField("relispartition").as[Boolean]
        relrewrite <- c.downField("relrewrite").as[/* oid */ Long]
        relfrozenxid <- c.downField("relfrozenxid").as[TypoXid]
        relminmxid <- c.downField("relminmxid").as[TypoXid]
        relacl <- c.downField("relacl").as[Option[Array[TypoAclItem]]]
        reloptions <- c.downField("reloptions").as[Option[Array[String]]]
        relpartbound <- c.downField("relpartbound").as[Option[TypoPgNodeTree]]
      } yield PgClassRow(oid, relname, relnamespace, reltype, reloftype, relowner, relam, relfilenode, reltablespace, relpages, reltuples, relallvisible, reltoastrelid, relhasindex, relisshared, relpersistence, relkind, relnatts, relchecks, relhasrules, relhastriggers, relhassubclass, relrowsecurity, relforcerowsecurity, relispopulated, relreplident, relispartition, relrewrite, relfrozenxid, relminmxid, relacl, reloptions, relpartbound)
  implicit val encoder: Encoder[PgClassRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "oid" := row.oid,
        "relname" := row.relname,
        "relnamespace" := row.relnamespace,
        "reltype" := row.reltype,
        "reloftype" := row.reloftype,
        "relowner" := row.relowner,
        "relam" := row.relam,
        "relfilenode" := row.relfilenode,
        "reltablespace" := row.reltablespace,
        "relpages" := row.relpages,
        "reltuples" := row.reltuples,
        "relallvisible" := row.relallvisible,
        "reltoastrelid" := row.reltoastrelid,
        "relhasindex" := row.relhasindex,
        "relisshared" := row.relisshared,
        "relpersistence" := row.relpersistence,
        "relkind" := row.relkind,
        "relnatts" := row.relnatts,
        "relchecks" := row.relchecks,
        "relhasrules" := row.relhasrules,
        "relhastriggers" := row.relhastriggers,
        "relhassubclass" := row.relhassubclass,
        "relrowsecurity" := row.relrowsecurity,
        "relforcerowsecurity" := row.relforcerowsecurity,
        "relispopulated" := row.relispopulated,
        "relreplident" := row.relreplident,
        "relispartition" := row.relispartition,
        "relrewrite" := row.relrewrite,
        "relfrozenxid" := row.relfrozenxid,
        "relminmxid" := row.relminmxid,
        "relacl" := row.relacl,
        "reloptions" := row.reloptions,
        "relpartbound" := row.relpartbound
      )}
  implicit val read: Read[PgClassRow] =
    new Read[PgClassRow](
      gets = List(
        (Get[PgClassId], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Float], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[TypoXid], Nullability.NoNulls),
        (Get[TypoXid], Nullability.NoNulls),
        (Get[Array[TypoAclItem]], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable),
        (Get[TypoPgNodeTree], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgClassRow(
        oid = Get[PgClassId].unsafeGetNonNullable(rs, i + 0),
        relname = Get[String].unsafeGetNonNullable(rs, i + 1),
        relnamespace = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 2),
        reltype = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 3),
        reloftype = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 4),
        relowner = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 5),
        relam = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 6),
        relfilenode = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 7),
        reltablespace = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 8),
        relpages = Get[Int].unsafeGetNonNullable(rs, i + 9),
        reltuples = Get[Float].unsafeGetNonNullable(rs, i + 10),
        relallvisible = Get[Int].unsafeGetNonNullable(rs, i + 11),
        reltoastrelid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 12),
        relhasindex = Get[Boolean].unsafeGetNonNullable(rs, i + 13),
        relisshared = Get[Boolean].unsafeGetNonNullable(rs, i + 14),
        relpersistence = Get[String].unsafeGetNonNullable(rs, i + 15),
        relkind = Get[String].unsafeGetNonNullable(rs, i + 16),
        relnatts = Get[Int].unsafeGetNonNullable(rs, i + 17),
        relchecks = Get[Int].unsafeGetNonNullable(rs, i + 18),
        relhasrules = Get[Boolean].unsafeGetNonNullable(rs, i + 19),
        relhastriggers = Get[Boolean].unsafeGetNonNullable(rs, i + 20),
        relhassubclass = Get[Boolean].unsafeGetNonNullable(rs, i + 21),
        relrowsecurity = Get[Boolean].unsafeGetNonNullable(rs, i + 22),
        relforcerowsecurity = Get[Boolean].unsafeGetNonNullable(rs, i + 23),
        relispopulated = Get[Boolean].unsafeGetNonNullable(rs, i + 24),
        relreplident = Get[String].unsafeGetNonNullable(rs, i + 25),
        relispartition = Get[Boolean].unsafeGetNonNullable(rs, i + 26),
        relrewrite = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 27),
        relfrozenxid = Get[TypoXid].unsafeGetNonNullable(rs, i + 28),
        relminmxid = Get[TypoXid].unsafeGetNonNullable(rs, i + 29),
        relacl = Get[Array[TypoAclItem]].unsafeGetNullable(rs, i + 30),
        reloptions = Get[Array[String]].unsafeGetNullable(rs, i + 31),
        relpartbound = Get[TypoPgNodeTree].unsafeGetNullable(rs, i + 32)
      )
    )
  

}
