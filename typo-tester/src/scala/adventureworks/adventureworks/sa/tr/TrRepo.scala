/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package tr

import java.sql.Connection

trait TrRepo {
  def selectAll(implicit c: Connection): List[TrRow]
  def selectByFieldValues(fieldValues: List[TrFieldOrIdValue[_]])(implicit c: Connection): List[TrRow]
}
