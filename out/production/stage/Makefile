#
GNAME= unamedLanguage
GSRC= $(GNAME).g

all: grammar compiler

grammar: $(GSRCS)
	java org.antlr.Tool -fo . $(GSRC) 

compiler:
	javac *.java
	javac ASTNodes/*.java

clean:
	rm *.class $(GNAME)*.java $(GNAME)__.g $(GNAME).tokens ASTNodes/*.class


 
