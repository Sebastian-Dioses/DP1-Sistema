

name := """hello-play-java"""

version := "1.0-SNAPSHOT"

libraryDependencies += jdbc

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "mysql" % "mysql-connector-java" % "5.1.38")

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
