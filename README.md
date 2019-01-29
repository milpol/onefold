# Onefold
Onefold is the skeleton of a complete, production-ready, Java web application, build with modern JavaScript 
libraries (ReactJS) and bundled by Maven only.
It does not do much, simply displays welcome page, asks backend for current user (XHR) and updates view with obtained
 value.
The reason behind this project is to provide independent from JavaScript ecosystem, dependencies building mechanism 
based on pure Java.

## Building & Running
To run the project from IDE, execute `OnefoldApplication` class with arguments `server files/configuration.yml`.
(If you are familiar with [Dropwizard](https://www.dropwizard.io) project this should be rather straightforward, if 
not, I strongly recommend to start with 101 tutorials before diving here).

To build executable JAR file, run maven package phase with **fold** profile:

`mvn clean package -P fold`

When done, application can be executed from Java (outside IDE):

`java -jar target/onefold-1.0-SNAPSHOT.jar server files/configuration.yml`

Application is available at: `http://localhost:8080`