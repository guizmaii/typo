/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salestaxrate

import doobie.free.connection.ConnectionIO
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.UpdateBuilder

trait SalestaxrateRepo {
  def delete(salestaxrateid: SalestaxrateId): ConnectionIO[Boolean]
  def delete: DeleteBuilder[SalestaxrateFields, SalestaxrateRow]
  def insert(unsaved: SalestaxrateRow): ConnectionIO[SalestaxrateRow]
  def insert(unsaved: SalestaxrateRowUnsaved): ConnectionIO[SalestaxrateRow]
  def select: SelectBuilder[SalestaxrateFields, SalestaxrateRow]
  def selectAll: Stream[ConnectionIO, SalestaxrateRow]
  def selectById(salestaxrateid: SalestaxrateId): ConnectionIO[Option[SalestaxrateRow]]
  def selectByIds(salestaxrateids: Array[SalestaxrateId]): Stream[ConnectionIO, SalestaxrateRow]
  def update(row: SalestaxrateRow): ConnectionIO[Boolean]
  def update: UpdateBuilder[SalestaxrateFields, SalestaxrateRow]
  def upsert(unsaved: SalestaxrateRow): ConnectionIO[SalestaxrateRow]
}
