package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait UserDefinedTypesRepoImpl extends UserDefinedTypesRepo {
  override def selectAll(implicit c: Connection): List[UserDefinedTypesRow] = {
    SQL"""select user_defined_type_catalog, user_defined_type_schema, user_defined_type_name, user_defined_type_category, is_instantiable, is_final, ordering_form, ordering_category, ordering_routine_catalog, ordering_routine_schema, ordering_routine_name, reference_type, data_type, character_maximum_length, character_octet_length, character_set_catalog, character_set_schema, character_set_name, collation_catalog, collation_schema, collation_name, numeric_precision, numeric_precision_radix, numeric_scale, datetime_precision, interval_type, interval_precision, source_dtd_identifier, ref_dtd_identifier from information_schema.user_defined_types""".as(UserDefinedTypesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[UserDefinedTypesFieldValue[_]])(implicit c: Connection): List[UserDefinedTypesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UserDefinedTypesFieldValue.userDefinedTypeCatalog(value) => NamedParameter("user_defined_type_catalog", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.userDefinedTypeSchema(value) => NamedParameter("user_defined_type_schema", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.userDefinedTypeName(value) => NamedParameter("user_defined_type_name", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.userDefinedTypeCategory(value) => NamedParameter("user_defined_type_category", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.isInstantiable(value) => NamedParameter("is_instantiable", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.isFinal(value) => NamedParameter("is_final", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.orderingForm(value) => NamedParameter("ordering_form", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.orderingCategory(value) => NamedParameter("ordering_category", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.orderingRoutineCatalog(value) => NamedParameter("ordering_routine_catalog", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.orderingRoutineSchema(value) => NamedParameter("ordering_routine_schema", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.orderingRoutineName(value) => NamedParameter("ordering_routine_name", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.referenceType(value) => NamedParameter("reference_type", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.dataType(value) => NamedParameter("data_type", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.characterMaximumLength(value) => NamedParameter("character_maximum_length", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.characterOctetLength(value) => NamedParameter("character_octet_length", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.characterSetCatalog(value) => NamedParameter("character_set_catalog", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.characterSetSchema(value) => NamedParameter("character_set_schema", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.characterSetName(value) => NamedParameter("character_set_name", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.collationCatalog(value) => NamedParameter("collation_catalog", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.collationSchema(value) => NamedParameter("collation_schema", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.collationName(value) => NamedParameter("collation_name", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.numericPrecision(value) => NamedParameter("numeric_precision", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.numericPrecisionRadix(value) => NamedParameter("numeric_precision_radix", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.numericScale(value) => NamedParameter("numeric_scale", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.datetimePrecision(value) => NamedParameter("datetime_precision", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.intervalType(value) => NamedParameter("interval_type", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.intervalPrecision(value) => NamedParameter("interval_precision", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.sourceDtdIdentifier(value) => NamedParameter("source_dtd_identifier", ParameterValue.from(value))
          case UserDefinedTypesFieldValue.refDtdIdentifier(value) => NamedParameter("ref_dtd_identifier", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.user_defined_types where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(UserDefinedTypesRow.rowParser.*)
    }

  }
}
