/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package shoppingcartitem

import java.sql.Connection

trait ShoppingcartitemRepo {
  def delete(shoppingcartitemid: ShoppingcartitemId)(implicit c: Connection): Boolean
  def insert(unsaved: ShoppingcartitemRow)(implicit c: Connection): ShoppingcartitemRow
  def insert(unsaved: ShoppingcartitemRowUnsaved)(implicit c: Connection): ShoppingcartitemRow
  def selectAll(implicit c: Connection): List[ShoppingcartitemRow]
  def selectByFieldValues(fieldValues: List[ShoppingcartitemFieldOrIdValue[_]])(implicit c: Connection): List[ShoppingcartitemRow]
  def selectById(shoppingcartitemid: ShoppingcartitemId)(implicit c: Connection): Option[ShoppingcartitemRow]
  def selectByIds(shoppingcartitemids: Array[ShoppingcartitemId])(implicit c: Connection): List[ShoppingcartitemRow]
  def update(row: ShoppingcartitemRow)(implicit c: Connection): Boolean
  def updateFieldValues(shoppingcartitemid: ShoppingcartitemId, fieldValues: List[ShoppingcartitemFieldValue[_]])(implicit c: Connection): Boolean
}
