name := "pluspod"

version := "0.1"

scalaVersion := "2.8.1"

libraryDependencies += "org.springframework" % "spring-core" % "3.0.6.RELEASE"


libraryDependencies ++= Seq(
    "org.springframework" % "spring-beans" % "3.0.6.RELEASE",
    "org.springframework" % "spring-context" % "3.0.6.RELEASE",
    "org.springframework" % "spring-web" % "3.0.6.RELEASE",
    "org.springframework" % "spring-webmvc" % "3.0.6.RELEASE"
)
