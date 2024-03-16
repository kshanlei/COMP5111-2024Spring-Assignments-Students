#!/bin/bash  

java -ea -classpath "lib/soot-4.2.1-jar-with-dependencies.jar;target/classes"  soot.Main Subject


for (( ti = 0; ti < 5; ti++ )); 
do
	for (( i = 0; i < 2; i++ )); 
	do
		arguments="$i comp5111.assignment.cut.RegressionTest"$ti
		arguments=$arguments' comp5111.assignment.cut.Subject comp5111.assignment.cut.Subject$NumberHandler comp5111.assignment.cut.Subject$ParameterHandler comp5111.assignment.cut.Subject$SortTools comp5111.assignment.cut.Subject$TaskHandler comp5111.assignment.cut.Subject$TextHandler '
		mvn clean compile exec:java -Dexec.mainClass="comp5111.assignment.Assignment1" \
		-Dexec.args="$arguments"
	done
done

