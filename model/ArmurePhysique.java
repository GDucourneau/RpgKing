/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe ArmurePhysique h�rite de Armure
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
	 * @param nom, cha�ne de caract�res, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefensePhysique, entier, valeur de d�fense physique de l'armure
	 */
	public ArmurePhysique(String nom, int niveau, int valeurDefensePhysique) {
		super(nom, niveau);
		this.statPhysique = valeurDefensePhysique;
	}			
	
	// Les accesseurs
	
	/**  Permet de modifier les d�g�ts physiques qui sont absorb�s par l'armure
	 * 
	 * @param statPhysique, entier, r�sistance aux d�gats physiques
	 */
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	/** Permet d'obtenir les d�g�ts physiques qui sont absorb�s par l'armure sous forme d'entier
	 * 
	 * @return int, r�sistance aux d�gats physiques
	 */
	public int getStatPhysique() {
		return this.statPhysique;
	}
}
