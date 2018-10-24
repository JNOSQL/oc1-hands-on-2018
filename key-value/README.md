# Key-value

![Redis Project](https://redis.io/images/redis-white.png)


**Redis**:In computing, Redis is an open source (BSD licensed), in-memory data structure store, used as a database, cache and message broker.


## Check the code

This part has two configuration files and seven classes


* [src/main/resources/META-INF/beans.xml](src/main/resources/META-INF/beans.xml): CDI configuration file

* [src/main/resources/diana-redis.properties](src/main/resources/diana-redis.properties): Database connection configuration file

* [org.jnosql.demo.key.BucketManagerProducer](src/main/java/org/jnosql/demo/key/BucketManagerProducer.java): Connection handler

* [org.jnosql.demo.key.User](src/main/java/org/jnosql/demo/key/User.java): This class is a org.jnosql.artemis.Entity to model a User

* [org.jnosql.demo.key.UserBuilder](src/main/java/org/jnosql/demo/key/UserBuilder.java): builder to create a User entity

* [org.jnosql.demo.key.UserEvent](src/main/java/org/jnosql/demo/key/UserEvent.java)

* [org.jnosql.demo.key.UserRepository](src/main/java/org/jnosql/demo/key/UserRepository.java)  Artemis Repository for User entity

* [org.jnosql.demo.key.App](src/main/java/org/jnosql/demo/key/App.java) This class will be used to make the exercises.

This class creates and persist into Diana-redis one user with two telephone numbers whith username, name and then queries it:

```Java
	private static final User USER = User.builder()
         				.withPhones(Arrays.asList("234", "432"))
            				.withUsername("username")
            				.withName("Name")
            				.build();

 ```

* [org.jnosql.demo.key.App2](src/main/java/org/jnosql/demo/key/App2.java) This class will be used to make the exercises.

This class creates and persist into Diana-redis one user with two telephone numbers whith username, name and then queries it:

```Java
	private static final User USER = User.builder()
         				.withPhones(Arrays.asList("234", "432"))
            				.withUsername("username")
            				.withName("Name")
            				.build();

 ```



## Start the workshop

1. Run the Redis Docker instance

	```
	docker run --name redis-instance -p 6379:6379 -d redis
	```
  
2. Compile the project via Maven 
	```
	mvn compile
	```
3. Run the project via Maven 
	```
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.key.App"
	
	mvn exec:java -Dexec.mainClass="org.jnosql.demo.key.App2"
	```
	
## Time to practice

Now, It is time you explore the code: add new persons, more relationships, and create new queries. 
Also you can try to an create your own entities that can be used to respond some questions, next some ideas: 

* Create a database to handle JUG information using Redis
* Create, Retrieve and Update JUG information
* Where the JUG name is the unique value.
