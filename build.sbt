
enablePlugins(ScalaJSPlugin)

name := "grids"
scalaVersion := "2.13.10"

lazy val root = (project in file("."))
    .dependsOn(grids_frontend_web)
    .aggregate(grids_frontend_web)

lazy val grids_backend = (project in file("grids-backend"))
    .dependsOn(grids_eitherend)
    
lazy val grids_eitherend = (project in file("grids-eitherend"))

lazy val grids_frontend_web = (project in file("grids-fontend-web"))
//    .dependsOn(grids_backend, grids_eitherend)
