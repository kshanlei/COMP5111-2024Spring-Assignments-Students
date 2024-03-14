#!/bin/bash

# 1 Compile all the java to .class
javac 	-classpath "lib/*;target/classes" \
		-d target/classes \
		src/main/java/comp5111/assignment/Assignment1.java \
		src/main/java/comp5111/assignment/Counter.java \
		src/main/java/comp5111/assignment/cut/Subject.java \
		src/main/java/comp5111/assignment/EntryPoint.java \
		src/main/java/comp5111/assignment/Instrumenter.java \
		src/test/randoop0/comp5111/assignment/cut/RegressionTest0.java \
		src/test/randoop1/comp5111/assignment/cut/RegressionTest1.java \
		src/test/randoop2/comp5111/assignment/cut/RegressionTest2.java \
		src/test/randoop3/comp5111/assignment/cut/RegressionTest3.java \
		src/test/randoop4/comp5111/assignment/cut/RegressionTest4.java \
		src/test/task2randoop/comp5111/assignment/cut/RegressionTestTask2.java
		
# 2 test 
java -ea -classpath "lib/*;target/classes" comp5111.assignment.EntryPoint
# 3. we run the main method of castle.comp5111.assignment.EntryPoint
java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes castle.comp5111.assignment.EntryPoint

java -ea -classpath "lib/*;target/classes" castle.comp5111.assignment.EntryPoint





admin@DESKTOP-R6CPU78 MINGW64 /d/projects/comp5111/assignment/assignment1/soot-example
$ java -classpath "lib/*;target/classes" castle.comp5111.example.EntryPoint                                                                                                                                       Soot started on Thu Mar 14 20:22:58 CST 2024
instrumenting method: <castle.comp5111.example.Subject: int staticMethod_Add(int,int)>
instrumenting method: <castle.comp5111.example.Subject: double staticMethod_Add(double,double)>
instrumenting method: <castle.comp5111.example.Subject: int staticMethod_Mul(int,int)>
instrumenting method: <castle.comp5111.example.Subject: double staticMethod_Mul(double,double)>
instrumenting method: <castle.comp5111.example.Subject: int instanceMethod_Add(int,int)>
instrumenting method: <castle.comp5111.example.Subject: double instanceMethod_Add(double,double)>
instrumenting method: <castle.comp5111.example.Subject: int instanceMethod_Mul(int,int)>
instrumenting method: <castle.comp5111.example.Subject: double instanceMethod_Mul(double,double)>
Soot finished on Thu Mar 14 20:22:58 CST 2024
Soot has run for 0 min. 0 sec.
Running junit test: castle.comp5111.example.test.RegressionTest
Invocation to static methods: 1259
Invocation to instance methods: 4852
