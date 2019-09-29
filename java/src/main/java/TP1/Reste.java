package TP1;

import java.util.ArrayList;
import java.util.List;

import TP1.Predicat;

public class Reste {
	
	private Predicat p;
	
	private List<Objet> objects = new ArrayList<>();
	
	
	public Predicat getPredicat() {
		return p;
	}

	public void setPredicat(Predicat p) {
		this.p = p;
	}

	public List<Objet> getObjects() {
		return objects;
	}

	public void setObjects(List<Objet> objects) {
		this.objects = objects;
	}

	public Reste(Predicat p, Objet o ) {
		this.p = p;
		this.objects.add(o);
	}
	
	public Reste(Predicat p, List<Objet> objects) {
		this.p = p;
		this.objects = objects;
	}
}