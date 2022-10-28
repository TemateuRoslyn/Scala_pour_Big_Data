val scala3Version = "3.2.0"


 /**
  *   LES PARAMETTRES COMMUNS A CHACUNE DE CONFIGURATION DE CHACUN DES MODULE
  * ===========================================================================
  *
  */


lazy val commonSettings = Seq(
  organization := "com.bigdata.maestros",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := scala3Version,
  scalacOptions := Seq(
    "-deprecation",
    "-feature"
  ),
  libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
)



/**
  *    ICI VOUS AVEZ LA LISTE DES CONFIGURATOIN POUR CHAQUE MODULE DE L'APPLICATION SCALA
  * 
  * =========================================================================================
  */





lazy val chapter01 = project
 .in(file("src/main/scala/modules/build/chapter01"))
 .settings(
    name := "Chapter 01",
    commonSettings
 )

 lazy val chapter02 = project
 .in(file("src/main/scala/modules/build/chapter02"))
 .settings(
    name := "Chapter 02",
    commonSettings
 )

 lazy val chapter03 = project
 .in(file("src/main/scala/modules/build/chapter03"))
 .settings(
    name := "Chapter 03",
    commonSettings
 )

  lazy val chapter04 = project
 .in(file("src/main/scala/modules/build/chapter04"))
 .settings(
    name := "Chapter 04",
    commonSettings
 )

  lazy val chapter05 = project
 .in(file("src/main/scala/modules/build/chapter05"))
 .settings(
    name := "Chapter 05",
    commonSettings
 )

  lazy val chapter06 = project
 .in(file("src/main/scala/modules/build/chapter06"))
 .settings(
    name := "Chapter 06",
    commonSettings
 )

  lazy val chapter07 = project
 .in(file("src/main/scala/modules/build/chapter07"))
 .settings(
    name := "Chapter 07",
    commonSettings
 )

  lazy val chapter08 = project
 .in(file("src/main/scala/modules/build/chapter08"))
 .settings(
    name := "Chapter 08",
    commonSettings
 )

  lazy val chapter09 = project
 .in(file("src/main/scala/modules/build/chapter09"))
 .settings(
    name := "Chapter 09",
    commonSettings
 )

  lazy val chapter10 = project
 .in(file("src/main/scala/modules/build/chapter10"))
 .settings(
    name := "Chapter 10",
    commonSettings
 )

  lazy val chapter11 = project
 .in(file("src/main/scala/modules/build/chapter11"))
 .settings(
    name := "Chapter 11",
    commonSettings
 )

  lazy val chapter12 = project
 .in(file("src/main/scala/modules/build/chapter12"))
 .settings(
    name := "Chapter 12",
    commonSettings
 )

  lazy val chapter13 = project
 .in(file("src/main/scala/modules/build/chapter13"))
 .settings(
    name := "Chapter 13",
    commonSettings
 )

  lazy val chapter14 = project
 .in(file("src/main/scala/modules/build/chapter14"))
 .settings(
    name := "Chapter 14",
    commonSettings
 )



 /**
  *    ICI VOUS AVEZ LA LES CONFIGURATION POUR LE PROJET PRINCIPALE
  * 
  * ==================================================================
  */


lazy val root = project
  .in(file("."))
  .aggregate(chapter01, chapter02, chapter03, chapter04, chapter05, chapter06, chapter07, chapter08, chapter09, chapter10, chapter11, chapter12, chapter13, chapter14)
  .dependsOn(chapter01, chapter02, chapter03, chapter04, chapter05, chapter06, chapter07, chapter08, chapter09, chapter10, chapter11, chapter12, chapter13, chapter14)
  .settings(
    name := "SCALA_FOR_BIG_DATA",
    commonSettings,
    publishArtifact := false,
  )
