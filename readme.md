# Example spring-boot-maven-plugin

How to repackage your project to get a standalone jar-file containing all dependencies.

## Build

```
mvn clean install
```

## Launch standalone jar

Launch the generated *-boot.jar file:

```
cd target
java -jar spring-boot-maven-plugin-example-0.0.1-SNAPSHOT-boot.jar
```

## Configuration

See [pom.xml](pom.xml), look for *spring-boot-maven-plugin* in pluginManagement and plugins.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
