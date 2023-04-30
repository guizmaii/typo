/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productdescription

import java.sql.Connection
import scala.Function1

class ProductdescriptionRepoMock(toRow: Function1[ProductdescriptionRowUnsaved, ProductdescriptionRow],
                                 map: scala.collection.mutable.Map[ProductdescriptionId, ProductdescriptionRow] = scala.collection.mutable.Map.empty) extends ProductdescriptionRepo {
  override def delete(productdescriptionid: ProductdescriptionId)(implicit c: Connection): Boolean = {
    map.remove(productdescriptionid).isDefined
  }
  override def insert(unsaved: ProductdescriptionRow)(implicit c: Connection): ProductdescriptionRow = {
    if (map.contains(unsaved.productdescriptionid))
      sys.error(s"id ${unsaved.productdescriptionid} already exists")
    else
      map.put(unsaved.productdescriptionid, unsaved)
    unsaved
  }
  override def insert(unsaved: ProductdescriptionRowUnsaved)(implicit c: Connection): ProductdescriptionRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[ProductdescriptionRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[ProductdescriptionFieldOrIdValue[_]])(implicit c: Connection): List[ProductdescriptionRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, ProductdescriptionFieldValue.productdescriptionid(value)) => acc.filter(_.productdescriptionid == value)
      case (acc, ProductdescriptionFieldValue.description(value)) => acc.filter(_.description == value)
      case (acc, ProductdescriptionFieldValue.rowguid(value)) => acc.filter(_.rowguid == value)
      case (acc, ProductdescriptionFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(productdescriptionid: ProductdescriptionId)(implicit c: Connection): Option[ProductdescriptionRow] = {
    map.get(productdescriptionid)
  }
  override def selectByIds(productdescriptionids: Array[ProductdescriptionId])(implicit c: Connection): List[ProductdescriptionRow] = {
    productdescriptionids.flatMap(map.get).toList
  }
  override def update(row: ProductdescriptionRow)(implicit c: Connection): Boolean = {
    map.get(row.productdescriptionid) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.productdescriptionid, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(productdescriptionid: ProductdescriptionId, fieldValues: List[ProductdescriptionFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(productdescriptionid) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, ProductdescriptionFieldValue.description(value)) => acc.copy(description = value)
          case (acc, ProductdescriptionFieldValue.rowguid(value)) => acc.copy(rowguid = value)
          case (acc, ProductdescriptionFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
        }
        if (updatedRow != oldRow) {
          map.put(productdescriptionid, updatedRow)
          true
        } else {
          false
        }
      case None => false
    }
  }
}
