# JLink example
This is a minimal example of an application that can be modularized using JLink and
distributed with it's own JRE containing only the required Java modules and this application.

## Structure
The maven project has two modules to emulate a real modular application. The `api` module contains
a `Student` class representing the API. The `app` module contains a `Main` class that instansiates
three student objects and prints the information to `System.out` when run. This is supposed to emulate 
the main application that would start an application server and run a real application. 

## Setup
Make sure you are using Java 12
  - `java -version` and `mvn -version` should both show some Java 12 version/build

## Build the modular jars
`mvn clean install`

## Create a temp folder
`mkdir libs`

## Copy the modular jars to libs folder
`cp api/target/jlink-api-1.0-SNAPSHOT.jar libs/`

`cp app/target/jlink-app-1.0-SNAPSHOT.jar libs/`

## Create the JRE using jlink
Remember to change the below path to the JDK to something that matches your installation location.

`jlink --module-path "/c/java/jdk-12/jmods/;libs" --add-modules no.hamre.java9workshop.jlink.api,no.hamre.java9workshop.jlink.app --output image/`

This will create the custom JRE with the application in the `image` folder

## Run the application from your JRE
`cd image`

`./bin/java -m no.hamre.java9workshop.jlink.app/no.hamre.java9workshop.jlink.app.Main`

## Using the maven-jlink-plugin 

_This plugin does not work for Java 12_

Chekout the branch `maven-plugin`.

Here we are using `maven-jlink-plugin` to build the JRE. With this plugin the maven project has a 
new module, `image`, used only for building the JRE from the other two modules using the plugin.