/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package information_schema
package key_column_usage

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import typo.generated.information_schema.CardinalNumber
import typo.generated.information_schema.SqlIdentifier

object KeyColumnUsageRepoImpl extends KeyColumnUsageRepo {
  override def selectAll(implicit c: Connection): List[KeyColumnUsageRow] = {
    SQL"""select constraint_catalog, constraint_schema, constraint_name, table_catalog, table_schema, table_name, column_name, ordinal_position, position_in_unique_constraint
          from information_schema.key_column_usage
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[KeyColumnUsageFieldOrIdValue[_]])(implicit c: Connection): List[KeyColumnUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case KeyColumnUsageFieldValue.constraintCatalog(value) => NamedParameter("constraint_catalog", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.constraintSchema(value) => NamedParameter("constraint_schema", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.constraintName(value) => NamedParameter("constraint_name", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.columnName(value) => NamedParameter("column_name", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.ordinalPosition(value) => NamedParameter("ordinal_position", ParameterValue.from(value))
          case KeyColumnUsageFieldValue.positionInUniqueConstraint(value) => NamedParameter("position_in_unique_constraint", ParameterValue.from(value))
        }
        val q = s"""select *
                    from information_schema.key_column_usage
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[KeyColumnUsageRow] =
    RowParser[KeyColumnUsageRow] { row =>
      Success(
        KeyColumnUsageRow(
          constraintCatalog = row[Option[SqlIdentifier]]("constraint_catalog"),
          constraintSchema = row[Option[SqlIdentifier]]("constraint_schema"),
          constraintName = row[Option[SqlIdentifier]]("constraint_name"),
          tableCatalog = row[Option[SqlIdentifier]]("table_catalog"),
          tableSchema = row[Option[SqlIdentifier]]("table_schema"),
          tableName = row[Option[SqlIdentifier]]("table_name"),
          columnName = row[Option[SqlIdentifier]]("column_name"),
          ordinalPosition = row[Option[CardinalNumber]]("ordinal_position"),
          positionInUniqueConstraint = row[Option[CardinalNumber]]("position_in_unique_constraint")
        )
      )
    }
}
