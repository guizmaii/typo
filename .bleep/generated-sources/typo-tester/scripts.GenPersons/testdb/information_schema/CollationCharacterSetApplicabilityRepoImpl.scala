package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait CollationCharacterSetApplicabilityRepoImpl extends CollationCharacterSetApplicabilityRepo {
  override def selectAll(implicit c: Connection): List[CollationCharacterSetApplicabilityRow] = {
    SQL"""select collation_catalog, collation_schema, collation_name, character_set_catalog, character_set_schema, character_set_name from information_schema.collation_character_set_applicability""".as(CollationCharacterSetApplicabilityRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[CollationCharacterSetApplicabilityFieldValue[_]])(implicit c: Connection): List[CollationCharacterSetApplicabilityRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CollationCharacterSetApplicabilityFieldValue.collationCatalog(value) => NamedParameter("collation_catalog", ParameterValue.from(value))
          case CollationCharacterSetApplicabilityFieldValue.collationSchema(value) => NamedParameter("collation_schema", ParameterValue.from(value))
          case CollationCharacterSetApplicabilityFieldValue.collationName(value) => NamedParameter("collation_name", ParameterValue.from(value))
          case CollationCharacterSetApplicabilityFieldValue.characterSetCatalog(value) => NamedParameter("character_set_catalog", ParameterValue.from(value))
          case CollationCharacterSetApplicabilityFieldValue.characterSetSchema(value) => NamedParameter("character_set_schema", ParameterValue.from(value))
          case CollationCharacterSetApplicabilityFieldValue.characterSetName(value) => NamedParameter("character_set_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.collation_character_set_applicability where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(CollationCharacterSetApplicabilityRow.rowParser.*)
    }

  }
}
