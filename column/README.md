# Column

![Cassandra Project](http://www.jnosql.org/img/logos/cassandra.png)

**Cassandra**: Apache Cassandra is a free and open-source distributed database management system designed to handle large amounts of data across many commodity servers, providing high availability with no single point of failure.


## Check the code

This part has XXXX configuration files and XXXX classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI

* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI


//TODO ADD CLASSES AND CONFIGURATION FILE WITH SMALL DESCRIPTION, FOR APP CLASSES EXPLAIN SOME LINES OF CODE SO ATTENDEES CAN UNDERSTAND THEM, YOU CAN LOOK OVER THE GRAPH README


## Start the workshop

1. Run the Neo4J Docker instance

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
