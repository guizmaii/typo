/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pa

import java.sql.Connection

trait PaRepo {
  def selectAll(implicit c: Connection): List[PaRow]
  def selectByFieldValues(fieldValues: List[PaFieldOrIdValue[_]])(implicit c: Connection): List[PaRow]
}
