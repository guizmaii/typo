package scripts

import bleep._
import bleep.logging.Logger
import play.api.libs.json.JsNull
import typo._

// this runs automatically at build time to instantly see results.
// it does not need a running database
object GenHardcodedFiles extends BleepCodegenScript("GenHardcodedFiles") {
  val enums = List(
    db.StringEnum(db.RelationName(Some("myschema"), "sector"), List("PUBLIC", "PRIVATE", "OTHER"))
  )

  val person = db.Table(
    name = db.RelationName(Some("myschema"), "person"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.BigInt, Nullability.NoNulls, columnDefault = Some("auto-increment"), None, JsNull),
      db.Col(db.ColName("favourite_football_club_id"), db.Type.VarChar(Some(50)), Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("name"), db.Type.VarChar(Some(100)), Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("nick_name"), db.Type.VarChar(Some(30)), Nullability.Nullable, columnDefault = None, None, JsNull),
      db.Col(db.ColName("blog_url"), db.Type.VarChar(Some(100)), Nullability.Nullable, columnDefault = None, None, JsNull),
      db.Col(db.ColName("email"), db.Type.VarChar(Some(254)), Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("phone"), db.Type.VarChar(Some(8)), Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("likes_pizza"), db.Type.Boolean, Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("marital_status_id"), db.Type.VarChar(Some(50)), Nullability.NoNulls, columnDefault = Some("some-value"), None, JsNull),
      db.Col(db.ColName("work_email"), db.Type.VarChar(Some(254)), Nullability.Nullable, columnDefault = None, None, JsNull),
      db.Col(
        db.ColName("sector"),
        db.Type.EnumRef(db.RelationName(Some("myschema"), "sector")),
        Nullability.NoNulls,
        columnDefault = Some("PUBLIC"),
        None,
        JsNull
      )
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("myschema"), "person_pkey"))),
    Nil,
    List(
      db.ForeignKey(
        NonEmptyList(db.ColName("favourite_football_club_id")),
        db.RelationName(Some("myschema"), "football_club"),
        NonEmptyList(db.ColName("id")),
        db.RelationName(Some("myschema"), "person_favourite_football_club_id_fkey")
      ),
      db.ForeignKey(
        NonEmptyList(db.ColName("marital_status_id")),
        db.RelationName(Some("myschema"), "marital_status"),
        NonEmptyList(db.ColName("id")),
        db.RelationName(Some("myschema"), "person_marital_status_id_fkey")
      )
    )
  )
  val football_club = db.Table(
    name = db.RelationName(Some("myschema"), "football_club"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.BigInt, Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("name"), db.Type.VarChar(Some(100)), Nullability.NoNulls, columnDefault = None, None, JsNull)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("myschema"), "football_club_pkey"))),
    Nil,
    Nil
  )
  val marital_status = db.Table(
    name = db.RelationName(Some("myschema"), "marital_status"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.BigInt, Nullability.NoNulls, columnDefault = None, None, JsNull)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("myschema"), "marital_status_pkey"))),
    Nil,
    Nil
  )

  val cpk_person = db.Table(
    name = db.RelationName(Some("compositepk"), "person"), // name clash to ensure we handle it
    cols = NonEmptyList(
      db.Col(db.ColName("one"), db.Type.BigInt, Nullability.NoNulls, columnDefault = Some("auto-increment"), None, JsNull),
      db.Col(db.ColName("two"), db.Type.Text, Nullability.Nullable, columnDefault = Some("auto-increment"), None, JsNull),
      db.Col(db.ColName("name"), db.Type.Text, Nullability.Nullable, columnDefault = None, None, JsNull)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("one"), db.ColName("two")), db.RelationName(Some("compositepk"), "person_pkey"))),
    Nil,
    Nil
  )
  val cpk_bike = db.Table(
    name = db.RelationName(Some("compositepk"), "bike"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.BigInt, Nullability.NoNulls, columnDefault = Some("auto-increment"), None, JsNull),
      db.Col(db.ColName("owner_one"), db.Type.BigInt, Nullability.NoNulls, columnDefault = None, None, JsNull),
      db.Col(db.ColName("owner_two"), db.Type.Text, Nullability.Nullable, columnDefault = None, None, JsNull),
      db.Col(db.ColName("bike_name"), db.Type.Text, Nullability.NoNulls, columnDefault = None, None, JsNull)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("compositepk"), "bike_pkey"))),
    Nil,
    Nil
  )

  val all = List(person, football_club, marital_status, cpk_person)

  override def run(started: Started, commands: Commands, targets: List[Target], args: List[String]): Unit = {
    val header =
      """|/**
         | * File automatically generated by `typo` for its own test suite.
         | *
         | * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
         | */
         |""".stripMargin

    val generated: Generated = {
      fromData(
        Options(
          pkg = "testdb.hardcoded",
          JsonLibName.PlayJson,
          DbLibName.Anorm,
          naming = pkg =>
            new Naming(pkg) {
              override def enumValue(name: String): sc.Ident = sc.Ident("_" + name.toLowerCase)
            },
          header = header
        ),
        relations = all,
        enums = enums,
        domains = Nil,
        sqlScripts = Nil,
        Selector.All
      )
    }

    targets.foreach { target =>
      generated.overwriteFolder(
        target.sources,
        // todo: bleep should use something better than timestamps
        soft = false
      )
      cli("add to git", target.sources, List("git", "add", "-f", target.sources.toString), Logger.DevNull, cli.Out.Raw)
    }
  }
}
