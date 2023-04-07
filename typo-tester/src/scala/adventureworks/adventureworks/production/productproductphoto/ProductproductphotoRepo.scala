/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productproductphoto

import java.sql.Connection

trait ProductproductphotoRepo {
  def delete(compositeId: ProductproductphotoId)(implicit c: Connection): Boolean
  def insert(compositeId: ProductproductphotoId, unsaved: ProductproductphotoRowUnsaved)(implicit c: Connection): Boolean
  def selectAll(implicit c: Connection): List[ProductproductphotoRow]
  def selectByFieldValues(fieldValues: List[ProductproductphotoFieldOrIdValue[_]])(implicit c: Connection): List[ProductproductphotoRow]
  def selectById(compositeId: ProductproductphotoId)(implicit c: Connection): Option[ProductproductphotoRow]
  def update(compositeId: ProductproductphotoId, row: ProductproductphotoRow)(implicit c: Connection): Boolean
  def updateFieldValues(compositeId: ProductproductphotoId, fieldValues: List[ProductproductphotoFieldValue[_]])(implicit c: Connection): Boolean
}
