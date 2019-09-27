
lazy val `tmt-typed` = project
  .in(file("."))
  .aggregate(
    `svg_dot_js`,`rsocket-types`,`csw-aas-js`,`paper`,`prop-types`,`rsocket-websocket-client`,`rsocket-core`,`react-facade`,`keycloak-js`,`csstype`,`react-transition-group`,`node`,`react`,`eventsource`,`material-ui__core`,`react-dom`,`rsocket-flowable`,`popper_dot_js`,`p5`,`jss`,`indefinite-observable`,`material-ui__icons`
  )

lazy val std = project
  .in(file("modules/std"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "com.olvind" %%% "scalablytyped-runtime" % "2.1.0"
    )
  )


lazy val `react-dom` = project
  .in(file("modules/react-dom"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`react`,`csstype`,`std`)

lazy val `indefinite-observable` = project
  .in(file("modules/indefinite-observable"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn()

lazy val `keycloak-js` = project
  .in(file("modules/keycloak-js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `csstype` = project
  .in(file("modules/csstype"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `p5` = project
  .in(file("modules/p5"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-flowable` = project
  .in(file("modules/rsocket-flowable"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-websocket-client` = project
  .in(file("modules/rsocket-websocket-client"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-core`,`rsocket-flowable`,`rsocket-types`,`std`)

lazy val `react` = project
  .in(file("modules/react"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`csstype`,`std`)

lazy val `svg_dot_js` = project
  .in(file("modules/svg_dot_js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-types` = project
  .in(file("modules/rsocket-types"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-flowable`,`std`)

lazy val `material-ui__icons` = project
  .in(file("modules/material-ui__icons"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`jss`,`prop-types`,`react`,`react-transition-group`,`material-ui__core`,`csstype`,`indefinite-observable`,`popper_dot_js`,`std`)

lazy val `csw-aas-js` = project
  .in(file("modules/csw-aas-js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`react`,`csstype`,`keycloak-js`,`std`)

lazy val `jss` = project
  .in(file("modules/jss"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`csstype`,`indefinite-observable`,`std`)

lazy val `eventsource` = project
  .in(file("modules/eventsource"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `prop-types` = project
  .in(file("modules/prop-types"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `react-transition-group` = project
  .in(file("modules/react-transition-group"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`react`,`csstype`,`std`)

lazy val `popper_dot_js` = project
  .in(file("modules/popper_dot_js"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `material-ui__core` = project
  .in(file("modules/material-ui__core"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`jss`,`prop-types`,`react`,`react-transition-group`,`csstype`,`indefinite-observable`,`popper_dot_js`,`std`)

lazy val `paper` = project
  .in(file("modules/paper"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `node` = project
  .in(file("modules/node"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`std`)

lazy val `rsocket-core` = project
  .in(file("modules/rsocket-core"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`node`,`rsocket-flowable`,`rsocket-types`,`std`)

lazy val `react-facade` = project
  .in(file("modules/react-facade"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`prop-types`,`react`,`csstype`,`std`)

