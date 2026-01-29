// Generated from C:/Users/spenc/Desktop/GitHub/Tlang/src/main/antlr/TrefoilParser.g4 by ANTLR 4.13.2

package me.spencernold.tlang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrefoilParser}.
 */
public interface TrefoilParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TrefoilParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TrefoilParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TrefoilParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TrefoilParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(TrefoilParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(TrefoilParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TrefoilParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TrefoilParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TrefoilParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TrefoilParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TrefoilParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TrefoilParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TrefoilParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TrefoilParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrefoilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TrefoilParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrefoilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TrefoilParser.TypeContext ctx);
}