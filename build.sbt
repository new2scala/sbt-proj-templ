name := "sbt project template"

lazy val commonSettings = Seq(
  organization := "org.dev",
  version := "0.1.0",
  scalaVersion := "2.12.6",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.5"
  )
)

lazy val root = project.in(file(".")).settings(commonSettings: _*).aggregate(proj1)

lazy val proj1 = project.settings(commonSettings: _*)
