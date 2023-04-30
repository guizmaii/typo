/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productsubcategory

import java.sql.Connection
import scala.Function1

class ProductsubcategoryRepoMock(toRow: Function1[ProductsubcategoryRowUnsaved, ProductsubcategoryRow],
                                 map: scala.collection.mutable.Map[ProductsubcategoryId, ProductsubcategoryRow] = scala.collection.mutable.Map.empty) extends ProductsubcategoryRepo {
  override def delete(productsubcategoryid: ProductsubcategoryId)(implicit c: Connection): Boolean = {
    map.remove(productsubcategoryid).isDefined
  }
  override def insert(unsaved: ProductsubcategoryRow)(implicit c: Connection): ProductsubcategoryRow = {
    if (map.contains(unsaved.productsubcategoryid))
      sys.error(s"id ${unsaved.productsubcategoryid} already exists")
    else
      map.put(unsaved.productsubcategoryid, unsaved)
    unsaved
  }
  override def insert(unsaved: ProductsubcategoryRowUnsaved)(implicit c: Connection): ProductsubcategoryRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[ProductsubcategoryRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[ProductsubcategoryFieldOrIdValue[_]])(implicit c: Connection): List[ProductsubcategoryRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, ProductsubcategoryFieldValue.productsubcategoryid(value)) => acc.filter(_.productsubcategoryid == value)
      case (acc, ProductsubcategoryFieldValue.productcategoryid(value)) => acc.filter(_.productcategoryid == value)
      case (acc, ProductsubcategoryFieldValue.name(value)) => acc.filter(_.name == value)
      case (acc, ProductsubcategoryFieldValue.rowguid(value)) => acc.filter(_.rowguid == value)
      case (acc, ProductsubcategoryFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(productsubcategoryid: ProductsubcategoryId)(implicit c: Connection): Option[ProductsubcategoryRow] = {
    map.get(productsubcategoryid)
  }
  override def selectByIds(productsubcategoryids: Array[ProductsubcategoryId])(implicit c: Connection): List[ProductsubcategoryRow] = {
    productsubcategoryids.flatMap(map.get).toList
  }
  override def update(row: ProductsubcategoryRow)(implicit c: Connection): Boolean = {
    map.get(row.productsubcategoryid) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.productsubcategoryid, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(productsubcategoryid: ProductsubcategoryId, fieldValues: List[ProductsubcategoryFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(productsubcategoryid) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, ProductsubcategoryFieldValue.productcategoryid(value)) => acc.copy(productcategoryid = value)
          case (acc, ProductsubcategoryFieldValue.name(value)) => acc.copy(name = value)
          case (acc, ProductsubcategoryFieldValue.rowguid(value)) => acc.copy(rowguid = value)
          case (acc, ProductsubcategoryFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
        }
        if (updatedRow != oldRow) {
          map.put(productsubcategoryid, updatedRow)
          true
        } else {
          false
        }
      case None => false
    }
  }
}
