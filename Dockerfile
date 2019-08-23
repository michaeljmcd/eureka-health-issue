FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/eureka-health-issue*.jar eureka-health-issue.jar
CMD java ${JAVA_OPTS} -jar eureka-health-issue.jar