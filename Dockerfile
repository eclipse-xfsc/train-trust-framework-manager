# Stage 1: Maven-Build
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /build

# Nur pom.xml kopieren und Dependencies cachen
COPY pom.xml .
RUN mvn dependency:go-offline

# Projektdateien kopieren und bauen
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Tomcat-Deploy
FROM tomcat:10.1.16-jdk21-temurin-jammy

# Port anpassen
RUN sed -i 's/port="8080"/port="16003"/' ${CATALINA_HOME}/conf/server.xml

# WAR aus dem Build übernehmen
COPY --from=builder /build/target/tspa-service.war /usr/local/tomcat/webapps/tspa-service.war

# Tomcat-User und Manager-Kontext setzen
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml

# Start-Befehl
CMD ["catalina.sh", "run"]
