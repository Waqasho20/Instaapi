#!/bin/sh
# -----------------------
# Gradle wrapper script
# -----------------------

# Locate java
if [ -n "$JAVA_HOME" ]; then
  JAVA="$JAVA_HOME/bin/java"
else
  JAVA=java
fi

# Determine base directory
DIR="$( cd "$( dirname "$0" )" && pwd )"
"$JAVA" -classpath "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
