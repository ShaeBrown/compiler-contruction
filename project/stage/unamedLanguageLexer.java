// $ANTLR 3.0.1 unamedLanguage.g 2018-01-17 17:20:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class unamedLanguageLexer extends Lexer {
    public static final int FLOAT=10;
    public static final int NON_DIGIT=12;
    public static final int CHAR=9;
    public static final int INT=5;
    public static final int COMMENT=17;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T27=27;
    public static final int ELSE=7;
    public static final int T26=26;
    public static final int T29=29;
    public static final int ID=11;
    public static final int T28=28;
    public static final int WS=16;
    public static final int EOF=-1;
    public static final int TYPE=4;
    public static final int IF=6;
    public static final int Tokens=38;
    public static final int VALID_CHAR=13;
    public static final int DIGIT=15;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int STRING=8;
    public static final int T37=37;
    public static final int NONZERO_DIGIT=14;
    public static final int T18=18;
    public static final int T19=19;
    public unamedLanguageLexer() {;} 
    public unamedLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "unamedLanguage.g"; }

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // unamedLanguage.g:3:5: ( '(' )
            // unamedLanguage.g:3:7: '('
            {
            match('('); 

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
            // unamedLanguage.g:4:5: ( ')' )
            // unamedLanguage.g:4:7: ')'
            {
            match(')'); 

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
            // unamedLanguage.g:5:5: ( ',' )
            // unamedLanguage.g:5:7: ','
            {
            match(','); 

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
            // unamedLanguage.g:6:5: ( '{' )
            // unamedLanguage.g:6:7: '{'
            {
            match('{'); 

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
            // unamedLanguage.g:7:5: ( '}' )
            // unamedLanguage.g:7:7: '}'
            {
            match('}'); 

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
            // unamedLanguage.g:8:5: ( ';' )
            // unamedLanguage.g:8:7: ';'
            {
            match(';'); 

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
            // unamedLanguage.g:9:5: ( '[' )
            // unamedLanguage.g:9:7: '['
            {
            match('['); 

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
            // unamedLanguage.g:10:5: ( ']' )
            // unamedLanguage.g:10:7: ']'
            {
            match(']'); 

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
            // unamedLanguage.g:11:5: ( 'while' )
            // unamedLanguage.g:11:7: 'while'
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
            // unamedLanguage.g:12:5: ( 'print' )
            // unamedLanguage.g:12:7: 'print'
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
            // unamedLanguage.g:13:5: ( 'println' )
            // unamedLanguage.g:13:7: 'println'
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
            // unamedLanguage.g:14:5: ( 'return' )
            // unamedLanguage.g:14:7: 'return'
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
            // unamedLanguage.g:15:5: ( '=' )
            // unamedLanguage.g:15:7: '='
            {
            match('='); 

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
            // unamedLanguage.g:16:5: ( '==' )
            // unamedLanguage.g:16:7: '=='
            {
            match("=="); 


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
            // unamedLanguage.g:17:5: ( '<' )
            // unamedLanguage.g:17:7: '<'
            {
            match('<'); 

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
            // unamedLanguage.g:18:5: ( '+' )
            // unamedLanguage.g:18:7: '+'
            {
            match('+'); 

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
            // unamedLanguage.g:19:5: ( '-' )
            // unamedLanguage.g:19:7: '-'
            {
            match('-'); 

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
            // unamedLanguage.g:20:5: ( '*' )
            // unamedLanguage.g:20:7: '*'
            {
            match('*'); 

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
            // unamedLanguage.g:21:5: ( 'true' )
            // unamedLanguage.g:21:7: 'true'
            {
            match("true"); 


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
            // unamedLanguage.g:22:5: ( 'false' )
            // unamedLanguage.g:22:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // unamedLanguage.g:158:4: ( 'if' )
            // unamedLanguage.g:158:6: 'if'
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
            // unamedLanguage.g:161:6: ( 'else' )
            // unamedLanguage.g:161:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // unamedLanguage.g:164:5: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            case 's':
                {
                alt1=4;
                }
                break;
            case 'b':
                {
                alt1=5;
                }
                break;
            case 'v':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("164:1: TYPE : ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // unamedLanguage.g:164:7: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // unamedLanguage.g:164:16: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // unamedLanguage.g:164:26: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 4 :
                    // unamedLanguage.g:164:35: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 5 :
                    // unamedLanguage.g:164:46: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 6 :
                    // unamedLanguage.g:164:58: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // unamedLanguage.g:167:4: ( NON_DIGIT ( VALID_CHAR )* )
            // unamedLanguage.g:167:6: NON_DIGIT ( VALID_CHAR )*
            {
            mNON_DIGIT(); 
            // unamedLanguage.g:167:16: ( VALID_CHAR )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // unamedLanguage.g:167:16: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // unamedLanguage.g:170:5: ( NONZERO_DIGIT ( DIGIT )+ | DIGIT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='9')) ) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("170:1: INT : ( NONZERO_DIGIT ( DIGIT )+ | DIGIT );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // unamedLanguage.g:170:7: NONZERO_DIGIT ( DIGIT )+
                    {
                    mNONZERO_DIGIT(); 
                    // unamedLanguage.g:170:21: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // unamedLanguage.g:170:21: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // unamedLanguage.g:171:7: DIGIT
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
            // unamedLanguage.g:174:8: ( '\"' ( VALID_CHAR | ' ' )* '\"' )
            // unamedLanguage.g:174:10: '\"' ( VALID_CHAR | ' ' )* '\"'
            {
            match('\"'); 
            // unamedLanguage.g:174:13: ( VALID_CHAR | ' ' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }
                else if ( (LA5_0==' ') ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // unamedLanguage.g:174:14: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // unamedLanguage.g:174:25: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // unamedLanguage.g:177:5: ( '\\'' ( VALID_CHAR | ' ' ) '\\'' )
            // unamedLanguage.g:177:7: '\\'' ( VALID_CHAR | ' ' ) '\\''
            {
            match('\''); 
            // unamedLanguage.g:177:11: ( VALID_CHAR | ' ' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                alt6=1;
            }
            else if ( (LA6_0==' ') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("177:11: ( VALID_CHAR | ' ' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // unamedLanguage.g:177:12: VALID_CHAR
                    {
                    mVALID_CHAR(); 

                    }
                    break;
                case 2 :
                    // unamedLanguage.g:177:23: ' '
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
            // unamedLanguage.g:180:6: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // unamedLanguage.g:180:8: ( DIGIT )+ '.' ( DIGIT )+
            {
            // unamedLanguage.g:180:8: ( DIGIT )+
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
            	    // unamedLanguage.g:180:8: DIGIT
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

            match('.'); 
            // unamedLanguage.g:180:19: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // unamedLanguage.g:180:19: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // unamedLanguage.g:183:15: ( ( '0' .. '9' ) )
            // unamedLanguage.g:183:17: ( '0' .. '9' )
            {
            // unamedLanguage.g:183:17: ( '0' .. '9' )
            // unamedLanguage.g:183:18: '0' .. '9'
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
            // unamedLanguage.g:184:23: ( ( '1' .. '9' ) )
            // unamedLanguage.g:184:25: ( '1' .. '9' )
            {
            // unamedLanguage.g:184:25: ( '1' .. '9' )
            // unamedLanguage.g:184:26: '1' .. '9'
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
            // unamedLanguage.g:185:19: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' )
            int alt9=3;
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
                alt9=1;
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
                alt9=2;
                }
                break;
            case '_':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("185:10: fragment NON_DIGIT : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // unamedLanguage.g:185:21: ( 'a' .. 'z' )
                    {
                    // unamedLanguage.g:185:21: ( 'a' .. 'z' )
                    // unamedLanguage.g:185:22: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // unamedLanguage.g:185:32: ( 'A' .. 'Z' )
                    {
                    // unamedLanguage.g:185:32: ( 'A' .. 'Z' )
                    // unamedLanguage.g:185:33: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 3 :
                    // unamedLanguage.g:185:43: '_'
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
            // unamedLanguage.g:186:20: ( NON_DIGIT | DIGIT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                alt10=1;
            }
            else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("186:10: fragment VALID_CHAR : ( NON_DIGIT | DIGIT );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // unamedLanguage.g:186:22: NON_DIGIT
                    {
                    mNON_DIGIT(); 

                    }
                    break;
                case 2 :
                    // unamedLanguage.g:186:32: DIGIT
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
            // unamedLanguage.g:193:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // unamedLanguage.g:193:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // unamedLanguage.g:193:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // unamedLanguage.g:196:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
            // unamedLanguage.g:196:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
            {
            match("//"); 

            // unamedLanguage.g:196:16: (~ ( '\\r' | '\\n' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // unamedLanguage.g:196:16: ~ ( '\\r' | '\\n' )
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
            	    break loop12;
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
        // unamedLanguage.g:1:8: ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | IF | ELSE | TYPE | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT )
        int alt13=30;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // unamedLanguage.g:1:10: T18
                {
                mT18(); 

                }
                break;
            case 2 :
                // unamedLanguage.g:1:14: T19
                {
                mT19(); 

                }
                break;
            case 3 :
                // unamedLanguage.g:1:18: T20
                {
                mT20(); 

                }
                break;
            case 4 :
                // unamedLanguage.g:1:22: T21
                {
                mT21(); 

                }
                break;
            case 5 :
                // unamedLanguage.g:1:26: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // unamedLanguage.g:1:30: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // unamedLanguage.g:1:34: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // unamedLanguage.g:1:38: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // unamedLanguage.g:1:42: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // unamedLanguage.g:1:46: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // unamedLanguage.g:1:50: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // unamedLanguage.g:1:54: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // unamedLanguage.g:1:58: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // unamedLanguage.g:1:62: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // unamedLanguage.g:1:66: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // unamedLanguage.g:1:70: T33
                {
                mT33(); 

                }
                break;
            case 17 :
                // unamedLanguage.g:1:74: T34
                {
                mT34(); 

                }
                break;
            case 18 :
                // unamedLanguage.g:1:78: T35
                {
                mT35(); 

                }
                break;
            case 19 :
                // unamedLanguage.g:1:82: T36
                {
                mT36(); 

                }
                break;
            case 20 :
                // unamedLanguage.g:1:86: T37
                {
                mT37(); 

                }
                break;
            case 21 :
                // unamedLanguage.g:1:90: IF
                {
                mIF(); 

                }
                break;
            case 22 :
                // unamedLanguage.g:1:93: ELSE
                {
                mELSE(); 

                }
                break;
            case 23 :
                // unamedLanguage.g:1:98: TYPE
                {
                mTYPE(); 

                }
                break;
            case 24 :
                // unamedLanguage.g:1:103: ID
                {
                mID(); 

                }
                break;
            case 25 :
                // unamedLanguage.g:1:106: INT
                {
                mINT(); 

                }
                break;
            case 26 :
                // unamedLanguage.g:1:110: STRING
                {
                mSTRING(); 

                }
                break;
            case 27 :
                // unamedLanguage.g:1:117: CHAR
                {
                mCHAR(); 

                }
                break;
            case 28 :
                // unamedLanguage.g:1:122: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 29 :
                // unamedLanguage.g:1:128: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // unamedLanguage.g:1:131: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\11\uffff\3\31\1\44\4\uffff\10\31\1\uffff\2\57\4\uffff\3\31\2\uffff"+
        "\3\31\1\70\6\31\2\uffff\1\57\6\31\1\uffff\1\105\10\31\1\116\2\31"+
        "\1\uffff\1\121\1\105\2\31\1\105\1\124\1\126\1\31\1\uffff\1\130\1"+
        "\105\1\uffff\2\31\1\uffff\1\31\1\uffff\1\134\1\uffff\1\105\1\31"+
        "\1\136\1\uffff\1\105\1\uffff";
    static final String DFA13_eofS =
        "\137\uffff";
    static final String DFA13_minS =
        "\1\11\10\uffff\1\150\1\162\1\145\1\75\4\uffff\1\162\1\141\1\146"+
        "\1\154\1\150\1\164\2\157\1\uffff\2\56\4\uffff\2\151\1\164\2\uffff"+
        "\1\165\1\154\1\157\1\60\1\164\1\163\1\141\1\162\1\157\1\151\2\uffff"+
        "\1\56\1\154\1\156\1\165\1\145\1\163\1\141\1\uffff\1\60\1\145\1\162"+
        "\1\151\1\154\1\144\1\145\1\164\1\162\1\60\1\145\1\164\1\uffff\2"+
        "\60\1\156\1\145\3\60\1\156\1\uffff\2\60\1\uffff\1\147\1\141\1\uffff"+
        "\1\156\1\uffff\1\60\1\uffff\1\60\1\156\1\60\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\175\10\uffff\1\150\1\162\1\145\1\75\4\uffff\1\162\1\154\1\156"+
        "\1\154\1\150\1\164\2\157\1\uffff\2\71\4\uffff\2\151\1\164\2\uffff"+
        "\1\165\1\154\1\157\1\172\1\164\1\163\1\141\1\162\1\157\1\151\2\uffff"+
        "\1\71\1\154\1\156\1\165\1\145\1\163\1\141\1\uffff\1\172\1\145\1"+
        "\162\1\151\1\154\1\144\1\145\1\164\1\162\1\172\1\145\1\164\1\uffff"+
        "\2\172\1\156\1\145\3\172\1\156\1\uffff\2\172\1\uffff\1\147\1\141"+
        "\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172\1\156\1\172\1\uffff\1"+
        "\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\17\1\20\1\21"+
        "\1\22\10\uffff\1\30\2\uffff\1\32\1\33\1\35\1\36\3\uffff\1\16\1\15"+
        "\12\uffff\1\31\1\34\7\uffff\1\25\14\uffff\1\27\10\uffff\1\23\2\uffff"+
        "\1\26\2\uffff\1\11\1\uffff\1\12\1\uffff\1\24\3\uffff\1\14\1\uffff"+
        "\1\13";
    static final String DFA13_specialS =
        "\137\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\34\4\uffff\1\35\1"+
            "\1\1\2\1\20\1\16\1\3\1\17\1\uffff\1\37\1\33\11\32\1\uffff\1"+
            "\6\1\15\1\14\3\uffff\32\31\1\7\1\uffff\1\10\1\uffff\1\31\1\uffff"+
            "\1\31\1\27\1\25\1\31\1\24\1\22\2\31\1\23\6\31\1\12\1\31\1\13"+
            "\1\26\1\21\1\31\1\30\1\11\3\31\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46\12\uffff\1\47",
            "\1\50\7\uffff\1\51",
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
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\71",
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
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
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
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\122",
            "\1\123",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\125\16\31",
            "\1\127",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\135",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | IF | ELSE | TYPE | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT );";
        }
    }
 

}