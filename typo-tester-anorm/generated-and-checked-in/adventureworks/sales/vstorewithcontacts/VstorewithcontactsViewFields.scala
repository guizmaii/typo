/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithcontacts

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.Phone
import adventureworks.userdefined.FirstName
import typo.dsl.SqlExpr.OptField

trait VstorewithcontactsViewFields[Row] {
  val businessentityid: OptField[BusinessentityId, Row]
  val name: OptField[Name, Row]
  val contacttype: OptField[Name, Row]
  val title: OptField[/* max 8 chars */ String, Row]
  val firstname: OptField[/* user-picked */ FirstName, Row]
  val middlename: OptField[Name, Row]
  val lastname: OptField[Name, Row]
  val suffix: OptField[/* max 10 chars */ String, Row]
  val phonenumber: OptField[Phone, Row]
  val phonenumbertype: OptField[Name, Row]
  val emailaddress: OptField[/* max 50 chars */ String, Row]
  val emailpromotion: OptField[Int, Row]
}
object VstorewithcontactsViewFields extends VstorewithcontactsViewStructure[VstorewithcontactsViewRow](None, identity, (_, x) => x)

