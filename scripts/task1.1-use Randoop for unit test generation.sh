#!/bin/bash  
  
for((i=0;i<=4;i++));  
do   
java -ea -classpath "lib/randoop-all-4.3.1.jar:target/classes" \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --randomseed=60 \
   --junit-package-name=comp5111.assignment.cut \
   --junit-output-dir=/Users/mac/wkdir/code/comp5111/COMP5111-2024Spring-Assignments-Students/src/test/randoop$i
done
