package testdb
package pg_catalog



sealed abstract class PgFileSettingsFieldValue[T](val name: String, val value: T)

object PgFileSettingsFieldValue {
  case class sourcefile(override val value: /* unknown nullability */ Option[String]) extends PgFileSettingsFieldValue("sourcefile", value)
  case class sourceline(override val value: /* unknown nullability */ Option[Int]) extends PgFileSettingsFieldValue("sourceline", value)
  case class seqno(override val value: /* unknown nullability */ Option[Int]) extends PgFileSettingsFieldValue("seqno", value)
  case class name(override val value: /* unknown nullability */ Option[String]) extends PgFileSettingsFieldValue("name", value)
  case class setting(override val value: /* unknown nullability */ Option[String]) extends PgFileSettingsFieldValue("setting", value)
  case class applied(override val value: /* unknown nullability */ Option[Boolean]) extends PgFileSettingsFieldValue("applied", value)
  case class error(override val value: /* unknown nullability */ Option[String]) extends PgFileSettingsFieldValue("error", value)
}
