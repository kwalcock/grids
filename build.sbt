enablePlugins(ScalaJSPlugin)

name := "grids"
scalaVersion := "2.13.10"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "com.typesafe.play"   %% "play-json"     % "2.8.1",
  "com.typesafe.play"   %% "play-slick"    % "5.0.0",
  "com.typesafe.slick"  %% "slick-codegen" % "3.3.2",
  "org.scala-js"       %%% "scalajs-dom"   % "2.1.0",
  "com.lihaoyi"        %%% "utest"         % "0.7.4"  % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// Don't forget to run
// npm init private
// npm install jsdom

// Global / scalaJSStage := FullOptStage

lazy val grids_backend = (project in file("grids-backend"))
    .dependsOn(grids_eitherend)
    
lazy val grids_eitherend = (project in file("grids-eitherend"))

lazy val grids_frontend_web = (project in file("grids-fontend-web"))
    .dependsOn(grids_backend, grids_eitherend)
