package testdb
package information_schema



sealed abstract class TablesFieldValue[T](val name: String, val value: T)

object TablesFieldValue {
  case class tableCatalog(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("table_catalog", value)
  case class tableSchema(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("table_schema", value)
  case class tableName(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("table_name", value)
  case class tableType(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("table_type", value)
  case class selfReferencingColumnName(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("self_referencing_column_name", value)
  case class referenceGeneration(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("reference_generation", value)
  case class userDefinedTypeCatalog(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("user_defined_type_catalog", value)
  case class userDefinedTypeSchema(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("user_defined_type_schema", value)
  case class userDefinedTypeName(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("user_defined_type_name", value)
  case class isInsertableInto(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("is_insertable_into", value)
  case class isTyped(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("is_typed", value)
  case class commitAction(override val value: /* unknown nullability */ Option[String]) extends TablesFieldValue("commit_action", value)
}
