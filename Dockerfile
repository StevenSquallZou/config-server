# Use an official OpenJDK runtime as the base image
FROM eclipse-temurin:19-jre-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/config-server-1.0-SNAPSHOT.jar app.jar

# Expose the port your app runs on 8888
EXPOSE 8888

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
