package TP1;

public class Sujet {

	private String name;

	public Sujet(String name) {
		this.name = new Entite(name).getName();
	}
	
	public String toNtriples() {
		return this.name;
	}
}
