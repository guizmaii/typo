/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package public
package pgtest

import java.util.UUID
import typo.dsl.SqlExpr.Field

trait PgtestFields[Row] {
  val box: Field[TypoBox, Row]
  val circle: Field[TypoCircle, Row]
  val line: Field[TypoLine, Row]
  val lseg: Field[TypoLineSegment, Row]
  val path: Field[TypoPath, Row]
  val point: Field[TypoPoint, Row]
  val polygon: Field[TypoPolygon, Row]
  val interval: Field[TypoInterval, Row]
  val money: Field[TypoMoney, Row]
  val xml: Field[TypoXml, Row]
  val json: Field[TypoJson, Row]
  val jsonb: Field[TypoJsonb, Row]
  val hstore: Field[TypoHStore, Row]
  val inet: Field[TypoInet, Row]
  val timestamp: Field[TypoLocalDateTime, Row]
  val timestampz: Field[TypoOffsetDateTime, Row]
  val time: Field[TypoLocalTime, Row]
  val timez: Field[TypoOffsetTime, Row]
  val date: Field[TypoLocalDate, Row]
  val uuid: Field[UUID, Row]
  val numeric: Field[BigDecimal, Row]
  val boxes: Field[Array[TypoBox], Row]
  val circlees: Field[Array[TypoCircle], Row]
  val linees: Field[Array[TypoLine], Row]
  val lseges: Field[Array[TypoLineSegment], Row]
  val pathes: Field[Array[TypoPath], Row]
  val pointes: Field[Array[TypoPoint], Row]
  val polygones: Field[Array[TypoPolygon], Row]
  val intervales: Field[Array[TypoInterval], Row]
  val moneyes: Field[Array[TypoMoney], Row]
  val xmles: Field[Array[TypoXml], Row]
  val jsones: Field[Array[TypoJson], Row]
  val jsonbes: Field[Array[TypoJsonb], Row]
  val hstores: Field[Array[TypoHStore], Row]
  val inets: Field[Array[TypoInet], Row]
  val timestamps: Field[Array[TypoLocalDateTime], Row]
  val timestampzs: Field[Array[TypoOffsetDateTime], Row]
  val times: Field[Array[TypoLocalTime], Row]
  val timezs: Field[Array[TypoOffsetTime], Row]
  val dates: Field[Array[TypoLocalDate], Row]
  val uuids: Field[Array[UUID], Row]
  val numerics: Field[Array[BigDecimal], Row]
}
object PgtestFields extends PgtestStructure[PgtestRow](None, identity, (_, x) => x)

