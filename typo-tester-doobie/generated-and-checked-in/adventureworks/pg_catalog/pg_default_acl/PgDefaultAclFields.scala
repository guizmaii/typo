/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_default_acl

import adventureworks.customtypes.TypoAclItem
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField

trait PgDefaultAclFields[Row] {
  val oid: IdField[PgDefaultAclId, Row]
  val defaclrole: Field[/* oid */ Long, Row]
  val defaclnamespace: Field[/* oid */ Long, Row]
  val defaclobjtype: Field[String, Row]
  val defaclacl: Field[Array[TypoAclItem], Row]
}
object PgDefaultAclFields extends PgDefaultAclStructure[PgDefaultAclRow](None, identity, (_, x) => x)

