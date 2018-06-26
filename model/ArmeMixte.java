package com.imie.algotojava.tp09Modifie.model;

public class ArmeMixte extends Arme {
	
	private int statPhysique;
	private int statMagique;
	
	
	public ArmeMixte () {
		
	}
	
	public ArmeMixte (String nom, int niveau,int pA,int statMagique, int statPhysique) {
		super( nom, niveau, pA);
		this.statMagique = statMagique;
		this.statPhysique = statPhysique;
	}
	
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	public int getStatPhysique() {
		return this.statPhysique;
	}
	
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	public int getStatMagique() {
		return this.statMagique;
	}
}
