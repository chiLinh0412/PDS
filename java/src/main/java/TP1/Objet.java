package TP1;

public abstract class Objet {
	
	private String name;

	public Objet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toNtriples() {
		return name;
	}
}
