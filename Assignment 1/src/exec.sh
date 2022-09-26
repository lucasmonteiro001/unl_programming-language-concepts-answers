#!/bin/bash

export CLASSPATH=".:/usr/local/lib/antlr-4.4-complete.jar:$CLASSPATH"
java -jar /usr/local/lib/antlr-4.4-complete.jar chuteAndLadders.g4
javac *.java
java org.antlr.v4.runtime.misc.TestRig chuteAndLadders init > output.txt