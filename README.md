# Eclipse JNoSQL: One API to Many NoSQL Databases - BYOL [HOL5998]

Eclipse JNoSQL is a Java framework that streamlines the integration of Java applications with NoSQL databases. It defines a set of APIs and provides a standard implementation for most NoSQL databases. This clearly helps achieve very low coupling with the underlying NoSQL technologies used in applications. The objective of this session is to show how to use the Eclipse JNoSQL framework to connect with a NoSQL database and perform operations to manipulate and extract information.

## Requirements


* [Git](https://git-scm.com/book/en/v1/Getting-Started-Installing-Git)
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven 3 or higher Configured](https://maven.apache.org/download.cgi)
* [Docker 17.12.1-ce or higher](https://docs.docker.com/install/#next-release)
* [Docker Compose 1.21.2 or higher](https://docs.docker.com/v17.09/compose/install/)
* Any IDE that supports maven and Java 8
  * [Eclipse](https://www.eclipse.org/downloads/)
  * [NetBeans](https://netbeans.org/)
  * [IntelliJ](https://www.jetbrains.com/idea/download/)



## Run the code

* `git clone https://github.com/JNOSQL/oc1-hands-on-2018.git`
* `cd oc1-hands-on-2018`
* `mvn clean install`
* Run databases
  * Run Docker instances
  * Run Docker Compose

### Run Docker instances

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)


* `docker run --name redis-instance -p 6379:6379 -d redis`
* `docker run -d --name casandra-instance -p 9042:9042 cassandra`
* `docker run -d --name mongodb-instance -p 27017:27017 mongodb`
* `docker run -d -p 7474:7474 -p 7687:7687 neo4j`
  * Go to [http://localhost:7474/browser/](http://localhost:7474/browser/) set new password to **admin**, the default is **neo4j**


### Run as Docker-Compose

#### Start fresh environment

`docker-compose -f docker-compose.yml up -d`

#### Stop and Remove

`docker-compose -f docker-compose.yml down`

####  List services
`docker-compose -f ft-compose.yml ps`



## Hands on Lab

This workshop is divide in four parts, each of them correspond to a different type of a NoSQL Database. 
You can follow any order but we recommend next (You can find instructions by clicking on a NoSQL type):

1. [Graph](graph/README.md): this Lab uses Graph-Neo4J 

2. [Document](document/README.md): this Lab uses MongoDB

3. [Column](column/README.md): this Lab uses Cassandra

4. [Key-value](key-value/README.md): this Lab uses Hazelcast



 
 
 #### Model 
 
 ##### JUG
 
 * Name
 * City
 * Programming Languages
 * Country
 
 ##### JUG Member
 
 * Name
 * City
 * Programming Languages (name and skill level)




