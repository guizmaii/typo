/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package l

import java.sql.Connection

trait LRepo {
  def selectAll(implicit c: Connection): List[LRow]
  def selectByFieldValues(fieldValues: List[LFieldOrIdValue[_]])(implicit c: Connection): List[LRow]
}
