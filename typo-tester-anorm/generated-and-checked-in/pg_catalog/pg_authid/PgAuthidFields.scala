/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_authid

import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField

trait PgAuthidFields[Row] {
  val oid: IdField[PgAuthidId, Row]
  val rolname: Field[String, Row]
  val rolsuper: Field[Boolean, Row]
  val rolinherit: Field[Boolean, Row]
  val rolcreaterole: Field[Boolean, Row]
  val rolcreatedb: Field[Boolean, Row]
  val rolcanlogin: Field[Boolean, Row]
  val rolreplication: Field[Boolean, Row]
  val rolbypassrls: Field[Boolean, Row]
  val rolconnlimit: Field[Int, Row]
  val rolpassword: OptField[String, Row]
  val rolvaliduntil: OptField[TypoOffsetDateTime, Row]
}
object PgAuthidFields extends PgAuthidStructure[PgAuthidRow](None, identity, (_, x) => x)

