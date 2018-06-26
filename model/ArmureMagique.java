/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 *
 * La classe ArmureMagique hérite de Armure
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
	 * @param nom, chaîne de caractères, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefense, entier, valeur de défense magique de l'armure
	 */
	public ArmureMagique (String nom, int niveau, int valeurDefense) {
		super(nom, niveau);
		this.statMagique = valeurDefense;
	}
	
	
	// Les accesseurs
	/**  Permet de modifier les dégâts magiques qui sont absorbés par l'armure
	 * 
	 * @param statMagique, entier, résistance aux dégats magiques
	 */
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	/** Permet d'obtenir les dégâts magiques qui sont absorbés par l'armure sous forme d'entier
	 * 
	 * @return int, résistance aux dégats magiques
	 */
	public int getStatMagique() {
		return this.statMagique;
	}
}
