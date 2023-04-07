/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

import java.sql.Connection

trait SalesorderheaderRepo {
  def delete(salesorderid: SalesorderheaderId)(implicit c: Connection): Boolean
  def insert(unsaved: SalesorderheaderRowUnsaved)(implicit c: Connection): SalesorderheaderId
  def selectAll(implicit c: Connection): List[SalesorderheaderRow]
  def selectByFieldValues(fieldValues: List[SalesorderheaderFieldOrIdValue[_]])(implicit c: Connection): List[SalesorderheaderRow]
  def selectById(salesorderid: SalesorderheaderId)(implicit c: Connection): Option[SalesorderheaderRow]
  def selectByIds(salesorderids: List[SalesorderheaderId])(implicit c: Connection): List[SalesorderheaderRow]
  def update(salesorderid: SalesorderheaderId, row: SalesorderheaderRow)(implicit c: Connection): Boolean
  def updateFieldValues(salesorderid: SalesorderheaderId, fieldValues: List[SalesorderheaderFieldValue[_]])(implicit c: Connection): Boolean
}
