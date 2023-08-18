/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_replication_slots

import typo.dsl.SqlExpr.OptField

trait PgReplicationSlotsViewFields[Row] {
  val slotName: OptField[String, Row]
  val plugin: OptField[String, Row]
  val slotType: OptField[String, Row]
  val datoid: OptField[/* oid */ Long, Row]
  val database: OptField[String, Row]
  val temporary: OptField[Boolean, Row]
  val active: OptField[Boolean, Row]
  val activePid: OptField[Int, Row]
  val xmin: OptField[TypoXid, Row]
  val catalogXmin: OptField[TypoXid, Row]
  val restartLsn: OptField[/* pg_lsn */ Long, Row]
  val confirmedFlushLsn: OptField[/* pg_lsn */ Long, Row]
  val walStatus: OptField[String, Row]
  val safeWalSize: OptField[Long, Row]
  val twoPhase: OptField[Boolean, Row]
}
object PgReplicationSlotsViewFields extends PgReplicationSlotsViewStructure[PgReplicationSlotsViewRow](None, identity, (_, x) => x)

