name := """hello-play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  cache,
  javaWs,
  // http://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",
  //  http://mvnrepository.com/artifact/mysql/mysql-connector-java
  "mysql" % "mysql-connector-java" % "5.1.34",
  //  http://mvnrepository.com/artifact/org.mindrot/jbcrypt/
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.1.1-2"
  )

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
//routesGenerator := InjectedRoutesGenerator

PlayKeys.externalizeResources := false