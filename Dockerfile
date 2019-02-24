FROM oracle/graalvm-ce:1.0.0-rc11 as graalvm
COPY . /home/app/micronaut-graal-hello-world
WORKDIR /home/app/micronaut-graal-hello-world
RUN ./build-native-image.sh

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-graal-hello-world .
ENTRYPOINT ["./micronaut-graal-hello-world"]
