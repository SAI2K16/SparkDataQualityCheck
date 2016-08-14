name := "SparkChecking"

version := "1.0"

scalaVersion := "2.10.4"


val sparkVersion = "1.6.1"
val hbaseVersion = "1.2.0-cdh5.7.0"
val hadoopVersion = "2.6.0-cdh5.7.0"

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools",
  "cloudera-repos" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % sparkVersion ,
  "org.apache.hbase" % "hbase" % hbaseVersion,
  "org.apache.hbase" % "hbase-server" % hbaseVersion,
  "org.apache.hbase" % "hbase-server" % hbaseVersion classifier "tests",
  "org.apache.hbase" % "hbase-client" % hbaseVersion,
  "org.apache.hbase" % "hbase-common" % hbaseVersion,
  "org.apache.hbase" % "hbase-common" % hbaseVersion classifier "tests",
  "org.apache.hbase" % "hbase-annotations" % hbaseVersion,
  "org.apache.hbase" % "hbase-testing-util" % hbaseVersion % "test",
  "org.apache.hadoop" % "hadoop-minicluster" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-mapreduce-client-jobclient" % hadoopVersion classifier "tests",
  "org.apache.hadoop" % "hadoop-hdfs" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-hdfs" % hadoopVersion classifier "tests",
  "org.apache.hbase" % "hbase-hadoop-compat" % hbaseVersion,
  "org.apache.hbase" % "hbase-hadoop-compat" % hbaseVersion classifier "tests",
  "org.apache.hbase" % "hbase-hadoop2-compat" % hbaseVersion,
  "org.apache.hbase" % "hbase-hadoop2-compat" % hbaseVersion classifier "tests",
  "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-common" % hadoopVersion classifier "tests",
  "org.apache.hadoop" % "hadoop-annotations" % hadoopVersion,
  "org.scalatest" %% "scalatest" % "2.2.4" %  "test->*" ,
  //"org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "com.cloudera.sparkts" % "sparkts" % "0.3.0",
  "com.ecwid.consul" % "consul-api" % "1.1.9",
  "joda-time" % "joda-time" % "2.7",
  // https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
  "javax.servlet" % "javax.servlet-api" % "3.0.1"

)


