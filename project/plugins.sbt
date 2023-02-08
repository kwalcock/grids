libraryDependencies ++= Seq(
  "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.0.0"
)

addSbtPlugin("com.typesafe.play"  % "sbt-plugin"                % "2.8.19")  // up to 2.8.19
// addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"  % "0.6.1")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"               % "1.13.0")
