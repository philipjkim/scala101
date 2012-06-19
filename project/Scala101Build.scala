import sbt._
import sbt.Keys._

object Scala101Build extends Build {

  lazy val scala101 = Project(
    id = "scala101",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scala101",
      organization := "net.daum",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
