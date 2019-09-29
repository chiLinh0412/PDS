package TP1;

public class Entite extends Objet {

	private String name;

	public Entite(String name) {
		super(name);
		this.name = "<" + name + ">";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
