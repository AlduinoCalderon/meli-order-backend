# Use a lightweight OpenJDK image
FROM eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the built jar from the target directory
COPY target/ecommerce-0.0.1-SNAPSHOT.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Set environment variables for production profile (can be overridden)
ENV SPRING_PROFILES_ACTIVE=prod

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
