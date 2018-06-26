/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 *
 */
public class ArmureMagique extends Armure {
	// Les attributs
	private int statMagique;
	
	// Les constructeurs
	
	/** Constructeur vide de la classe ArmureMagique
	 * 
	 */
	public ArmureMagique() {
		
	}
	
	/** Constructeur de la classe ArmureMagique
	 * 
	 * @param nom, cha�ne de caract�res, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefense, entier, valeur de d�fense magique de l'armure
	 */
	public ArmureMagique (String nom, int niveau, int valeurDefense) {
		super(nom, niveau);
		this.statMagique = valeurDefense;
	}
	
	
	// Les accesseurs
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	public int getStatMagique() {
		return this.statMagique;
	}
}
