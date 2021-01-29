Created with Spring Initializer
https://start.spring.io/

To run first build.

Mac
```
./mvnw clean package
```

TODO: windows

The following need to be configured

"native" profile active to use [local filesystem](https://docs.spring.io/spring-cloud-config/docs/3.0.0/reference/html/#_file_system_backend)
```
spring.profiles.active=native
```

searchLocations to point to place on filesystem 
(for windows an extra slash is required such as `file:///C:/temp/config-repo`)
```
spring.cloud.config.server.native.searchLocations=file:/Users/username/config-repo
```

Mac:
```
java -jar -Dspring.profiles.active=native -Dserver.port=8888 -Dspring.cloud.config.server.native.searchLocations=file:/Users/username/config-repo ./target/cloud-config-server-0.0.1-SNAPSHOT.jar
```

`1`
