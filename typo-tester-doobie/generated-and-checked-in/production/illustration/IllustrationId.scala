/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package illustration

import doobie.Meta
import io.circe.Decoder
import io.circe.Encoder

/** Type for the primary key of table `production.illustration` */
case class IllustrationId(value: Int) extends AnyVal
object IllustrationId {
  implicit val ordering: Ordering[IllustrationId] = Ordering.by(_.value)
  implicit val encoder: Encoder[IllustrationId] =
    Encoder[Int].contramap(_.value)
  implicit val decoder: Decoder[IllustrationId] =
    Decoder[Int].map(IllustrationId(_))
  implicit val meta: Meta[IllustrationId] = Meta[Int].imap(IllustrationId.apply)(_.value)
  implicit val metaArray: Meta[Array[IllustrationId]] = Meta[Array[Int]].imap(_.map(IllustrationId.apply))(_.map(_.value))
}
