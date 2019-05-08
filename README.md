# varlink-java-maven-plugin-test

## What I did to generate the bindings

```
mvn varlink:generate
mv target/generated-sources/varlink/io src/main/java/io
```

## Try building with broken pom
```
mvn clean install
```
This will fail because maven uses varlink-core:${project-version}. It is still trying to compile because the project version is 0.0.1, which is also a valid varlink-core release. (Took me like two days to figure that one out xD).

For example: If you set the project version in the pom.xml from 0.0.1 to 9.9.9 the maven build will fail because it tries to find varlink-core:9.9.9.

## Try building with fixed pom
```
mv pom.xml pom.old
mv pom.fixed pom.xml
mvn clean install
```
Everythink works just fine.
