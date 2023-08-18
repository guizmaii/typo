/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_partitioned_table

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField

trait PgPartitionedTableFields[Row] {
  val partrelid: IdField[PgPartitionedTableId, Row]
  val partstrat: Field[String, Row]
  val partnatts: Field[Int, Row]
  val partdefid: Field[/* oid */ Long, Row]
  val partattrs: Field[TypoInt2Vector, Row]
  val partclass: Field[TypoOidVector, Row]
  val partcollation: Field[TypoOidVector, Row]
  val partexprs: OptField[TypoPgNodeTree, Row]
}
object PgPartitionedTableFields extends PgPartitionedTableStructure[PgPartitionedTableRow](None, identity, (_, x) => x)

