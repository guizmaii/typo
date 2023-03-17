package testdb
package pg_catalog



sealed abstract class PgMatviewsFieldValue[T](val name: String, val value: T)

object PgMatviewsFieldValue {
  case class schemaname(override val value: String) extends PgMatviewsFieldValue("schemaname", value)
  case class matviewname(override val value: String) extends PgMatviewsFieldValue("matviewname", value)
  case class matviewowner(override val value: /* unknown nullability */ Option[String]) extends PgMatviewsFieldValue("matviewowner", value)
  case class tablespace(override val value: String) extends PgMatviewsFieldValue("tablespace", value)
  case class hasindexes(override val value: Boolean) extends PgMatviewsFieldValue("hasindexes", value)
  case class ispopulated(override val value: Boolean) extends PgMatviewsFieldValue("ispopulated", value)
  case class definition(override val value: /* unknown nullability */ Option[String]) extends PgMatviewsFieldValue("definition", value)
}
