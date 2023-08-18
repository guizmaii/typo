/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_policy

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgPolicyStructure[Row](val prefix: Option[String], val extract: Row => PgPolicyRow, val merge: (Row, PgPolicyRow) => Row)
  extends Relation[PgPolicyFields, PgPolicyRow, Row]
    with PgPolicyFields[Row] { outer =>

  override val oid = new IdField[PgPolicyId, Row](prefix, "oid", None, Some("oid"))(x => extract(x).oid, (row, value) => merge(row, extract(row).copy(oid = value)))
  override val polname = new Field[String, Row](prefix, "polname", None, Some("name"))(x => extract(x).polname, (row, value) => merge(row, extract(row).copy(polname = value)))
  override val polrelid = new Field[/* oid */ Long, Row](prefix, "polrelid", None, Some("oid"))(x => extract(x).polrelid, (row, value) => merge(row, extract(row).copy(polrelid = value)))
  override val polcmd = new Field[String, Row](prefix, "polcmd", None, Some("char"))(x => extract(x).polcmd, (row, value) => merge(row, extract(row).copy(polcmd = value)))
  override val polpermissive = new Field[Boolean, Row](prefix, "polpermissive", None, None)(x => extract(x).polpermissive, (row, value) => merge(row, extract(row).copy(polpermissive = value)))
  override val polroles = new Field[Array[/* oid */ Long], Row](prefix, "polroles", None, Some("_oid"))(x => extract(x).polroles, (row, value) => merge(row, extract(row).copy(polroles = value)))
  override val polqual = new OptField[TypoPgNodeTree, Row](prefix, "polqual", None, Some("pg_node_tree"))(x => extract(x).polqual, (row, value) => merge(row, extract(row).copy(polqual = value)))
  override val polwithcheck = new OptField[TypoPgNodeTree, Row](prefix, "polwithcheck", None, Some("pg_node_tree"))(x => extract(x).polwithcheck, (row, value) => merge(row, extract(row).copy(polwithcheck = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](oid, polname, polrelid, polcmd, polpermissive, polroles, polqual, polwithcheck)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgPolicyRow, merge: (NewRow, PgPolicyRow) => NewRow): PgPolicyStructure[NewRow] =
    new PgPolicyStructure(prefix, extract, merge)
}
