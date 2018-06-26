/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe ArmureMixte h�rite de Armure
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
	 * @param nom, cha�ne de caract�res, nom de l'armure
	 * @param niveau, entier, niveau de l'armure
	 * @param valeurDefensePhysique, entier, valeur de d�fense physique de l'armure
	 * @param valeurDefenseMagique, entier, valeur de d�fense magique de l'armure
	 */
	public ArmureMixte(String nom, int niveau, int valeurDefensePhysique, int valeurDefenseMagique) {
		super(nom, niveau);
		this.statPhysique = valeurDefensePhysique;
		this.statMagique = valeurDefenseMagique;
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
	
	/**  Permet de modifier les d�g�ts magiques qui sont absorb�s par l'armure
	 * 
	 * @param statMagique, entier, r�sistance aux d�gats magiques
	 */
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	/** Permet d'obtenir les d�g�ts magiques qui sont absorb�s par l'armure sous forme d'entier
	 * 
	 * @return int, r�sistance aux d�gats magiques
	 */
	public int getStatMagique() {
		return this.statMagique;
	}
}
