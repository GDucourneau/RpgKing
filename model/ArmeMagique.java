package com.imie.algotojava.tp09Modifie.model;

public class ArmeMagique extends Arme {
	
	private int statMagique;
	
	/** Constructeur vide de la classe Armure
	 * 
	 */
	public ArmeMagique () {
		
	}
	
	public ArmeMagique (String nom, int niveau, int valeurAttaque,int pA,int statMagique) {
		this.nom = nom;
		this.valeurAttaque = valeurAttaque;
		this.pA = pA;
		this.niveau = niveau;
		this.statMagique = statMagique;
	}
	
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	public int getStatMagique() {
		return this.statMagique;
	}
}
