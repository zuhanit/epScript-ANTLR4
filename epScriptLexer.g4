lexer grammar epScriptLexer;

// Boolean Literals
BooleanLiterl
 : 'true'
 | 'false'
 ;

// Numeric Literals
DecimalLiteral
 : DecimicalDigit+
 ;

HexIntegerLiteral
 : '0' [xX] HexDigit+
 ;

// Special Chars
OpenBracket     : '[';
CloseBracket    : ']';
OpenParen       : '(';
CloseParen      : ')';
OpenBrace       : '{';
CloseBrace      : '}';
Dot             : '.';
QuestionMark    : '?';
Comma           : ',';
Colon           : ':';
SemiColon       : ';';

// 0.65.2 Inplace Operators
PlusPlus                    : '++';
MinusMinus                  : '--';
PlusAssign                  : '+=';
MinusAssign                 : '-=';
MultiplyAssign              : '*=';
LeftShiftArithmeticAssign   : '<<=';
RightShiftArithmeticAssign  : '>>=';
BitAndAssign                : '&=';
BitXorAssign                : '^=';
BitOrAssign                 : '|=';

// Operators
And                     : '&&';
Or                      : '||';
LeftShiftArithmetic     : '<<';
RightShiftArithmetic    : '>>';
BitNot                  : '~';
BitAnd                  : '&';
BitOr                   : '|';
BitXOr                  : '^';
Equals                  : '==';
LessThanEquals          : '<=';
GreaterThanEquals       : '>=';
LessThan                : '<';
MoreThan                : '>';
NotEquals               : '!=';
Not                     : '!';
Plus                    : '+';
Minus                   : '-';
Multiply                : '*';
Divide                  : '/';
Modulus                 : '%';
Assign                  : '=';


// 0.65.2 Keywords
UnitName    : '$U';
LocName     : '$L';
SwitchName  : '$S';
MapString   : '$T';
StatTxt     : '$B';
VArray      : 'VArray';
List        : 'list';
Import      : 'import';
As          : 'as';
Var         : 'var';
Const       : 'const';
Static      : 'static';
Function    : 'function';
Object      : 'object';
L2V         : 'l2v';
Once        : 'once';
If          : 'if';
Else        : 'else';
For         : 'for';
Foreach     : 'foreach';
While       : 'while';
Break       : 'break';
Continue    : 'continue';
Return      : 'return';
Switch      : 'switch';
Case        : 'case';
Default     : 'default';
This        : 'this';

// Type
TrgAllyStatus   : 'TrgAllyStatus';
TrgComparison   : 'TrgComparsion';
TrgCount        : 'TrgCount';
TrgModifier     : 'TrgModifier';
TrgOrder        : 'TrgOrder';
TrgPlayer       : 'TrgPlayer';
TrgProperty     : 'TrgProperty';
TrgPropState    : 'TrgPropState';
TrgResource     : 'TrgResource';
TrgScore        : 'TrgScore';
TrgSwitchAction : 'TrgSwitchAction';
TrgSwitchState  : 'TrgSwitchState';
TrgAIScript     : 'TrgAIScript';
TrgLocation     : 'TrgLocation';
TrgString       : 'TrgString';
TrgSwitch       : 'TrgSwitch';
TrgUnit         : 'TrgUnit';
TrgTBL          : 'TrgTBL';

// Identifier
Identifier
 : IdentifierStart IdentifierPart*
 ;

// String Literals
StringLiteral
 : '"' DoubleStringCharacter* '"'
 | '\'' SingleStringCharacter* '\''
 ;

WhiteSpaces
 : [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN)
 ;

LineTerminator
 : [\r\n\u2028\u2029] -> channel(HIDDEN)
 ;

/// Comments
MultiLineComment
 : '/*' .*? '*/' -> channel(HIDDEN)
 ;

SingleLineComment
 : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN)
 ;

UnexpectedCharacter
 : .
 ;

DoubleStringCharacter
 : ~["\\\r\n]
 | '\\' EscapeSequence 
 ;

SingleStringCharacter
 : ~['\\\r\n]
 | '\\' EscapeSequence
 ;

fragment EscapeSequence
 : UnicodeEscapeSequence
 ;

fragment UnicodeEscapeSequence
 : 'x' HexDigit HexDigit
 ;

fragment DecimicalDigit
 : [0-9]
 ;

fragment HexDigit
 : [0-9a-fA-F]
 ;

fragment IdentifierPart
 : IdentifierStart
 | [\p{Mn}]
 | [\p{Nd}]
 | [\p{Pc}]
 | '\u200C'
 | '\u200D'
 ;

fragment IdentifierStart
 : [\p{L}]
 | [$_]
 | '\\' UnicodeEscapeSequence
 ;