/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import java.sql.Connection

trait PurchaseorderdetailRepo {
  def delete(compositeId: PurchaseorderdetailId)(implicit c: Connection): Boolean
  def insert(unsaved: PurchaseorderdetailRow)(implicit c: Connection): PurchaseorderdetailRow
  def insert(unsaved: PurchaseorderdetailRowUnsaved)(implicit c: Connection): PurchaseorderdetailRow
  def selectAll(implicit c: Connection): List[PurchaseorderdetailRow]
  def selectByFieldValues(fieldValues: List[PurchaseorderdetailFieldOrIdValue[_]])(implicit c: Connection): List[PurchaseorderdetailRow]
  def selectById(compositeId: PurchaseorderdetailId)(implicit c: Connection): Option[PurchaseorderdetailRow]
  def update(row: PurchaseorderdetailRow)(implicit c: Connection): Boolean
  def updateFieldValues(compositeId: PurchaseorderdetailId, fieldValues: List[PurchaseorderdetailFieldValue[_]])(implicit c: Connection): Boolean
}
