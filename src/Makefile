all:
	jtb MyNewGrammar.jj
	javacc jtb.out.jj
	javac visitor/*.java
	javac syntaxtree/*.java
	javac -cp . *.java
clean:
	rm eg1*.java
	rm Parse*
	rm jtb.out.jj
	rm SimpleChar*
	rm *Token*
	rm *.class
	rm visitor/*Visitor*
	rm syntaxtree/*
