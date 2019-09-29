package TP1;

public class Predicat {

	private String name;

	public Predicat(String name) {
		this.name = new Entite(name).getName();
	}
	
	public String getName() {
		return this.name;
	}
}