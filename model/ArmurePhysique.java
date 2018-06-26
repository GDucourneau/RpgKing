/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe ArmurePhysique hérite de Armure
 * 
 */
public class ArmurePhysique extends Armure {
	// Les attributs	
	
	private int statPhysique;
	
	// Les constructeurs	
	
	/** Constructeur vide de la classe ArmurePhysique
	 * 
	 */
	public ArmurePhysique() {
		
	}
	
	/** Constructeur de la classe ArmurePhysique
	 * 
	 * @param nom, chaîne de caractères, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefensePhysique, entier, valeur de défense physique de l'armure
	 */
	public ArmurePhysique(String nom, int niveau, int valeurDefensePhysique) {
		super(nom, niveau);
		this.statPhysique = valeurDefensePhysique;
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
}
