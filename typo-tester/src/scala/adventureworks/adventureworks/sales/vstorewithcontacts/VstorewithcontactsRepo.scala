/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithcontacts

import java.sql.Connection

trait VstorewithcontactsRepo {
  def selectAll(implicit c: Connection): List[VstorewithcontactsRow]
  def selectByFieldValues(fieldValues: List[VstorewithcontactsFieldOrIdValue[_]])(implicit c: Connection): List[VstorewithcontactsRow]
}
