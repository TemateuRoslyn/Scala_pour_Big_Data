val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

lazy val chapter01 = project
 .in(file("chapter01"))
 .settings(
 name := "chapter01",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
 libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 )
