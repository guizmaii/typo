/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package udt_privileges

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait UdtPrivilegesViewRepo {
  def selectAll: Stream[ConnectionIO, UdtPrivilegesViewRow]
}
