/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 */
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
	
	/** Constructeur de la classe Armure
	 * 
	 * @param nom, chaîne de caractères, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 */
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
