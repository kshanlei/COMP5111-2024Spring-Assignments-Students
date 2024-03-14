#!/bin/bash  

# Please execute this shell script in the root directory with:  ./scripts/task2-gentest-windows.sh
java -ea -classpath "raw-classes;lib/*" \
     randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --randomseed=60 \
   --output-limit=50 \
   --junit-package-name=comp5111.assignment.cut \
   --junit-output-dir=%ROOT_DIR%/src/test/task2randoop