/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package vadditionalcontactinfo

import java.sql.Connection

trait VadditionalcontactinfoRepo {
  def selectAll(implicit c: Connection): List[VadditionalcontactinfoRow]
  def selectByFieldValues(fieldValues: List[VadditionalcontactinfoFieldOrIdValue[_]])(implicit c: Connection): List[VadditionalcontactinfoRow]
}
