/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package pcc

import java.sql.Connection

trait PccRepo {
  def selectAll(implicit c: Connection): List[PccRow]
  def selectByFieldValues(fieldValues: List[PccFieldOrIdValue[_]])(implicit c: Connection): List[PccRow]
}
