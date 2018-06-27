/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 * La classe ArmeMagique h�rite de Arme
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
	 * @param nom, cha�ne de caract�res, designant le nom de l'arme magique
	 * @param niveau, entier, niveau requis pour �quiper l'arme magique
	 * @param pA, entier, co�t d'un coup avec l'arme magique
	 * @param statMagique, entier, d�g�ts magiques d'un coup avec l'arme
	 */
	public ArmeMagique (String nom, int niveau,int pA,int statMagique) {
		super( nom, niveau, pA);
		this.statMagique = statMagique;
	}
	
	// Les accesseurs
	
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
