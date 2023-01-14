ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"
libraryDependencies += "org.scalatestplus" %% "scalacheck-1-16" % "3.2.14.0" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "codewars"
  )
