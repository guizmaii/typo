/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_server_options

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait ForeignServerOptionsViewRepo {
  def selectAll: Stream[ConnectionIO, ForeignServerOptionsViewRow]
}
