
# ---- Build Stage ----
FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# ---- Package Stage ----
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/ecommerce-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV SPRING_PROFILES_ACTIVE=prod
ENTRYPOINT ["java", "-jar", "app.jar"]
