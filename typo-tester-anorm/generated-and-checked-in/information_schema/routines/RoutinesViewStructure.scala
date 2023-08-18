/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package routines

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class RoutinesViewStructure[Row](val prefix: Option[String], val extract: Row => RoutinesViewRow, val merge: (Row, RoutinesViewRow) => Row)
  extends Relation[RoutinesViewFields, RoutinesViewRow, Row]
    with RoutinesViewFields[Row] { outer =>

  override val specificCatalog = new OptField[SqlIdentifier, Row](prefix, "specific_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).specificCatalog, (row, value) => merge(row, extract(row).copy(specificCatalog = value)))
  override val specificSchema = new OptField[SqlIdentifier, Row](prefix, "specific_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).specificSchema, (row, value) => merge(row, extract(row).copy(specificSchema = value)))
  override val specificName = new OptField[SqlIdentifier, Row](prefix, "specific_name", None, Some("information_schema.sql_identifier"))(x => extract(x).specificName, (row, value) => merge(row, extract(row).copy(specificName = value)))
  override val routineCatalog = new OptField[SqlIdentifier, Row](prefix, "routine_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).routineCatalog, (row, value) => merge(row, extract(row).copy(routineCatalog = value)))
  override val routineSchema = new OptField[SqlIdentifier, Row](prefix, "routine_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).routineSchema, (row, value) => merge(row, extract(row).copy(routineSchema = value)))
  override val routineName = new OptField[SqlIdentifier, Row](prefix, "routine_name", None, Some("information_schema.sql_identifier"))(x => extract(x).routineName, (row, value) => merge(row, extract(row).copy(routineName = value)))
  override val routineType = new OptField[CharacterData, Row](prefix, "routine_type", None, Some("information_schema.character_data"))(x => extract(x).routineType, (row, value) => merge(row, extract(row).copy(routineType = value)))
  override val moduleCatalog = new OptField[SqlIdentifier, Row](prefix, "module_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).moduleCatalog, (row, value) => merge(row, extract(row).copy(moduleCatalog = value)))
  override val moduleSchema = new OptField[SqlIdentifier, Row](prefix, "module_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).moduleSchema, (row, value) => merge(row, extract(row).copy(moduleSchema = value)))
  override val moduleName = new OptField[SqlIdentifier, Row](prefix, "module_name", None, Some("information_schema.sql_identifier"))(x => extract(x).moduleName, (row, value) => merge(row, extract(row).copy(moduleName = value)))
  override val udtCatalog = new OptField[SqlIdentifier, Row](prefix, "udt_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).udtCatalog, (row, value) => merge(row, extract(row).copy(udtCatalog = value)))
  override val udtSchema = new OptField[SqlIdentifier, Row](prefix, "udt_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).udtSchema, (row, value) => merge(row, extract(row).copy(udtSchema = value)))
  override val udtName = new OptField[SqlIdentifier, Row](prefix, "udt_name", None, Some("information_schema.sql_identifier"))(x => extract(x).udtName, (row, value) => merge(row, extract(row).copy(udtName = value)))
  override val dataType = new OptField[CharacterData, Row](prefix, "data_type", None, Some("information_schema.character_data"))(x => extract(x).dataType, (row, value) => merge(row, extract(row).copy(dataType = value)))
  override val characterMaximumLength = new OptField[CardinalNumber, Row](prefix, "character_maximum_length", None, Some("information_schema.cardinal_number"))(x => extract(x).characterMaximumLength, (row, value) => merge(row, extract(row).copy(characterMaximumLength = value)))
  override val characterOctetLength = new OptField[CardinalNumber, Row](prefix, "character_octet_length", None, Some("information_schema.cardinal_number"))(x => extract(x).characterOctetLength, (row, value) => merge(row, extract(row).copy(characterOctetLength = value)))
  override val characterSetCatalog = new OptField[SqlIdentifier, Row](prefix, "character_set_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).characterSetCatalog, (row, value) => merge(row, extract(row).copy(characterSetCatalog = value)))
  override val characterSetSchema = new OptField[SqlIdentifier, Row](prefix, "character_set_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).characterSetSchema, (row, value) => merge(row, extract(row).copy(characterSetSchema = value)))
  override val characterSetName = new OptField[SqlIdentifier, Row](prefix, "character_set_name", None, Some("information_schema.sql_identifier"))(x => extract(x).characterSetName, (row, value) => merge(row, extract(row).copy(characterSetName = value)))
  override val collationCatalog = new OptField[SqlIdentifier, Row](prefix, "collation_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).collationCatalog, (row, value) => merge(row, extract(row).copy(collationCatalog = value)))
  override val collationSchema = new OptField[SqlIdentifier, Row](prefix, "collation_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).collationSchema, (row, value) => merge(row, extract(row).copy(collationSchema = value)))
  override val collationName = new OptField[SqlIdentifier, Row](prefix, "collation_name", None, Some("information_schema.sql_identifier"))(x => extract(x).collationName, (row, value) => merge(row, extract(row).copy(collationName = value)))
  override val numericPrecision = new OptField[CardinalNumber, Row](prefix, "numeric_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).numericPrecision, (row, value) => merge(row, extract(row).copy(numericPrecision = value)))
  override val numericPrecisionRadix = new OptField[CardinalNumber, Row](prefix, "numeric_precision_radix", None, Some("information_schema.cardinal_number"))(x => extract(x).numericPrecisionRadix, (row, value) => merge(row, extract(row).copy(numericPrecisionRadix = value)))
  override val numericScale = new OptField[CardinalNumber, Row](prefix, "numeric_scale", None, Some("information_schema.cardinal_number"))(x => extract(x).numericScale, (row, value) => merge(row, extract(row).copy(numericScale = value)))
  override val datetimePrecision = new OptField[CardinalNumber, Row](prefix, "datetime_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).datetimePrecision, (row, value) => merge(row, extract(row).copy(datetimePrecision = value)))
  override val intervalType = new OptField[CharacterData, Row](prefix, "interval_type", None, Some("information_schema.character_data"))(x => extract(x).intervalType, (row, value) => merge(row, extract(row).copy(intervalType = value)))
  override val intervalPrecision = new OptField[CardinalNumber, Row](prefix, "interval_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).intervalPrecision, (row, value) => merge(row, extract(row).copy(intervalPrecision = value)))
  override val typeUdtCatalog = new OptField[SqlIdentifier, Row](prefix, "type_udt_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).typeUdtCatalog, (row, value) => merge(row, extract(row).copy(typeUdtCatalog = value)))
  override val typeUdtSchema = new OptField[SqlIdentifier, Row](prefix, "type_udt_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).typeUdtSchema, (row, value) => merge(row, extract(row).copy(typeUdtSchema = value)))
  override val typeUdtName = new OptField[SqlIdentifier, Row](prefix, "type_udt_name", None, Some("information_schema.sql_identifier"))(x => extract(x).typeUdtName, (row, value) => merge(row, extract(row).copy(typeUdtName = value)))
  override val scopeCatalog = new OptField[SqlIdentifier, Row](prefix, "scope_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).scopeCatalog, (row, value) => merge(row, extract(row).copy(scopeCatalog = value)))
  override val scopeSchema = new OptField[SqlIdentifier, Row](prefix, "scope_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).scopeSchema, (row, value) => merge(row, extract(row).copy(scopeSchema = value)))
  override val scopeName = new OptField[SqlIdentifier, Row](prefix, "scope_name", None, Some("information_schema.sql_identifier"))(x => extract(x).scopeName, (row, value) => merge(row, extract(row).copy(scopeName = value)))
  override val maximumCardinality = new OptField[CardinalNumber, Row](prefix, "maximum_cardinality", None, Some("information_schema.cardinal_number"))(x => extract(x).maximumCardinality, (row, value) => merge(row, extract(row).copy(maximumCardinality = value)))
  override val dtdIdentifier = new OptField[SqlIdentifier, Row](prefix, "dtd_identifier", None, Some("information_schema.sql_identifier"))(x => extract(x).dtdIdentifier, (row, value) => merge(row, extract(row).copy(dtdIdentifier = value)))
  override val routineBody = new OptField[CharacterData, Row](prefix, "routine_body", None, Some("information_schema.character_data"))(x => extract(x).routineBody, (row, value) => merge(row, extract(row).copy(routineBody = value)))
  override val routineDefinition = new OptField[CharacterData, Row](prefix, "routine_definition", None, Some("information_schema.character_data"))(x => extract(x).routineDefinition, (row, value) => merge(row, extract(row).copy(routineDefinition = value)))
  override val externalName = new OptField[CharacterData, Row](prefix, "external_name", None, Some("information_schema.character_data"))(x => extract(x).externalName, (row, value) => merge(row, extract(row).copy(externalName = value)))
  override val externalLanguage = new OptField[CharacterData, Row](prefix, "external_language", None, Some("information_schema.character_data"))(x => extract(x).externalLanguage, (row, value) => merge(row, extract(row).copy(externalLanguage = value)))
  override val parameterStyle = new OptField[CharacterData, Row](prefix, "parameter_style", None, Some("information_schema.character_data"))(x => extract(x).parameterStyle, (row, value) => merge(row, extract(row).copy(parameterStyle = value)))
  override val isDeterministic = new OptField[YesOrNo, Row](prefix, "is_deterministic", None, Some("information_schema.yes_or_no"))(x => extract(x).isDeterministic, (row, value) => merge(row, extract(row).copy(isDeterministic = value)))
  override val sqlDataAccess = new OptField[CharacterData, Row](prefix, "sql_data_access", None, Some("information_schema.character_data"))(x => extract(x).sqlDataAccess, (row, value) => merge(row, extract(row).copy(sqlDataAccess = value)))
  override val isNullCall = new OptField[YesOrNo, Row](prefix, "is_null_call", None, Some("information_schema.yes_or_no"))(x => extract(x).isNullCall, (row, value) => merge(row, extract(row).copy(isNullCall = value)))
  override val sqlPath = new OptField[CharacterData, Row](prefix, "sql_path", None, Some("information_schema.character_data"))(x => extract(x).sqlPath, (row, value) => merge(row, extract(row).copy(sqlPath = value)))
  override val schemaLevelRoutine = new OptField[YesOrNo, Row](prefix, "schema_level_routine", None, Some("information_schema.yes_or_no"))(x => extract(x).schemaLevelRoutine, (row, value) => merge(row, extract(row).copy(schemaLevelRoutine = value)))
  override val maxDynamicResultSets = new OptField[CardinalNumber, Row](prefix, "max_dynamic_result_sets", None, Some("information_schema.cardinal_number"))(x => extract(x).maxDynamicResultSets, (row, value) => merge(row, extract(row).copy(maxDynamicResultSets = value)))
  override val isUserDefinedCast = new OptField[YesOrNo, Row](prefix, "is_user_defined_cast", None, Some("information_schema.yes_or_no"))(x => extract(x).isUserDefinedCast, (row, value) => merge(row, extract(row).copy(isUserDefinedCast = value)))
  override val isImplicitlyInvocable = new OptField[YesOrNo, Row](prefix, "is_implicitly_invocable", None, Some("information_schema.yes_or_no"))(x => extract(x).isImplicitlyInvocable, (row, value) => merge(row, extract(row).copy(isImplicitlyInvocable = value)))
  override val securityType = new OptField[CharacterData, Row](prefix, "security_type", None, Some("information_schema.character_data"))(x => extract(x).securityType, (row, value) => merge(row, extract(row).copy(securityType = value)))
  override val toSqlSpecificCatalog = new OptField[SqlIdentifier, Row](prefix, "to_sql_specific_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).toSqlSpecificCatalog, (row, value) => merge(row, extract(row).copy(toSqlSpecificCatalog = value)))
  override val toSqlSpecificSchema = new OptField[SqlIdentifier, Row](prefix, "to_sql_specific_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).toSqlSpecificSchema, (row, value) => merge(row, extract(row).copy(toSqlSpecificSchema = value)))
  override val toSqlSpecificName = new OptField[SqlIdentifier, Row](prefix, "to_sql_specific_name", None, Some("information_schema.sql_identifier"))(x => extract(x).toSqlSpecificName, (row, value) => merge(row, extract(row).copy(toSqlSpecificName = value)))
  override val asLocator = new OptField[YesOrNo, Row](prefix, "as_locator", None, Some("information_schema.yes_or_no"))(x => extract(x).asLocator, (row, value) => merge(row, extract(row).copy(asLocator = value)))
  override val created = new OptField[TimeStamp, Row](prefix, "created", None, Some("information_schema.time_stamp"))(x => extract(x).created, (row, value) => merge(row, extract(row).copy(created = value)))
  override val lastAltered = new OptField[TimeStamp, Row](prefix, "last_altered", None, Some("information_schema.time_stamp"))(x => extract(x).lastAltered, (row, value) => merge(row, extract(row).copy(lastAltered = value)))
  override val newSavepointLevel = new OptField[YesOrNo, Row](prefix, "new_savepoint_level", None, Some("information_schema.yes_or_no"))(x => extract(x).newSavepointLevel, (row, value) => merge(row, extract(row).copy(newSavepointLevel = value)))
  override val isUdtDependent = new OptField[YesOrNo, Row](prefix, "is_udt_dependent", None, Some("information_schema.yes_or_no"))(x => extract(x).isUdtDependent, (row, value) => merge(row, extract(row).copy(isUdtDependent = value)))
  override val resultCastFromDataType = new OptField[CharacterData, Row](prefix, "result_cast_from_data_type", None, Some("information_schema.character_data"))(x => extract(x).resultCastFromDataType, (row, value) => merge(row, extract(row).copy(resultCastFromDataType = value)))
  override val resultCastAsLocator = new OptField[YesOrNo, Row](prefix, "result_cast_as_locator", None, Some("information_schema.yes_or_no"))(x => extract(x).resultCastAsLocator, (row, value) => merge(row, extract(row).copy(resultCastAsLocator = value)))
  override val resultCastCharMaxLength = new OptField[CardinalNumber, Row](prefix, "result_cast_char_max_length", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastCharMaxLength, (row, value) => merge(row, extract(row).copy(resultCastCharMaxLength = value)))
  override val resultCastCharOctetLength = new OptField[CardinalNumber, Row](prefix, "result_cast_char_octet_length", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastCharOctetLength, (row, value) => merge(row, extract(row).copy(resultCastCharOctetLength = value)))
  override val resultCastCharSetCatalog = new OptField[SqlIdentifier, Row](prefix, "result_cast_char_set_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCharSetCatalog, (row, value) => merge(row, extract(row).copy(resultCastCharSetCatalog = value)))
  override val resultCastCharSetSchema = new OptField[SqlIdentifier, Row](prefix, "result_cast_char_set_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCharSetSchema, (row, value) => merge(row, extract(row).copy(resultCastCharSetSchema = value)))
  override val resultCastCharSetName = new OptField[SqlIdentifier, Row](prefix, "result_cast_char_set_name", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCharSetName, (row, value) => merge(row, extract(row).copy(resultCastCharSetName = value)))
  override val resultCastCollationCatalog = new OptField[SqlIdentifier, Row](prefix, "result_cast_collation_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCollationCatalog, (row, value) => merge(row, extract(row).copy(resultCastCollationCatalog = value)))
  override val resultCastCollationSchema = new OptField[SqlIdentifier, Row](prefix, "result_cast_collation_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCollationSchema, (row, value) => merge(row, extract(row).copy(resultCastCollationSchema = value)))
  override val resultCastCollationName = new OptField[SqlIdentifier, Row](prefix, "result_cast_collation_name", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastCollationName, (row, value) => merge(row, extract(row).copy(resultCastCollationName = value)))
  override val resultCastNumericPrecision = new OptField[CardinalNumber, Row](prefix, "result_cast_numeric_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastNumericPrecision, (row, value) => merge(row, extract(row).copy(resultCastNumericPrecision = value)))
  override val resultCastNumericPrecisionRadix = new OptField[CardinalNumber, Row](prefix, "result_cast_numeric_precision_radix", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastNumericPrecisionRadix, (row, value) => merge(row, extract(row).copy(resultCastNumericPrecisionRadix = value)))
  override val resultCastNumericScale = new OptField[CardinalNumber, Row](prefix, "result_cast_numeric_scale", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastNumericScale, (row, value) => merge(row, extract(row).copy(resultCastNumericScale = value)))
  override val resultCastDatetimePrecision = new OptField[CardinalNumber, Row](prefix, "result_cast_datetime_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastDatetimePrecision, (row, value) => merge(row, extract(row).copy(resultCastDatetimePrecision = value)))
  override val resultCastIntervalType = new OptField[CharacterData, Row](prefix, "result_cast_interval_type", None, Some("information_schema.character_data"))(x => extract(x).resultCastIntervalType, (row, value) => merge(row, extract(row).copy(resultCastIntervalType = value)))
  override val resultCastIntervalPrecision = new OptField[CardinalNumber, Row](prefix, "result_cast_interval_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastIntervalPrecision, (row, value) => merge(row, extract(row).copy(resultCastIntervalPrecision = value)))
  override val resultCastTypeUdtCatalog = new OptField[SqlIdentifier, Row](prefix, "result_cast_type_udt_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastTypeUdtCatalog, (row, value) => merge(row, extract(row).copy(resultCastTypeUdtCatalog = value)))
  override val resultCastTypeUdtSchema = new OptField[SqlIdentifier, Row](prefix, "result_cast_type_udt_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastTypeUdtSchema, (row, value) => merge(row, extract(row).copy(resultCastTypeUdtSchema = value)))
  override val resultCastTypeUdtName = new OptField[SqlIdentifier, Row](prefix, "result_cast_type_udt_name", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastTypeUdtName, (row, value) => merge(row, extract(row).copy(resultCastTypeUdtName = value)))
  override val resultCastScopeCatalog = new OptField[SqlIdentifier, Row](prefix, "result_cast_scope_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastScopeCatalog, (row, value) => merge(row, extract(row).copy(resultCastScopeCatalog = value)))
  override val resultCastScopeSchema = new OptField[SqlIdentifier, Row](prefix, "result_cast_scope_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastScopeSchema, (row, value) => merge(row, extract(row).copy(resultCastScopeSchema = value)))
  override val resultCastScopeName = new OptField[SqlIdentifier, Row](prefix, "result_cast_scope_name", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastScopeName, (row, value) => merge(row, extract(row).copy(resultCastScopeName = value)))
  override val resultCastMaximumCardinality = new OptField[CardinalNumber, Row](prefix, "result_cast_maximum_cardinality", None, Some("information_schema.cardinal_number"))(x => extract(x).resultCastMaximumCardinality, (row, value) => merge(row, extract(row).copy(resultCastMaximumCardinality = value)))
  override val resultCastDtdIdentifier = new OptField[SqlIdentifier, Row](prefix, "result_cast_dtd_identifier", None, Some("information_schema.sql_identifier"))(x => extract(x).resultCastDtdIdentifier, (row, value) => merge(row, extract(row).copy(resultCastDtdIdentifier = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](specificCatalog, specificSchema, specificName, routineCatalog, routineSchema, routineName, routineType, moduleCatalog, moduleSchema, moduleName, udtCatalog, udtSchema, udtName, dataType, characterMaximumLength, characterOctetLength, characterSetCatalog, characterSetSchema, characterSetName, collationCatalog, collationSchema, collationName, numericPrecision, numericPrecisionRadix, numericScale, datetimePrecision, intervalType, intervalPrecision, typeUdtCatalog, typeUdtSchema, typeUdtName, scopeCatalog, scopeSchema, scopeName, maximumCardinality, dtdIdentifier, routineBody, routineDefinition, externalName, externalLanguage, parameterStyle, isDeterministic, sqlDataAccess, isNullCall, sqlPath, schemaLevelRoutine, maxDynamicResultSets, isUserDefinedCast, isImplicitlyInvocable, securityType, toSqlSpecificCatalog, toSqlSpecificSchema, toSqlSpecificName, asLocator, created, lastAltered, newSavepointLevel, isUdtDependent, resultCastFromDataType, resultCastAsLocator, resultCastCharMaxLength, resultCastCharOctetLength, resultCastCharSetCatalog, resultCastCharSetSchema, resultCastCharSetName, resultCastCollationCatalog, resultCastCollationSchema, resultCastCollationName, resultCastNumericPrecision, resultCastNumericPrecisionRadix, resultCastNumericScale, resultCastDatetimePrecision, resultCastIntervalType, resultCastIntervalPrecision, resultCastTypeUdtCatalog, resultCastTypeUdtSchema, resultCastTypeUdtName, resultCastScopeCatalog, resultCastScopeSchema, resultCastScopeName, resultCastMaximumCardinality, resultCastDtdIdentifier)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => RoutinesViewRow, merge: (NewRow, RoutinesViewRow) => NewRow): RoutinesViewStructure[NewRow] =
    new RoutinesViewStructure(prefix, extract, merge)
}
