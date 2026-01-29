lexer grammar TrefoilLexer;

@header {
package me.spencernold.tlang.antlr;
}

O_PARENTHESES  : '(' ;
C_PARENTHESES  : ')' ;
O_C_BRACKET    : '{' ;
C_C_BRACKET    : '}' ;
O_BRACKET      : '[' ;
C_BRACKET      : ']' ;
DOT            : '.' ;
COMMA          : ',' ;

TRUE_VALUE     : 'true' ;
FALSE_VALUE    : 'false' ;
NULL_VALUE     : 'null' ;

INT8           : 'int8' ;
INT16          : 'int16' ;
INT32          : 'int32' ;
INT64          : 'int64' ;
UINT8          : 'uint8' ;
UINT16         : 'uint16' ;
UINT32         : 'uint32' ;
UINT64         : 'uint64' ;
CHAR           : 'char' ;
BOOL           : 'bool' ;
FLOAT32        : 'float32' ;
FLOAT64        : 'float64' ;
FUNCTION       : 'function' ;
VOID           : 'void' ;
STRING         : 'string' ;
POINTER        : 'ptr' ;

INCLUDE        : 'include' ;
PRIVATE        : 'private' ;
PROTECTED      : 'protected' ;
CLASS          : 'class' ;
ENUM           : 'enum' ;
INTERFACE      : 'interface' ;
NEW            : 'new' ;
EXTENDS        : 'extends' ;
IMPLEMENTS     : 'implements' ;
ABSTRACT       : 'abstract' ;
FINAL          : 'final' ;
ASSERT         : 'assert' ;
THIS           : 'this' ;
RETURN         : 'return' ;
IF             : 'if' ;
ELSE           : 'else' ;
FOR            : 'for' ;
IN             : 'in' ;
RANGE          : 'range' ;
WHILE          : 'while' ;
CONTINUE       : 'continue' ;
BREAK          : 'break' ;
IS             : 'is' ;
ASYNC          : 'async' ;
FUTURE         : 'future' ;
UNSAFE         : 'unsafe' ;
DEFER          : 'defer' ;
EXTERNAL       : 'external' ;

ADD_EQ_OPER    : '+=' ;
SUB_EQ_OPER    : '-=' ;
MUL_EQ_OPER    : '*=' ;
DIV_EQ_OPER    : '/=' ;
MOD_EQ_OPER    : '%=' ;

INCR_OPER      : '++' ;
DECR_OPER      : '--' ;
POW_OPER       : '**' ;

GT_EQ_OPER     : '>=' ;
LT_EQ_OPER     : '<=' ;
BIT_SHL_OPER   : '<<' ;
BIT_SHR_OPER   : '>>' ;

EQ_OPER        : '=' ;
ADD_OPER       : '+' ;
SUB_OPER       : '-' ;
MUL_OPER       : '*' ;
DIV_OPER       : '/' ;
MOD_OPER       : '%' ;

GT_OPER        : '>' ;
LT_OPER        : '<' ;
BIT_AND_OPER   : '&' ;
BIT_OR_OPER    : '|' ;
BIT_NOT_OPER   : '~' ;
BIT_XOR_OPER   : '^' ;

AND_OPER       : 'and' ;
OR_OPER        : 'or' ;
NOT_OPER       : 'not' ;
TERNARY_OPER   : '?' ;

STRING_LIT
    : '"' ( ESC | ~["\\] )* '"'
    ;

fragment ESC
    : '\\' [nrtf"\\]
    ;

DECIMAL
    : '-'? [1-9][0-9]*
    | '0x' [0-9a-fA-F]+
    ;

FLOATING_POINT
    : '-'? [0-9]+ '.' [0-9]*
    ;

IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

NEWLINE
    : '\n' -> skip
    ;

WS
    : [ \t\r]+ -> skip
    ;