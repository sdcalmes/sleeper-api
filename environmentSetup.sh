#!/usr/bin/env bash

function copyEnvVarsToGradleProperties {
    GRADLE_PROPERTIES=$HOME"/.gradle/gradle.properties"
    export GRADLE_PROPERTIES
    echo "Gradle Properties should exist at $GRADLE_PROPERTIES"

    if [ ! -f "$GRADLE_PROPERTIES" ]; then
        echo "Gradle Properties does not exist"

        echo "Creating Gradle Properties file..."
        touch $GRADLE_PROPERTIES

        echo "Writing to gradle.properties..."
        echo "ossrhUsername=$ossrhUsername" >> $GRADLE_PROPERTIES
        echo "ossrhPassword=$ossrhPassword" >> $GRADLE_PROPERTIES
    fi
}