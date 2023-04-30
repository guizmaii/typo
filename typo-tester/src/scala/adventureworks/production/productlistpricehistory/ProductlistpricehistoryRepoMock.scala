/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productlistpricehistory

import java.sql.Connection
import scala.Function1

class ProductlistpricehistoryRepoMock(toRow: Function1[ProductlistpricehistoryRowUnsaved, ProductlistpricehistoryRow],
                                      map: scala.collection.mutable.Map[ProductlistpricehistoryId, ProductlistpricehistoryRow] = scala.collection.mutable.Map.empty) extends ProductlistpricehistoryRepo {
  override def delete(compositeId: ProductlistpricehistoryId)(implicit c: Connection): Boolean = {
    map.remove(compositeId).isDefined
  }
  override def insert(unsaved: ProductlistpricehistoryRow)(implicit c: Connection): ProductlistpricehistoryRow = {
    if (map.contains(unsaved.compositeId))
      sys.error(s"id ${unsaved.compositeId} already exists")
    else
      map.put(unsaved.compositeId, unsaved)
    unsaved
  }
  override def insert(unsaved: ProductlistpricehistoryRowUnsaved)(implicit c: Connection): ProductlistpricehistoryRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[ProductlistpricehistoryRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[ProductlistpricehistoryFieldOrIdValue[_]])(implicit c: Connection): List[ProductlistpricehistoryRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, ProductlistpricehistoryFieldValue.productid(value)) => acc.filter(_.productid == value)
      case (acc, ProductlistpricehistoryFieldValue.startdate(value)) => acc.filter(_.startdate == value)
      case (acc, ProductlistpricehistoryFieldValue.enddate(value)) => acc.filter(_.enddate == value)
      case (acc, ProductlistpricehistoryFieldValue.listprice(value)) => acc.filter(_.listprice == value)
      case (acc, ProductlistpricehistoryFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(compositeId: ProductlistpricehistoryId)(implicit c: Connection): Option[ProductlistpricehistoryRow] = {
    map.get(compositeId)
  }
  override def update(row: ProductlistpricehistoryRow)(implicit c: Connection): Boolean = {
    map.get(row.compositeId) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.compositeId, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(compositeId: ProductlistpricehistoryId, fieldValues: List[ProductlistpricehistoryFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(compositeId) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, ProductlistpricehistoryFieldValue.enddate(value)) => acc.copy(enddate = value)
          case (acc, ProductlistpricehistoryFieldValue.listprice(value)) => acc.copy(listprice = value)
          case (acc, ProductlistpricehistoryFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
        }
        if (updatedRow != oldRow) {
          map.put(compositeId, updatedRow)
          true
        } else {
          false
        }
      case None => false
    }
  }
}
