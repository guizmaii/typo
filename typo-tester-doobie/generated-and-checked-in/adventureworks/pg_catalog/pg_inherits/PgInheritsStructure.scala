/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_inherits

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.Structure.Relation

class PgInheritsStructure[Row](val prefix: Option[String], val extract: Row => PgInheritsRow, val merge: (Row, PgInheritsRow) => Row)
  extends Relation[PgInheritsFields, PgInheritsRow, Row]
    with PgInheritsFields[Row] { outer =>

  override val inhrelid = new IdField[/* oid */ Long, Row](prefix, "inhrelid", None, Some("oid"))(x => extract(x).inhrelid, (row, value) => merge(row, extract(row).copy(inhrelid = value)))
  override val inhparent = new Field[/* oid */ Long, Row](prefix, "inhparent", None, Some("oid"))(x => extract(x).inhparent, (row, value) => merge(row, extract(row).copy(inhparent = value)))
  override val inhseqno = new IdField[Int, Row](prefix, "inhseqno", None, Some("int4"))(x => extract(x).inhseqno, (row, value) => merge(row, extract(row).copy(inhseqno = value)))
  override val inhdetachpending = new Field[Boolean, Row](prefix, "inhdetachpending", None, None)(x => extract(x).inhdetachpending, (row, value) => merge(row, extract(row).copy(inhdetachpending = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](inhrelid, inhparent, inhseqno, inhdetachpending)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgInheritsRow, merge: (NewRow, PgInheritsRow) => NewRow): PgInheritsStructure[NewRow] =
    new PgInheritsStructure(prefix, extract, merge)
}
