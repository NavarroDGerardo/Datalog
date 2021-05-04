grammar Datalog;

program
    : facts
    | facts? rules? query
    ;

fact
    : predicate OPEN literalList CLOSE DOT
    ;

literalList
    : literal ( COMA literal ) *
    ;

facts
    : fact+
    ;

rulen
    : atom RULENINIT atoms DOT
    ;

rules
    : rulen+
    ;

query
    : QUERYINIT atom RULENINIT atoms DOT
    ;

// Definition of atom (or goal) used in horn clauses (or rules)
atom: predicate otro
 	| NOT atom
 	;

otro: relOp variableOrLiterals
 	| OPEN variableOrLiterals CLOSE
    ;

atoms
    : atom ( COMA atom )*
    ;

// Types of things allowed within arguments of rules
variableOrLiteral
    : variable
    | literal
    | aggregateVariable
    ;

variableOrLiterals
    : variableOrLiteral (COMA variableOrLiteral)*
    ;

aggregateVariable
    : aggregateOp LT variable GT
    ;

relOp
	: LT
	| GT
	| ELT
	| EGT
	| EQ
	;

aggregateOp
    : COUNT
    | AVG
    | SUM
    | MIN
    | MAX
    ;

variable
    : Identifier
    ;

predicate
    : Predicate
    ;

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|   GUION
	;

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL] 
	;

fragment
DecimalNumeral
	:	ZERO
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	ZERO
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	GUION
	;

fragment
Underscores
	:	GUION+
	;

fragment
HexNumeral
	:	 ZERO [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	GUION
	;

fragment
OctalNumeral
	:	ZERO Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	GUION
	;

fragment
BinaryNumeral
	:	ZERO [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	GUION
	;

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits DOT Digits? ExponentPart? FloatTypeSuffix?
	|	DOT Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral DOT?
	|	ZERO [xX] HexDigits? DOT HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;

BooleanLiteral
	:	TRUE
	|	FALSE
	;

CharacterLiteral
	:	ESCAPECHAR SingleCharacter ESCAPECHAR
	|	ESCAPECHAR EscapeSequence ESCAPECHAR
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;

StringLiteral
	:	COMILLA StringCharacters? COMILLA
	;
fragment
StringCharacters
	:	StringCharacter+
	;
fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;


fragment
EscapeSequence
	:	ESCAPE [btnfr"'\\]
	|	OctalEscape
	;

fragment
OctalEscape
	:	ESCAPE OctalDigit
	|	ESCAPE OctalDigit OctalDigit
	|	ESCAPE ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

Identifier
    : IDE IdentifierLetter IdentifierLetterOrDigit*
    ;

fragment
IdentifierLetter: ALFA;

fragment
IdentifierLetterOrDigit: ALFANUM;


// Lexer rules

NOT: 'not';
COUNT: 'count';
AVG: 'avg';
SUM: 'sum';
MIN: 'min';
MAX: 'max';
LT: '<';
GT: '>';
ELT: '<=';
EGT: '>=';
EQ: '=';
TRUE: 'true';
FALSE: 'false';
ESCAPE: '\\';
IDE: '?';
COMILLA: '"';
ESCAPECHAR: '\'';
ZERO: '0';
DOT: '.';
COMA: ',';
GUION: '_';
OPEN: '(';
CLOSE: ')';
QUERYINIT: '?-';
RULENINIT: ':-';
ALFA: [a-zA-Z];
ALFANUM: [a-zA-Z0-9_];
WS: [ \t\r\n\u000C]+ -> skip;
COMMENT: '%' ~[\n\r]* ( [\n\r] | EOF) -> skip;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> skip;

Predicate: IdentifierLetter IdentifierLetterOrDigit* ;