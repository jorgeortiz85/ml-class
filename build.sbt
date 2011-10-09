scalaVersion := "2.9.1"

resolvers ++= Seq(
  "ondex" at "http://ondex.rothamsted.bbsrc.ac.uk/nexus/content/groups/public",
  "ScalaNLP Maven2" at "http://repo.scalanlp.org/repo")

libraryDependencies ++= Seq(
  "org.scalala" %% "scalala" % "1.0.0.RC2-SNAPSHOT")
