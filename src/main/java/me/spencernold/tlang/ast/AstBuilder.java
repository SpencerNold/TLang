package me.spencernold.tlang.ast;

import me.spencernold.tlang.antlr.TrefoilParser;
import me.spencernold.tlang.antlr.TrefoilParserBaseVisitor;

public class AstBuilder extends TrefoilParserBaseVisitor<Node> {

    @Override
    public Node visitFile(TrefoilParser.FileContext ctx) {
        BaseNode node = new BaseNode();
        for (var declaration : ctx.declaration()) {
            Node n1 = visit(declaration);
        }
        return node;
    }
}
