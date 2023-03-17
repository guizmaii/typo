package testdb
package pg_catalog



sealed abstract class PgStatioUserIndexesFieldValue[T](val name: String, val value: T)

object PgStatioUserIndexesFieldValue {
  case class relid(override val value: Option[Long]) extends PgStatioUserIndexesFieldValue("relid", value)
  case class indexrelid(override val value: Option[Long]) extends PgStatioUserIndexesFieldValue("indexrelid", value)
  case class schemaname(override val value: Option[String]) extends PgStatioUserIndexesFieldValue("schemaname", value)
  case class relname(override val value: Option[String]) extends PgStatioUserIndexesFieldValue("relname", value)
  case class indexrelname(override val value: Option[String]) extends PgStatioUserIndexesFieldValue("indexrelname", value)
  case class idxBlksRead(override val value: Option[Long]) extends PgStatioUserIndexesFieldValue("idx_blks_read", value)
  case class idxBlksHit(override val value: Option[Long]) extends PgStatioUserIndexesFieldValue("idx_blks_hit", value)
}
