#!/bin/bash
VERSION=1.0.1
mvn clean package
docker build . -f Dockerfile -t warehouse:${VERSION}
docker image tag warehouse:${VERSION} enmasoomi/warehouse:${VERSION}
docker push enmasoomi/warehouse:${VERSION}


