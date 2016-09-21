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
  "org.typelevel" %% "cats-core" % "0.7.2"
)

tutSettings

tutSourceDirectory := baseDirectory.value / "tut"

tutTargetDirectory := baseDirectory.value / "tut-out"
