/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_rewrite

import adventureworks.customtypes.TypoPgNodeTree
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.Structure.Relation

class PgRewriteStructure[Row](val prefix: Option[String], val extract: Row => PgRewriteRow, val merge: (Row, PgRewriteRow) => Row)
  extends Relation[PgRewriteFields, PgRewriteRow, Row]
    with PgRewriteFields[Row] { outer =>

  override val oid = new IdField[PgRewriteId, Row](prefix, "oid", None, Some("oid"))(x => extract(x).oid, (row, value) => merge(row, extract(row).copy(oid = value)))
  override val rulename = new Field[String, Row](prefix, "rulename", None, Some("name"))(x => extract(x).rulename, (row, value) => merge(row, extract(row).copy(rulename = value)))
  override val evClass = new Field[/* oid */ Long, Row](prefix, "ev_class", None, Some("oid"))(x => extract(x).evClass, (row, value) => merge(row, extract(row).copy(evClass = value)))
  override val evType = new Field[String, Row](prefix, "ev_type", None, Some("char"))(x => extract(x).evType, (row, value) => merge(row, extract(row).copy(evType = value)))
  override val evEnabled = new Field[String, Row](prefix, "ev_enabled", None, Some("char"))(x => extract(x).evEnabled, (row, value) => merge(row, extract(row).copy(evEnabled = value)))
  override val isInstead = new Field[Boolean, Row](prefix, "is_instead", None, None)(x => extract(x).isInstead, (row, value) => merge(row, extract(row).copy(isInstead = value)))
  override val evQual = new Field[TypoPgNodeTree, Row](prefix, "ev_qual", None, Some("pg_node_tree"))(x => extract(x).evQual, (row, value) => merge(row, extract(row).copy(evQual = value)))
  override val evAction = new Field[TypoPgNodeTree, Row](prefix, "ev_action", None, Some("pg_node_tree"))(x => extract(x).evAction, (row, value) => merge(row, extract(row).copy(evAction = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](oid, rulename, evClass, evType, evEnabled, isInstead, evQual, evAction)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgRewriteRow, merge: (NewRow, PgRewriteRow) => NewRow): PgRewriteStructure[NewRow] =
    new PgRewriteStructure(prefix, extract, merge)
}
