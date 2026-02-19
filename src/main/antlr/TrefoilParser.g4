parser grammar TrefoilParser;

options {
    tokenVocab = TrefoilLexer;
}

@header {
package me.spencernold.tlang.antlr;
}

file
    : (terminator | declaration terminator)* declaration? terminator* EOF
    ;

declaration
    : INCLUDE NATIVE? STRING_LIT (AS IDENTIFIER)?
    | classDecl
    | functionDecl
    | fieldDecl
    ;

classDecl
    : (PRIVATE | PROTECTED)? CLASS IDENTIFIER '{' classMember* '}'
    ;

classMember
    : fieldDecl
    | functionDecl
    ;

fieldDecl
    : (PRIVATE | PROTECTED)? variableDecl terminator
    ;

functionDecl
    : (PRIVATE | PROTECTED)? typeDef IDENTIFIER '(' parameters? ')' '{' functionBody? '}'
    ;

parameters
    : variableDef (',' variableDef)*
    ;

functionBody
    : (statement terminator)+
    ;

statement
    : variableDecl
    | expression
    ;

variableDef
    : typeDef IDENTIFIER
    ;

variableDecl
    : variableDef ('=' expression)?
    ;

typeDef
    : FINAL? POINTER? type ('[' ']')*
    ;

type
    : IDENTIFIER
    | INT8
    | INT16
    | INT32
    | INT64
    | UINT8
    | UINT16
    | UINT32
    | UINT64
    | CHAR
    | BOOL
    | FLOAT32
    | FLOAT64
    | FUNCTION
    | STRING
    | VOID
    ;

expression
    : assignment
    ;

primary
    : literal
    | call
    | IDENTIFIER
    | '(' expression ')'
    ;

// C Operator Precedence: 14
assignment
    : conditional (assignmentOperator assignment)?
    ;

assignmentOperator
    : EQ_OPER
    | ADD_EQ_OPER
    | SUB_EQ_OPER
    | MUL_EQ_OPER
    | DIV_EQ_OPER
    | MOD_EQ_OPER
    ;
// END

// C Operator Precedence: 13
conditional
    : logicalOr ('?' expression ':' expression)?
    ;
// END

// C Operator Precedence: 12
logicalOr
    : logicalAnd ('or' logicalAnd)*
    ;
// END

// C Operator Precedence: 11
logicalAnd
    : bitwiseOr ('and' bitwiseOr)*
    ;
// END

// C Operator Precedence: 10
bitwiseOr
    : bitwiseXor ('|' bitwiseXor)*
    ;
// END

// C Operator Precedence: 9
bitwiseXor
    : bitwiseAnd ('^' bitwiseAnd)*
    ;
// END

// C Operator Precedence: 8
bitwiseAnd
    : equality ('&' equality)*
    ;
// END

// C Operator Precedence: 7
equality
    : comparison (('==' | '!=') comparison)*
    ;
// END

// C Operator Precedence: 6
comparison
    : shift (('<' | '<=' | '>' | '>=') shift)*
    ;
// END

// C Operator Precedence: 5
shift
    : additive (('<<' | '>>') additive)*
    ;
// END

// C Operator Precedence: 4
additive
    : multiplicative (('+' | '-') multiplicative)*
    ;
// END

// C Operator Precedence: 3
multiplicative
    : exponential (('*' | '/' | '%') exponential)*
    ;
// END

// C Operator Precedence: 2.5
exponential
    : unary ('**' exponential)?
    ;
// END

// C Operator Precedence: 2
unary
    : ('not' | '-' | '+' | '++' | '--' | '~' ) unary
    | postfix
    ;
// END

// C Operator Precedence: 1
postfix
    : primary ('++' | '--')?
    ;
// END

literal
    : DECIMAL
    | FLOATING_POINT
    | STRING_LIT
    ;

call
    : (NATIVE '::')? IDENTIFIER '(' arguments? ')'
    ;

arguments
    : expression (',' expression)*
    ;

terminator
    : NEWLINE+
    ;