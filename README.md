# Eclipse JNoSQL: One API to Many NoSQL Databases - BYOL [HOL5998]

Eclipse JNoSQL is a Java framework that streamlines the integration of Java applications with NoSQL databases. It defines a set of APIs and provides a standard implementation for most NoSQL databases. This clearly helps achieve very low coupling with the underlying NoSQL technologies used in applications. The objective of this session is to show how to use the Eclipse JNoSQL framework to connect with a NoSQL database and perform operations to manipulate and extract information.

## Requirements


* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven 3 or higher Configured](https://maven.apache.org/download.cgi)
* [Docker 17.12.1-ce or higher](https://docs.docker.com/install/#next-release)
* Any IDE that supports maven and Java 8
  * [Eclipse](https://www.eclipse.org/downloads/)
  * [NetBeans](https://netbeans.org/)
  * [IntelliJ](https://www.jetbrains.com/idea/download/)



## Run Docker instances

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)


* `docker run --name redis-instance -p 6379:6379 -d redis`
* `docker run -d --name casandra-instance -p 9042:9042 cassandra`
* `docker run -d --name mongodb-instance -p 27017:27017 mongodb`
* `docker run -d --publish=7474:7474 --publish=7687:7687 neo4j`
  * Go to [http://localhost:7474/browser/](http://localhost:7474/browser/) set new password to **admin**, the default is **neo4j**
