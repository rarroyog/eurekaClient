## Demo Eureka Client

First, you need to run a Eureka Server, see [an example](https://github.com/rarroyog/eurekaServer).

Run by opening 6 separate command prompts:
* java -jar -Dspring.profiles.active=subject eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=verb eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=article eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=adjective eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=noun eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=sentence eureka-client-0.0.1-SNAPSHOT.jar
