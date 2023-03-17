package testdb
package information_schema



sealed abstract class ViewsFieldValue[T](val name: String, val value: T)

object ViewsFieldValue {
  case class tableCatalog(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("table_catalog", value)
  case class tableSchema(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("table_schema", value)
  case class tableName(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("table_name", value)
  case class viewDefinition(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("view_definition", value)
  case class checkOption(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("check_option", value)
  case class isUpdatable(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("is_updatable", value)
  case class isInsertableInto(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("is_insertable_into", value)
  case class isTriggerUpdatable(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("is_trigger_updatable", value)
  case class isTriggerDeletable(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("is_trigger_deletable", value)
  case class isTriggerInsertableInto(override val value: /* unknown nullability */ Option[String]) extends ViewsFieldValue("is_trigger_insertable_into", value)
}
