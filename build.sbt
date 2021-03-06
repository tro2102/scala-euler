name := "euler"

version := "1.0"

organization := "com.github.tro2102"

name := "euler-scala"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.1.0",
  "joda-time" % "joda-time" % "2.3",
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test",
  "org.joda" % "joda-convert" % "1.5",
  "org.mockito" % "mockito-all" % "1.9.5"
)
