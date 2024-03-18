# Java 21 + Spring Boot Custom Starter: Quick Start Maven Archetype

Maven archetype to create a quick new Spring Boot Custom Starter project configured for Java 21, Spring Boot 3.

## Install archetype in local repository

Once you have cloned the repository locally. Just run the maven command below to install the archetype.

``` shell
mvn clean install
```

## Example using the archetype

When the archetype has been installed locally you can create a project using the command below. Just replace the parameter values with the actual values you want to use.

``` shell
mvn archetype:generate -DarchetypeGroupId=org.fve.archetypes \
                        -DarchetypeArtifactId=spring-boot-custom-starter-archetype \
                        -DarchetypeVersion=1.0.0-SNAPSHOT \
                        -DgroupId=org.fve.app \
                        -DartifactId=a-test-project \
                        -Dversion=1.0.0-SNAPSHOT \
                        -DinteractiveMode=false
```

Create java library
``` shell
mvn archetype:generate -DarchetypeGroupId=org.fve.archetypes -DarchetypeArtifactId=spring-boot-custom-starter-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT \
                        -DgroupId=org.fve.customstarters -DartifactId=microservice-spring-boot-starter-generated                       
```

## References

* [Maven](https://maven.apache.org)
* [Maven Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)
* [JUnit 5](https://junit.org/junit5/)
* [AssertJ](https://assertj.github.io/doc/)

## Author

* Filip VE, Sr. Software Engineer / Java Dev
* LinkedIn: https://www.linkedin.com/in/filipve/

## License

* This project is released under the Apache 2.0 License. See the [LICENSE](https://github.com/wallaceespindola/java21-junit5-assertj-maven-archetype/blob/master/LICENSE) file for details.
* Copyright © 2024 [Filip VE](https://github.com/filipve1994/).

