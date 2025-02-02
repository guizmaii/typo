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
import adventureworks.customtypes.TypoInstant
import adventureworks.customtypes.TypoInterval
import adventureworks.customtypes.TypoJson
import adventureworks.customtypes.TypoJsonb
import adventureworks.customtypes.TypoLine
import adventureworks.customtypes.TypoLineSegment
import adventureworks.customtypes.TypoLocalDate
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoLocalTime
import adventureworks.customtypes.TypoMoney
import adventureworks.customtypes.TypoOffsetTime
import adventureworks.customtypes.TypoPath
import adventureworks.customtypes.TypoPoint
import adventureworks.customtypes.TypoPolygon
import adventureworks.customtypes.TypoUUID
import adventureworks.customtypes.TypoXml
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgtestRepoImpl extends PgtestRepo {
  override def delete: DeleteBuilder[PgtestFields, PgtestRow] = {
    DeleteBuilder("public.pgtest", PgtestFields)
  }
  override def insert(unsaved: PgtestRow)(implicit c: Connection): PgtestRow = {
    SQL"""insert into public.pgtest("box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money", "xml", "json", "jsonb", "hstore", "inet", "timestamp", "timestampz", "time", "timez", "date", "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes", "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps", "timestampzs", "times", "timezs", "dates", "uuids", "numerics")
          values (${ParameterValue(unsaved.box, null, TypoBox.toStatement)}::box, ${ParameterValue(unsaved.circle, null, TypoCircle.toStatement)}::circle, ${ParameterValue(unsaved.line, null, TypoLine.toStatement)}::line, ${ParameterValue(unsaved.lseg, null, TypoLineSegment.toStatement)}::lseg, ${ParameterValue(unsaved.path, null, TypoPath.toStatement)}::path, ${ParameterValue(unsaved.point, null, TypoPoint.toStatement)}::point, ${ParameterValue(unsaved.polygon, null, TypoPolygon.toStatement)}::polygon, ${ParameterValue(unsaved.interval, null, TypoInterval.toStatement)}::interval, ${ParameterValue(unsaved.money, null, TypoMoney.toStatement)}::money, ${ParameterValue(unsaved.xml, null, TypoXml.toStatement)}::xml, ${ParameterValue(unsaved.json, null, TypoJson.toStatement)}::json, ${ParameterValue(unsaved.jsonb, null, TypoJsonb.toStatement)}::jsonb, ${ParameterValue(unsaved.hstore, null, TypoHStore.toStatement)}::hstore, ${ParameterValue(unsaved.inet, null, TypoInet.toStatement)}::inet, ${ParameterValue(unsaved.timestamp, null, TypoLocalDateTime.toStatement)}::timestamp, ${ParameterValue(unsaved.timestampz, null, TypoInstant.toStatement)}::timestamptz, ${ParameterValue(unsaved.time, null, TypoLocalTime.toStatement)}::time, ${ParameterValue(unsaved.timez, null, TypoOffsetTime.toStatement)}::timetz, ${ParameterValue(unsaved.date, null, TypoLocalDate.toStatement)}::date, ${ParameterValue(unsaved.uuid, null, TypoUUID.toStatement)}::uuid, ${ParameterValue(unsaved.numeric, null, ToStatement.scalaBigDecimalToStatement)}::numeric, ${ParameterValue(unsaved.boxes, null, TypoBox.arrayToStatement)}::_box, ${ParameterValue(unsaved.circlees, null, TypoCircle.arrayToStatement)}::_circle, ${ParameterValue(unsaved.linees, null, TypoLine.arrayToStatement)}::_line, ${ParameterValue(unsaved.lseges, null, TypoLineSegment.arrayToStatement)}::_lseg, ${ParameterValue(unsaved.pathes, null, TypoPath.arrayToStatement)}::_path, ${ParameterValue(unsaved.pointes, null, TypoPoint.arrayToStatement)}::_point, ${ParameterValue(unsaved.polygones, null, TypoPolygon.arrayToStatement)}::_polygon, ${ParameterValue(unsaved.intervales, null, TypoInterval.arrayToStatement)}::_interval, ${ParameterValue(unsaved.moneyes, null, TypoMoney.arrayToStatement)}::_money, ${ParameterValue(unsaved.xmles, null, TypoXml.arrayToStatement)}::_xml, ${ParameterValue(unsaved.jsones, null, TypoJson.arrayToStatement)}::_json, ${ParameterValue(unsaved.jsonbes, null, TypoJsonb.arrayToStatement)}::_jsonb, ${ParameterValue(unsaved.hstores, null, TypoHStore.arrayToStatement)}::_hstore, ${ParameterValue(unsaved.inets, null, TypoInet.arrayToStatement)}::_inet, ${ParameterValue(unsaved.timestamps, null, TypoLocalDateTime.arrayToStatement)}::_timestamp, ${ParameterValue(unsaved.timestampzs, null, TypoInstant.arrayToStatement)}::_timestamptz, ${ParameterValue(unsaved.times, null, TypoLocalTime.arrayToStatement)}::_time, ${ParameterValue(unsaved.timezs, null, TypoOffsetTime.arrayToStatement)}::_timetz, ${ParameterValue(unsaved.dates, null, TypoLocalDate.arrayToStatement)}::_date, ${ParameterValue(unsaved.uuids, null, TypoUUID.arrayToStatement)}::_uuid, ${ParameterValue(unsaved.numerics, null, adventureworks.BigDecimalArrayToStatement)}::_numeric)
          returning "box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money"::numeric, "xml", "json", "jsonb", "hstore", "inet", "timestamp"::text, "timestampz"::text, "time"::text, "timez"::text, "date"::text, "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes"::numeric[], "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps"::text[], "timestampzs"::text[], "times"::text[], "timezs"::text[], "dates"::text[], "uuids", "numerics"
       """
      .executeInsert(PgtestRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgtestFields, PgtestRow] = {
    SelectBuilderSql("public.pgtest", PgtestFields, PgtestRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgtestRow] = {
    SQL"""select "box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money"::numeric, "xml", "json", "jsonb", "hstore", "inet", "timestamp"::text, "timestampz"::text, "time"::text, "timez"::text, "date"::text, "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes"::numeric[], "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps"::text[], "timestampzs"::text[], "times"::text[], "timezs"::text[], "dates"::text[], "uuids", "numerics"
          from public.pgtest
       """.as(PgtestRow.rowParser(1).*)
  }
  override def update: UpdateBuilder[PgtestFields, PgtestRow] = {
    UpdateBuilder("public.pgtest", PgtestFields, PgtestRow.rowParser)
  }
}
