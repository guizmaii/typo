package typo

import typo.sc.syntax.CodeInterpolator

object JsonLibPlay extends JsonLib {
  def Format(t: sc.Type) = sc.Type.TApply(sc.Type.Qualified("play.api.libs.json.Format"), List(t))
  val ReadsName = sc.Type.Qualified("play.api.libs.json.Reads")
  def Reads(t: sc.Type) = sc.Type.TApply(ReadsName, List(t))
  val WritesName = "play.api.libs.json.Writes"
  def Writes(t: sc.Type) = sc.Type.TApply(sc.Type.Qualified(WritesName), List(t))
  val Json = sc.Type.Qualified("play.api.libs.json.Json")
  def OFormat(t: sc.Type) = sc.Type.TApply(sc.Type.Qualified("play.api.libs.json.OFormat"), List(t))
  val JsString = sc.Type.Qualified("play.api.libs.json.JsString")
  val JsError = sc.Type.Qualified("play.api.libs.json.JsError")
  val JsSuccess = sc.Type.Qualified("play.api.libs.json.JsSuccess")
  val JsValue = sc.Type.Qualified("play.api.libs.json.JsValue")
  val JsObject = sc.Type.Qualified("play.api.libs.json.JsObject")
  val JsResult = sc.Type.Qualified("play.api.libs.json.JsResult")

  override def defaultedInstance(defaulted: sc.QIdent, provided: sc.QIdent, useDefault: sc.QIdent): List[sc.Code] = {
    val T = sc.Type.Abstract(sc.Ident("T"))
    val defaultOfT = sc.Type.TApply(sc.Type.Qualified(defaulted), List(T))
    val reader = code"""implicit def reads[$T: $ReadsName]: ${Reads(defaultOfT)} = {
            |    case $JsString("defaulted") =>
            |      $JsSuccess($useDefault)
            |    case $JsObject(Seq(("provided", providedJson: $JsValue))) =>
            |      $Json.fromJson[T](providedJson).map($provided.apply)
            |    case _ =>
            |      $JsError(s"Expected `$defaulted` json object structure")
            |  }
            |""".stripMargin

    val writer = code"""implicit def writes[$T: $WritesName]: ${Writes(defaultOfT)} = {
            |    case $provided(value) => $Json.obj("provided" -> implicitly[${Writes(T)}].writes(value))
            |    case $useDefault      => $JsString("defaulted")
            |  }
            |""".stripMargin
    List(
      reader,
      writer
    )
  }
  override def stringEnumInstances(wrapperType: sc.Type, underlying: sc.Type, lookup: sc.Ident): List[sc.Code] = {
    val reader = code"""implicit val reads: ${Reads(wrapperType)} = (value: $JsValue) =>
                         |    value.validate[${sc.Type.String}].flatMap { str =>
                         |      $lookup.get(str) match {
                         |        case Some(value) => $JsSuccess(value)
                         |        case None => $JsError(s"'$$str' does not match any of the following legal values: $$Names")
                         |      }
                         |    }
                         |""".stripMargin
    val writer = code"""implicit val writes: ${Writes(wrapperType)} = value => implicitly[${Writes(underlying)}].writes(value.value)"""

    List(reader, writer)
  }

  override def instances(tpe: sc.Type, cols: Seq[ColumnComputed]): List[sc.Code] = {
    def as(col: ColumnComputed): sc.Code =
      col.tpe match {
        case sc.Type.Optional(of) => code"""json.\\(${sc.StrLit(col.dbName.value)}).toOption.map(_.as[$of])"""
        case _ => code"""json.\\(${sc.StrLit(col.dbName.value)}).as[${col.tpe}]"""
      }

    List(
      code"""|implicit val oFormat: ${OFormat(tpe)} = new ${OFormat(tpe)}{
             |    override def writes(o: $tpe): $JsObject =
             |      $Json.obj(
             |        ${cols.map(col => code"""${sc.StrLit(col.dbName.value)} -> o.${col.name}""").mkCode(",\n      ")}
             |      )
             |
             |    override def reads(json: $JsValue): ${JsResult.of(tpe)} = {
             |      $JsResult.fromTry(
             |        ${sc.Type.Try}(
             |          $tpe(
             |            ${cols.map(col => code"""${col.name} = ${as(col)}""").mkCode(",\n            ")}
             |          )
             |        )
             |      )
             |    }
             |  }"""
    )
  }

  def anyValInstances(wrapperType: sc.Type.Qualified, underlying: sc.Type): List[sc.Code] =
    List(
      code"""implicit val format: ${Format(wrapperType)} = implicitly[${Format(underlying)}].bimap(${wrapperType.value.name}.apply, _.value)"""
    )
}
