package testdb
package pg_catalog

import java.sql.Connection

trait PgUserRepo {
  def selectAll(implicit c: Connection): List[PgUserRow]
  def selectByFieldValues(fieldValues: List[PgUserFieldValue[_]])(implicit c: Connection): List[PgUserRow]
}
