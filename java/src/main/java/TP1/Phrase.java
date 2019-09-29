package TP1;

import java.util.ArrayList;
import java.util.List;

import TP1.Reste;
import TP1.Sujet;

public class Phrase {
	
	private Sujet sujet;

	private List<Reste> restes = new ArrayList<>();
	
	public Sujet getSujet() {
		return sujet;
	}

	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}

	public List<Reste> getRestes() {
		return restes;
	}

	public void setRestes(List<Reste> restes) {
		this.restes = restes;
	}

	

	public Phrase(Sujet sujet, List<Reste> restes) {
		this.sujet = sujet;
		this.restes = restes;
	}

	public Phrase(Sujet sujet, Reste reste) {
		this.sujet = sujet;
		this.restes.add(reste);
	}
}
