# Play scala project dockerized using sbt package manager

## Add plugin 
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "*.*.*")

* in build.sbt add

```enablePlugins(JavaAppPackaging)```

* sbt stage 

we can see docker file under
cat target/docker/stage/Dockerfile


* To buid an image 

```sbt docker:publishLocal```

* To run

```docker run -p 9000:9000 imagename:tag```

 -p for publish flag, we are saying that we are mapping post in host machine to port in process network


### Size of image is 580MB

### To make image ligher we can use jre instead of jdk

specify this in build.sbt
dockerBaseImage := "openjdk:8-jre"

```size of this image is now 334MB```