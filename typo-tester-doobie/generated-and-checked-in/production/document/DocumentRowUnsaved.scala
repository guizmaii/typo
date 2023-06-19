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
import adventureworks.public.Flag
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

/** This class corresponds to a row in table `production.document` which has not been persisted yet */
case class DocumentRowUnsaved(
  /** Title of the document. */
  title: /* max 50 chars */ String,
  /** Employee who controls the document.  Foreign key to Employee.BusinessEntityID
      Points to [[humanresources.employee.EmployeeRow.businessentityid]] */
  owner: BusinessentityId,
  /** File name of the document */
  filename: /* max 400 chars */ String,
  /** File extension indicating the document type. For example, .doc or .txt. */
  fileextension: Option[/* max 8 chars */ String],
  /** Revision number of the document. */
  revision: /* bpchar */ String,
  /** 1 = Pending approval, 2 = Approved, 3 = Obsolete */
  status: Int,
  /** Document abstract. */
  documentsummary: Option[String],
  /** Complete document. */
  document: Option[Array[Byte]],
  /** Default: false
      0 = This is a folder, 1 = This is a document. */
  folderflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: 0
      Engineering change approval number. */
  changenumber: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1()
      ROWGUIDCOL number uniquely identifying the record. Required for FileStream. */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[LocalDateTime] = Defaulted.UseDefault,
  /** Default: '/'::character varying
      Primary key for Document records. */
  documentnode: Defaulted[DocumentId] = Defaulted.UseDefault
) {
  def toRow(folderflagDefault: => Flag, changenumberDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => LocalDateTime, documentnodeDefault: => DocumentId): DocumentRow =
    DocumentRow(
      title = title,
      owner = owner,
      filename = filename,
      fileextension = fileextension,
      revision = revision,
      status = status,
      documentsummary = documentsummary,
      document = document,
      folderflag = folderflag match {
                     case Defaulted.UseDefault => folderflagDefault
                     case Defaulted.Provided(value) => value
                   },
      changenumber = changenumber match {
                       case Defaulted.UseDefault => changenumberDefault
                       case Defaulted.Provided(value) => value
                     },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     },
      documentnode = documentnode match {
                       case Defaulted.UseDefault => documentnodeDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object DocumentRowUnsaved {
  implicit val decoder: Decoder[DocumentRowUnsaved] =
    (c: HCursor) =>
      for {
        title <- c.downField("title").as[/* max 50 chars */ String]
        owner <- c.downField("owner").as[BusinessentityId]
        filename <- c.downField("filename").as[/* max 400 chars */ String]
        fileextension <- c.downField("fileextension").as[Option[/* max 8 chars */ String]]
        revision <- c.downField("revision").as[/* bpchar */ String]
        status <- c.downField("status").as[Int]
        documentsummary <- c.downField("documentsummary").as[Option[String]]
        document <- c.downField("document").as[Option[Array[Byte]]]
        folderflag <- c.downField("folderflag").as[Defaulted[Flag]]
        changenumber <- c.downField("changenumber").as[Defaulted[Int]]
        rowguid <- c.downField("rowguid").as[Defaulted[UUID]]
        modifieddate <- c.downField("modifieddate").as[Defaulted[LocalDateTime]]
        documentnode <- c.downField("documentnode").as[Defaulted[DocumentId]]
      } yield DocumentRowUnsaved(title, owner, filename, fileextension, revision, status, documentsummary, document, folderflag, changenumber, rowguid, modifieddate, documentnode)
  implicit val encoder: Encoder[DocumentRowUnsaved] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "title" := row.title,
        "owner" := row.owner,
        "filename" := row.filename,
        "fileextension" := row.fileextension,
        "revision" := row.revision,
        "status" := row.status,
        "documentsummary" := row.documentsummary,
        "document" := row.document,
        "folderflag" := row.folderflag,
        "changenumber" := row.changenumber,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate,
        "documentnode" := row.documentnode
      )}
}
