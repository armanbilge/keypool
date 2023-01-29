val sbtTypelevelVersion = "0.4.18"

addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.11.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.10")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.2.0")
addSbtPlugin("com.github.cb372"   % "sbt-explicit-dependencies"     % "0.2.16")
addSbtPlugin("org.typelevel"      % "sbt-typelevel"                 % sbtTypelevelVersion)
addSbtPlugin("org.typelevel"      % "sbt-typelevel-site"            % sbtTypelevelVersion)
