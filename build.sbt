inThisBuild(
  Seq(
    organization := "org.scalablytyped",
    scalaVersion := "2.13.0",
    publishArtifact in packageDoc := false,
    scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls"),
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    resolvers += "jitpack" at "https://jitpack.io",
  )
)

enablePlugins(ExtractorPlugin)

stRepo := file("/Users/mushtaq/projects/cloned/ScalablyTyped")

stModules ++= Seq(
  ScalablyTyped.E.eventsource,
  ScalablyTyped.C.`csw-aas-js`,
  ScalablyTyped.R.`rsocket-websocket-client`,
  ScalablyTyped.S.`svg_dot_js`,
  ScalablyTyped.P.p5,
  ScalablyTyped.P.paper,
  ScalablyTyped.R.`react-facade`,
  ScalablyTyped.R.`react`,
  ScalablyTyped.R.`react-dom`,
  ScalablyTyped.M.`material-ui__core`,
  ScalablyTyped.M.`material-ui__icons`,
)
