# Base image 설정
FROM openjdk:17-jdk-slim

# Maintainer 정보 (선택)
LABEL maintainer="your_email@example.com"

# 애플리케이션 디렉토리 설정
WORKDIR /app

# JAR 파일 복사
COPY build/libs/peach-0.0.1-SNAPSHOT.jar /app/peach-0.0.1-SNAPSHOT.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "peach-0.0.1-SNAPSHOT.jar"]
