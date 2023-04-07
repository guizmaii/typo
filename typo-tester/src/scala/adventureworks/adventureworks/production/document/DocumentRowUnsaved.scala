/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package document

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class DocumentRowUnsaved(
  title: String,
  owner: BusinessentityId,
  folderflag: Defaulted[Boolean],
  filename: String,
  fileextension: Option[String],
  revision: /* bpchar */ String,
  changenumber: Defaulted[Int],
  status: Int,
  documentsummary: Option[String],
  document: Option[Array[Byte]],
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object DocumentRowUnsaved {
  implicit val oFormat: OFormat[DocumentRowUnsaved] = new OFormat[DocumentRowUnsaved]{
    override def writes(o: DocumentRowUnsaved): JsObject =
      Json.obj(
        "title" -> o.title,
        "owner" -> o.owner,
        "folderflag" -> o.folderflag,
        "filename" -> o.filename,
        "fileextension" -> o.fileextension,
        "revision" -> o.revision,
        "changenumber" -> o.changenumber,
        "status" -> o.status,
        "documentsummary" -> o.documentsummary,
        "document" -> o.document,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[DocumentRowUnsaved] = {
      JsResult.fromTry(
        Try(
          DocumentRowUnsaved(
            title = json.\("title").as[String],
            owner = json.\("owner").as[BusinessentityId],
            folderflag = json.\("folderflag").as[Defaulted[Boolean]],
            filename = json.\("filename").as[String],
            fileextension = json.\("fileextension").toOption.map(_.as[String]),
            revision = json.\("revision").as[/* bpchar */ String],
            changenumber = json.\("changenumber").as[Defaulted[Int]],
            status = json.\("status").as[Int],
            documentsummary = json.\("documentsummary").toOption.map(_.as[String]),
            document = json.\("document").toOption.map(_.as[Array[Byte]]),
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
