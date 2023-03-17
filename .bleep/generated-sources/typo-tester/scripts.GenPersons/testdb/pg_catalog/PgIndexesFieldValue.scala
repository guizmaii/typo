package testdb
package pg_catalog



sealed abstract class PgIndexesFieldValue[T](val name: String, val value: T)

object PgIndexesFieldValue {
  case class schemaname(override val value: String) extends PgIndexesFieldValue("schemaname", value)
  case class tablename(override val value: String) extends PgIndexesFieldValue("tablename", value)
  case class indexname(override val value: String) extends PgIndexesFieldValue("indexname", value)
  case class tablespace(override val value: String) extends PgIndexesFieldValue("tablespace", value)
  case class indexdef(override val value: /* unknown nullability */ Option[String]) extends PgIndexesFieldValue("indexdef", value)
}
