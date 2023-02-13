
name := "grids-middleware-web"
scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play"   %% "play-json"     % "2.8.1",
)

lazy val webapp = (project in file("."))
    .enablePlugins(PlayScala)
