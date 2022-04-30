Daily learning

# Development of unit tests to validate a beer inventory management REST API

Project developed at Digital Innovation One's Bootcamp Java Developer with guidance from specialist [Rodrigo Peleias](https://www.linkedin.com/in/rodrigopeleias/ "Rodrigo Peleias"). Learning to unit test a REST API for managing beer stocks. Build unit tests to validate the beer inventory management system developed in Spring Boot, and get to know the main concepts and advantages of creating unit tests with JUnit and Mockito. In addition, develop API functionality through the practice of TDD.

![stock_beer](https://user-images.githubusercontent.com/95108889/162970668-6f2b8b23-1891-4f85-b086-7cd37a5e524f.jpeg)

To run the project in the terminal, type the following command:

```shell script
mvn spring-boot:run 
```

To run the test suite developed during live coding, simply run the following command:

```shell script
mvn clean test
```

After executing the above command, just open the following address and view the project execution:

```
http://localhost:8080/api/v1/beers
```

The following prerequisites are necessary for the execution of this project:

* Java 14 or higher versions.
* Maven 3.6.3 or higher versions.
* Intellj IDEA Community Edition or your favorite IDE.
* GIT version control installed on your machine.

Below are useful links:

* [SDKMan! for managing and installing Java and Maven](https://sdkman.io/)
* [Downloadable Intellij IDEA Community Reference](https://www.jetbrains.com/idea/download)
* [Intellij Command Shortcut Palette](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Spring official website](https://spring.io/)
* [JUnit 5 Official Website](https://junit.org/junit5/docs/current/user-guide/)
* [Mockito Official Website](https://site.mockito.org/)
* [Official Hamcrest website](http://hamcrest.org/JavaHamcrest/)
* [References - testing in general with Spring Boot](https://www.baeldung.com/spring-boot-testing)
* [Reference for the REST architectural pattern](https://restfulapi.net/)
* [Test Pyramid Reference - Martin Fowler](https://martinfowler.com/articles/practical-test-pyramid.html#TheImportanceOftestAutomation)

[LICENSE](./LICENSE)
