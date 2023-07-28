/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks

import anorm.Column
import anorm.MetaDataItem
import anorm.ParameterMetaData
import anorm.SqlRequestError
import anorm.ToStatement
import anorm.TypeDoesNotMatch
import java.sql.PreparedStatement
import java.sql.Types
import org.postgresql.jdbc.PgArray
import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** regtype (via PGObject) */
case class TypoRegtype(value: String)
object TypoRegtype {
  implicit val oFormat: OFormat[TypoRegtype] = new OFormat[TypoRegtype]{
    override def writes(o: TypoRegtype): JsObject =
      Json.obj(
        "value" -> o.value
      )
  
    override def reads(json: JsValue): JsResult[TypoRegtype] = {
      JsResult.fromTry(
        Try(
          TypoRegtype(
            value = json.\("value").as[String]
          )
        )
      )
    }
  }
  implicit val TypoRegtypeDb: ToStatement[TypoRegtype] with ParameterMetaData[TypoRegtype] with Column[TypoRegtype] = new ToStatement[TypoRegtype] with ParameterMetaData[TypoRegtype] with Column[TypoRegtype] {
    override def sqlType: String = "regtype"
    override def jdbcType: Int = Types.OTHER
    override def set(s: PreparedStatement, index: Int, v: TypoRegtype): Unit =
      s.setObject(index, {
                           val obj = new PGobject
                           obj.setType("regtype")
                           obj.setValue(v.value)
                           obj
                         })
    override def apply(v: Any, v2: MetaDataItem): Either[SqlRequestError, TypoRegtype] =
      v match {
        case v: PGobject => Right(TypoRegtype(v.getValue))
        case other => Left(TypeDoesNotMatch(s"Expected instance of PGobject from JDBC to produce a TypoRegtype, got ${other.getClass.getName}"))
      }
  }
  
  implicit val TypoRegtypeDbArray: ToStatement[Array[TypoRegtype]] with ParameterMetaData[Array[TypoRegtype]] with Column[Array[TypoRegtype]] = new ToStatement[Array[TypoRegtype]] with ParameterMetaData[Array[TypoRegtype]] with Column[Array[TypoRegtype]] {
    override def sqlType: String = "_regtype"
    override def jdbcType: Int = Types.ARRAY
    override def set(s: PreparedStatement, index: Int, v: Array[TypoRegtype]): Unit =
      s.setArray(index, s.getConnection.createArrayOf("regtype", v.map(v => {
                                                                              val obj = new PGobject
                                                                              obj.setType("regtype")
                                                                              obj.setValue(v.value)
                                                                              obj
                                                                            })))
    override def apply(v: Any, v2: MetaDataItem): Either[SqlRequestError, Array[TypoRegtype]] =
      v match {
        case v: PgArray =>
         v.getArray match {
           case v: Array[_] =>
             Right(v.map(v => TypoRegtype(v.asInstanceOf[String])))
           case other => Left(TypeDoesNotMatch(s"Expected one-dimensional array from JDBC to produce an array of TypoRegtype, got ${other.getClass.getName}"))
         }
        case other => Left(TypeDoesNotMatch(s"Expected PgArray from JDBC to produce an array of TypoRegtype, got ${other.getClass.getName}"))
      }
  }

}
