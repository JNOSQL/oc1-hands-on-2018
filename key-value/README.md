# Key-value

![Hazelcast Project](http://www.jnosql.org/img/logos/hazelcast.svg)


**Hazelcast**:In computing, Hazelcast is an open source in-memory data grid based on Java.


## Check the code

This part has XXXX configuration files and XXXX classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI

* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI

//TODO ADD CLASSES AND CONFIGURATION FILE WITH SMALL DESCRIPTION, FOR APP CLASSES EXPLAIN SOME LINES OF CODE SO ATTENDEES CAN UNDERSTAND THEM, YOU CAN LOOK OVER THE GRAPH README


## Start the workshop

1. Run the Neo4J Docker instance

	```
	docker run -d --name mongodb-instance -p 27017:27017 mongodb
	```
  
2. Compile the project via Maven 
	```
	mvn compile
	```
3. Run the project via Maven 
	```
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.key-value.App"
	
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.key-value.App2"
	```
	
## Time to practice

Now, It is time you explore the code: add new persons, more relationships, and create new queries. 
Also you can try to an create your own entities that can be used to respond some questions, next some ideas: 

* Create a database to handle JUG information using Redis
* Create, Retrieve and Update JUG information
* Where the JUG name is the unique value.