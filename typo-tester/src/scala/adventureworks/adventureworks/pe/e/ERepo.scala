/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package e

import java.sql.Connection

trait ERepo {
  def selectAll(implicit c: Connection): List[ERow]
  def selectByFieldValues(fieldValues: List[EFieldOrIdValue[_]])(implicit c: Connection): List[ERow]
}
