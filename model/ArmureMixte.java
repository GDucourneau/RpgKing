package com.imie.algotojava.tp09Modifie.model;

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
	public void setStatPhysique(int statPhysique) {
		this.statPhysique = statPhysique;
	}
	
	public int getStatPhysique() {
		return this.statPhysique;
	}
	
	public void setStatMagique(int statMagique) {
		this.statMagique = statMagique;
	}
	
	public int getStatMagique() {
		return this.statMagique;
	}
}
