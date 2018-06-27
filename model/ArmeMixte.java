/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 * La classe ArmeMixte h�rite de Arme
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
	 * @param nom, cha�ne de caract�res, designant le nom de l'arme mixte
	 * @param niveau, entier, niveau requis pour �quiper l'arme mixte
	 * @param pA, entier, co�t d'un coup avec l'arme mixte
	 * @param statPhysique, entier, d�g�ts physiques d'un coup avec l'arme mixte
	 * @param statMagique, entier, d�g�ts magiques d'un coup avec l'arme mixte
	 */
	public ArmeMixte (String nom, int niveau, int pA, int statPhysique, int statMagique) {
		super( nom, niveau, pA);
		this.statPhysique = statPhysique;
		this.statMagique = statMagique;
	}
	
	// Les accesseurs
	
	/**  Permet de modifier les d�g�ts physiques d'un coup avec l'arme
	 * 
	 * @param statPhysique, entier, d�g�ts physiques d'un coup avec l'arme
	 */
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	/** Permet d'obtenir les d�g�ts physiques d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, d�g�ts physiques d'un coup avec l'arme
	 */
	public int getStatPhysique() {
		return this.statPhysique;
	}
	
	/**  Permet de modifier les d�g�ts magiques d'un coup avec l'arme
	 * 
	 * @param statMagique, entier, d�g�ts magiques d'un coup avec l'arme
	 */
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	/** Permet d'obtenir les d�g�ts magiques d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, d�g�ts magiques d'un coup avec l'arme
	 */
	public int getStatMagique() {
		return this.statMagique;
	}
}
