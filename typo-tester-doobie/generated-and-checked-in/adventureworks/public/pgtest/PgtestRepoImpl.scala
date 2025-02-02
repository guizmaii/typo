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
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.meta.Meta
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgtestRepoImpl extends PgtestRepo {
  override def delete: DeleteBuilder[PgtestFields, PgtestRow] = {
    DeleteBuilder("public.pgtest", PgtestFields)
  }
  override def insert(unsaved: PgtestRow): ConnectionIO[PgtestRow] = {
    sql"""insert into public.pgtest("box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money", "xml", "json", "jsonb", "hstore", "inet", "timestamp", "timestampz", "time", "timez", "date", "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes", "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps", "timestampzs", "times", "timezs", "dates", "uuids", "numerics")
          values (${fromWrite(unsaved.box)(Write.fromPut(TypoBox.put))}::box, ${fromWrite(unsaved.circle)(Write.fromPut(TypoCircle.put))}::circle, ${fromWrite(unsaved.line)(Write.fromPut(TypoLine.put))}::line, ${fromWrite(unsaved.lseg)(Write.fromPut(TypoLineSegment.put))}::lseg, ${fromWrite(unsaved.path)(Write.fromPut(TypoPath.put))}::path, ${fromWrite(unsaved.point)(Write.fromPut(TypoPoint.put))}::point, ${fromWrite(unsaved.polygon)(Write.fromPut(TypoPolygon.put))}::polygon, ${fromWrite(unsaved.interval)(Write.fromPut(TypoInterval.put))}::interval, ${fromWrite(unsaved.money)(Write.fromPut(TypoMoney.put))}::money, ${fromWrite(unsaved.xml)(Write.fromPut(TypoXml.put))}::xml, ${fromWrite(unsaved.json)(Write.fromPut(TypoJson.put))}::json, ${fromWrite(unsaved.jsonb)(Write.fromPut(TypoJsonb.put))}::jsonb, ${fromWrite(unsaved.hstore)(Write.fromPut(TypoHStore.put))}::hstore, ${fromWrite(unsaved.inet)(Write.fromPut(TypoInet.put))}::inet, ${fromWrite(unsaved.timestamp)(Write.fromPut(TypoLocalDateTime.put))}::timestamp, ${fromWrite(unsaved.timestampz)(Write.fromPut(TypoInstant.put))}::timestamptz, ${fromWrite(unsaved.time)(Write.fromPut(TypoLocalTime.put))}::time, ${fromWrite(unsaved.timez)(Write.fromPut(TypoOffsetTime.put))}::timetz, ${fromWrite(unsaved.date)(Write.fromPut(TypoLocalDate.put))}::date, ${fromWrite(unsaved.uuid)(Write.fromPut(TypoUUID.put))}::uuid, ${fromWrite(unsaved.numeric)(Write.fromPut(Meta.ScalaBigDecimalMeta.put))}::numeric, ${fromWrite(unsaved.boxes)(Write.fromPut(TypoBox.arrayPut))}::_box, ${fromWrite(unsaved.circlees)(Write.fromPut(TypoCircle.arrayPut))}::_circle, ${fromWrite(unsaved.linees)(Write.fromPut(TypoLine.arrayPut))}::_line, ${fromWrite(unsaved.lseges)(Write.fromPut(TypoLineSegment.arrayPut))}::_lseg, ${fromWrite(unsaved.pathes)(Write.fromPut(TypoPath.arrayPut))}::_path, ${fromWrite(unsaved.pointes)(Write.fromPut(TypoPoint.arrayPut))}::_point, ${fromWrite(unsaved.polygones)(Write.fromPut(TypoPolygon.arrayPut))}::_polygon, ${fromWrite(unsaved.intervales)(Write.fromPut(TypoInterval.arrayPut))}::_interval, ${fromWrite(unsaved.moneyes)(Write.fromPut(TypoMoney.arrayPut))}::_money, ${fromWrite(unsaved.xmles)(Write.fromPut(TypoXml.arrayPut))}::_xml, ${fromWrite(unsaved.jsones)(Write.fromPut(TypoJson.arrayPut))}::_json, ${fromWrite(unsaved.jsonbes)(Write.fromPut(TypoJsonb.arrayPut))}::_jsonb, ${fromWrite(unsaved.hstores)(Write.fromPut(TypoHStore.arrayPut))}::_hstore, ${fromWrite(unsaved.inets)(Write.fromPut(TypoInet.arrayPut))}::_inet, ${fromWrite(unsaved.timestamps)(Write.fromPut(TypoLocalDateTime.arrayPut))}::_timestamp, ${fromWrite(unsaved.timestampzs)(Write.fromPut(TypoInstant.arrayPut))}::_timestamptz, ${fromWrite(unsaved.times)(Write.fromPut(TypoLocalTime.arrayPut))}::_time, ${fromWrite(unsaved.timezs)(Write.fromPut(TypoOffsetTime.arrayPut))}::_timetz, ${fromWrite(unsaved.dates)(Write.fromPut(TypoLocalDate.arrayPut))}::_date, ${fromWrite(unsaved.uuids)(Write.fromPut(TypoUUID.arrayPut))}::_uuid, ${fromWrite(unsaved.numerics)(Write.fromPut(adventureworks.BigDecimalMeta.put))}::_numeric)
          returning "box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money"::numeric, "xml", "json", "jsonb", "hstore", "inet", "timestamp"::text, "timestampz"::text, "time"::text, "timez"::text, "date"::text, "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes"::numeric[], "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps"::text[], "timestampzs"::text[], "times"::text[], "timezs"::text[], "dates"::text[], "uuids", "numerics"
       """.query(PgtestRow.read).unique
  }
  override def select: SelectBuilder[PgtestFields, PgtestRow] = {
    SelectBuilderSql("public.pgtest", PgtestFields, PgtestRow.read)
  }
  override def selectAll: Stream[ConnectionIO, PgtestRow] = {
    sql"""select "box", "circle", "line", "lseg", "path", "point", "polygon", "interval", "money"::numeric, "xml", "json", "jsonb", "hstore", "inet", "timestamp"::text, "timestampz"::text, "time"::text, "timez"::text, "date"::text, "uuid", "numeric", "boxes", "circlees", "linees", "lseges", "pathes", "pointes", "polygones", "intervales", "moneyes"::numeric[], "xmles", "jsones", "jsonbes", "hstores", "inets", "timestamps"::text[], "timestampzs"::text[], "times"::text[], "timezs"::text[], "dates"::text[], "uuids", "numerics" from public.pgtest""".query(PgtestRow.read).stream
  }
  override def update: UpdateBuilder[PgtestFields, PgtestRow] = {
    UpdateBuilder("public.pgtest", PgtestFields, PgtestRow.read)
  }
}
