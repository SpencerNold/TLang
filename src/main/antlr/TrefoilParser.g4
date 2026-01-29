parser grammar TrefoilParser;

options {
    tokenVocab = TrefoilLexer;
}

@header {
package me.spencernold.tlang.antlr;
}

file
    : declaration* EOF
    ;

declaration
    : INCLUDE STRING_LIT
    | classDecl
    | functionDecl
    | fieldDecl
    ;

classDecl
    : (PRIVATE | PROTECTED)? CLASS IDENTIFIER '{' classBody? '}'
    ;

classBody
    : classMember+
    ;

classMember
    : fieldDecl
    | functionDecl
    ;

fieldDecl
    : (PRIVATE | PROTECTED)? variable
    ;

functionDecl
    : (PRIVATE | PROTECTED)? typeDef IDENTIFIER '(' parameters? ')' '{' functionBody? '}'
    ;

parameters
    : variable (',' variable)*
    ;

functionBody
    : variable+
    ;

variable
    : typeDef IDENTIFIER ('=' value)?
    ;

typeDef
    : FINAL? POINTER? type ('[' ']')?
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

value
    : DECIMAL
    | FLOATING_POINT
    | STRING_LIT
    | IDENTIFIER
    ; // expressions, function calls, etc.