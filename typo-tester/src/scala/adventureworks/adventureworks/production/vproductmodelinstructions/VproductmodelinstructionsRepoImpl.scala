/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package vproductmodelinstructions

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object VproductmodelinstructionsRepoImpl extends VproductmodelinstructionsRepo {
  override def selectAll(implicit c: Connection): List[VproductmodelinstructionsRow] = {
    SQL"""select productmodelid, name, instructions, LocationID, SetupHours, MachineHours, LaborHours, LotSize, Step, rowguid, modifieddate from production.vproductmodelinstructions""".as(VproductmodelinstructionsRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[VproductmodelinstructionsFieldOrIdValue[_]])(implicit c: Connection): List[VproductmodelinstructionsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case VproductmodelinstructionsFieldValue.productmodelid(value) => NamedParameter("productmodelid", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.instructions(value) => NamedParameter("instructions", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.LocationID(value) => NamedParameter("LocationID", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.SetupHours(value) => NamedParameter("SetupHours", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.MachineHours(value) => NamedParameter("MachineHours", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.LaborHours(value) => NamedParameter("LaborHours", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.LotSize(value) => NamedParameter("LotSize", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.Step(value) => NamedParameter("Step", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case VproductmodelinstructionsFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from production.vproductmodelinstructions where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(VproductmodelinstructionsRow.rowParser("").*)
    }
  
  }
}
