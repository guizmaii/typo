/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_depend

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.Structure.Relation

class PgDependStructure[Row](val prefix: Option[String], val extract: Row => PgDependRow, val merge: (Row, PgDependRow) => Row)
  extends Relation[PgDependFields, PgDependRow, Row]
    with PgDependFields[Row] { outer =>

  override val classid = new Field[/* oid */ Long, Row](prefix, "classid", None, Some("oid"))(x => extract(x).classid, (row, value) => merge(row, extract(row).copy(classid = value)))
  override val objid = new Field[/* oid */ Long, Row](prefix, "objid", None, Some("oid"))(x => extract(x).objid, (row, value) => merge(row, extract(row).copy(objid = value)))
  override val objsubid = new Field[Int, Row](prefix, "objsubid", None, Some("int4"))(x => extract(x).objsubid, (row, value) => merge(row, extract(row).copy(objsubid = value)))
  override val refclassid = new Field[/* oid */ Long, Row](prefix, "refclassid", None, Some("oid"))(x => extract(x).refclassid, (row, value) => merge(row, extract(row).copy(refclassid = value)))
  override val refobjid = new Field[/* oid */ Long, Row](prefix, "refobjid", None, Some("oid"))(x => extract(x).refobjid, (row, value) => merge(row, extract(row).copy(refobjid = value)))
  override val refobjsubid = new Field[Int, Row](prefix, "refobjsubid", None, Some("int4"))(x => extract(x).refobjsubid, (row, value) => merge(row, extract(row).copy(refobjsubid = value)))
  override val deptype = new Field[String, Row](prefix, "deptype", None, Some("char"))(x => extract(x).deptype, (row, value) => merge(row, extract(row).copy(deptype = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](classid, objid, objsubid, refclassid, refobjid, refobjsubid, deptype)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgDependRow, merge: (NewRow, PgDependRow) => NewRow): PgDependStructure[NewRow] =
    new PgDependStructure(prefix, extract, merge)
}
