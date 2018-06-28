/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 * La classe ArmePhysique hérite de Arme
 */
public class ArmePhysique extends Arme {
	// Les attributs		
	private int statPhysique;
	
	// Les constructeurs
	/** Constructeur vide de la classe ArmePhysique
	 * 
	 */
	public ArmePhysique () {
		
	}
	
	/** Constructeur de la classe ArmePhysique
	 * 
	 * @param nom, chaîne de caractères, designant le nom de l'arme physique
	 * @param niveau, entier, niveau requis pour équiper l'arme physique
	 * @param pA, entier, coût d'un coup avec l'arme physique
	 * @param statPhysique, entier, dégâts physiques d'un coup avec l'arme physique
	 */
	public ArmePhysique (String nom, int niveau,int pA,int statPhysique) {
		super( nom, niveau, pA);
		this.statPhysique = statPhysique;
	}
	
	// Les accesseurs	
	/**  Permet de modifier les dégâts physiques d'un coup avec l'arme physique
	 * 
	 * @param statPhysique, entier, dégâts physiques d'un coup avec l'arme physique
	 */
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	/** Permet d'obtenir les dégâts physiques d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, dégâts physiques d'un coup avec l'arme physique
	 */
	public int getStatPhysique() {
		return this.statPhysique;
	}


}
