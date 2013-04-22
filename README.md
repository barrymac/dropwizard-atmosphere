## Introduction

The [Dropwizard](http://dropwizard.codahale.com/) example integrated with [Atmosphere](https://github.com/Atmosphere/atmosphere) rest-chat example.

## Overview

Dropwizard is a high performance JVM REST framework built upon proven production JVM technologies.

Atmosphere provides server side push technology using websockets when it can and
gracefully degrades to long polling for browsers that suck.

Gradle is a groovy based build system that includes maven, ant and ivy functionality under the hood

# Running The Application

To test the example application with gradle run the following commands.

*   You will probably need to install the 0.7.0-SNAPSHOT version of dropwizard libraries locally with 'mvn install' on those projects
eg: [Dropwizard Core](http://github.com/codahale/dropwizard/tree/master/dropwizard-core/)

*   To package the example run.

        gradle run

To test the example application with maven run the following commands.

*   To package the example run.

        mvn package

*   To run the server run.

        java -jar target/dropwizard-example-0.6.2.jar server example.yml

To test chat, which purposely resides in its own directory to excercise CORS

*   Browse the file

        app/chat.html

* To test the bad word filter, enter any message with ".NET" and it will be replaced with "***" :)

