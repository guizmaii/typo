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
  def insert(compositeId: SalespersonquotahistoryId, unsaved: SalespersonquotahistoryRowUnsaved)(implicit c: Connection): Boolean
  def selectAll(implicit c: Connection): List[SalespersonquotahistoryRow]
  def selectByFieldValues(fieldValues: List[SalespersonquotahistoryFieldOrIdValue[_]])(implicit c: Connection): List[SalespersonquotahistoryRow]
  def selectById(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Option[SalespersonquotahistoryRow]
  def update(compositeId: SalespersonquotahistoryId, row: SalespersonquotahistoryRow)(implicit c: Connection): Boolean
  def updateFieldValues(compositeId: SalespersonquotahistoryId, fieldValues: List[SalespersonquotahistoryFieldValue[_]])(implicit c: Connection): Boolean
}
