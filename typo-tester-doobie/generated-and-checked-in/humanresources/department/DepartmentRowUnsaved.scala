/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package department

import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `humanresources.department` which has not been persisted yet */
case class DepartmentRowUnsaved(
  /** Name of the department. */
  name: Name,
  /** Name of the group to which the department belongs. */
  groupname: Name,
  /** Default: nextval('humanresources.department_departmentid_seq'::regclass)
      Primary key for Department records. */
  departmentid: Defaulted[DepartmentId] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(departmentidDefault: => DepartmentId, modifieddateDefault: => TypoLocalDateTime): DepartmentRow =
    DepartmentRow(
      name = name,
      groupname = groupname,
      departmentid = departmentid match {
                       case Defaulted.UseDefault => departmentidDefault
                       case Defaulted.Provided(value) => value
                     },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object DepartmentRowUnsaved {
  implicit lazy val decoder: Decoder[DepartmentRowUnsaved] = Decoder.forProduct4[DepartmentRowUnsaved, Name, Name, Defaulted[DepartmentId], Defaulted[TypoLocalDateTime]]("name", "groupname", "departmentid", "modifieddate")(DepartmentRowUnsaved.apply)(Name.decoder, Name.decoder, Defaulted.decoder(DepartmentId.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[DepartmentRowUnsaved] = Encoder.forProduct4[DepartmentRowUnsaved, Name, Name, Defaulted[DepartmentId], Defaulted[TypoLocalDateTime]]("name", "groupname", "departmentid", "modifieddate")(x => (x.name, x.groupname, x.departmentid, x.modifieddate))(Name.encoder, Name.encoder, Defaulted.encoder(DepartmentId.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
