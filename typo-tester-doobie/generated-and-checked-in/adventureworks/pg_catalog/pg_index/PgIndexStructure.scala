/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_index

import adventureworks.customtypes.TypoInt2Vector
import adventureworks.customtypes.TypoOidVector
import adventureworks.customtypes.TypoPgNodeTree
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgIndexStructure[Row](val prefix: Option[String], val extract: Row => PgIndexRow, val merge: (Row, PgIndexRow) => Row)
  extends Relation[PgIndexFields, PgIndexRow, Row]
    with PgIndexFields[Row] { outer =>

  override val indexrelid = new IdField[PgIndexId, Row](prefix, "indexrelid", None, Some("oid"))(x => extract(x).indexrelid, (row, value) => merge(row, extract(row).copy(indexrelid = value)))
  override val indrelid = new Field[/* oid */ Long, Row](prefix, "indrelid", None, Some("oid"))(x => extract(x).indrelid, (row, value) => merge(row, extract(row).copy(indrelid = value)))
  override val indnatts = new Field[Int, Row](prefix, "indnatts", None, Some("int2"))(x => extract(x).indnatts, (row, value) => merge(row, extract(row).copy(indnatts = value)))
  override val indnkeyatts = new Field[Int, Row](prefix, "indnkeyatts", None, Some("int2"))(x => extract(x).indnkeyatts, (row, value) => merge(row, extract(row).copy(indnkeyatts = value)))
  override val indisunique = new Field[Boolean, Row](prefix, "indisunique", None, None)(x => extract(x).indisunique, (row, value) => merge(row, extract(row).copy(indisunique = value)))
  override val indisprimary = new Field[Boolean, Row](prefix, "indisprimary", None, None)(x => extract(x).indisprimary, (row, value) => merge(row, extract(row).copy(indisprimary = value)))
  override val indisexclusion = new Field[Boolean, Row](prefix, "indisexclusion", None, None)(x => extract(x).indisexclusion, (row, value) => merge(row, extract(row).copy(indisexclusion = value)))
  override val indimmediate = new Field[Boolean, Row](prefix, "indimmediate", None, None)(x => extract(x).indimmediate, (row, value) => merge(row, extract(row).copy(indimmediate = value)))
  override val indisclustered = new Field[Boolean, Row](prefix, "indisclustered", None, None)(x => extract(x).indisclustered, (row, value) => merge(row, extract(row).copy(indisclustered = value)))
  override val indisvalid = new Field[Boolean, Row](prefix, "indisvalid", None, None)(x => extract(x).indisvalid, (row, value) => merge(row, extract(row).copy(indisvalid = value)))
  override val indcheckxmin = new Field[Boolean, Row](prefix, "indcheckxmin", None, None)(x => extract(x).indcheckxmin, (row, value) => merge(row, extract(row).copy(indcheckxmin = value)))
  override val indisready = new Field[Boolean, Row](prefix, "indisready", None, None)(x => extract(x).indisready, (row, value) => merge(row, extract(row).copy(indisready = value)))
  override val indislive = new Field[Boolean, Row](prefix, "indislive", None, None)(x => extract(x).indislive, (row, value) => merge(row, extract(row).copy(indislive = value)))
  override val indisreplident = new Field[Boolean, Row](prefix, "indisreplident", None, None)(x => extract(x).indisreplident, (row, value) => merge(row, extract(row).copy(indisreplident = value)))
  override val indkey = new Field[TypoInt2Vector, Row](prefix, "indkey", None, Some("int2vector"))(x => extract(x).indkey, (row, value) => merge(row, extract(row).copy(indkey = value)))
  override val indcollation = new Field[TypoOidVector, Row](prefix, "indcollation", None, Some("oidvector"))(x => extract(x).indcollation, (row, value) => merge(row, extract(row).copy(indcollation = value)))
  override val indclass = new Field[TypoOidVector, Row](prefix, "indclass", None, Some("oidvector"))(x => extract(x).indclass, (row, value) => merge(row, extract(row).copy(indclass = value)))
  override val indoption = new Field[TypoInt2Vector, Row](prefix, "indoption", None, Some("int2vector"))(x => extract(x).indoption, (row, value) => merge(row, extract(row).copy(indoption = value)))
  override val indexprs = new OptField[TypoPgNodeTree, Row](prefix, "indexprs", None, Some("pg_node_tree"))(x => extract(x).indexprs, (row, value) => merge(row, extract(row).copy(indexprs = value)))
  override val indpred = new OptField[TypoPgNodeTree, Row](prefix, "indpred", None, Some("pg_node_tree"))(x => extract(x).indpred, (row, value) => merge(row, extract(row).copy(indpred = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](indexrelid, indrelid, indnatts, indnkeyatts, indisunique, indisprimary, indisexclusion, indimmediate, indisclustered, indisvalid, indcheckxmin, indisready, indislive, indisreplident, indkey, indcollation, indclass, indoption, indexprs, indpred)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgIndexRow, merge: (NewRow, PgIndexRow) => NewRow): PgIndexStructure[NewRow] =
    new PgIndexStructure(prefix, extract, merge)
}
