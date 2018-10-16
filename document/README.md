# Document

![MongoDB Project](http://www.jnosql.org/img/logos/mongodb.png)


**Mongodb**: MongoDB is a free and open-source cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schemas.


To run this project a MongoDB instance is required, so you can use either a local instalation or using Docker.



## Check the code

This part has 2 configuration files and 8 classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to use CDI

* [src/main/resources/diana-mongodb.properties](src/main/resources/diana-mongodb.properties): File to configure connection to DB

* [column/src/main/java/org/jnosql/demo/document/DocumentCollectionProducer.java](src/main/java/org/jnosql/demo/document/DocumentCollectionProducer.java): Connection handler

* [column/src/main/java/org/jnosql/demo/document/Person](src/main/java/org/jnosql/demo/document/Person.java): This class is a `org.jnosql.artemis.Entity` to model a Person

* [column/src/main/java/org/jnosql/demo/document/Address](src/main/java/org/jnosql/demo/document/Address.java): This class is a `org.jnosql.artemis.Entity` to model an Address

* [column/src/main/java/org/jnosql/demo/document/Job](src/main/java/org/jnosql/demo/document/Job.java): This class is a `org.jnosql.artemis.Entity` to model a Job

* [column/src/main/java/org/jnosql/demo/document/PersonBuilder](src/main/java/org/jnosql/demo/document/PersonBuilder.java): builder to create a Person entity

* [column/src/main/java/org/jnosql/demo/document/PersonRepository](src/main/java/org/jnosql/demo/document/PersonRepository.java): Artemis Repository for Person entity

* [column/src/main/java/org/jnosql/demo/document/App](src/main/java/org/jnosql/demo/document/App.java): This class will be used to make the exercises.

	* This class creates and persist into MongoDB one person with address and job and 2 telephone numbers and then queries it:
	```java
    Person person = Person.builder().
                    withPhones(Arrays.asList("234", "432"))
                    .withName("Name")
                    .withAddress(address)
                    .withJob(job)
                    .withId(id).build();
    ```
                  
* [column/src/main/java/org/jnosql/demo/document/App2](src/main/java/org/jnosql/demo/document/App2.java): This class will be used to make the exercises.
	
	* This class creates and persist into MongoDB one person with 2 telephone numbers and then queries it:
	```java
    Person person = Person.builder().
                    withPhones(Arrays.asList("234", "432"))
                    .withName("Name")
                    .withId(id)
                .build(); 
    ```
	  
## Start the workshop

1. Run the MongoDB Docker instance

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
