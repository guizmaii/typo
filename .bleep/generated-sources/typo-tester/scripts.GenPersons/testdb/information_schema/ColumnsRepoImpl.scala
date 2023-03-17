package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ColumnsRepoImpl extends ColumnsRepo {
  override def selectAll(implicit c: Connection): List[ColumnsRow] = {
    SQL"""select table_catalog, table_schema, table_name, column_name, ordinal_position, column_default, is_nullable, data_type, character_maximum_length, character_octet_length, numeric_precision, numeric_precision_radix, numeric_scale, datetime_precision, interval_type, interval_precision, character_set_catalog, character_set_schema, character_set_name, collation_catalog, collation_schema, collation_name, domain_catalog, domain_schema, domain_name, udt_catalog, udt_schema, udt_name, scope_catalog, scope_schema, scope_name, maximum_cardinality, dtd_identifier, is_self_referencing, is_identity, identity_generation, identity_start, identity_increment, identity_maximum, identity_minimum, identity_cycle, is_generated, generation_expression, is_updatable from information_schema.columns""".as(ColumnsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ColumnsFieldValue[_]])(implicit c: Connection): List[ColumnsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ColumnsFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case ColumnsFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case ColumnsFieldValue.columnName(value) => NamedParameter("column_name", ParameterValue.from(value))
          case ColumnsFieldValue.ordinalPosition(value) => NamedParameter("ordinal_position", ParameterValue.from(value))
          case ColumnsFieldValue.columnDefault(value) => NamedParameter("column_default", ParameterValue.from(value))
          case ColumnsFieldValue.isNullable(value) => NamedParameter("is_nullable", ParameterValue.from(value))
          case ColumnsFieldValue.dataType(value) => NamedParameter("data_type", ParameterValue.from(value))
          case ColumnsFieldValue.characterMaximumLength(value) => NamedParameter("character_maximum_length", ParameterValue.from(value))
          case ColumnsFieldValue.characterOctetLength(value) => NamedParameter("character_octet_length", ParameterValue.from(value))
          case ColumnsFieldValue.numericPrecision(value) => NamedParameter("numeric_precision", ParameterValue.from(value))
          case ColumnsFieldValue.numericPrecisionRadix(value) => NamedParameter("numeric_precision_radix", ParameterValue.from(value))
          case ColumnsFieldValue.numericScale(value) => NamedParameter("numeric_scale", ParameterValue.from(value))
          case ColumnsFieldValue.datetimePrecision(value) => NamedParameter("datetime_precision", ParameterValue.from(value))
          case ColumnsFieldValue.intervalType(value) => NamedParameter("interval_type", ParameterValue.from(value))
          case ColumnsFieldValue.intervalPrecision(value) => NamedParameter("interval_precision", ParameterValue.from(value))
          case ColumnsFieldValue.characterSetCatalog(value) => NamedParameter("character_set_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.characterSetSchema(value) => NamedParameter("character_set_schema", ParameterValue.from(value))
          case ColumnsFieldValue.characterSetName(value) => NamedParameter("character_set_name", ParameterValue.from(value))
          case ColumnsFieldValue.collationCatalog(value) => NamedParameter("collation_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.collationSchema(value) => NamedParameter("collation_schema", ParameterValue.from(value))
          case ColumnsFieldValue.collationName(value) => NamedParameter("collation_name", ParameterValue.from(value))
          case ColumnsFieldValue.domainCatalog(value) => NamedParameter("domain_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.domainSchema(value) => NamedParameter("domain_schema", ParameterValue.from(value))
          case ColumnsFieldValue.domainName(value) => NamedParameter("domain_name", ParameterValue.from(value))
          case ColumnsFieldValue.udtCatalog(value) => NamedParameter("udt_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.udtSchema(value) => NamedParameter("udt_schema", ParameterValue.from(value))
          case ColumnsFieldValue.udtName(value) => NamedParameter("udt_name", ParameterValue.from(value))
          case ColumnsFieldValue.scopeCatalog(value) => NamedParameter("scope_catalog", ParameterValue.from(value))
          case ColumnsFieldValue.scopeSchema(value) => NamedParameter("scope_schema", ParameterValue.from(value))
          case ColumnsFieldValue.scopeName(value) => NamedParameter("scope_name", ParameterValue.from(value))
          case ColumnsFieldValue.maximumCardinality(value) => NamedParameter("maximum_cardinality", ParameterValue.from(value))
          case ColumnsFieldValue.dtdIdentifier(value) => NamedParameter("dtd_identifier", ParameterValue.from(value))
          case ColumnsFieldValue.isSelfReferencing(value) => NamedParameter("is_self_referencing", ParameterValue.from(value))
          case ColumnsFieldValue.isIdentity(value) => NamedParameter("is_identity", ParameterValue.from(value))
          case ColumnsFieldValue.identityGeneration(value) => NamedParameter("identity_generation", ParameterValue.from(value))
          case ColumnsFieldValue.identityStart(value) => NamedParameter("identity_start", ParameterValue.from(value))
          case ColumnsFieldValue.identityIncrement(value) => NamedParameter("identity_increment", ParameterValue.from(value))
          case ColumnsFieldValue.identityMaximum(value) => NamedParameter("identity_maximum", ParameterValue.from(value))
          case ColumnsFieldValue.identityMinimum(value) => NamedParameter("identity_minimum", ParameterValue.from(value))
          case ColumnsFieldValue.identityCycle(value) => NamedParameter("identity_cycle", ParameterValue.from(value))
          case ColumnsFieldValue.isGenerated(value) => NamedParameter("is_generated", ParameterValue.from(value))
          case ColumnsFieldValue.generationExpression(value) => NamedParameter("generation_expression", ParameterValue.from(value))
          case ColumnsFieldValue.isUpdatable(value) => NamedParameter("is_updatable", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.columns where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ColumnsRow.rowParser.*)
    }

  }
}
