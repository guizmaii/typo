/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person_row_join

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PersonRowJoinSqlRepoImpl extends PersonRowJoinSqlRepo {
  override def apply(): Stream[ConnectionIO, PersonRowJoinSqlRow] = {
    val sql =
      sql"""SELECT s.businessentityid,
                   (select array_agg(ROW(a.emailaddress, a.rowguid)) from person.emailaddress a where a.businessentityid = s.businessentityid) as email,
                   (select ARRAY[ROW(a.emailaddress, a.rowguid)] from person.emailaddress a where a.businessentityid = s.businessentityid) as emails
            FROM sales.salesperson s
      """
    sql.query(PersonRowJoinSqlRow.read).stream
  }
}
