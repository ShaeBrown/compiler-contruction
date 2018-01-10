// $ANTLR 3.0.1 ulNoActions.g 2018-01-09 18:09:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "TYPE", "INT", "IF", "OP", "STRING", "CHAR", "FLOAT", "NON_DIGIT", "VALID_CHAR", "NONZERO_DIGIT", "DIGIT", "WS", "COMMENT", "'('", "')'", "'{'", "'}'", "';'", "'['", "']'", "'else'", "'while'", "'print'", "'println'", "'return'", "','", "'true'", "'false'"
    };
    public static final int OP=8;
    public static final int FLOAT=11;
    public static final int NON_DIGIT=12;
    public static final int CHAR=10;
    public static final int VALID_CHAR=13;
    public static final int DIGIT=15;
    public static final int INT=6;
    public static final int COMMENT=17;
    public static final int STRING=9;
    public static final int NONZERO_DIGIT=14;
    public static final int ID=4;
    public static final int WS=16;
    public static final int EOF=-1;
    public static final int TYPE=5;
    public static final int IF=7;

        public ulNoActionsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "ulNoActions.g"; }


    protected void mismatch (IntStream input, int ttype, BitSet follow)
            throws RecognitionException
    {
            throw new MismatchedTokenException(ttype, input);
    }
    public void recoverFromMismatchedSet (IntStream input,
                                          RecognitionException e,
                                          BitSet follow)
            throws RecognitionException
    {
            reportError(e);
            throw e;
    }



    // $ANTLR start program
    // ulNoActions.g:36:1: program : ( function )+ ;
    public final void program() throws RecognitionException {
        try {
            // ulNoActions.g:36:9: ( ( function )+ )
            // ulNoActions.g:36:11: ( function )+
            {
            // ulNoActions.g:36:11: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ulNoActions.g:36:11: function
            	    {
            	    pushFollow(FOLLOW_function_in_program29);
            	    function();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end program


    // $ANTLR start function
    // ulNoActions.g:39:1: function : functionDecl functionBody ;
    public final void function() throws RecognitionException {
        try {
            // ulNoActions.g:39:9: ( functionDecl functionBody )
            // ulNoActions.g:39:11: functionDecl functionBody
            {
            pushFollow(FOLLOW_functionDecl_in_function40);
            functionDecl();
            _fsp--;

            pushFollow(FOLLOW_functionBody_in_function42);
            functionBody();
            _fsp--;


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end function


    // $ANTLR start functionDecl
    // ulNoActions.g:42:1: functionDecl : compoundType identifier '(' formalParameters ')' ;
    public final void functionDecl() throws RecognitionException {
        try {
            // ulNoActions.g:42:13: ( compoundType identifier '(' formalParameters ')' )
            // ulNoActions.g:42:15: compoundType identifier '(' formalParameters ')'
            {
            pushFollow(FOLLOW_compoundType_in_functionDecl51);
            compoundType();
            _fsp--;

            pushFollow(FOLLOW_identifier_in_functionDecl53);
            identifier();
            _fsp--;

            match(input,18,FOLLOW_18_in_functionDecl55); 
            pushFollow(FOLLOW_formalParameters_in_functionDecl57);
            formalParameters();
            _fsp--;

            match(input,19,FOLLOW_19_in_functionDecl59); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end functionDecl


    // $ANTLR start formalParameters
    // ulNoActions.g:45:1: formalParameters : ( compoundType identifier | );
    public final void formalParameters() throws RecognitionException {
        try {
            // ulNoActions.g:45:17: ( compoundType identifier | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45:1: formalParameters : ( compoundType identifier | );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ulNoActions.g:45:19: compoundType identifier
                    {
                    pushFollow(FOLLOW_compoundType_in_formalParameters68);
                    compoundType();
                    _fsp--;

                    pushFollow(FOLLOW_identifier_in_formalParameters70);
                    identifier();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ulNoActions.g:47:5: 
                    {
                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end formalParameters


    // $ANTLR start functionBody
    // ulNoActions.g:49:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
    public final void functionBody() throws RecognitionException {
        try {
            // ulNoActions.g:49:13: ( '{' ( varDecl )* ( statement )* '}' )
            // ulNoActions.g:49:15: '{' ( varDecl )* ( statement )* '}'
            {
            match(input,20,FOLLOW_20_in_functionBody88); 
            // ulNoActions.g:49:19: ( varDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TYPE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ulNoActions.g:49:19: varDecl
            	    {
            	    pushFollow(FOLLOW_varDecl_in_functionBody90);
            	    varDecl();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ulNoActions.g:49:28: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||(LA4_0>=INT && LA4_0<=IF)||(LA4_0>=STRING && LA4_0<=FLOAT)||LA4_0==18||LA4_0==22||(LA4_0>=26 && LA4_0<=29)||(LA4_0>=31 && LA4_0<=32)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:49:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody93);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_functionBody96); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end functionBody


    // $ANTLR start varDecl
    // ulNoActions.g:52:1: varDecl : compoundType identifier ';' ;
    public final void varDecl() throws RecognitionException {
        try {
            // ulNoActions.g:52:8: ( compoundType identifier ';' )
            // ulNoActions.g:52:10: compoundType identifier ';'
            {
            pushFollow(FOLLOW_compoundType_in_varDecl105);
            compoundType();
            _fsp--;

            pushFollow(FOLLOW_identifier_in_varDecl107);
            identifier();
            _fsp--;

            match(input,22,FOLLOW_22_in_varDecl109); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end varDecl


    // $ANTLR start identifier
    // ulNoActions.g:55:1: identifier : ID ;
    public final void identifier() throws RecognitionException {
        try {
            // ulNoActions.g:55:12: ( ID )
            // ulNoActions.g:55:14: ID
            {
            match(input,ID,FOLLOW_ID_in_identifier122); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end identifier


    // $ANTLR start compoundType
    // ulNoActions.g:58:1: compoundType : ( TYPE | TYPE '[' INT ']' );
    public final void compoundType() throws RecognitionException {
        try {
            // ulNoActions.g:58:13: ( TYPE | TYPE '[' INT ']' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TYPE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=2;
                }
                else if ( (LA5_1==ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("58:1: compoundType : ( TYPE | TYPE '[' INT ']' );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("58:1: compoundType : ( TYPE | TYPE '[' INT ']' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ulNoActions.g:58:15: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType131); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:59:15: TYPE '[' INT ']'
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType147); 
                    match(input,23,FOLLOW_23_in_compoundType149); 
                    match(input,INT,FOLLOW_INT_in_compoundType150); 
                    match(input,24,FOLLOW_24_in_compoundType151); 

                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end compoundType


    // $ANTLR start statement
    // ulNoActions.g:62:1: statement : ( ';' | expr ';' | IF '(' expr ')' block ( 'else' block )? | 'while' '(' expr ')' block | 'print' expr ';' | 'println' expr ';' | 'return' ( expr )? ';' );
    public final void statement() throws RecognitionException {
        try {
            // ulNoActions.g:62:10: ( ';' | expr ';' | IF '(' expr ')' block ( 'else' block )? | 'while' '(' expr ')' block | 'print' expr ';' | 'println' expr ';' | 'return' ( expr )? ';' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case ID:
            case INT:
            case STRING:
            case CHAR:
            case FLOAT:
            case 18:
            case 31:
            case 32:
                {
                alt8=2;
                }
                break;
            case IF:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("62:1: statement : ( ';' | expr ';' | IF '(' expr ')' block ( 'else' block )? | 'while' '(' expr ')' block | 'print' expr ';' | 'println' expr ';' | 'return' ( expr )? ';' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ulNoActions.g:62:13: ';'
                    {
                    match(input,22,FOLLOW_22_in_statement161); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:63:13: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement175);
                    expr();
                    _fsp--;

                    match(input,22,FOLLOW_22_in_statement177); 

                    }
                    break;
                case 3 :
                    // ulNoActions.g:64:13: IF '(' expr ')' block ( 'else' block )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement191); 
                    match(input,18,FOLLOW_18_in_statement193); 
                    pushFollow(FOLLOW_expr_in_statement195);
                    expr();
                    _fsp--;

                    match(input,19,FOLLOW_19_in_statement197); 
                    pushFollow(FOLLOW_block_in_statement199);
                    block();
                    _fsp--;

                    // ulNoActions.g:64:35: ( 'else' block )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==25) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ulNoActions.g:64:36: 'else' block
                            {
                            match(input,25,FOLLOW_25_in_statement202); 
                            pushFollow(FOLLOW_block_in_statement204);
                            block();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ulNoActions.g:65:12: 'while' '(' expr ')' block
                    {
                    match(input,26,FOLLOW_26_in_statement219); 
                    match(input,18,FOLLOW_18_in_statement221); 
                    pushFollow(FOLLOW_expr_in_statement223);
                    expr();
                    _fsp--;

                    match(input,19,FOLLOW_19_in_statement225); 
                    pushFollow(FOLLOW_block_in_statement227);
                    block();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // ulNoActions.g:66:12: 'print' expr ';'
                    {
                    match(input,27,FOLLOW_27_in_statement240); 
                    pushFollow(FOLLOW_expr_in_statement242);
                    expr();
                    _fsp--;

                    match(input,22,FOLLOW_22_in_statement244); 

                    }
                    break;
                case 6 :
                    // ulNoActions.g:67:12: 'println' expr ';'
                    {
                    match(input,28,FOLLOW_28_in_statement257); 
                    pushFollow(FOLLOW_expr_in_statement259);
                    expr();
                    _fsp--;

                    match(input,22,FOLLOW_22_in_statement261); 

                    }
                    break;
                case 7 :
                    // ulNoActions.g:68:12: 'return' ( expr )? ';'
                    {
                    match(input,29,FOLLOW_29_in_statement274); 
                    // ulNoActions.g:68:21: ( expr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID||LA7_0==INT||(LA7_0>=STRING && LA7_0<=FLOAT)||LA7_0==18||(LA7_0>=31 && LA7_0<=32)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ulNoActions.g:68:21: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement276);
                            expr();
                            _fsp--;


                            }
                            break;

                    }

                    match(input,22,FOLLOW_22_in_statement279); 

                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start block
    // ulNoActions.g:75:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // ulNoActions.g:75:6: ( '{' ( statement )* '}' )
            // ulNoActions.g:75:8: '{' ( statement )* '}'
            {
            match(input,20,FOLLOW_20_in_block307); 
            // ulNoActions.g:75:12: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||(LA9_0>=INT && LA9_0<=IF)||(LA9_0>=STRING && LA9_0<=FLOAT)||LA9_0==18||LA9_0==22||(LA9_0>=26 && LA9_0<=29)||(LA9_0>=31 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ulNoActions.g:75:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block309);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_block312); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end block


    // $ANTLR start expr
    // ulNoActions.g:89:1: expr : ( identifier '[' expr ']' exprPrime | identifier '(' exprList ')' exprPrime | identifier exprPrime | literal exprPrime | '(' expr ')' exprPrime );
    public final void expr() throws RecognitionException {
        try {
            // ulNoActions.g:89:5: ( identifier '[' expr ']' exprPrime | identifier '(' exprList ')' exprPrime | identifier exprPrime | literal exprPrime | '(' expr ')' exprPrime )
            int alt10=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt10=2;
                    }
                    break;
                case 23:
                    {
                    alt10=1;
                    }
                    break;
                case OP:
                case 19:
                case 22:
                case 24:
                case 30:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("89:1: expr : ( identifier '[' expr ']' exprPrime | identifier '(' exprList ')' exprPrime | identifier exprPrime | literal exprPrime | '(' expr ')' exprPrime );", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            case INT:
            case STRING:
            case CHAR:
            case FLOAT:
            case 31:
            case 32:
                {
                alt10=4;
                }
                break;
            case 18:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("89:1: expr : ( identifier '[' expr ']' exprPrime | identifier '(' exprList ')' exprPrime | identifier exprPrime | literal exprPrime | '(' expr ')' exprPrime );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ulNoActions.g:89:8: identifier '[' expr ']' exprPrime
                    {
                    pushFollow(FOLLOW_identifier_in_expr328);
                    identifier();
                    _fsp--;

                    match(input,23,FOLLOW_23_in_expr330); 
                    pushFollow(FOLLOW_expr_in_expr332);
                    expr();
                    _fsp--;

                    match(input,24,FOLLOW_24_in_expr334); 
                    pushFollow(FOLLOW_exprPrime_in_expr336);
                    exprPrime();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ulNoActions.g:90:8: identifier '(' exprList ')' exprPrime
                    {
                    pushFollow(FOLLOW_identifier_in_expr345);
                    identifier();
                    _fsp--;

                    match(input,18,FOLLOW_18_in_expr347); 
                    pushFollow(FOLLOW_exprList_in_expr349);
                    exprList();
                    _fsp--;

                    match(input,19,FOLLOW_19_in_expr351); 
                    pushFollow(FOLLOW_exprPrime_in_expr353);
                    exprPrime();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // ulNoActions.g:91:8: identifier exprPrime
                    {
                    pushFollow(FOLLOW_identifier_in_expr362);
                    identifier();
                    _fsp--;

                    pushFollow(FOLLOW_exprPrime_in_expr364);
                    exprPrime();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // ulNoActions.g:92:8: literal exprPrime
                    {
                    pushFollow(FOLLOW_literal_in_expr373);
                    literal();
                    _fsp--;

                    pushFollow(FOLLOW_exprPrime_in_expr375);
                    exprPrime();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // ulNoActions.g:93:8: '(' expr ')' exprPrime
                    {
                    match(input,18,FOLLOW_18_in_expr384); 
                    pushFollow(FOLLOW_expr_in_expr386);
                    expr();
                    _fsp--;

                    match(input,19,FOLLOW_19_in_expr388); 
                    pushFollow(FOLLOW_exprPrime_in_expr390);
                    exprPrime();
                    _fsp--;


                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end expr


    // $ANTLR start exprPrime
    // ulNoActions.g:96:1: exprPrime : ( OP expr exprPrime | );
    public final void exprPrime() throws RecognitionException {
        try {
            // ulNoActions.g:96:10: ( OP expr exprPrime | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OP) ) {
                alt11=1;
            }
            else if ( (LA11_0==19||LA11_0==22||LA11_0==24||LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("96:1: exprPrime : ( OP expr exprPrime | );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ulNoActions.g:96:12: OP expr exprPrime
                    {
                    match(input,OP,FOLLOW_OP_in_exprPrime403); 
                    pushFollow(FOLLOW_expr_in_exprPrime405);
                    expr();
                    _fsp--;

                    pushFollow(FOLLOW_exprPrime_in_exprPrime407);
                    exprPrime();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ulNoActions.g:98:12: 
                    {
                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end exprPrime


    // $ANTLR start exprList
    // ulNoActions.g:100:1: exprList : ( expr ( exprMore )* | );
    public final void exprList() throws RecognitionException {
        try {
            // ulNoActions.g:100:9: ( expr ( exprMore )* | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID||LA13_0==INT||(LA13_0>=STRING && LA13_0<=FLOAT)||LA13_0==18||(LA13_0>=31 && LA13_0<=32)) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("100:1: exprList : ( expr ( exprMore )* | );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ulNoActions.g:100:11: expr ( exprMore )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList439);
                    expr();
                    _fsp--;

                    // ulNoActions.g:100:16: ( exprMore )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ulNoActions.g:100:16: exprMore
                    	    {
                    	    pushFollow(FOLLOW_exprMore_in_exprList441);
                    	    exprMore();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ulNoActions.g:102:9: 
                    {
                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end exprList


    // $ANTLR start exprMore
    // ulNoActions.g:104:1: exprMore : ',' expr ;
    public final void exprMore() throws RecognitionException {
        try {
            // ulNoActions.g:104:9: ( ',' expr )
            // ulNoActions.g:104:11: ',' expr
            {
            match(input,30,FOLLOW_30_in_exprMore468); 
            pushFollow(FOLLOW_expr_in_exprMore470);
            expr();
            _fsp--;


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end exprMore


    // $ANTLR start literal
    // ulNoActions.g:106:1: literal : ( INT | STRING | CHAR | FLOAT | 'true' | 'false' );
    public final void literal() throws RecognitionException {
        try {
            // ulNoActions.g:106:9: ( INT | STRING | CHAR | FLOAT | 'true' | 'false' )
            // ulNoActions.g:
            {
            if ( input.LA(1)==INT||(input.LA(1)>=STRING && input.LA(1)<=FLOAT)||(input.LA(1)>=31 && input.LA(1)<=32) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_literal0);    throw mse;
            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


 

    public static final BitSet FOLLOW_function_in_program29 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_functionDecl_in_function40 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_functionBody_in_function42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_functionDecl51 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_functionDecl53 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_functionDecl55 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl57 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_functionDecl59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_formalParameters70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_functionBody88 = new BitSet(new long[]{0x00000001BC640EF0L});
    public static final BitSet FOLLOW_varDecl_in_functionBody90 = new BitSet(new long[]{0x00000001BC640EF0L});
    public static final BitSet FOLLOW_statement_in_functionBody93 = new BitSet(new long[]{0x00000001BC640ED0L});
    public static final BitSet FOLLOW_21_in_functionBody96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDecl105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_varDecl107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_varDecl109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType147 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_compoundType149 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_compoundType150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_compoundType151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement175 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement191 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement193 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_statement195 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_statement197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_statement199 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_statement202 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_statement204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement219 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement221 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_statement223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_statement225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_statement240 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_statement242 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_statement257 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_statement259 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_statement274 = new BitSet(new long[]{0x0000000180440E50L});
    public static final BitSet FOLLOW_expr_in_statement276 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_block307 = new BitSet(new long[]{0x00000001BC640ED0L});
    public static final BitSet FOLLOW_statement_in_block309 = new BitSet(new long[]{0x00000001BC640ED0L});
    public static final BitSet FOLLOW_21_in_block312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr328 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_expr330 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_expr334 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_exprPrime_in_expr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr345 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr347 = new BitSet(new long[]{0x00000001800C0E50L});
    public static final BitSet FOLLOW_exprList_in_expr349 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_expr351 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_exprPrime_in_expr353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr362 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_exprPrime_in_expr364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr373 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_exprPrime_in_expr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expr384 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_expr388 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_exprPrime_in_expr390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_exprPrime403 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_exprPrime405 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_exprPrime_in_exprPrime407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList439 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_exprMore_in_exprList441 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_exprMore468 = new BitSet(new long[]{0x0000000180040E50L});
    public static final BitSet FOLLOW_expr_in_exprMore470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}