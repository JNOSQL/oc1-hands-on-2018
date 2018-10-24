# Column

![Cassandra Project](http://www.jnosql.org/img/logos/cassandra.png)

**Cassandra**: Apache Cassandra is a free and open-source distributed database management system designed to handle large amounts of data across many commodity servers, providing high availability with no single point of failure.


## Check the code

This part has two configuration files and six classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): CDI configuration file

* [src/main/resources/diana-cassandra.properties](src/main/resources/diana-cassandra.properties): Database connection configuration file

* [org.jnosql.demo.column.ColumnFamilyManagerProducer](src/main/java/org/jnosql/demo/column/ColumnFamilyManagerProducer.java): Connection handler

* [org.jnosql.demo.column.Person](src/main/java/org/jnosql/demo/column/Person.java): This class is a `org.jnosql.artemis.Entity` to model a Person

* [org.jnosql.demo.column.PersonBuilder](src/main/java/org/jnosql/demo/column/PersonBuilder.java): builder to create a Person entity

* [org.jnosql.demo.column.PersonRepository](src/main/java/org/jnosql/demo/column/PersonRepository.java): Artemis Repository for Person entity

* [org.jnosql.demo.column.App](src/main/java/org/jnosql/demo/column/App.java): This class will be used to make the exercises.
	* This class creates and persist into Cassandra one person with two telephone numbers and whith Id 1 and then queries it:
	```java
	private static final Person PERSON = Person.builder()
					     .withPhones(Arrays.asList("234", "432"))
					     .withName("Name").withId(1).build();
	  
* [org.jnosql.demo.column.App2](src/main/java/org/jnosql/demo/column/App2.java): This class will be used to make the exercises.
	* This class creates and persist into Cassandra one person with two telephone numbers and whith Id 1 and then queries it:
	```java
	private static final Person PERSON = Person.builder()
					    .withPhones(Arrays.asList("234", "432"))
					    .withName("Name").withId(1).build();


## Start the workshop

1. Run the Cassandra Docker instance

	```
	docker run -d --name casandra-instance -p 9042:9042 cassandra
	```
  
2. Compile the project via Maven 
	```
	mvn compile
	```
3. Run the project via Maven 
	```
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.column.App"
	
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.column.App2"
	```
	
## Time to practice

Now, It is time you explore the code: add new persons, more relationships, and create new queries. 
Also you can try to an create your own entities that can be used to respond some questions, next some ideas: 

* Implement some searches against a MongoDB
* Search JUG members in a given city
* Search JUG members of legal drinking age
* Search JUGs in a region
