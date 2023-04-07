/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package workorder

import java.sql.Connection

trait WorkorderRepo {
  def delete(workorderid: WorkorderId)(implicit c: Connection): Boolean
  def insert(unsaved: WorkorderRowUnsaved)(implicit c: Connection): WorkorderId
  def selectAll(implicit c: Connection): List[WorkorderRow]
  def selectByFieldValues(fieldValues: List[WorkorderFieldOrIdValue[_]])(implicit c: Connection): List[WorkorderRow]
  def selectById(workorderid: WorkorderId)(implicit c: Connection): Option[WorkorderRow]
  def selectByIds(workorderids: List[WorkorderId])(implicit c: Connection): List[WorkorderRow]
  def update(workorderid: WorkorderId, row: WorkorderRow)(implicit c: Connection): Boolean
  def updateFieldValues(workorderid: WorkorderId, fieldValues: List[WorkorderFieldValue[_]])(implicit c: Connection): Boolean
}
