package TP1;

import java.nio.file.Paths;
import java.io.IOException;

/*
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
*/

public class Main {
  public static void main(String[] args) {
    // Use with a manually made AST
    ASD.Document ast = new ASD.Document(/* Fill here! */);
    System.out.println(ast.toNtriples());


    // Use with lexer and parser
    /*
    try {
      // Set input
      CharStream input;
      if(args.length == 0) {
        // From standard input
        input = CharStreams.fromStream(System.in);
      }
      else {
        // From file set in first argument
        input = CharStreams.fromPath(Paths.get(args[0]));
      }

      // Instantiate Lexer
      TurtleLexer lexer = new TurtleLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // Instantiate Parser
      TurtleParser parser = new TurtleParser(tokens);

      // Parse
      ASD.Document ast = parser.document().out;

      // Print as Ntriples
      System.out.println(ast.toNtriples());
    } catch(IOException e) {
      e.printStackTrace();
    }
    */
  }
}
