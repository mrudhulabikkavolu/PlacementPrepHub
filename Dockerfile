# Use OpenJDK 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the built jar file
COPY target/placement_prep_hub-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 9090

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
