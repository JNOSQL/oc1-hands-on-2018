# Key-value

![Hazelcast Project](http://www.jnosql.org/img/logos/hazelcast.svg)


**Hazelcast**:In computing, Hazelcast is an open source in-memory data grid based on Java.


## Check the code

This part has one configuration file and seven classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): File to uses CDI

* [org.jnosql.demo.key.BucketManagerProducer](src/main/java/org/jnosql/demo/key/BucketManagerProducer.java)

* [org.jnosql.demo.key.User](src/main/java/org/jnosql/demo/key/User.java): This class is a org.jnosql.artemis.Entity to model a User

* [org.jnosql.demo.key.UserBuilder](src/main/java/org/jnosql/demo/key/UserBuilder.java) 

* [org.jnosql.demo.key.UserEvent](src/main/java/org/jnosql/demo/key/UserEvent.java)

* [org.jnosql.demo.key.UserRepository](src/main/java/org/jnosql/demo/key/UserRepository.java)

* [org.jnosql.demo.key.App](src/main/java/org/jnosql/demo/key/App.java)

* [org.jnosql.demo.key.App2](src/main/java/org/jnosql/demo/key/App2.java)



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
