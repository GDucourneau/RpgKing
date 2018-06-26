/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe ArmureMixte hérite de Armure
 * 
 */
public class ArmureMixte extends Armure {
	// Les attributs	
	private int statPhysique;
	private int statMagique;
	
	// Les constructeurs	
	/** Constructeur vide de la classe ArmureMixte
	 * 
	 */
	public ArmureMixte() {
		
	}
	
	/** Constructeur de la classe ArmureMixte
	 * 
	 * @param nom, chaîne de caractères, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefensePhysique, entier, valeur de défense physique de l'armure
	 * @param valeurDefenseMagique, entier, valeur de défense magique de l'armure
	 */
	public ArmureMixte(String nom, int niveau, int valeurDefensePhysique, int valeurDefenseMagique) {
		super(nom, niveau);
		this.statPhysique = valeurDefensePhysique;
		this.statMagique = valeurDefenseMagique;
	}
		
	
	// Les accesseurs	
	/**  Permet de modifier les dégâts physiques qui sont absorbés par l'armure
	 * 
	 * @param statPhysique, entier, résistance aux dégats physiques
	 */
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	/** Permet d'obtenir les dégâts physiques qui sont absorbés par l'armure sous forme d'entier
	 * 
	 * @return int, résistance aux dégats physiques
	 */
	public int getStatPhysique() {
		return this.statPhysique;
	}
	
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
