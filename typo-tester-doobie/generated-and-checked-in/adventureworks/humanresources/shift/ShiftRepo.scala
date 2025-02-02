/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package shift

import doobie.free.connection.ConnectionIO
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.UpdateBuilder

trait ShiftRepo {
  def delete(shiftid: ShiftId): ConnectionIO[Boolean]
  def delete: DeleteBuilder[ShiftFields, ShiftRow]
  def insert(unsaved: ShiftRow): ConnectionIO[ShiftRow]
  def insert(unsaved: ShiftRowUnsaved): ConnectionIO[ShiftRow]
  def select: SelectBuilder[ShiftFields, ShiftRow]
  def selectAll: Stream[ConnectionIO, ShiftRow]
  def selectById(shiftid: ShiftId): ConnectionIO[Option[ShiftRow]]
  def selectByIds(shiftids: Array[ShiftId]): Stream[ConnectionIO, ShiftRow]
  def update(row: ShiftRow): ConnectionIO[Boolean]
  def update: UpdateBuilder[ShiftFields, ShiftRow]
  def upsert(unsaved: ShiftRow): ConnectionIO[ShiftRow]
}
