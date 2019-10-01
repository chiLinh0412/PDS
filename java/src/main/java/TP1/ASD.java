package TP1;

import java.util.ArrayList;
import java.util.List;

public class ASD {
	static public class Document {

		private List<Phrase> phrases = new ArrayList<>();

		public Document(Phrase phrase) {
			this.phrases.add(phrase);
		}

		public Document(List<Phrase> phrase) {
			this.phrases = phrase;
		}

		public String toNtriples() {
			String Ntriples = "";
			for (Phrase p : this.phrases) {
				for (Reste r : p.getRestes()) {
					for (Objet o : r.getObjects()) {
						Ntriples = Ntriples + " " +
								p.getSujet().toNtriples() + " " + 
								r.getPredicat().toNtriples() + " "+
								o.toNtriples() +" .\n";

					}
				}

			}

			return Ntriples;
		}
	}
	// Fill here!
}
