Bumping to spring cloud 2020.0.1 to work around [this](https://github.com/spring-cloud/spring-cloud-config/issues/1777)
see [release notes](https://github.com/spring-cloud/spring-cloud-release/wiki/Spring-Cloud-2020.0-Release-Notes)

build the jar

Mac
```
./mvnw clean package
```

prod mac example
```
java -D'spring.config.import=optional:configserver:http://localhost:8888' \
 -Dspring.application.name=alpha \
 -Dspring.profiles.active=prod \
 -jar ./target/alpha-0.0.1-SNAPSHOT.jar
```

qa mac example
```
java -D'spring.config.import=optional:configserver:http://localhost:8888' \
 -Dspring.application.name=alpha \
 -Dspring.profiles.active=qa \
 -jar ./target/alpha-0.0.1-SNAPSHOT.jar
```
