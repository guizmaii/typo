/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pm

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PmViewStructure[Row](val prefix: Option[String], val extract: Row => PmViewRow, val merge: (Row, PmViewRow) => Row)
  extends Relation[PmViewFields, PmViewRow, Row]
    with PmViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val productmodelid = new OptField[ProductmodelId, Row](prefix, "productmodelid", None, Some("int4"))(x => extract(x).productmodelid, (row, value) => merge(row, extract(row).copy(productmodelid = value)))
  override val name = new OptField[Name, Row](prefix, "name", None, Some(""""public"."Name""""))(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val catalogdescription = new OptField[TypoXml, Row](prefix, "catalogdescription", None, Some("xml"))(x => extract(x).catalogdescription, (row, value) => merge(row, extract(row).copy(catalogdescription = value)))
  override val instructions = new OptField[TypoXml, Row](prefix, "instructions", None, Some("xml"))(x => extract(x).instructions, (row, value) => merge(row, extract(row).copy(instructions = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, productmodelid, name, catalogdescription, instructions, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PmViewRow, merge: (NewRow, PmViewRow) => NewRow): PmViewStructure[NewRow] =
    new PmViewStructure(prefix, extract, merge)
}
