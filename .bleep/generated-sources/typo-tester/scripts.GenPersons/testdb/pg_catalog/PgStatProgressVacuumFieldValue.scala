package testdb
package pg_catalog



sealed abstract class PgStatProgressVacuumFieldValue[T](val name: String, val value: T)

object PgStatProgressVacuumFieldValue {
  case class pid(override val value: /* unknown nullability */ Option[Int]) extends PgStatProgressVacuumFieldValue("pid", value)
  case class datid(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("datid", value)
  case class datname(override val value: String) extends PgStatProgressVacuumFieldValue("datname", value)
  case class relid(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("relid", value)
  case class phase(override val value: /* unknown nullability */ Option[String]) extends PgStatProgressVacuumFieldValue("phase", value)
  case class heapBlksTotal(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("heap_blks_total", value)
  case class heapBlksScanned(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("heap_blks_scanned", value)
  case class heapBlksVacuumed(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("heap_blks_vacuumed", value)
  case class indexVacuumCount(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("index_vacuum_count", value)
  case class maxDeadTuples(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("max_dead_tuples", value)
  case class numDeadTuples(override val value: /* unknown nullability */ Option[Long]) extends PgStatProgressVacuumFieldValue("num_dead_tuples", value)
}
