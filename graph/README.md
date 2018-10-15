# Graph-Neo4J

A JNoSQL Artemis project with Java SE using using Graph API with Neo4J.

![Neo4J Project](http://www.jnosql.org/img/logos/neo4j.png)

Neo4j is a graph database management system developed by  Neo4j, Inc. Described by its developers as an ACID-compliant transactional database with native graph storage and processing, Neo4j is the most popular graph database according to db-engines.com. Neo4j is available in a GPL3-licensed open-source "community edition", with online backup and high availability extensions licensed under the terms of the Affero General Public License. Neo also licenses Neo4j with these extensions under closed-source commercial terms. Neo4j is implemented in Java and accessible from software written in other languages using the Cypher Query Language through a transactional HTTP endpoint, or through the binary 'bolt' protocol.


To run this project a nEO4j instance is required, so you can use either a local installation or using Docker.

## Check the code

This part has two configuration files and four classes

* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI

* [src/main/resources/META-INF/jnosql.json](src/main/resources/META-INF/jnosql.json): Database connection configuration file

* [org.jnosql.demo.graph.infrastructure.DriverProducer](src/main/java/org/jnosql/demo/graph/infrastructure/DriverProducer.java)
This is the Configuration class that connects to Neo4J database. It has three attributes:

	```java
	private static final String URL = "bolt://localhost:7687";
	private static final String USER = "neo4j";
	private static final String PASSWORD = "admin";

* [org.jnosql.demo.graph.GraphProducer](src/main/java/org/jnosql/demo/graph/GraphProducer.java): 



* [org.jnosql.demo.graph.Person](src/main/java/org/jnosql/demo/graph/Person.java):
 This class is a `org.jnosql.artemis.Entity` to model a Person

* [org.jnosql.demo.graph.App](src/main/java/org/jnosql/demo/graph/App.java): This class will be used to make the exercises.
	* This class creates and persist into Neo4J four persons: Banner, Natalia, Rose and Tony. Each person is created with some attributes:

		```java
		graph.insert(Person.builder().withAge(30L).withName("Banner").withOccupation("Developer").withSalary(3_000D).build());
		```
	* With next line the datas are commited into the database
		```java
		thinkerpop.tx().commit();
		```
		
	* Then different relationships are added between them
		```java
		graph.edge(Tony, "knows", rose).add("feel", "love");
		``` 
	
	* Finally we can perform question to the database
		```java
		List<Person> developers = graph.getTraversalVertex().has("occupation", "Developer").<Person>stream().collect(toList());
		``` 


## Start the workshop

1. Run the Neo4J Docker instance

	```
	docker run -d -p 7474:7474 -p 7687:7687 neo4j
	```
  	Go to [http://localhost:7474/browser/](http://localhost:7474/browser/) log in with the user **neo4j** the default password is **neo4j**, and set new password to **admin**, 

2. Compile the project via Maven 
	```
	mvn compile
	```
3. Run the project via Maven 
	```
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.graph.App"
	```
## Time to practice

Now, It is time you explore the code: add new persons, more relationships, and create new queries. 
Also you can try to an create your own entities that can be used to respond some questions, next some ideas: 

* Find Beginner Java Users that know Advanced Java User(s).
* Find Java Users in a given City
* Recommend Advanced Java Users in the same City as a given User.
* Recommend restaurants 
 