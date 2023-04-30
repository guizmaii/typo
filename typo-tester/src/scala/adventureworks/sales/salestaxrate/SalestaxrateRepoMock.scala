/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salestaxrate

import java.sql.Connection
import scala.Function1

class SalestaxrateRepoMock(toRow: Function1[SalestaxrateRowUnsaved, SalestaxrateRow],
                           map: scala.collection.mutable.Map[SalestaxrateId, SalestaxrateRow] = scala.collection.mutable.Map.empty) extends SalestaxrateRepo {
  override def delete(salestaxrateid: SalestaxrateId)(implicit c: Connection): Boolean = {
    map.remove(salestaxrateid).isDefined
  }
  override def insert(unsaved: SalestaxrateRow)(implicit c: Connection): SalestaxrateRow = {
    if (map.contains(unsaved.salestaxrateid))
      sys.error(s"id ${unsaved.salestaxrateid} already exists")
    else
      map.put(unsaved.salestaxrateid, unsaved)
    unsaved
  }
  override def insert(unsaved: SalestaxrateRowUnsaved)(implicit c: Connection): SalestaxrateRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[SalestaxrateRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[SalestaxrateFieldOrIdValue[_]])(implicit c: Connection): List[SalestaxrateRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, SalestaxrateFieldValue.salestaxrateid(value)) => acc.filter(_.salestaxrateid == value)
      case (acc, SalestaxrateFieldValue.stateprovinceid(value)) => acc.filter(_.stateprovinceid == value)
      case (acc, SalestaxrateFieldValue.taxtype(value)) => acc.filter(_.taxtype == value)
      case (acc, SalestaxrateFieldValue.taxrate(value)) => acc.filter(_.taxrate == value)
      case (acc, SalestaxrateFieldValue.name(value)) => acc.filter(_.name == value)
      case (acc, SalestaxrateFieldValue.rowguid(value)) => acc.filter(_.rowguid == value)
      case (acc, SalestaxrateFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(salestaxrateid: SalestaxrateId)(implicit c: Connection): Option[SalestaxrateRow] = {
    map.get(salestaxrateid)
  }
  override def selectByIds(salestaxrateids: Array[SalestaxrateId])(implicit c: Connection): List[SalestaxrateRow] = {
    salestaxrateids.flatMap(map.get).toList
  }
  override def update(row: SalestaxrateRow)(implicit c: Connection): Boolean = {
    map.get(row.salestaxrateid) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.salestaxrateid, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(salestaxrateid: SalestaxrateId, fieldValues: List[SalestaxrateFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(salestaxrateid) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, SalestaxrateFieldValue.stateprovinceid(value)) => acc.copy(stateprovinceid = value)
          case (acc, SalestaxrateFieldValue.taxtype(value)) => acc.copy(taxtype = value)
          case (acc, SalestaxrateFieldValue.taxrate(value)) => acc.copy(taxrate = value)
          case (acc, SalestaxrateFieldValue.name(value)) => acc.copy(name = value)
          case (acc, SalestaxrateFieldValue.rowguid(value)) => acc.copy(rowguid = value)
          case (acc, SalestaxrateFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
        }
        if (updatedRow != oldRow) {
          map.put(salestaxrateid, updatedRow)
          true
        } else {
          false
        }
      case None => false
    }
  }
}
