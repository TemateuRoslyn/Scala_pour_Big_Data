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



 /**
  *    ICI VOUS AVEZ LA LES CONFIGURATION POUR LE PROJET PRINCIPALE
  * 
  * ==================================================================
  */


lazy val root = project
  .in(file("."))
  .aggregate(chapter01)
  .dependsOn(chapter01)
  .aggregate(chapter02)
  .dependsOn(chapter02)
  .settings(
    name := "SCALA_FOR_BIG_DATA",
    commonSettings,
    publishArtifact := false,
  )
