/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currencyrate

import java.sql.Connection

trait CurrencyrateRepo {
  def delete(currencyrateid: CurrencyrateId)(implicit c: Connection): Boolean
  def insert(unsaved: CurrencyrateRow)(implicit c: Connection): CurrencyrateRow
  def insert(unsaved: CurrencyrateRowUnsaved)(implicit c: Connection): CurrencyrateRow
  def selectAll(implicit c: Connection): List[CurrencyrateRow]
  def selectByFieldValues(fieldValues: List[CurrencyrateFieldOrIdValue[_]])(implicit c: Connection): List[CurrencyrateRow]
  def selectById(currencyrateid: CurrencyrateId)(implicit c: Connection): Option[CurrencyrateRow]
  def selectByIds(currencyrateids: Array[CurrencyrateId])(implicit c: Connection): List[CurrencyrateRow]
  def update(row: CurrencyrateRow)(implicit c: Connection): Boolean
  def updateFieldValues(currencyrateid: CurrencyrateId, fieldValues: List[CurrencyrateFieldValue[_]])(implicit c: Connection): Boolean
}
