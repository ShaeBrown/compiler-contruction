// $ANTLR 3.0.1 unamedLanguage.g 2018-02-21 18:40:24

    import ASTNodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class unamedLanguageLexer extends Lexer {
    public static final int NON_DIGIT=11;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T27=27;
    public static final int ELSE=6;
    public static final int T26=26;
    public static final int T29=29;
    public static final int ID=10;
    public static final int T28=28;
    public static final int IF=5;
    public static final int Tokens=43;
    public static final int VALID_CHAR=12;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int FLOAT=9;
    public static final int CHAR=8;
    public static final int INT=4;
    public static final int COMMENT=16;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T42=42;
    public static final int WS=15;
    public static final int EOF=-1;
    public static final int DIGIT=14;
    public static final int STRING=7;
    public static final int NONZERO_DIGIT=13;
    public static final int T18=18;
    public static final int T17=17;
    public static final int T19=19;
    public unamedLanguageLexer() {;} 
    public unamedLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "unamedLanguage.g"; }

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // unamedLanguage.g:6:5: ( '(' )
            // unamedLanguage.g:6:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // unamedLanguage.g:7:5: ( ')' )
            // unamedLanguage.g:7:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // unamedLanguage.g:8:5: ( '{' )
            // unamedLanguage.g:8:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // unamedLanguage.g:9:5: ( '}' )
            // unamedLanguage.g:9:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // unamedLanguage.g:10:5: ( ',' )
            // unamedLanguage.g:10:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // unamedLanguage.g:11:5: ( ';' )
            // unamedLanguage.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // unamedLanguage.g:12:5: ( '[' )
            // unamedLanguage.g:12:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // unamedLanguage.g:13:5: ( ']' )
            // unamedLanguage.g:13:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // unamedLanguage.g:14:5: ( '=' )
            // unamedLanguage.g:14:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // unamedLanguage.g:15:5: ( 'while' )
            // unamedLanguage.g:15:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // unamedLanguage.g:16:5: ( 'print' )
            // unamedLanguage.g:16:7: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // unamedLanguage.g:17:5: ( 'println' )
            // unamedLanguage.g:17:7: 'println'
            {
            match("println"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // unamedLanguage.g:18:5: ( 'return' )
            // unamedLanguage.g:18:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // unamedLanguage.g:19:5: ( '==' )
            // unamedLanguage.g:19:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // unamedLanguage.g:20:5: ( '<' )
            // unamedLanguage.g:20:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // unamedLanguage.g:21:5: ( '+' )
            // unamedLanguage.g:21:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // unamedLanguage.g:22:5: ( '-' )
            // unamedLanguage.g:22:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // unamedLanguage.g:23:5: ( '*' )
            // unamedLanguage.g:23:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // unamedLanguage.g:24:5: ( 'true' )
            // unamedLanguage.g:24:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // unamedLanguage.g:25:5: ( 'false' )
            // unamedLanguage.g:25:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // unamedLanguage.g:26:5: ( 'int' )
            // unamedLanguage.g:26:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // unamedLanguage.g:27:5: ( 'float' )
            // unamedLanguage.g:27:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // unamedLanguage.g:28:5: ( 'char' )
            // unamedLanguage.g:28:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // unamedLanguage.g:29:5: ( 'string' )
            // unamedLanguage.g:29:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // unamedLanguage.g:30:5: ( 'boolean' )
            // unamedLanguage.g:30:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // unamedLanguage.g:31:5: ( 'void' )
            // unamedLanguage.g:31:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // unamedLanguage.g:240:4: ( 'if' )
            // unamedLanguage.g:240:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // unamedLanguage.g:243:6: ( 'else' )
            // unamedLanguage.g:243:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // unamedLanguage.g:246:4: ( NON_DIGIT ( VALID_CHAR )* )
            // unamedLanguage.g:246:6: NON_DIGIT ( VALID_CHAR )*
            {
            mNON_DIGIT(); 
            // unamedLanguage.g:246:16: ( VALID_CHAR )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // unamedLanguage.g:246:16: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // unamedLanguage.g:249:5: ( NONZERO_DIGIT ( DIGIT )+ | DIGIT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='0' && LA3_1<='9')) ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
            }
            else if ( (LA3_0=='0') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("249:1: INT : ( NONZERO_DIGIT ( DIGIT )+ | DIGIT );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // unamedLanguage.g:249:7: NONZERO_DIGIT ( DIGIT )+
                    {
                    mNONZERO_DIGIT(); 
                    // unamedLanguage.g:249:21: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // unamedLanguage.g:249:21: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // unamedLanguage.g:250:7: DIGIT
                    {
                    mDIGIT(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // unamedLanguage.g:253:8: ( '\"' ( VALID_CHAR | ' ' )* '\"' )
            // unamedLanguage.g:253:10: '\"' ( VALID_CHAR | ' ' )* '\"'
            {
            match('\"'); 
            // unamedLanguage.g:253:13: ( VALID_CHAR | ' ' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }
                else if ( (LA4_0==' ') ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // unamedLanguage.g:253:14: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // unamedLanguage.g:253:25: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // unamedLanguage.g:256:5: ( '\\'' ( VALID_CHAR | ' ' ) '\\'' )
            // unamedLanguage.g:256:7: '\\'' ( VALID_CHAR | ' ' ) '\\''
            {
            match('\''); 
            // unamedLanguage.g:256:11: ( VALID_CHAR | ' ' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( (LA5_0==' ') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("256:11: ( VALID_CHAR | ' ' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // unamedLanguage.g:256:12: VALID_CHAR
                    {
                    mVALID_CHAR(); 

                    }
                    break;
                case 2 :
                    // unamedLanguage.g:256:23: ' '
                    {
                    match(' '); 

                    }
                    break;

            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // unamedLanguage.g:259:6: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // unamedLanguage.g:259:8: ( DIGIT )+ '.' ( DIGIT )+
            {
            // unamedLanguage.g:259:8: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // unamedLanguage.g:259:8: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // unamedLanguage.g:259:19: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // unamedLanguage.g:259:19: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // unamedLanguage.g:262:15: ( ( '0' .. '9' ) )
            // unamedLanguage.g:262:17: ( '0' .. '9' )
            {
            // unamedLanguage.g:262:17: ( '0' .. '9' )
            // unamedLanguage.g:262:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start NONZERO_DIGIT
    public final void mNONZERO_DIGIT() throws RecognitionException {
        try {
            // unamedLanguage.g:263:23: ( ( '1' .. '9' ) )
            // unamedLanguage.g:263:25: ( '1' .. '9' )
            {
            // unamedLanguage.g:263:25: ( '1' .. '9' )
            // unamedLanguage.g:263:26: '1' .. '9'
            {
            matchRange('1','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NONZERO_DIGIT

    // $ANTLR start NON_DIGIT
    public final void mNON_DIGIT() throws RecognitionException {
        try {
            // unamedLanguage.g:264:19: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt8=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt8=2;
                }
                break;
            case '_':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("264:10: fragment NON_DIGIT : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // unamedLanguage.g:264:21: ( 'a' .. 'z' )
                    {
                    // unamedLanguage.g:264:21: ( 'a' .. 'z' )
                    // unamedLanguage.g:264:22: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // unamedLanguage.g:264:32: ( 'A' .. 'Z' )
                    {
                    // unamedLanguage.g:264:32: ( 'A' .. 'Z' )
                    // unamedLanguage.g:264:33: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 3 :
                    // unamedLanguage.g:264:43: '_'
                    {
                    match('_'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end NON_DIGIT

    // $ANTLR start VALID_CHAR
    public final void mVALID_CHAR() throws RecognitionException {
        try {
            // unamedLanguage.g:265:20: ( NON_DIGIT | DIGIT )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("265:10: fragment VALID_CHAR : ( NON_DIGIT | DIGIT );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // unamedLanguage.g:265:22: NON_DIGIT
                    {
                    mNON_DIGIT(); 

                    }
                    break;
                case 2 :
                    // unamedLanguage.g:265:32: DIGIT
                    {
                    mDIGIT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end VALID_CHAR

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // unamedLanguage.g:272:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // unamedLanguage.g:272:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // unamedLanguage.g:272:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // unamedLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

             channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // unamedLanguage.g:275:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
            // unamedLanguage.g:275:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
            {
            match("//"); 

            // unamedLanguage.g:275:16: (~ ( '\\r' | '\\n' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // unamedLanguage.g:275:16: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // unamedLanguage.g:1:8: ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | IF | ELSE | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // unamedLanguage.g:1:10: T17
                {
                mT17(); 

                }
                break;
            case 2 :
                // unamedLanguage.g:1:14: T18
                {
                mT18(); 

                }
                break;
            case 3 :
                // unamedLanguage.g:1:18: T19
                {
                mT19(); 

                }
                break;
            case 4 :
                // unamedLanguage.g:1:22: T20
                {
                mT20(); 

                }
                break;
            case 5 :
                // unamedLanguage.g:1:26: T21
                {
                mT21(); 

                }
                break;
            case 6 :
                // unamedLanguage.g:1:30: T22
                {
                mT22(); 

                }
                break;
            case 7 :
                // unamedLanguage.g:1:34: T23
                {
                mT23(); 

                }
                break;
            case 8 :
                // unamedLanguage.g:1:38: T24
                {
                mT24(); 

                }
                break;
            case 9 :
                // unamedLanguage.g:1:42: T25
                {
                mT25(); 

                }
                break;
            case 10 :
                // unamedLanguage.g:1:46: T26
                {
                mT26(); 

                }
                break;
            case 11 :
                // unamedLanguage.g:1:50: T27
                {
                mT27(); 

                }
                break;
            case 12 :
                // unamedLanguage.g:1:54: T28
                {
                mT28(); 

                }
                break;
            case 13 :
                // unamedLanguage.g:1:58: T29
                {
                mT29(); 

                }
                break;
            case 14 :
                // unamedLanguage.g:1:62: T30
                {
                mT30(); 

                }
                break;
            case 15 :
                // unamedLanguage.g:1:66: T31
                {
                mT31(); 

                }
                break;
            case 16 :
                // unamedLanguage.g:1:70: T32
                {
                mT32(); 

                }
                break;
            case 17 :
                // unamedLanguage.g:1:74: T33
                {
                mT33(); 

                }
                break;
            case 18 :
                // unamedLanguage.g:1:78: T34
                {
                mT34(); 

                }
                break;
            case 19 :
                // unamedLanguage.g:1:82: T35
                {
                mT35(); 

                }
                break;
            case 20 :
                // unamedLanguage.g:1:86: T36
                {
                mT36(); 

                }
                break;
            case 21 :
                // unamedLanguage.g:1:90: T37
                {
                mT37(); 

                }
                break;
            case 22 :
                // unamedLanguage.g:1:94: T38
                {
                mT38(); 

                }
                break;
            case 23 :
                // unamedLanguage.g:1:98: T39
                {
                mT39(); 

                }
                break;
            case 24 :
                // unamedLanguage.g:1:102: T40
                {
                mT40(); 

                }
                break;
            case 25 :
                // unamedLanguage.g:1:106: T41
                {
                mT41(); 

                }
                break;
            case 26 :
                // unamedLanguage.g:1:110: T42
                {
                mT42(); 

                }
                break;
            case 27 :
                // unamedLanguage.g:1:114: IF
                {
                mIF(); 

                }
                break;
            case 28 :
                // unamedLanguage.g:1:117: ELSE
                {
                mELSE(); 

                }
                break;
            case 29 :
                // unamedLanguage.g:1:122: ID
                {
                mID(); 

                }
                break;
            case 30 :
                // unamedLanguage.g:1:125: INT
                {
                mINT(); 

                }
                break;
            case 31 :
                // unamedLanguage.g:1:129: STRING
                {
                mSTRING(); 

                }
                break;
            case 32 :
                // unamedLanguage.g:1:136: CHAR
                {
                mCHAR(); 

                }
                break;
            case 33 :
                // unamedLanguage.g:1:141: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 34 :
                // unamedLanguage.g:1:147: WS
                {
                mWS(); 

                }
                break;
            case 35 :
                // unamedLanguage.g:1:150: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\11\uffff\1\41\3\31\4\uffff\10\31\1\uffff\2\57\6\uffff\7\31\1\71"+
        "\5\31\2\uffff\1\57\6\31\1\105\1\uffff\10\31\1\116\2\31\1\uffff\1"+
        "\121\2\31\1\124\1\125\1\126\1\130\1\31\1\uffff\1\132\1\133\1\uffff"+
        "\2\31\3\uffff\1\31\1\uffff\1\137\2\uffff\1\140\1\31\1\142\2\uffff"+
        "\1\143\2\uffff";
    static final String DFA12_eofS =
        "\144\uffff";
    static final String DFA12_minS =
        "\1\11\10\uffff\1\75\1\150\1\162\1\145\4\uffff\1\162\1\141\1\146"+
        "\1\150\1\164\2\157\1\154\1\uffff\2\56\6\uffff\2\151\1\164\1\165"+
        "\1\154\1\157\1\164\1\60\1\141\1\162\1\157\1\151\1\163\2\uffff\1"+
        "\56\1\154\1\156\1\165\1\145\1\163\1\141\1\60\1\uffff\1\162\1\151"+
        "\1\154\1\144\2\145\1\164\1\162\1\60\1\145\1\164\1\uffff\1\60\1\156"+
        "\1\145\4\60\1\156\1\uffff\2\60\1\uffff\1\147\1\141\3\uffff\1\156"+
        "\1\uffff\1\60\2\uffff\1\60\1\156\1\60\2\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\175\10\uffff\1\75\1\150\1\162\1\145\4\uffff\1\162\1\154\1\156"+
        "\1\150\1\164\2\157\1\154\1\uffff\2\71\6\uffff\2\151\1\164\1\165"+
        "\1\154\1\157\1\164\1\172\1\141\1\162\1\157\1\151\1\163\2\uffff\1"+
        "\71\1\154\1\156\1\165\1\145\1\163\1\141\1\172\1\uffff\1\162\1\151"+
        "\1\154\1\144\2\145\1\164\1\162\1\172\1\145\1\164\1\uffff\1\172\1"+
        "\156\1\145\4\172\1\156\1\uffff\2\172\1\uffff\1\147\1\141\3\uffff"+
        "\1\156\1\uffff\1\172\2\uffff\1\172\1\156\1\172\2\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\17\1\20\1\21"+
        "\1\22\10\uffff\1\35\2\uffff\1\37\1\40\1\42\1\43\1\16\1\11\15\uffff"+
        "\1\36\1\41\10\uffff\1\33\13\uffff\1\25\10\uffff\1\23\2\uffff\1\27"+
        "\2\uffff\1\32\1\34\1\12\1\uffff\1\13\1\uffff\1\24\1\26\3\uffff\1"+
        "\15\1\30\1\uffff\1\14\1\31";
    static final String DFA12_specialS =
        "\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\34\4\uffff\1\35\1"+
            "\1\1\2\1\20\1\16\1\5\1\17\1\uffff\1\37\1\33\11\32\1\uffff\1"+
            "\6\1\15\1\11\3\uffff\32\31\1\7\1\uffff\1\10\1\uffff\1\31\1\uffff"+
            "\1\31\1\26\1\24\1\31\1\30\1\22\2\31\1\23\6\31\1\13\1\31\1\14"+
            "\1\25\1\21\1\31\1\27\1\12\3\31\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46\12\uffff\1\47",
            "\1\51\7\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\60\1\uffff\12\61",
            "\1\60\1\uffff\12\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "\1\60\1\uffff\12\61",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\117",
            "\1\120",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\122",
            "\1\123",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\127\16\31",
            "\1\131",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\1\136",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\141",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | IF | ELSE | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT );";
        }
    }
 

}