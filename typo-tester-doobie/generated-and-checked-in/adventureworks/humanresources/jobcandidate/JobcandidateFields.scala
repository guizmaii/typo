/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package jobcandidate

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField

trait JobcandidateFields[Row] {
  val jobcandidateid: IdField[JobcandidateId, Row]
  val businessentityid: OptField[BusinessentityId, Row]
  val resume: OptField[TypoXml, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object JobcandidateFields extends JobcandidateStructure[JobcandidateRow](None, identity, (_, x) => x)

