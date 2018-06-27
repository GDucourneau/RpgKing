/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 * La classe ArmeMixte hérite de Arme
 */
public class ArmeMixte extends Arme {
	// Les attributs	
	private int statPhysique;
	private int statMagique;
	
	// Les constructeurs
	/** Constructeur vide de la classe ArmeMixte
	 * 
	 */
	public ArmeMixte () {
		
	}
	
	/** Constructeur de la classe ArmeMixte
	 * 
	 * @param nom, chaîne de caractères, designant le nom de l'arme mixte
	 * @param niveau, entier, niveau requis pour équiper l'arme mixte
	 * @param pA, entier, coût d'un coup avec l'arme mixte
	 * @param statPhysique, entier, dégâts physiques d'un coup avec l'arme mixte
	 * @param statMagique, entier, dégâts magiques d'un coup avec l'arme mixte
	 */
	public ArmeMixte (String nom, int niveau, int pA, int statPhysique, int statMagique) {
		super( nom, niveau, pA);
		this.statPhysique = statPhysique;
		this.statMagique = statMagique;
	}
	
	// Les accesseurs
	
	/**  Permet de modifier les dégâts physiques d'un coup avec l'arme
	 * 
	 * @param statPhysique, entier, dégâts physiques d'un coup avec l'arme
	 */
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	/** Permet d'obtenir les dégâts physiques d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, dégâts physiques d'un coup avec l'arme
	 */
	public int getStatPhysique() {
		return this.statPhysique;
	}
	
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
