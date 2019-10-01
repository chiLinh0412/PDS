package TP1;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
	public static void main(String[] args) {

		
		List<Phrase> phrases = new ArrayList<>();

		List<Reste> r1 = new ArrayList<>();
		List<Reste> r2 = new ArrayList<>();
		
		Sujet s1 = new Sujet("poly117");
		Sujet s2 = new Sujet("Ridoux");
		
		Objet poly = new Entite("poly");
		Objet ridoux = new Entite("Ridoux");
		Objet ferre = new Entite("Ferre");
		Objet compilation = new Text("Compilation");
		Objet personne = new Entite("personne");
		Objet professeur = new Entite("professeur");
		
		List<Objet> autors = new ArrayList<>();
		List<Objet> typeList2 = new ArrayList<>();
		

		Predicat p1 = new Predicat("type");
		Predicat p2 = new Predicat("auteur");
		Predicat p3 = new Predicat("titre");
		
		autors.add(ridoux);
		autors.add(ferre);
		
		typeList2.add(personne);
		typeList2.add(professeur);

		
		Reste type1 = new Reste(p1, poly);
		Reste auteur = new Reste(p2, autors);
		Reste titre = new Reste(p3, compilation);
		
		r1.add(type1);
		r1.add(auteur);
		r1.add(titre);
		
		
		Reste type2 = new Reste(p1, typeList2);
		
		r2.add(type2);
		
		Phrase ph1 = new Phrase(s1, r1);
		Phrase ph2 = new Phrase(s2, r2);

		phrases.add(ph1);
		phrases.add(ph2);

		// Use with a manually made AST
		ASD.Document ast = new ASD.Document(phrases);
		System.out.println(ast.toNtriples());

		// Use with lexer and parser
		/*
		 * try { // Set input CharStream input; if(args.length == 0) { // From standard
		 * input input = CharStreams.fromStream(System.in); } else { // From file set in
		 * first argument input = CharStreams.fromPath(Paths.get(args[0])); }
		 * 
		 * // Instantiate Lexer TurtleLexer lexer = new TurtleLexer(input);
		 * CommonTokenStream tokens = new CommonTokenStream(lexer);
		 * 
		 * // Instantiate Parser TurtleParser parser = new TurtleParser(tokens);
		 * 
		 * // Parse ASD.Document ast = parser.document().out;
		 * 
		 * // Print as Ntriples System.out.println(ast.toNtriples()); }
		 * catch(IOException e) { e.printStackTrace(); }
		 */
	}
}
