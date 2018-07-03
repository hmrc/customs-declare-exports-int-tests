name := "customs-declare-exports-int-tests"

organization := "hmrc.org.uk"

scalaVersion := "2.12.6"

version := "0.1.0-SNAPSHOT"

resolvers += "Sonatype Repo" at "http://oss.sonatype.org/content/groups/public/"

libraryDependencies += "im.mange" % "flakeless_2.12" % "0.0.186" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"
