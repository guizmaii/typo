/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package domain_udt_usage

import anorm.SqlStringInterpolation
import java.sql.Connection

object DomainUdtUsageViewRepoImpl extends DomainUdtUsageViewRepo {
  override def selectAll(implicit c: Connection): List[DomainUdtUsageViewRow] = {
    SQL"""select udt_catalog, udt_schema, udt_name, domain_catalog, domain_schema, domain_name
          from information_schema.domain_udt_usage
       """.as(DomainUdtUsageViewRow.rowParser(1).*)
  }
}
