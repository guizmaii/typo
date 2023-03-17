package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait DomainUdtUsageRepoImpl extends DomainUdtUsageRepo {
  override def selectAll(implicit c: Connection): List[DomainUdtUsageRow] = {
    SQL"""select udt_catalog, udt_schema, udt_name, domain_catalog, domain_schema, domain_name from information_schema.domain_udt_usage""".as(DomainUdtUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[DomainUdtUsageFieldValue[_]])(implicit c: Connection): List[DomainUdtUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case DomainUdtUsageFieldValue.udtCatalog(value) => NamedParameter("udt_catalog", ParameterValue.from(value))
          case DomainUdtUsageFieldValue.udtSchema(value) => NamedParameter("udt_schema", ParameterValue.from(value))
          case DomainUdtUsageFieldValue.udtName(value) => NamedParameter("udt_name", ParameterValue.from(value))
          case DomainUdtUsageFieldValue.domainCatalog(value) => NamedParameter("domain_catalog", ParameterValue.from(value))
          case DomainUdtUsageFieldValue.domainSchema(value) => NamedParameter("domain_schema", ParameterValue.from(value))
          case DomainUdtUsageFieldValue.domainName(value) => NamedParameter("domain_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.domain_udt_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(DomainUdtUsageRow.rowParser.*)
    }

  }
}
