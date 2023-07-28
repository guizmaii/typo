/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_auth_members

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgAuthMembersRow(
  roleid: /* oid */ Long,
  member: /* oid */ Long,
  grantor: /* oid */ Long,
  adminOption: Boolean
){
   val compositeId: PgAuthMembersId = PgAuthMembersId(roleid, member)
 }

object PgAuthMembersRow {
  def rowParser(idx: Int): RowParser[PgAuthMembersRow] =
    RowParser[PgAuthMembersRow] { row =>
      Success(
        PgAuthMembersRow(
          roleid = row[/* oid */ Long](idx + 0),
          member = row[/* oid */ Long](idx + 1),
          grantor = row[/* oid */ Long](idx + 2),
          adminOption = row[Boolean](idx + 3)
        )
      )
    }
  implicit val oFormat: OFormat[PgAuthMembersRow] = new OFormat[PgAuthMembersRow]{
    override def writes(o: PgAuthMembersRow): JsObject =
      Json.obj(
        "roleid" -> o.roleid,
        "member" -> o.member,
        "grantor" -> o.grantor,
        "admin_option" -> o.adminOption
      )
  
    override def reads(json: JsValue): JsResult[PgAuthMembersRow] = {
      JsResult.fromTry(
        Try(
          PgAuthMembersRow(
            roleid = json.\("roleid").as[/* oid */ Long],
            member = json.\("member").as[/* oid */ Long],
            grantor = json.\("grantor").as[/* oid */ Long],
            adminOption = json.\("admin_option").as[Boolean]
          )
        )
      )
    }
  }
}
