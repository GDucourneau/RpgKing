/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Magicien par d�faut
 * 
 */
public class Magicien implements IMagicien{
	// Les attributs
	private ArmeMagique armeMagique;
	private ArmureMagique armureMagique;
	
	// Les constrcteurs
	/** Construceur vide de la classe Magicien
	 * 
	 */
	public Magicien() {
		
	}
	
	/** Constrcteur de la classe Magicien
	 * 
	 * @param uneArmeMagique, l'arme du magicien
	 * @param uneArmureMagique, l'armure du magicien
	 */
	public Magicien(ArmeMagique uneArmeMagique, ArmureMagique uneArmureMagique) {
		this.armeMagique = uneArmeMagique;
		this.armureMagique = uneArmureMagique;
	}
	
	// Les accesseurs
	public ArmeMagique getArme() {
		return armeMagique;
	}

	public void setArme(ArmeMagique armeMagique) {
		this.armeMagique = armeMagique;
	}
	
	public Armure getArmure() {
		return armureMagique;
	}

	public void setArmureMagique(ArmureMagique armureMagique) {
		this.armureMagique = armureMagique;
	}
	
	// Les m�thodes
	/** Impl�mentation de la boule de feu
	 * 
	 * @return un tableau de deux entiers, le cout de la comp�tence et les d�gats de la comp�tence
	 */
	public int[] bouleDeFeu() {
		int cout = 10;
		int degats = 50;
		int[] bdf = {cout, degats};
		return bdf;
	}
}
