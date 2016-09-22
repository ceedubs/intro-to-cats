scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-encoding", "UTF-8", // 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  // This includes laws as well. For production use, you'll probably want `core`
  // and then the laws modules under the `test` scope.
  "org.typelevel" %% "cats" % "0.7.2",
  "org.scalatest" %% "scalatest" % "3.0.0-M8"
)

tutSettings

tutSourceDirectory := baseDirectory.value / "tut"

tutTargetDirectory := baseDirectory.value / "tut-out"
