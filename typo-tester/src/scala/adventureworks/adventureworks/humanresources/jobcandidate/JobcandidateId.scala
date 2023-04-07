/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package jobcandidate

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `humanresources.jobcandidate` */
case class JobcandidateId(value: Int) extends AnyVal
object JobcandidateId {
  implicit val ordering: Ordering[JobcandidateId] = Ordering.by(_.value)
  implicit val format: Format[JobcandidateId] = implicitly[Format[Int]].bimap(JobcandidateId.apply, _.value)
  implicit val toStatement: ToStatement[JobcandidateId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[JobcandidateId] = implicitly[Column[Int]].map(JobcandidateId.apply)
  implicit val parameterMetadata: ParameterMetaData[JobcandidateId] = new ParameterMetaData[JobcandidateId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
