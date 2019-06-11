
ThisBuild / scalaVersion := "2.12.8"

lazy val root = project.in(file("."))

lazy val js = project.in(file("js"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies += "com.raquo" %%% "laminar" % "0.6",
    scalaJSUseMainModuleInitializer := true,
  )
