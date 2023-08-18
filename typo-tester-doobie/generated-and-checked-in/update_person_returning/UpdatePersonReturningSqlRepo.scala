/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package update_person_returning

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait UpdatePersonReturningSqlRepo {
  def opt(suffix: Option[String], cutoff: Option[TypoLocalDateTime]): Stream[ConnectionIO, UpdatePersonReturningSqlRow]
  final def apply(suffix: String, cutoff: TypoLocalDateTime): Stream[ConnectionIO, UpdatePersonReturningSqlRow] =
    opt(Option(suffix), Option(cutoff))
}
