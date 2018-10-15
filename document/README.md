# Document

![MongoDB Project](http://www.jnosql.org/img/logos/mongodb.png)


**Mongodb**: MongoDB is a free and open-source cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schemas.


To run this project a MongoDB instance is required, so you can use either a local instalation or using Docker.



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
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.document.App"
	
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.document.App2"
	```
	
## Time to practice

Now, It is time you explore the code: add new persons, more relationships, and create new queries. 
Also you can try to an create your own entities that can be used to respond some questions, next some ideas: 

* Implement some searches against a MongoDB
* Search JUG members in a given city
* Search JUG members of legal drinking age
* Search JUGs in a region
