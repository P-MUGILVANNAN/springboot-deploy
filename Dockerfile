FROM maven:3.9.9-eclipse-temurin-21 As build
COPY . . 
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-alpine
COPY --from=build /target/*.jar samdeploy.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","samdeploy.jar"]