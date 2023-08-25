/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_database

import adventureworks.customtypes.TypoOffsetDateTime
import typo.dsl.SqlExpr.OptField

trait PgStatDatabaseViewFields[Row] {
  val datid: OptField[/* oid */ Long, Row]
  val datname: OptField[String, Row]
  val numbackends: OptField[Int, Row]
  val xactCommit: OptField[Long, Row]
  val xactRollback: OptField[Long, Row]
  val blksRead: OptField[Long, Row]
  val blksHit: OptField[Long, Row]
  val tupReturned: OptField[Long, Row]
  val tupFetched: OptField[Long, Row]
  val tupInserted: OptField[Long, Row]
  val tupUpdated: OptField[Long, Row]
  val tupDeleted: OptField[Long, Row]
  val conflicts: OptField[Long, Row]
  val tempFiles: OptField[Long, Row]
  val tempBytes: OptField[Long, Row]
  val deadlocks: OptField[Long, Row]
  val checksumFailures: OptField[Long, Row]
  val checksumLastFailure: OptField[TypoOffsetDateTime, Row]
  val blkReadTime: OptField[Double, Row]
  val blkWriteTime: OptField[Double, Row]
  val sessionTime: OptField[Double, Row]
  val activeTime: OptField[Double, Row]
  val idleInTransactionTime: OptField[Double, Row]
  val sessions: OptField[Long, Row]
  val sessionsAbandoned: OptField[Long, Row]
  val sessionsFatal: OptField[Long, Row]
  val sessionsKilled: OptField[Long, Row]
  val statsReset: OptField[TypoOffsetDateTime, Row]
}
object PgStatDatabaseViewFields extends PgStatDatabaseViewStructure[PgStatDatabaseViewRow](None, identity, (_, x) => x)

