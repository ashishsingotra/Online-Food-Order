FROM openjdk:19-alpine

WORKDIR /Online-Food-Ordering
# https://security.alpinelinux.org/vuln/CVE-2021-46848
RUN apk add --upgrade libtasn1-progs

# https://security.alpinelinux.org/vuln/CVE-2022-37434
RUN apk update && apk upgrade zlib


# Create a new user with UID 10014
RUN addgroup -g 10014 choreo && \
    adduser  --disabled-password  --no-create-home --uid 10014 --ingroup choreo choreouser

VOLUME /tmp

USER 10014

# Add Spring Boot app.jar to Container
COPY target/Online-Food-Ordering-*.jar app.jar

# Fire up our Spring Boot app by default
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar