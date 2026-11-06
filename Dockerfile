# Lightweight Java 17 Alpine runtime
FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Run application under a dedicated non-root user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# Copy executable jar built by Maven
COPY target/*.jar app.jar

# Application entry point
ENTRYPOINT ["java", "-jar", "app.jar"]

# Default arguments
CMD []

