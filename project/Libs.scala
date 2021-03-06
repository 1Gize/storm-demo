import sbt._

object Libs {

  private val StormV      = "2.3.0"
  private val DropwizardV = "3.2.6"

  val configDeps = Seq(
    "com.github.pureconfig" %% "pureconfig" % "0.17.1"
  )

  val unitTestingStack = Seq(
    "org.scalatest"              %% "scalatest"              % "3.1.1"  % Test,
    "org.scalacheck"             %% "scalacheck"             % "1.15.4" % Test,
    "com.softwaremill.diffx"     %% "diffx-scalatest-should" % "0.7.0"  % Test,
    "com.softwaremill.quicklens" %% "quicklens"              % "1.8.4"  % Test
  )

  val loggingDeps = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
  )

  val argsParsingDeps = Seq(
    "com.github.scopt" %% "scopt" % "4.0.1"
  )

  val stormDeps = Seq(
    "org.apache.storm"      % "storm-core"         % StormV % "provided" exclude ("javax.servlet", "servlet-api"),
    "org.apache.storm"      % "storm-kafka-client" % StormV,
    "org.apache.storm"      % "storm-server"       % StormV,
    "io.dropwizard.metrics" % "metrics-core"       % DropwizardV,
    "io.dropwizard.metrics" % "metrics-graphite"   % DropwizardV,
    "io.dropwizard.metrics" % "metrics-jvm"        % DropwizardV,
    "org.hdrhistogram"      % "HdrHistogram"       % "2.1.9",
    "com.twitter"          %% "chill"              % "0.10.0"
  )

//  val kafkaDeps = Seq(
//    "org.apache.kafka" % "kafka-clients" % "3.1.0",
//    "org.slf4j" % "slf4j-api" % "1.7.36",
//    "org.slf4j" % "slf4j-reload4j" % "1.7.36"
//  )

  val kafkaDeps = Seq(
    "org.apache.storm"      % "storm-kafka-client" % StormV,
    "org.apache.kafka" % "kafka-clients"  % "2.1.0"
  )

  val allDeps = configDeps ++ unitTestingStack ++ loggingDeps ++ stormDeps ++ argsParsingDeps ++ kafkaDeps

}
