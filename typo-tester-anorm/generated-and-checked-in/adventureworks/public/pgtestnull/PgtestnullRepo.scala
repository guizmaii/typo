/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package public
package pgtestnull

import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.UpdateBuilder

trait PgtestnullRepo {
  def delete: DeleteBuilder[PgtestnullFields, PgtestnullRow]
  def insert(unsaved: PgtestnullRow)(implicit c: Connection): PgtestnullRow
  def select: SelectBuilder[PgtestnullFields, PgtestnullRow]
  def selectAll(implicit c: Connection): List[PgtestnullRow]
  def update: UpdateBuilder[PgtestnullFields, PgtestnullRow]
}
