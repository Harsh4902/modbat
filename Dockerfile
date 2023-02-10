# Use openjdk:11-jdk as the base image
FROM openjdk:11-jdk
 
# Set the working directory to /app
WORKDIR /app
 
# Install Scala 2.11.12
RUN apt-get update && apt-get install -y scala=2.11.12-4
 
# Clone the Git repository
RUN git clone https://github.com/cyrille-artho/modbat.git
 
# Change the working directory to the cloned repository
WORKDIR /app/modbat
 
# Run a Gradle build and test and run bin/test.sh if the tests passed
RUN ./gradlew test
 
# RUN sh bin/test.sh
# Enable the last line if build/test quota is sufficient
