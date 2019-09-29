package TP1;

public class Sujet {

	private String name;

	public Sujet(String name) {
		this.name = new Entite(name).getName();
	}
	
	public String getName() {
		return this.name;
	}
}
