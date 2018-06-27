/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 *
 * La classe ArmureMagique h�rite de Armure
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
