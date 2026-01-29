package me.spencernold.tlang;

import me.spencernold.tlang.antlr.TrefoilLexer;
import me.spencernold.tlang.antlr.TrefoilParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        InputStream input = Main.class.getResourceAsStream("/stdlib/test.tl");
        if (input == null)
            return;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            CharStream chars = CharStreams.fromReader(reader);
            TrefoilLexer lexer = new TrefoilLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TrefoilParser parser = new TrefoilParser(tokens);

            ParseTree tree = parser.file();

            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
