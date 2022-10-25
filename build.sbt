
val scala3Version = "3.2.0"

 /**
  * Les paramettres commun a toutes les declaration
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

lazy val root = project
  .in(file("."))
  .aggregate(chapter01)
  .dependsOn(chapter01)
  .settings(
    name := "SCALA_FOR_BIG_DATA",
    commonSettings,
    publishArtifact := false,
  )

lazy val chapter01 = project
 .in(file("chapter01"))
 .settings(
    name := "chapter01",
    commonSettings
 )