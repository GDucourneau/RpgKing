/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 * La classe ArmeMagique hérite de Arme
 */
public class ArmeMagique extends Arme {
	// Les attributs
	private int statMagique;
	
	// Les constructeurs
	/** Constructeur vide de la classe ArmeMagique
	 * 
	 */
	public ArmeMagique () {
		
	}
	
	/** Constructeur de la classe ArmeMagique
	 * 
	 * @param nom, chaîne de caractères, designant le nom de l'arme magique
	 * @param niveau, entier, niveau requis pour équiper l'arme magique
	 * @param pA, entier, coût d'un coup avec l'arme magique
	 * @param statMagique, entier, dégâts magiques d'un coup avec l'arme
	 */
	public ArmeMagique (String nom, int niveau,int pA,int statMagique) {
		super( nom, niveau, pA);
		this.statMagique = statMagique;
	}
	
	// Les accesseurs
	
	/**  Permet de modifier les dégâts magiques d'un coup avec l'arme
	 * 
	 * @param statMagique, entier, dégâts magiques d'un coup avec l'arme
	 */
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	/** Permet d'obtenir les dégâts magiques d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, dégâts magiques d'un coup avec l'arme
	 */
	public int getStatMagique() {
		return this.statMagique;
	}
}
