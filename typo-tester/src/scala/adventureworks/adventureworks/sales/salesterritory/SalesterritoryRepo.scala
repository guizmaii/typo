/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritory

import java.sql.Connection

trait SalesterritoryRepo {
  def delete(territoryid: SalesterritoryId)(implicit c: Connection): Boolean
  def insert(unsaved: SalesterritoryRowUnsaved)(implicit c: Connection): SalesterritoryId
  def selectAll(implicit c: Connection): List[SalesterritoryRow]
  def selectByFieldValues(fieldValues: List[SalesterritoryFieldOrIdValue[_]])(implicit c: Connection): List[SalesterritoryRow]
  def selectById(territoryid: SalesterritoryId)(implicit c: Connection): Option[SalesterritoryRow]
  def selectByIds(territoryids: List[SalesterritoryId])(implicit c: Connection): List[SalesterritoryRow]
  def update(territoryid: SalesterritoryId, row: SalesterritoryRow)(implicit c: Connection): Boolean
  def updateFieldValues(territoryid: SalesterritoryId, fieldValues: List[SalesterritoryFieldValue[_]])(implicit c: Connection): Boolean
}
