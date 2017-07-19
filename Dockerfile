FROM maven AS builder

ADD . /build

WORKDIR /build

RUN mvn dependency:resolve verify package

FROM java:8

WORKDIR /app

COPY --from=builder /build/target/slackbot-jar-with-dependencies.jar /app/run.jar

CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-DMENSAGEM=$MENSAGEM", "-DTOKEN=$TOKEN", "-DCANAIS=$CANAIS", "-jar", "run.jar"]