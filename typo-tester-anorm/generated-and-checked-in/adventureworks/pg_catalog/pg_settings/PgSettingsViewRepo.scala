/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_settings

import java.sql.Connection
import typo.dsl.SelectBuilder

trait PgSettingsViewRepo {
  def select: SelectBuilder[PgSettingsViewFields, PgSettingsViewRow]
  def selectAll(implicit c: Connection): List[PgSettingsViewRow]
}
