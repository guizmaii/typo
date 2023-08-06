package scripts

import bleep.*
import bleep.logging.Logger
import typo.*
import typo.internal.{DebugJson, TypeMapperDb}

// this runs automatically at build time to instantly see results.
// it does not need a running database
object GenHardcodedFiles extends BleepCodegenScript("GenHardcodedFiles") {
  val enums = List(
    db.StringEnum(db.RelationName(Some("myschema"), "sector"), List("PUBLIC", "PRIVATE", "OTHER"))
  )

  val person = db.Table(
    name = db.RelationName(Some("myschema"), "person"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.Int8, Some("int8"), Nullability.NoNulls, columnDefault = Some("auto-increment"), None, DebugJson.Empty),
      db.Col(
        db.ColName("favourite_football_club_id"),
        db.Type.VarChar(Some(50)),
        Some("varchar"),
        Nullability.NoNulls,
        columnDefault = None,
        None,
        DebugJson.Empty
      ),
      db.Col(db.ColName("name"), db.Type.VarChar(Some(100)), Some("varchar"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("nick_name"), db.Type.VarChar(Some(30)), Some("varchar"), Nullability.Nullable, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("blog_url"), db.Type.VarChar(Some(100)), Some("varchar"), Nullability.Nullable, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("email"), db.Type.VarChar(Some(254)), Some("varchar"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("phone"), db.Type.VarChar(Some(8)), Some("varchar"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("likes_pizza"), db.Type.Boolean, Some("bool"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty),
      db.Col(
        db.ColName("marital_status_id"),
        db.Type.VarChar(Some(50)),
        Some("varchar"),
        Nullability.NoNulls,
        columnDefault = Some("some-value"),
        None,
        DebugJson.Empty
      ),
      db.Col(db.ColName("work_email"), db.Type.VarChar(Some(254)), Some("varchar"), Nullability.Nullable, columnDefault = None, None, DebugJson.Empty),
      db.Col(
        db.ColName("sector"),
        db.Type.EnumRef(db.RelationName(Some("myschema"), "sector")),
        Some("myschema.sector"),
        Nullability.NoNulls,
        columnDefault = Some("PUBLIC"),
        None,
        DebugJson.Empty
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
      db.Col(db.ColName("id"), db.Type.Int8, Some("int8"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty),
      db.Col(db.ColName("name"), db.Type.VarChar(Some(100)), Some("varchar"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("myschema"), "football_club_pkey"))),
    Nil,
    Nil
  )
  val marital_status = db.Table(
    name = db.RelationName(Some("myschema"), "marital_status"),
    cols = NonEmptyList(
      db.Col(db.ColName("id"), db.Type.Int8, Some("int8"), Nullability.NoNulls, columnDefault = None, None, DebugJson.Empty)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("id")), db.RelationName(Some("myschema"), "marital_status_pkey"))),
    Nil,
    Nil
  )

  val cpk_person = db.Table(
    name = db.RelationName(Some("compositepk"), "person"), // name clash to ensure we handle it
    cols = NonEmptyList(
      db.Col(db.ColName("one"), db.Type.Int8, Some("int8"), Nullability.NoNulls, columnDefault = Some("auto-increment"), None, DebugJson.Empty),
      db.Col(db.ColName("two"), db.Type.Text, Some("text"), Nullability.Nullable, columnDefault = Some("auto-increment"), None, DebugJson.Empty),
      db.Col(db.ColName("name"), db.Type.Text, Some("text"), Nullability.Nullable, columnDefault = None, None, DebugJson.Empty)
    ),
    Some(db.PrimaryKey(NonEmptyList(db.ColName("one"), db.ColName("two")), db.RelationName(Some("compositepk"), "person_pkey"))),
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

    targets.foreach { target =>
      val (dbLib, jsonLib) =
        if (target.project.value.contains("doobie"))
          (DbLibName.Doobie, JsonLibName.Circe)
        else (DbLibName.Anorm, JsonLibName.PlayJson)
      val domains = Nil
      val typeMapperDb = TypeMapperDb(enums, domains)
      val metaDb = MetaDb(relations = all, enums = enums, domains = domains, sqlFiles = Nil, typeMapperDb)
      val generated: Generated =
        fromMetaDb(
          Options(
            pkg = "testdb.hardcoded",
            List(jsonLib),
            Some(dbLib),
            naming = pkg =>
              new Naming(pkg) {
                override def enumValue(name: String): sc.Ident = sc.Ident("_" + name.toLowerCase)
              },
            header = header,
            silentBanner = true
          ),
          metaDb,
          Selector.All
        )

      generated.overwriteFolder(
        target.sources,
        // todo: bleep should use something better than timestamps
        soft = false
      )
      cli("add to git", target.sources, List("git", "add", "-f", target.sources.toString), Logger.DevNull, cli.Out.Raw)
    }
  }
}
