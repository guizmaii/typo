/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import anorm.TypeDoesNotMatch
import java.sql.Types
import org.postgresql.jdbc.PgArray
import org.postgresql.util.PGobject
import play.api.libs.json.Reads
import play.api.libs.json.Writes

/** aclitem (via PGObject) */
case class TypoAclItem(value: String)

object TypoAclItem {
  implicit lazy val arrayColumn: Column[Array[TypoAclItem]] = Column.nonNull[Array[TypoAclItem]]((v1: Any, _) =>
    v1 match {
        case v: PgArray =>
         v.getArray match {
           case v: Array[?] =>
             Right(v.map(v => TypoAclItem(v.asInstanceOf[String])))
           case other => Left(TypeDoesNotMatch(s"Expected one-dimensional array from JDBC to produce an array of TypoAclItem, got ${other.getClass.getName}"))
         }
      case other => Left(TypeDoesNotMatch(s"Expected instance of org.postgresql.jdbc.PgArray, got ${other.getClass.getName}"))
    }
  )
  implicit lazy val arrayToStatement: ToStatement[Array[TypoAclItem]] = ToStatement[Array[TypoAclItem]]((s, index, v) => s.setArray(index, s.getConnection.createArrayOf("aclitem", v.map(v => {
                                                                                                                           val obj = new PGobject
                                                                                                                           obj.setType("aclitem")
                                                                                                                           obj.setValue(v.value)
                                                                                                                           obj
                                                                                                                         }))))
  implicit lazy val column: Column[TypoAclItem] = Column.nonNull[TypoAclItem]((v1: Any, _) =>
    v1 match {
      case v: PGobject => Right(TypoAclItem(v.getValue))
      case other => Left(TypeDoesNotMatch(s"Expected instance of org.postgresql.util.PGobject, got ${other.getClass.getName}"))
    }
  )
  implicit lazy val ordering: Ordering[TypoAclItem] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[TypoAclItem] = new ParameterMetaData[TypoAclItem] {
    override def sqlType: String = "aclitem"
    override def jdbcType: Int = Types.OTHER
  }
  implicit lazy val reads: Reads[TypoAclItem] = Reads.StringReads.map(TypoAclItem.apply)
  implicit lazy val toStatement: ToStatement[TypoAclItem] = ToStatement[TypoAclItem]((s, index, v) => s.setObject(index, {
                                                                 val obj = new PGobject
                                                                 obj.setType("aclitem")
                                                                 obj.setValue(v.value)
                                                                 obj
                                                               }))
  implicit lazy val writes: Writes[TypoAclItem] = Writes.StringWrites.contramap(_.value)
}
