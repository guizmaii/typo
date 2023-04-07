/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package address

import java.sql.Connection

trait AddressRepo {
  def delete(addressid: AddressId)(implicit c: Connection): Boolean
  def insert(unsaved: AddressRowUnsaved)(implicit c: Connection): AddressId
  def selectAll(implicit c: Connection): List[AddressRow]
  def selectByFieldValues(fieldValues: List[AddressFieldOrIdValue[_]])(implicit c: Connection): List[AddressRow]
  def selectById(addressid: AddressId)(implicit c: Connection): Option[AddressRow]
  def selectByIds(addressids: List[AddressId])(implicit c: Connection): List[AddressRow]
  def update(addressid: AddressId, row: AddressRow)(implicit c: Connection): Boolean
  def updateFieldValues(addressid: AddressId, fieldValues: List[AddressFieldValue[_]])(implicit c: Connection): Boolean
}
