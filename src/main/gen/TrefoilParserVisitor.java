// Generated from C:/Users/spenc/Desktop/GitHub/Tlang/src/main/antlr/TrefoilParser.g4 by ANTLR 4.13.2

package me.spencernold.tlang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrefoilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrefoilParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TrefoilParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TrefoilParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(TrefoilParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TrefoilParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TrefoilParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TrefoilParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TrefoilParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrefoilParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TrefoilParser.TypeContext ctx);
}