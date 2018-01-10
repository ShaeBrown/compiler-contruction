// $ANTLR 3.0.1 ulNoActions.g 2018-01-09 18:09:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsLexer extends Lexer {
    public static final int FLOAT=11;
    public static final int NON_DIGIT=12;
    public static final int CHAR=10;
    public static final int INT=6;
    public static final int COMMENT=17;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T29=29;
    public static final int ID=4;
    public static final int T28=28;
    public static final int WS=16;
    public static final int EOF=-1;
    public static final int TYPE=5;
    public static final int IF=7;
    public static final int Tokens=33;
    public static final int OP=8;
    public static final int VALID_CHAR=13;
    public static final int DIGIT=15;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int STRING=9;
    public static final int NONZERO_DIGIT=14;
    public static final int T18=18;
    public static final int T19=19;
    public ulNoActionsLexer() {;} 
    public ulNoActionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ulNoActions.g"; }

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ulNoActions.g:3:5: ( '(' )
            // ulNoActions.g:3:7: '('
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
            // ulNoActions.g:4:5: ( ')' )
            // ulNoActions.g:4:7: ')'
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
            // ulNoActions.g:5:5: ( '{' )
            // ulNoActions.g:5:7: '{'
            {
            match('{'); 

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
            // ulNoActions.g:6:5: ( '}' )
            // ulNoActions.g:6:7: '}'
            {
            match('}'); 

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
            // ulNoActions.g:7:5: ( ';' )
            // ulNoActions.g:7:7: ';'
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
            // ulNoActions.g:8:5: ( '[' )
            // ulNoActions.g:8:7: '['
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
            // ulNoActions.g:9:5: ( ']' )
            // ulNoActions.g:9:7: ']'
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
            // ulNoActions.g:10:5: ( 'else' )
            // ulNoActions.g:10:7: 'else'
            {
            match("else"); 


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
            // ulNoActions.g:11:5: ( 'while' )
            // ulNoActions.g:11:7: 'while'
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
            // ulNoActions.g:12:5: ( 'print' )
            // ulNoActions.g:12:7: 'print'
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
            // ulNoActions.g:13:5: ( 'println' )
            // ulNoActions.g:13:7: 'println'
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
            // ulNoActions.g:14:5: ( 'return' )
            // ulNoActions.g:14:7: 'return'
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
            // ulNoActions.g:15:5: ( ',' )
            // ulNoActions.g:15:7: ','
            {
            match(','); 

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
            // ulNoActions.g:16:5: ( 'true' )
            // ulNoActions.g:16:7: 'true'
            {
            match("true"); 


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
            // ulNoActions.g:17:5: ( 'false' )
            // ulNoActions.g:17:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // ulNoActions.g:111:4: ( 'if' )
            // ulNoActions.g:111:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // ulNoActions.g:114:5: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
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
                    new NoViableAltException("114:1: TYPE : ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ulNoActions.g:114:7: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // ulNoActions.g:114:16: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // ulNoActions.g:114:26: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 4 :
                    // ulNoActions.g:114:35: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 5 :
                    // ulNoActions.g:114:46: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 6 :
                    // ulNoActions.g:114:58: 'void'
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

    // $ANTLR start OP
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            // ulNoActions.g:117:5: ( '==' | '<' | '+' | '-' | '*' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                alt2=2;
                }
                break;
            case '+':
                {
                alt2=3;
                }
                break;
            case '-':
                {
                alt2=4;
                }
                break;
            case '*':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("117:1: OP : ( '==' | '<' | '+' | '-' | '*' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ulNoActions.g:117:7: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // ulNoActions.g:117:14: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // ulNoActions.g:117:20: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 4 :
                    // ulNoActions.g:117:26: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 5 :
                    // ulNoActions.g:117:32: '*'
                    {
                    match('*'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OP

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // ulNoActions.g:120:4: ( NON_DIGIT ( VALID_CHAR )* )
            // ulNoActions.g:120:6: NON_DIGIT ( VALID_CHAR )*
            {
            mNON_DIGIT(); 
            // ulNoActions.g:120:16: ( VALID_CHAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ulNoActions.g:120:16: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // ulNoActions.g:123:5: ( NONZERO_DIGIT ( DIGIT )* )
            // ulNoActions.g:123:7: NONZERO_DIGIT ( DIGIT )*
            {
            mNONZERO_DIGIT(); 
            // ulNoActions.g:123:21: ( DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:123:21: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
            // ulNoActions.g:126:8: ( '\"' ( VALID_CHAR | ' ' )* '\"' )
            // ulNoActions.g:126:10: '\"' ( VALID_CHAR | ' ' )* '\"'
            {
            match('\"'); 
            // ulNoActions.g:126:13: ( VALID_CHAR | ' ' )*
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
            	    // ulNoActions.g:126:14: VALID_CHAR
            	    {
            	    mVALID_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // ulNoActions.g:126:25: ' '
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
            // ulNoActions.g:129:5: ( '\\'' ( VALID_CHAR | ' ' ) '\\'' )
            // ulNoActions.g:129:7: '\\'' ( VALID_CHAR | ' ' ) '\\''
            {
            match('\''); 
            // ulNoActions.g:129:11: ( VALID_CHAR | ' ' )
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
                    new NoViableAltException("129:11: ( VALID_CHAR | ' ' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ulNoActions.g:129:12: VALID_CHAR
                    {
                    mVALID_CHAR(); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:129:23: ' '
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
            // ulNoActions.g:132:6: ( NONZERO_DIGIT ( DIGIT )* '.' ( DIGIT )* )
            // ulNoActions.g:132:8: NONZERO_DIGIT ( DIGIT )* '.' ( DIGIT )*
            {
            mNONZERO_DIGIT(); 
            // ulNoActions.g:132:22: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ulNoActions.g:132:22: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // ulNoActions.g:132:33: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ulNoActions.g:132:33: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
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
            // ulNoActions.g:135:15: ( ( '0' .. '9' ) )
            // ulNoActions.g:135:17: ( '0' .. '9' )
            {
            // ulNoActions.g:135:17: ( '0' .. '9' )
            // ulNoActions.g:135:18: '0' .. '9'
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
            // ulNoActions.g:136:23: ( ( '1' .. '9' ) )
            // ulNoActions.g:136:25: ( '1' .. '9' )
            {
            // ulNoActions.g:136:25: ( '1' .. '9' )
            // ulNoActions.g:136:26: '1' .. '9'
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
            // ulNoActions.g:137:19: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' )
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
                    new NoViableAltException("137:10: fragment NON_DIGIT : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ulNoActions.g:137:21: ( 'a' .. 'z' )
                    {
                    // ulNoActions.g:137:21: ( 'a' .. 'z' )
                    // ulNoActions.g:137:22: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // ulNoActions.g:137:32: ( 'A' .. 'Z' )
                    {
                    // ulNoActions.g:137:32: ( 'A' .. 'Z' )
                    // ulNoActions.g:137:33: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 3 :
                    // ulNoActions.g:137:43: '_'
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
            // ulNoActions.g:138:20: ( NON_DIGIT | DIGIT )
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
                    new NoViableAltException("138:10: fragment VALID_CHAR : ( NON_DIGIT | DIGIT );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ulNoActions.g:138:22: NON_DIGIT
                    {
                    mNON_DIGIT(); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:138:32: DIGIT
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
            // ulNoActions.g:145:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // ulNoActions.g:145:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // ulNoActions.g:145:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
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
            	    // ulNoActions.g:
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
            // ulNoActions.g:148:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
            // ulNoActions.g:148:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
            {
            match("//"); 

            // ulNoActions.g:148:16: (~ ( '\\r' | '\\n' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ulNoActions.g:148:16: ~ ( '\\r' | '\\n' )
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
        // ulNoActions.g:1:8: ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | IF | TYPE | OP | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT )
        int alt13=25;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ulNoActions.g:1:10: T18
                {
                mT18(); 

                }
                break;
            case 2 :
                // ulNoActions.g:1:14: T19
                {
                mT19(); 

                }
                break;
            case 3 :
                // ulNoActions.g:1:18: T20
                {
                mT20(); 

                }
                break;
            case 4 :
                // ulNoActions.g:1:22: T21
                {
                mT21(); 

                }
                break;
            case 5 :
                // ulNoActions.g:1:26: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // ulNoActions.g:1:30: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // ulNoActions.g:1:34: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // ulNoActions.g:1:38: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // ulNoActions.g:1:42: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // ulNoActions.g:1:46: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // ulNoActions.g:1:50: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // ulNoActions.g:1:54: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // ulNoActions.g:1:58: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // ulNoActions.g:1:62: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // ulNoActions.g:1:66: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // ulNoActions.g:1:70: IF
                {
                mIF(); 

                }
                break;
            case 17 :
                // ulNoActions.g:1:73: TYPE
                {
                mTYPE(); 

                }
                break;
            case 18 :
                // ulNoActions.g:1:78: OP
                {
                mOP(); 

                }
                break;
            case 19 :
                // ulNoActions.g:1:81: ID
                {
                mID(); 

                }
                break;
            case 20 :
                // ulNoActions.g:1:84: INT
                {
                mINT(); 

                }
                break;
            case 21 :
                // ulNoActions.g:1:88: STRING
                {
                mSTRING(); 

                }
                break;
            case 22 :
                // ulNoActions.g:1:95: CHAR
                {
                mCHAR(); 

                }
                break;
            case 23 :
                // ulNoActions.g:1:100: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 24 :
                // ulNoActions.g:1:106: WS
                {
                mWS(); 

                }
                break;
            case 25 :
                // ulNoActions.g:1:109: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\10\uffff\4\25\1\uffff\7\25\2\uffff\1\50\4\uffff\7\25\1\62\5\25"+
        "\1\uffff\1\50\1\uffff\7\25\1\uffff\1\77\4\25\1\104\3\25\1\110\2"+
        "\25\1\uffff\1\77\2\25\1\77\1\uffff\1\115\1\117\1\25\1\uffff\1\121"+
        "\1\77\2\25\1\uffff\1\25\1\uffff\1\125\1\uffff\1\77\1\25\1\127\1"+
        "\uffff\1\77\1\uffff";
    static final String DFA13_eofS =
        "\130\uffff";
    static final String DFA13_minS =
        "\1\11\7\uffff\1\154\1\150\1\162\1\145\1\uffff\1\162\1\141\1\146"+
        "\1\150\1\164\2\157\2\uffff\1\56\4\uffff\1\163\2\151\1\164\1\165"+
        "\1\154\1\157\1\60\1\164\1\141\1\162\1\157\1\151\1\uffff\1\56\1\uffff"+
        "\1\145\1\154\1\156\1\165\1\145\1\163\1\141\1\uffff\1\60\1\162\1"+
        "\151\1\154\1\144\1\60\1\145\1\164\1\162\1\60\1\145\1\164\1\uffff"+
        "\1\60\1\156\1\145\1\60\1\uffff\2\60\1\156\1\uffff\2\60\1\147\1\141"+
        "\1\uffff\1\156\1\uffff\1\60\1\uffff\1\60\1\156\1\60\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA13_maxS =
        "\1\175\7\uffff\1\154\1\150\1\162\1\145\1\uffff\1\162\1\154\1\156"+
        "\1\150\1\164\2\157\2\uffff\1\71\4\uffff\1\163\2\151\1\164\1\165"+
        "\1\154\1\157\1\172\1\164\1\141\1\162\1\157\1\151\1\uffff\1\71\1"+
        "\uffff\1\145\1\154\1\156\1\165\1\145\1\163\1\141\1\uffff\1\172\1"+
        "\162\1\151\1\154\1\144\1\172\1\145\1\164\1\162\1\172\1\145\1\164"+
        "\1\uffff\1\172\1\156\1\145\1\172\1\uffff\2\172\1\156\1\uffff\2\172"+
        "\1\147\1\141\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172\1\156\1\172"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff\1\15\7\uffff\1\22\1"+
        "\23\1\uffff\1\25\1\26\1\30\1\31\15\uffff\1\24\1\uffff\1\27\7\uffff"+
        "\1\20\14\uffff\1\21\4\uffff\1\10\3\uffff\1\16\4\uffff\1\11\1\uffff"+
        "\1\12\1\uffff\1\17\3\uffff\1\14\1\uffff\1\13";
    static final String DFA13_specialS =
        "\130\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\27\4\uffff\1\30\1"+
            "\1\1\2\2\24\1\14\1\24\1\uffff\1\32\1\uffff\11\26\1\uffff\1\5"+
            "\2\24\3\uffff\32\25\1\6\1\uffff\1\7\1\uffff\1\25\1\uffff\1\25"+
            "\1\22\1\20\1\25\1\10\1\16\2\25\1\17\6\25\1\12\1\25\1\13\1\21"+
            "\1\15\1\25\1\23\1\11\3\25\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "\1\40\12\uffff\1\41",
            "\1\42\7\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\52\1\uffff\12\51",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\52\1\uffff\12\51",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\111",
            "\1\112",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\113",
            "\1\114",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\116\16\25",
            "\1\120",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\126",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            return "1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | IF | TYPE | OP | ID | INT | STRING | CHAR | FLOAT | WS | COMMENT );";
        }
    }
 

}