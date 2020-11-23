@echo off
@echo ** Start installing server **
cd interfaces
start "MAVEN Console" mvn clean install -DskipTests
cd ..
@echo *** installed, end batch ***