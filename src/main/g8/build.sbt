name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.M5b" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-core" % "1.1.0" % "provided" withSources() withJavadoc(),
//  "org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided" withSources() withJavadoc(),
//  "org.apache.spark" %% "spark-sql" % "1.1.0" % "provided" withSources() withJavadoc(),
//  "org.apache.spark" %% "spark-hive" % "1.1.0" % "provided" withSources() withJavadoc(),
//  "org.apache.spark" %% "spark-mllib" % "1.1.0" % "provided" withSources() withJavadoc(),
  "org.apache.hadoop" % "hadoop-client" % "2.3.0-cdh5.1.2" % "provided" withJavadoc(),
  "com.github.scopt" %% "scopt" % "3.2.0"
)


initialCommands := "import $organization$.$name;format="lower,word"$._"

