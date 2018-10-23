## Setup
Make sure you are using Java 11
  - `java -version` and `mvn -version` should both show some Java 11 version/build



## Build the modular jars
`mvn clean install`

`mkdir libs`

## Copy the modular jars to libs folder
`cp api/target/jlink-api-1.0-SNAPSHOT.jar libs/`

`cp app/target/jlink-app-1.0-SNAPSHOT.jar libs/`

## Create the JRE using jlink
Remember to change the path to the JDK to something that matches your installation location.

`jlink --module-path "/c/java/jdk-11/jmods/;libs" --add-modules no.hamre.java9workshop.jlink.api,no.hamre.java9workshop.jlink.app --output image/`

## Run the application from your JRE
`cd image`

`./bin/java -m no.hamre.java9workshop.jlink.app/no.hamre.java9workshop.jlink.app.Main`

## Maven plugin
Chekout the branch `maven-plugin`.

Here we are using `maven-jlink-plugin` to build the JRE. The JRE are created in a new maven submodule `image`. 
