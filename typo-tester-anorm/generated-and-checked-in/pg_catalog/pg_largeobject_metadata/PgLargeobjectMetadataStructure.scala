/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_largeobject_metadata

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgLargeobjectMetadataStructure[Row](val prefix: Option[String], val extract: Row => PgLargeobjectMetadataRow, val merge: (Row, PgLargeobjectMetadataRow) => Row)
  extends Relation[PgLargeobjectMetadataFields, PgLargeobjectMetadataRow, Row]
    with PgLargeobjectMetadataFields[Row] { outer =>

  override val oid = new IdField[PgLargeobjectMetadataId, Row](prefix, "oid", None, Some("oid"))(x => extract(x).oid, (row, value) => merge(row, extract(row).copy(oid = value)))
  override val lomowner = new Field[/* oid */ Long, Row](prefix, "lomowner", None, Some("oid"))(x => extract(x).lomowner, (row, value) => merge(row, extract(row).copy(lomowner = value)))
  override val lomacl = new OptField[Array[TypoAclItem], Row](prefix, "lomacl", None, Some("_aclitem"))(x => extract(x).lomacl, (row, value) => merge(row, extract(row).copy(lomacl = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](oid, lomowner, lomacl)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgLargeobjectMetadataRow, merge: (NewRow, PgLargeobjectMetadataRow) => NewRow): PgLargeobjectMetadataStructure[NewRow] =
    new PgLargeobjectMetadataStructure(prefix, extract, merge)
}
