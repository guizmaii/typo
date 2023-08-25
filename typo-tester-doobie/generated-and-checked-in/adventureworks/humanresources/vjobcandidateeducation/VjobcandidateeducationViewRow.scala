/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidateeducation

import adventureworks.customtypes.TypoLocalDate
import adventureworks.humanresources.jobcandidate.JobcandidateId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class VjobcandidateeducationViewRow(
  /** Points to [[jobcandidate.JobcandidateRow.jobcandidateid]] */
  jobcandidateid: Option[JobcandidateId],
  `Edu.Level`: Option[/* max 50 chars */ String],
  `Edu.StartDate`: Option[TypoLocalDate],
  `Edu.EndDate`: Option[TypoLocalDate],
  `Edu.Degree`: Option[/* max 50 chars */ String],
  `Edu.Major`: Option[/* max 50 chars */ String],
  `Edu.Minor`: Option[/* max 50 chars */ String],
  `Edu.GPA`: Option[/* max 5 chars */ String],
  `Edu.GPAScale`: Option[/* max 5 chars */ String],
  `Edu.School`: Option[/* max 100 chars */ String],
  `Edu.Loc.CountryRegion`: Option[/* max 100 chars */ String],
  `Edu.Loc.State`: Option[/* max 100 chars */ String],
  `Edu.Loc.City`: Option[/* max 100 chars */ String]
)

object VjobcandidateeducationViewRow {
  implicit lazy val decoder: Decoder[VjobcandidateeducationViewRow] = Decoder.forProduct13[VjobcandidateeducationViewRow, Option[JobcandidateId], Option[/* max 50 chars */ String], Option[TypoLocalDate], Option[TypoLocalDate], Option[/* max 50 chars */ String], Option[/* max 50 chars */ String], Option[/* max 50 chars */ String], Option[/* max 5 chars */ String], Option[/* max 5 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String]]("jobcandidateid", "Edu.Level", "Edu.StartDate", "Edu.EndDate", "Edu.Degree", "Edu.Major", "Edu.Minor", "Edu.GPA", "Edu.GPAScale", "Edu.School", "Edu.Loc.CountryRegion", "Edu.Loc.State", "Edu.Loc.City")(VjobcandidateeducationViewRow.apply)(Decoder.decodeOption(JobcandidateId.decoder), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(TypoLocalDate.decoder), Decoder.decodeOption(TypoLocalDate.decoder), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString))
  implicit lazy val encoder: Encoder[VjobcandidateeducationViewRow] = Encoder.forProduct13[VjobcandidateeducationViewRow, Option[JobcandidateId], Option[/* max 50 chars */ String], Option[TypoLocalDate], Option[TypoLocalDate], Option[/* max 50 chars */ String], Option[/* max 50 chars */ String], Option[/* max 50 chars */ String], Option[/* max 5 chars */ String], Option[/* max 5 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String], Option[/* max 100 chars */ String]]("jobcandidateid", "Edu.Level", "Edu.StartDate", "Edu.EndDate", "Edu.Degree", "Edu.Major", "Edu.Minor", "Edu.GPA", "Edu.GPAScale", "Edu.School", "Edu.Loc.CountryRegion", "Edu.Loc.State", "Edu.Loc.City")(x => (x.jobcandidateid, x.`Edu.Level`, x.`Edu.StartDate`, x.`Edu.EndDate`, x.`Edu.Degree`, x.`Edu.Major`, x.`Edu.Minor`, x.`Edu.GPA`, x.`Edu.GPAScale`, x.`Edu.School`, x.`Edu.Loc.CountryRegion`, x.`Edu.Loc.State`, x.`Edu.Loc.City`))(Encoder.encodeOption(JobcandidateId.encoder), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(TypoLocalDate.encoder), Encoder.encodeOption(TypoLocalDate.encoder), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString))
  implicit lazy val read: Read[VjobcandidateeducationViewRow] = new Read[VjobcandidateeducationViewRow](
    gets = List(
      (JobcandidateId.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (TypoLocalDate.get, Nullability.Nullable),
      (TypoLocalDate.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => VjobcandidateeducationViewRow(
      jobcandidateid = JobcandidateId.get.unsafeGetNullable(rs, i + 0),
      `Edu.Level` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 1),
      `Edu.StartDate` = TypoLocalDate.get.unsafeGetNullable(rs, i + 2),
      `Edu.EndDate` = TypoLocalDate.get.unsafeGetNullable(rs, i + 3),
      `Edu.Degree` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 4),
      `Edu.Major` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 5),
      `Edu.Minor` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 6),
      `Edu.GPA` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 7),
      `Edu.GPAScale` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 8),
      `Edu.School` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 9),
      `Edu.Loc.CountryRegion` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 10),
      `Edu.Loc.State` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 11),
      `Edu.Loc.City` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 12)
    )
  )
}
