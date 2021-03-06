parser grammar epScriptParser;

options {
    tokenVocab=epScriptLexer;
}

program
 : sourceElements? EOF
 ;

sourceElement
 : statement
 ;

statement
 : block
 | importStatement
 | variableStatement
 | ifStatement
 | iterationStatement
 | switchStatement
 | expressionStatement
 | onceStatement
 | continueStatement
 | breakStatement
 | returnStatement
 | objectDeclaration
 | functionDeclaration
 | emptyStatement
 ;

block
 : '{' statementList? '}'
 ;

statementList
 : statement+
 ;

importStatement
 : Import dottedName importNamespace? SemiColon
 ;

dottedName
 : dottedName Dot identifierName
 | identifierName
 ;

importNamespace
 : As identifierName
 ;

variableStatement
 : variableDeclarationList SemiColon
 ;

variableDeclarationList
 : varModifier variableDeclaration (',' variableDeclaration)*
 ;

variableDeclaration
 : assignAble ('=' singleExpression)?
 ;

emptyStatement
 : SemiColon
 ;

assignAble
 : identifier
 | arrayLiteral
 ;

expressionSequence
 : singleExpression (',' singleExpression)*
 ;

expressionStatement
 : expressionSequence SemiColon
 ;

varModifier
 : Var
 | Const
 ;

ifStatement
 : If '(' expressionSequence ')' statement (Else statement)?
 ;

iterationStatement
 : While '(' expressionSequence ')' statement
 | For '(' (expressionSequence | variableDeclarationList?) ';' expressionSequence? ';' expressionSequence? ')' statement
 | Foreach '(' identifier ':' singleExpression ')' statement
 ;

onceStatement
 : Once statement
 ;

continueStatement
 : Continue expressionSequence? SemiColon
 ;

breakStatement
 : Break expressionSequence? SemiColon
 ;

returnStatement
 : Return expressionSequence? SemiColon
 ;

switchStatement
 : Switch '(' expressionSequence ')' caseBlock
 ;

caseBlock
 : '{' caseClauses? (defaultClause caseClauses?)? '}'
 ;

caseClauses
 : caseClause+
 ;

caseClause
 : Case expressionSequence ':' statementList?
 ;

defaultClause
 : Default ':' statementList?
 ;

objectDeclaration
 : Object identifier objectTail SemiColon
 ;

objectTail
 : '{' objectElement* '}'
 ;

objectElement
 : objectVariableDeclaration
 | functionDeclaration
 ;

objectVariableDeclaration
 : Var identifier typeAnnotation? SemiColon
 ;

// Type Annotations

typeAnnotation
 : ':' type_
 ;

type_
 : primaryType
 | typeName
 ;

typeName
 : identifier
 | namespaceName
 ;

namespaceName
 : identifierName ('.'+ identifierName)*
 ;

primaryType
 : singleExpression arguments // It doesn't looks good... Need to replaced by any alternative.
 | predefinedType
 ;

predefinedType
 : encodedTypes
 ;

encodedTypes
 : TrgAllyStatus
 | TrgComparison
 | TrgCount
 | TrgModifier
 | TrgOrder
 | TrgPlayer
 | TrgProperty
 | TrgPropState
 | TrgResource
 | TrgScore
 | TrgSwitchAction
 | TrgSwitchState
 | TrgAIScript
 | TrgLocation
 | TrgString
 | TrgSwitch
 | TrgUnit
 | TrgTBL
 ;

// Function Declaration

functionDeclaration
 : Function identifier '(' formalParameterList? ')' typeAnnotation? functionBody
 ;

formalParameterList
 : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
 | lastFormalParameterArg
 ;

formalParameterArg
 : assignAble typeAnnotation?
 ;

lastFormalParameterArg
 : singleExpression
 ;

functionBody
 : '{' sourceElements? '}'
 ;

functionDefine
 : Function identifier '(' formalParameterList? ')' SemiColon
 ;

sourceElements
 : sourceElement+
 ;

arrayLiteral
 : ('[' elementList ']')
 ;

elementList
 : ','* arrayElement? (','+ arrayElement)* ','*
 |
 ;

arrayElement
 : singleExpression
 ;

arguments
 : '(' (argumentList ','?)? ')'
 ;

argumentList
 : argument (',' argument)*
 ;

argument
 : (singleExpression | Identifier)
 ;

// Expressions

singleExpression
 : anonymosuFunction                                            # AnonymousFunctionExpression
 | singleExpression '[' expressionSequence ']'                  # MemberExpression
 | singleExpression '.' identifierName                          # MemberDotExpression
 | singleExpression arguments                                   # ArgumentExpression
 | singleExpression '?' singleExpression ':' singleExpression   # TernaryExpression
 | singleExpression '++'                                        # PostIncreaseExpression
 | singleExpression '--'                                        # PostDecreaseExpression
 | '++' singleExpression                                        # PreIncreaseExpression
 | '--' singleExpression                                        # PreDecreaseExpression
 | '+' singleExpression                                         # UnaryPlusExpression
 | '-' singleExpression                                         # UnaryMinusExpression
 | '~' singleExpression                                         # BitNotExpression
 | '!' singleExpression                                         # NotExpression
 | singleExpression ('*' | '/' | '%') singleExpression          # MultiplicateExpression
 | singleExpression ('+' | '-') singleExpression                # AddictiveExpression
 | singleExpression ('<<' | '>>') singleExpression              # BitShiftExpression
 | singleExpression ('<' | '>' | '<=' | '>=') singleExpression  # RelationalExpression
 | singleExpression ('==' | '!=') singleExpression              # EqualityExpression
 | singleExpression '&' singleExpression                        # BitAndExpression
 | singleExpression '^' singleExpression                        # BitXOrExpression
 | singleExpression '|' singleExpression                        # BitOrExpression
 | singleExpression '&&' singleExpression                       # LogicalAndExpression
 | singleExpression '||' singleExpression                       # LogicalOrExpression
 | singleExpression '=' singleExpression                        # AssignmentExpression
 | singleExpression assignmentOperator singleExpression         # assignmentOperatorExpression
 | This                                                         # ThisExpression
 | identifierName singleExpression?                             # IdentifierExpression
 | literal                                                      # LiteralExpression
 | arrayLiteral                                                 # ArrayLiteralExpression
 | '(' expressionSequence ')'                                   # ParanthesizedExpression
 ;

anonymosuFunction
 : Function '(' formalParameterList? ')' typeAnnotation? functionBody
 ;

assignmentOperator
 : MultiplyAssign
 | PlusAssign
 | BitOrAssign
 | MinusAssign
 | BitAndAssign
 | BitXorAssign
 | MultiplyAssign
 | LeftShiftArithmeticAssign
 | RightShiftArithmeticAssign
 ;

literal
 : BooleanLiterl
 | StringLiteral
 | numericLiteral
 ;

numericLiteral
 : DecimalLiteral
 | HexIntegerLiteral
 ;

identifierName
 : identifier
 | reservedWord
 ;

identifier
 : Identifier
 ;

reservedWord
 : keyword
 ;

keyword
 : UnitName
 | LocName
 | SwitchName
 | UnitName
 | LocName
 | SwitchName
 | MapString
 | StatTxt
 | VArray
 | List
 | Import
 | As
 | Var
 | Const
 | Static
 | Function
 | Object
 | L2V
 | Once
 | If
 | Else
 | For
 | Foreach
 | While
 | Break
 | Continue
 | Return
 | Switch
 | Case
 | Default
 ;