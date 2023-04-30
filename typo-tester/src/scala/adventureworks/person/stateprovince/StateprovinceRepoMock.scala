/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package stateprovince

import java.sql.Connection
import scala.Function1

class StateprovinceRepoMock(toRow: Function1[StateprovinceRowUnsaved, StateprovinceRow],
                            map: scala.collection.mutable.Map[StateprovinceId, StateprovinceRow] = scala.collection.mutable.Map.empty) extends StateprovinceRepo {
  override def delete(stateprovinceid: StateprovinceId)(implicit c: Connection): Boolean = {
    map.remove(stateprovinceid).isDefined
  }
  override def insert(unsaved: StateprovinceRow)(implicit c: Connection): StateprovinceRow = {
    if (map.contains(unsaved.stateprovinceid))
      sys.error(s"id ${unsaved.stateprovinceid} already exists")
    else
      map.put(unsaved.stateprovinceid, unsaved)
    unsaved
  }
  override def insert(unsaved: StateprovinceRowUnsaved)(implicit c: Connection): StateprovinceRow = {
    insert(toRow(unsaved))
  }
  override def selectAll(implicit c: Connection): List[StateprovinceRow] = {
    map.values.toList
  }
  override def selectByFieldValues(fieldValues: List[StateprovinceFieldOrIdValue[_]])(implicit c: Connection): List[StateprovinceRow] = {
    fieldValues.foldLeft(map.values) {
      case (acc, StateprovinceFieldValue.stateprovinceid(value)) => acc.filter(_.stateprovinceid == value)
      case (acc, StateprovinceFieldValue.stateprovincecode(value)) => acc.filter(_.stateprovincecode == value)
      case (acc, StateprovinceFieldValue.countryregioncode(value)) => acc.filter(_.countryregioncode == value)
      case (acc, StateprovinceFieldValue.isonlystateprovinceflag(value)) => acc.filter(_.isonlystateprovinceflag == value)
      case (acc, StateprovinceFieldValue.name(value)) => acc.filter(_.name == value)
      case (acc, StateprovinceFieldValue.territoryid(value)) => acc.filter(_.territoryid == value)
      case (acc, StateprovinceFieldValue.rowguid(value)) => acc.filter(_.rowguid == value)
      case (acc, StateprovinceFieldValue.modifieddate(value)) => acc.filter(_.modifieddate == value)
    }.toList
  }
  override def selectById(stateprovinceid: StateprovinceId)(implicit c: Connection): Option[StateprovinceRow] = {
    map.get(stateprovinceid)
  }
  override def selectByIds(stateprovinceids: Array[StateprovinceId])(implicit c: Connection): List[StateprovinceRow] = {
    stateprovinceids.flatMap(map.get).toList
  }
  override def update(row: StateprovinceRow)(implicit c: Connection): Boolean = {
    map.get(row.stateprovinceid) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.stateprovinceid, row)
        true
      case None => false
    }
  }
  override def updateFieldValues(stateprovinceid: StateprovinceId, fieldValues: List[StateprovinceFieldValue[_]])(implicit c: Connection): Boolean = {
    map.get(stateprovinceid) match {
      case Some(oldRow) =>
        val updatedRow = fieldValues.foldLeft(oldRow) {
          case (acc, StateprovinceFieldValue.stateprovincecode(value)) => acc.copy(stateprovincecode = value)
          case (acc, StateprovinceFieldValue.countryregioncode(value)) => acc.copy(countryregioncode = value)
          case (acc, StateprovinceFieldValue.isonlystateprovinceflag(value)) => acc.copy(isonlystateprovinceflag = value)
          case (acc, StateprovinceFieldValue.name(value)) => acc.copy(name = value)
          case (acc, StateprovinceFieldValue.territoryid(value)) => acc.copy(territoryid = value)
          case (acc, StateprovinceFieldValue.rowguid(value)) => acc.copy(rowguid = value)
          case (acc, StateprovinceFieldValue.modifieddate(value)) => acc.copy(modifieddate = value)
        }
        if (updatedRow != oldRow) {
          map.put(stateprovinceid, updatedRow)
          true
        } else {
          false
        }
      case None => false
    }
  }
}
