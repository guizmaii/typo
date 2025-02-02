/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithaddresses

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class VstorewithaddressesViewStructure[Row](val prefix: Option[String], val extract: Row => VstorewithaddressesViewRow, val merge: (Row, VstorewithaddressesViewRow) => Row)
  extends Relation[VstorewithaddressesViewFields, VstorewithaddressesViewRow, Row]
    with VstorewithaddressesViewFields[Row] { outer =>

  override val businessentityid = new Field[BusinessentityId, Row](prefix, "businessentityid", None, None)(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val name = new Field[Name, Row](prefix, "name", None, None)(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val addresstype = new Field[Name, Row](prefix, "addresstype", None, None)(x => extract(x).addresstype, (row, value) => merge(row, extract(row).copy(addresstype = value)))
  override val addressline1 = new Field[/* max 60 chars */ String, Row](prefix, "addressline1", None, None)(x => extract(x).addressline1, (row, value) => merge(row, extract(row).copy(addressline1 = value)))
  override val addressline2 = new OptField[/* max 60 chars */ String, Row](prefix, "addressline2", None, None)(x => extract(x).addressline2, (row, value) => merge(row, extract(row).copy(addressline2 = value)))
  override val city = new Field[/* max 30 chars */ String, Row](prefix, "city", None, None)(x => extract(x).city, (row, value) => merge(row, extract(row).copy(city = value)))
  override val stateprovincename = new Field[Name, Row](prefix, "stateprovincename", None, None)(x => extract(x).stateprovincename, (row, value) => merge(row, extract(row).copy(stateprovincename = value)))
  override val postalcode = new Field[/* max 15 chars */ String, Row](prefix, "postalcode", None, None)(x => extract(x).postalcode, (row, value) => merge(row, extract(row).copy(postalcode = value)))
  override val countryregionname = new Field[Name, Row](prefix, "countryregionname", None, None)(x => extract(x).countryregionname, (row, value) => merge(row, extract(row).copy(countryregionname = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](businessentityid, name, addresstype, addressline1, addressline2, city, stateprovincename, postalcode, countryregionname)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => VstorewithaddressesViewRow, merge: (NewRow, VstorewithaddressesViewRow) => NewRow): VstorewithaddressesViewStructure[NewRow] =
    new VstorewithaddressesViewStructure(prefix, extract, merge)
}
