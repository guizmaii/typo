/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sr

import java.sql.Connection

trait SrRepo {
  def selectAll(implicit c: Connection): List[SrRow]
  def selectByFieldValues(fieldValues: List[SrFieldOrIdValue[_]])(implicit c: Connection): List[SrRow]
}
