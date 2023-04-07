/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package customer

import java.sql.Connection

trait CustomerRepo {
  def delete(customerid: CustomerId)(implicit c: Connection): Boolean
  def insert(unsaved: CustomerRowUnsaved)(implicit c: Connection): CustomerId
  def selectAll(implicit c: Connection): List[CustomerRow]
  def selectByFieldValues(fieldValues: List[CustomerFieldOrIdValue[_]])(implicit c: Connection): List[CustomerRow]
  def selectById(customerid: CustomerId)(implicit c: Connection): Option[CustomerRow]
  def selectByIds(customerids: List[CustomerId])(implicit c: Connection): List[CustomerRow]
  def update(customerid: CustomerId, row: CustomerRow)(implicit c: Connection): Boolean
  def updateFieldValues(customerid: CustomerId, fieldValues: List[CustomerFieldValue[_]])(implicit c: Connection): Boolean
}
