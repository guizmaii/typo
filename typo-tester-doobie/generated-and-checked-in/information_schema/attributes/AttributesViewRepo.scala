/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package attributes

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait AttributesViewRepo {
  def selectAll: Stream[ConnectionIO, AttributesViewRow]
}
