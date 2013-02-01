name := "sbt-s3"

description := "S3 Plugin for sbt"

version := "0.1"

scalaVersion := "2.9.2"

organization := "com.typesafe.sbt"

organizationName := "Typesafe"

sbtPlugin := true

startYear := Some(2013)

libraryDependencies ++= Seq("com.amazonaws" % "aws-java-sdk" % "1.3.29",
                            "commons-lang" % "commons-lang" % "2.6")

scalacOptions in (Compile,doc) <++= (name,description,version) map {(n,d,v) =>
   Opts.doc.title(n+": "+d) ++ Opts.doc.version(v) ++ Seq("-doc-root-content", "src/main/rootdoc.txt")}

publishMavenStyle := false

