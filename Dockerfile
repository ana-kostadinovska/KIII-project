FROM maven:latest

WORKDIR /app

COPY pom.xml .

RUN mvn clean install -DskipTests

COPY . .

EXPOSE 9090

CMD ["mvn", "spring-boot:run"]