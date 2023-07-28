/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_roles

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgRolesViewRepoImpl extends PgRolesViewRepo {
  override def selectAll(implicit c: Connection): List[PgRolesViewRow] = {
    SQL"""select rolname, rolsuper, rolinherit, rolcreaterole, rolcreatedb, rolcanlogin, rolreplication, rolconnlimit, rolpassword, rolvaliduntil, rolbypassrls, rolconfig, oid
          from pg_catalog.pg_roles
       """.as(PgRolesViewRow.rowParser(1).*)
  }
}
