/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person_detail

import adventureworks.person.businessentity.BusinessentityId
import anorm.SqlStringInterpolation
import java.sql.Connection

object PersonDetailSqlRepoImpl extends PersonDetailSqlRepo {
  override def opt(businessentityid: Option[/* user-picked */ BusinessentityId], modifiedAfter: Option[TypoLocalDateTime])(implicit c: Connection): List[PersonDetailSqlRow] = {
    val sql =
      SQL"""SELECT s.businessentityid
                   , p.title
                   , p.firstname
                   , p.middlename
                   , p.namestyle
                   , e.jobtitle
                   , a.addressline1
                   , a.city
                   , a.postalcode
            FROM sales.salesperson s
                     JOIN humanresources.employee e ON e.businessentityid = s.businessentityid
                     JOIN person.person p ON p.businessentityid = s.businessentityid
                     JOIN person.businessentityaddress bea ON bea.businessentityid = s.businessentityid
                     JOIN person.address a ON a.addressid = bea.addressid
            where s.businessentityid = $businessentityid::int4
            and p.modifieddate > $modifiedAfter::timestamp"""
    sql.as(PersonDetailSqlRow.rowParser(1).*)
  }
}
