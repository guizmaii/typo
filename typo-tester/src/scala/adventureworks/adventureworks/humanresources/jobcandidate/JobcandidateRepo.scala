/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package jobcandidate

import java.sql.Connection

trait JobcandidateRepo {
  def delete(jobcandidateid: JobcandidateId)(implicit c: Connection): Boolean
  def insert(unsaved: JobcandidateRowUnsaved)(implicit c: Connection): JobcandidateId
  def selectAll(implicit c: Connection): List[JobcandidateRow]
  def selectByFieldValues(fieldValues: List[JobcandidateFieldOrIdValue[_]])(implicit c: Connection): List[JobcandidateRow]
  def selectById(jobcandidateid: JobcandidateId)(implicit c: Connection): Option[JobcandidateRow]
  def selectByIds(jobcandidateids: List[JobcandidateId])(implicit c: Connection): List[JobcandidateRow]
  def update(jobcandidateid: JobcandidateId, row: JobcandidateRow)(implicit c: Connection): Boolean
  def updateFieldValues(jobcandidateid: JobcandidateId, fieldValues: List[JobcandidateFieldValue[_]])(implicit c: Connection): Boolean
}
