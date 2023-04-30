/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salespersonquotahistory

import java.sql.Connection

trait SalespersonquotahistoryRepo {
  def delete(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Boolean
  def insert(unsaved: SalespersonquotahistoryRow)(implicit c: Connection): SalespersonquotahistoryRow
  def insert(unsaved: SalespersonquotahistoryRowUnsaved)(implicit c: Connection): SalespersonquotahistoryRow
  def selectAll(implicit c: Connection): List[SalespersonquotahistoryRow]
  def selectByFieldValues(fieldValues: List[SalespersonquotahistoryFieldOrIdValue[_]])(implicit c: Connection): List[SalespersonquotahistoryRow]
  def selectById(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Option[SalespersonquotahistoryRow]
  def update(row: SalespersonquotahistoryRow)(implicit c: Connection): Boolean
  def updateFieldValues(compositeId: SalespersonquotahistoryId, fieldValues: List[SalespersonquotahistoryFieldValue[_]])(implicit c: Connection): Boolean
}
