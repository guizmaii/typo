/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentitycontact

import java.sql.Connection
import scala.Function1

class BusinessentitycontactRepoMock(toRow: Function1[BusinessentitycontactRowUnsaved, BusinessentitycontactRow],
                                    map: scala.collection.mutable.Map[BusinessentitycontactId, BusinessentitycontactRow] = scala.collection.mutable.Map.empty) extends BusinessentitycontactRepo {
  override def delete(compositeId: BusinessentitycontactId)(implicit c: Connection): Boolean = {
    map.remove(compositeId).isDefined
  }
  override def insert(unsaved: BusinessentitycontactRow)(implicit c: Connection): BusinessentitycontactRow = {
    if (map.contains(unsaved.compositeId))
      sys.error(s"id ${unsaved.compositeId} already exists")
    else
      map.put(unsaved.compositeId, unsaved)
    unsaved
  }
  override def insert(unsaved: BusinessentitycontactRowUnsaved)(implicit c: Connection): BusinessentitycontactRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[BusinessentitycontactRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[BusinessentitycontactFieldOrIdValue[_]])(implicit c: Connection): List[BusinessentitycontactRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, BusinessentitycontactFieldValue.businessentityid(value)) => acc.filter(_.businessentityid == value)
      case (acc, BusinessentitycontactFieldValue.personid(value)) => acc.filter(_.personid == value)
      case (acc, BusinessentitycontactFieldValue.contacttypeid(value)) => acc.filter(_.contacttypeid == value)
      case (acc, BusinessentitycontactFieldValue.rowguid(value)) => acc.filter(_.rowguid == value)
      case (acc, BusinessentitycontactFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(compositeId: BusinessentitycontactId)(implicit c: Connection): Option[BusinessentitycontactRow] = {
    map.get(compositeId)
  }
  override def update(row: BusinessentitycontactRow)(implicit c: Connection): Boolean = {
    map.get(row.compositeId) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.compositeId, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(compositeId: BusinessentitycontactId, fieldValues: List[BusinessentitycontactFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(compositeId) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, BusinessentitycontactFieldValue.rowguid(value)) => acc.copy(rowguid = value)
          case (acc, BusinessentitycontactFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
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
