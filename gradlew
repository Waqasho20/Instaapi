#!/bin/sh

# Copyright 2015 the original author or authors.
# Licensed under the Apache License, Version 2.0

##############################################################################
# Gradle start script for UN*X
##############################################################################

DIRNAME=$(dirname "$0")
APP_BASE_NAME=$(basename "$0")
APP_HOME=$(cd "$DIRNAME" && pwd)

DEFAULT_JVM_OPTS=""

exec "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
