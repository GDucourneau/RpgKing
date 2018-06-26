package com.imie.algotojava.tp09Modifie.model;

public class ArmeMagique extends Arme {
	
	private int statMagique;
	
	/** Constructeur vide de la classe Armure
	 * 
	 */
	public ArmeMagique () {
		
	}
	
	public ArmeMagique (String nom, int niveau,int pA,int statMagique) {
		super( nom, niveau, pA);
		this.statMagique = statMagique;
	}
	
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	public int getStatMagique() {
		return this.statMagique;
	}
}
