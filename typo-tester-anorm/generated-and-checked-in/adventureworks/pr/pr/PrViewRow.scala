/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pr

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.productreview.ProductreviewId
import adventureworks.public.Name
import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class PrViewRow(
  id: Option[Int],
  /** Points to [[production.productreview.ProductreviewRow.productreviewid]] */
  productreviewid: Option[ProductreviewId],
  /** Points to [[production.productreview.ProductreviewRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[production.productreview.ProductreviewRow.reviewername]] */
  reviewername: Option[Name],
  /** Points to [[production.productreview.ProductreviewRow.reviewdate]] */
  reviewdate: Option[TypoLocalDateTime],
  /** Points to [[production.productreview.ProductreviewRow.emailaddress]] */
  emailaddress: Option[/* max 50 chars */ String],
  /** Points to [[production.productreview.ProductreviewRow.rating]] */
  rating: Option[Int],
  /** Points to [[production.productreview.ProductreviewRow.comments]] */
  comments: Option[/* max 3850 chars */ String],
  /** Points to [[production.productreview.ProductreviewRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object PrViewRow {
  implicit lazy val reads: Reads[PrViewRow] = Reads[PrViewRow](json => JsResult.fromTry(
      Try(
        PrViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          productreviewid = json.\("productreviewid").toOption.map(_.as(ProductreviewId.reads)),
          productid = json.\("productid").toOption.map(_.as(ProductId.reads)),
          reviewername = json.\("reviewername").toOption.map(_.as(Name.reads)),
          reviewdate = json.\("reviewdate").toOption.map(_.as(TypoLocalDateTime.reads)),
          emailaddress = json.\("emailaddress").toOption.map(_.as(Reads.StringReads)),
          rating = json.\("rating").toOption.map(_.as(Reads.IntReads)),
          comments = json.\("comments").toOption.map(_.as(Reads.StringReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PrViewRow] = RowParser[PrViewRow] { row =>
    Success(
      PrViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        productreviewid = row(idx + 1)(Column.columnToOption(ProductreviewId.column)),
        productid = row(idx + 2)(Column.columnToOption(ProductId.column)),
        reviewername = row(idx + 3)(Column.columnToOption(Name.column)),
        reviewdate = row(idx + 4)(Column.columnToOption(TypoLocalDateTime.column)),
        emailaddress = row(idx + 5)(Column.columnToOption(Column.columnToString)),
        rating = row(idx + 6)(Column.columnToOption(Column.columnToInt)),
        comments = row(idx + 7)(Column.columnToOption(Column.columnToString)),
        modifieddate = row(idx + 8)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[PrViewRow] = OWrites[PrViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "productreviewid" -> Writes.OptionWrites(ProductreviewId.writes).writes(o.productreviewid),
      "productid" -> Writes.OptionWrites(ProductId.writes).writes(o.productid),
      "reviewername" -> Writes.OptionWrites(Name.writes).writes(o.reviewername),
      "reviewdate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.reviewdate),
      "emailaddress" -> Writes.OptionWrites(Writes.StringWrites).writes(o.emailaddress),
      "rating" -> Writes.OptionWrites(Writes.IntWrites).writes(o.rating),
      "comments" -> Writes.OptionWrites(Writes.StringWrites).writes(o.comments),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
