/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package update_person_returning

import adventureworks.customtypes.TypoLocalDateTime
import doobie.free.connection.ConnectionIO
import fs2.Stream

trait UpdatePersonReturningSqlRepo {
  def apply(suffix: /* nullability unknown */ Option[String], cutoff: /* nullability unknown */ Option[TypoLocalDateTime]): Stream[ConnectionIO, UpdatePersonReturningSqlRow]
}
