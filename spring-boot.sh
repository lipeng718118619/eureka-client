#!/bin/bash
APP_NAME=$1
nohup java $JAVA_OPTS -Dfile.encoding=UTF-8 -Xms64m -Xmx128m -jar $APP_NAME --server.port=8001 > /dev/null 2>&1 &
nohup java $JAVA_OPTS -Dfile.encoding=UTF-8 -Xms64m -Xmx128m -jar $APP_NAME --server.port=9001 > /dev/null 2>&1 &
