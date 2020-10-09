name := """play-scala-nativepackager"""
organization := "muralis hub"

version := "1.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice

enablePlugins(JavaAppPackaging)
dockerBaseImage := "openjdk:8-jre"
packageName in Docker := "play-docker-jre"