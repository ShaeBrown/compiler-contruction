/*
 * Compiler.java
 *
 * A starting place for the unamed language compiler for CSC 435/535
 *
 */

import ASTNodes.*;
import org.antlr.runtime.*;
import java.io.*;

public class Compiler {
	public static void main (String[] args) throws Exception {
		ANTLRInputStream input;

		if (args.length == 0 ) {
			System.out.println("Usage: Test filename.ul");
			return;
		}
		else {
			input = new ANTLRInputStream(new FileInputStream(args[0]));
		}

		// The name of the grammar here is "ulNoActions",
		// so ANTLR generates ulNoActionsLexer and ulNoActionsParser
		unamedLanguageLexer lexer = new unamedLanguageLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		unamedLanguageParser parser = new unamedLanguageParser(tokens);

		try {
			Program p = parser.program();
                        Visitor localGlobals = new LocalGlobalVisitor();
                        Visitor typeCheck = new TypeCheckVisitor();
                        p.accept(localGlobals);
                        p.accept(typeCheck);
                        System.out.println("Existence, Uniqueness and Type Checking Successful");
		}
		catch (RecognitionException e )	{
                    System.out.println(e.getLocalizedMessage());
		}
		catch (Exception e) {
                    System.out.println(e);
                    e.printStackTrace();
		}
	}
}
