/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package public
package pgtest

import adventureworks.customtypes.TypoBox
import adventureworks.customtypes.TypoCircle
import adventureworks.customtypes.TypoHStore
import adventureworks.customtypes.TypoInet
import adventureworks.customtypes.TypoInterval
import adventureworks.customtypes.TypoJson
import adventureworks.customtypes.TypoJsonb
import adventureworks.customtypes.TypoLine
import adventureworks.customtypes.TypoLineSegment
import adventureworks.customtypes.TypoLocalDate
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoLocalTime
import adventureworks.customtypes.TypoMoney
import adventureworks.customtypes.TypoOffsetDateTime
import adventureworks.customtypes.TypoOffsetTime
import adventureworks.customtypes.TypoPath
import adventureworks.customtypes.TypoPoint
import adventureworks.customtypes.TypoPolygon
import adventureworks.customtypes.TypoXml
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.Structure.Relation

class PgtestStructure[Row](val prefix: Option[String], val extract: Row => PgtestRow, val merge: (Row, PgtestRow) => Row)
  extends Relation[PgtestFields, PgtestRow, Row]
    with PgtestFields[Row] { outer =>

  override val box = new Field[TypoBox, Row](prefix, "box", None, Some("box"))(x => extract(x).box, (row, value) => merge(row, extract(row).copy(box = value)))
  override val circle = new Field[TypoCircle, Row](prefix, "circle", None, Some("circle"))(x => extract(x).circle, (row, value) => merge(row, extract(row).copy(circle = value)))
  override val line = new Field[TypoLine, Row](prefix, "line", None, Some("line"))(x => extract(x).line, (row, value) => merge(row, extract(row).copy(line = value)))
  override val lseg = new Field[TypoLineSegment, Row](prefix, "lseg", None, Some("lseg"))(x => extract(x).lseg, (row, value) => merge(row, extract(row).copy(lseg = value)))
  override val path = new Field[TypoPath, Row](prefix, "path", None, Some("path"))(x => extract(x).path, (row, value) => merge(row, extract(row).copy(path = value)))
  override val point = new Field[TypoPoint, Row](prefix, "point", None, Some("point"))(x => extract(x).point, (row, value) => merge(row, extract(row).copy(point = value)))
  override val polygon = new Field[TypoPolygon, Row](prefix, "polygon", None, Some("polygon"))(x => extract(x).polygon, (row, value) => merge(row, extract(row).copy(polygon = value)))
  override val interval = new Field[TypoInterval, Row](prefix, "interval", None, Some("interval"))(x => extract(x).interval, (row, value) => merge(row, extract(row).copy(interval = value)))
  override val money = new Field[TypoMoney, Row](prefix, "money", Some("numeric"), Some("money"))(x => extract(x).money, (row, value) => merge(row, extract(row).copy(money = value)))
  override val xml = new Field[TypoXml, Row](prefix, "xml", None, Some("xml"))(x => extract(x).xml, (row, value) => merge(row, extract(row).copy(xml = value)))
  override val json = new Field[TypoJson, Row](prefix, "json", None, Some("json"))(x => extract(x).json, (row, value) => merge(row, extract(row).copy(json = value)))
  override val jsonb = new Field[TypoJsonb, Row](prefix, "jsonb", None, Some("jsonb"))(x => extract(x).jsonb, (row, value) => merge(row, extract(row).copy(jsonb = value)))
  override val hstore = new Field[TypoHStore, Row](prefix, "hstore", None, Some("hstore"))(x => extract(x).hstore, (row, value) => merge(row, extract(row).copy(hstore = value)))
  override val inet = new Field[TypoInet, Row](prefix, "inet", None, Some("inet"))(x => extract(x).inet, (row, value) => merge(row, extract(row).copy(inet = value)))
  override val timestamp = new Field[TypoLocalDateTime, Row](prefix, "timestamp", Some("text"), Some("timestamp"))(x => extract(x).timestamp, (row, value) => merge(row, extract(row).copy(timestamp = value)))
  override val timestampz = new Field[TypoOffsetDateTime, Row](prefix, "timestampz", Some("text"), Some("timestamptz"))(x => extract(x).timestampz, (row, value) => merge(row, extract(row).copy(timestampz = value)))
  override val time = new Field[TypoLocalTime, Row](prefix, "time", Some("text"), Some("time"))(x => extract(x).time, (row, value) => merge(row, extract(row).copy(time = value)))
  override val timez = new Field[TypoOffsetTime, Row](prefix, "timez", Some("text"), Some("timetz"))(x => extract(x).timez, (row, value) => merge(row, extract(row).copy(timez = value)))
  override val date = new Field[TypoLocalDate, Row](prefix, "date", Some("text"), Some("date"))(x => extract(x).date, (row, value) => merge(row, extract(row).copy(date = value)))
  override val uuid = new Field[UUID, Row](prefix, "uuid", None, Some("uuid"))(x => extract(x).uuid, (row, value) => merge(row, extract(row).copy(uuid = value)))
  override val numeric = new Field[BigDecimal, Row](prefix, "numeric", None, Some("numeric"))(x => extract(x).numeric, (row, value) => merge(row, extract(row).copy(numeric = value)))
  override val boxes = new Field[Array[TypoBox], Row](prefix, "boxes", None, Some("_box"))(x => extract(x).boxes, (row, value) => merge(row, extract(row).copy(boxes = value)))
  override val circlees = new Field[Array[TypoCircle], Row](prefix, "circlees", None, Some("_circle"))(x => extract(x).circlees, (row, value) => merge(row, extract(row).copy(circlees = value)))
  override val linees = new Field[Array[TypoLine], Row](prefix, "linees", None, Some("_line"))(x => extract(x).linees, (row, value) => merge(row, extract(row).copy(linees = value)))
  override val lseges = new Field[Array[TypoLineSegment], Row](prefix, "lseges", None, Some("_lseg"))(x => extract(x).lseges, (row, value) => merge(row, extract(row).copy(lseges = value)))
  override val pathes = new Field[Array[TypoPath], Row](prefix, "pathes", None, Some("_path"))(x => extract(x).pathes, (row, value) => merge(row, extract(row).copy(pathes = value)))
  override val pointes = new Field[Array[TypoPoint], Row](prefix, "pointes", None, Some("_point"))(x => extract(x).pointes, (row, value) => merge(row, extract(row).copy(pointes = value)))
  override val polygones = new Field[Array[TypoPolygon], Row](prefix, "polygones", None, Some("_polygon"))(x => extract(x).polygones, (row, value) => merge(row, extract(row).copy(polygones = value)))
  override val intervales = new Field[Array[TypoInterval], Row](prefix, "intervales", None, Some("_interval"))(x => extract(x).intervales, (row, value) => merge(row, extract(row).copy(intervales = value)))
  override val moneyes = new Field[Array[TypoMoney], Row](prefix, "moneyes", Some("numeric[]"), Some("_money"))(x => extract(x).moneyes, (row, value) => merge(row, extract(row).copy(moneyes = value)))
  override val xmles = new Field[Array[TypoXml], Row](prefix, "xmles", None, Some("_xml"))(x => extract(x).xmles, (row, value) => merge(row, extract(row).copy(xmles = value)))
  override val jsones = new Field[Array[TypoJson], Row](prefix, "jsones", None, Some("_json"))(x => extract(x).jsones, (row, value) => merge(row, extract(row).copy(jsones = value)))
  override val jsonbes = new Field[Array[TypoJsonb], Row](prefix, "jsonbes", None, Some("_jsonb"))(x => extract(x).jsonbes, (row, value) => merge(row, extract(row).copy(jsonbes = value)))
  override val hstores = new Field[Array[TypoHStore], Row](prefix, "hstores", None, Some("_hstore"))(x => extract(x).hstores, (row, value) => merge(row, extract(row).copy(hstores = value)))
  override val inets = new Field[Array[TypoInet], Row](prefix, "inets", None, Some("_inet"))(x => extract(x).inets, (row, value) => merge(row, extract(row).copy(inets = value)))
  override val timestamps = new Field[Array[TypoLocalDateTime], Row](prefix, "timestamps", Some("text[]"), Some("_timestamp"))(x => extract(x).timestamps, (row, value) => merge(row, extract(row).copy(timestamps = value)))
  override val timestampzs = new Field[Array[TypoOffsetDateTime], Row](prefix, "timestampzs", Some("text[]"), Some("_timestamptz"))(x => extract(x).timestampzs, (row, value) => merge(row, extract(row).copy(timestampzs = value)))
  override val times = new Field[Array[TypoLocalTime], Row](prefix, "times", Some("text[]"), Some("_time"))(x => extract(x).times, (row, value) => merge(row, extract(row).copy(times = value)))
  override val timezs = new Field[Array[TypoOffsetTime], Row](prefix, "timezs", Some("text[]"), Some("_timetz"))(x => extract(x).timezs, (row, value) => merge(row, extract(row).copy(timezs = value)))
  override val dates = new Field[Array[TypoLocalDate], Row](prefix, "dates", Some("text[]"), Some("_date"))(x => extract(x).dates, (row, value) => merge(row, extract(row).copy(dates = value)))
  override val uuids = new Field[Array[UUID], Row](prefix, "uuids", None, Some("_uuid"))(x => extract(x).uuids, (row, value) => merge(row, extract(row).copy(uuids = value)))
  override val numerics = new Field[Array[BigDecimal], Row](prefix, "numerics", None, Some("_numeric"))(x => extract(x).numerics, (row, value) => merge(row, extract(row).copy(numerics = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](box, circle, line, lseg, path, point, polygon, interval, money, xml, json, jsonb, hstore, inet, timestamp, timestampz, time, timez, date, uuid, numeric, boxes, circlees, linees, lseges, pathes, pointes, polygones, intervales, moneyes, xmles, jsones, jsonbes, hstores, inets, timestamps, timestampzs, times, timezs, dates, uuids, numerics)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgtestRow, merge: (NewRow, PgtestRow) => NewRow): PgtestStructure[NewRow] =
    new PgtestStructure(prefix, extract, merge)
}
