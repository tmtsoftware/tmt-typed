
lazy val `tmt-typed` = project
  .in(file("."))
  .aggregate(
    `rsocket-types`,`csw-aas-js`,`prop-types`,`rsocket-websocket-client`,`rsocket-core`,`keycloak-js`,`csstype`,`node`,`react`,`eventsource`,`rsocket-flowable`
  )

lazy val std = project
  .in(file("modules/std"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "com.olvind" %%% "scalablytyped-runtime" % "2.1.0"
    )
  )


lazy val `keycloak-js` = project
  .in(file("modules/keycloak-js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `csstype` = project
  .in(file("modules/csstype"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `react` = project
  .in(file("modules/react"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`csstype`,`std`)

lazy val `rsocket-types` = project
  .in(file("modules/rsocket-types"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-flowable`,`std`)

lazy val `csw-aas-js` = project
  .in(file("modules/csw-aas-js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`react`,`csstype`,`keycloak-js`,`std`)

lazy val `node` = project
  .in(file("modules/node"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-core` = project
  .in(file("modules/rsocket-core"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-flowable`,`rsocket-types`,`std`)

lazy val `rsocket-flowable` = project
  .in(file("modules/rsocket-flowable"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-websocket-client` = project
  .in(file("modules/rsocket-websocket-client"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-core`,`rsocket-flowable`,`rsocket-types`,`std`)

lazy val `eventsource` = project
  .in(file("modules/eventsource"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `prop-types` = project
  .in(file("modules/prop-types"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

