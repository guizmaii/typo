package testdb
package pg_catalog

import scala.math.BigDecimal

sealed abstract class PgStatSslFieldValue[T](val name: String, val value: T)

object PgStatSslFieldValue {
  case class pid(override val value: /* unknown nullability */ Option[Int]) extends PgStatSslFieldValue("pid", value)
  case class ssl(override val value: /* unknown nullability */ Option[Boolean]) extends PgStatSslFieldValue("ssl", value)
  case class version(override val value: /* unknown nullability */ Option[String]) extends PgStatSslFieldValue("version", value)
  case class cipher(override val value: /* unknown nullability */ Option[String]) extends PgStatSslFieldValue("cipher", value)
  case class bits(override val value: /* unknown nullability */ Option[Int]) extends PgStatSslFieldValue("bits", value)
  case class clientDn(override val value: /* unknown nullability */ Option[String]) extends PgStatSslFieldValue("client_dn", value)
  case class clientSerial(override val value: /* unknown nullability */ Option[BigDecimal]) extends PgStatSslFieldValue("client_serial", value)
  case class issuerDn(override val value: /* unknown nullability */ Option[String]) extends PgStatSslFieldValue("issuer_dn", value)
}
