FROM openjdk:8-alpine

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

RUN addgroup -S cardoso && adduser -S cardoso -G cardoso
USER cardoso:cardoso

EXPOSE 8080

ENTRYPOINT ["java","-cp","app:app/lib/*","br.com.mastertech.card.CardAppApplication"]