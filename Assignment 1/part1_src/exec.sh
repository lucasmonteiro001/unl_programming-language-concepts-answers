#!/bin/bash

export CLASSPATH=".:/usr/local/lib/antlr-4.4-complete.jar:$CLASSPATH"
java -jar /usr/local/lib/antlr-4.4-complete.jar csce322as01pt01.g4
javac *.java
java org.antlr.v4.runtime.misc.TestRig csce322as01pt01 chutesNladders > output.txt