/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package document

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Flag
import io.circe.Decoder
import io.circe.Encoder
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
  revision: /* bpchar, max 5 chars */ String,
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
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault,
  /** Default: '/'::character varying
      Primary key for Document records. */
  documentnode: Defaulted[DocumentId] = Defaulted.UseDefault
) {
  def toRow(folderflagDefault: => Flag, changenumberDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime, documentnodeDefault: => DocumentId): DocumentRow =
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
  implicit lazy val decoder: Decoder[DocumentRowUnsaved] = Decoder.forProduct13[DocumentRowUnsaved, /* max 50 chars */ String, BusinessentityId, /* max 400 chars */ String, Option[/* max 8 chars */ String], /* bpchar, max 5 chars */ String, Int, Option[String], Option[Array[Byte]], Defaulted[Flag], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime], Defaulted[DocumentId]]("title", "owner", "filename", "fileextension", "revision", "status", "documentsummary", "document", "folderflag", "changenumber", "rowguid", "modifieddate", "documentnode")(DocumentRowUnsaved.apply)(Decoder.decodeString, BusinessentityId.decoder, Decoder.decodeString, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeString, Decoder.decodeInt, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeArray[Byte](Decoder.decodeByte, implicitly)), Defaulted.decoder(Flag.decoder), Defaulted.decoder(Decoder.decodeInt), Defaulted.decoder(Decoder.decodeUUID), Defaulted.decoder(TypoLocalDateTime.decoder), Defaulted.decoder(DocumentId.decoder))
  implicit lazy val encoder: Encoder[DocumentRowUnsaved] = Encoder.forProduct13[DocumentRowUnsaved, /* max 50 chars */ String, BusinessentityId, /* max 400 chars */ String, Option[/* max 8 chars */ String], /* bpchar, max 5 chars */ String, Int, Option[String], Option[Array[Byte]], Defaulted[Flag], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime], Defaulted[DocumentId]]("title", "owner", "filename", "fileextension", "revision", "status", "documentsummary", "document", "folderflag", "changenumber", "rowguid", "modifieddate", "documentnode")(x => (x.title, x.owner, x.filename, x.fileextension, x.revision, x.status, x.documentsummary, x.document, x.folderflag, x.changenumber, x.rowguid, x.modifieddate, x.documentnode))(Encoder.encodeString, BusinessentityId.encoder, Encoder.encodeString, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeString, Encoder.encodeInt, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeIterable[Byte, Array](Encoder.encodeByte, implicitly)), Defaulted.encoder(Flag.encoder), Defaulted.encoder(Encoder.encodeInt), Defaulted.encoder(Encoder.encodeUUID), Defaulted.encoder(TypoLocalDateTime.encoder), Defaulted.encoder(DocumentId.encoder))
}
