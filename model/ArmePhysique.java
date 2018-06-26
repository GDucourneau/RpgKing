package com.imie.algotojava.tp09Modifie.model;

public class ArmePhysique extends Arme {
	
	private int statPhysique;
	
	public ArmePhysique () {
		
	}
	
	public ArmePhysique (String nom, int niveau,int pA,int statPhysique) {
		super( nom, niveau, pA);
		this.statPhysique = statPhysique;
	}
	
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	public int getStatPhysique() {
		return this.statPhysique;
	}
}
