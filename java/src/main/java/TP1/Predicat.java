package TP1;

public class Predicat {

	private String name;

	public Predicat(String name) {
		this.name = new Entite(name).getName();
	}
	
	
	public String toNtriples() {
		return this.name;
	}
}