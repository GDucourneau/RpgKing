package com.imie.algotojava.tp09Modifie.model;

public class Armure implements IButin{
	// Les attributs
	
	protected String nom;
	protected int niveau;
	
	// Les constructeurs
	
	/** Constructeur vide de la classe Armure
	 * 
	 */
	public Armure () {
		
	}
	
	public Armure (String nom, int niveau) {
		this.nom = nom;
		this.niveau = niveau;
	}
	
	// Les Accesseurs
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
		
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
}
