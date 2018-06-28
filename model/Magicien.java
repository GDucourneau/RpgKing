/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Magicien par défaut
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

	public void setArme(Arme armeMagique) {
		this.armeMagique = (ArmeMagique) armeMagique;
	}
	
	public Armure getArmure() {
		return armureMagique;
	}

	public void setArmure(Armure armureMagique) {
		this.armureMagique = (ArmureMagique) armureMagique;
	}
	
	// Les méthodes
	/** Permet de savoir si le personnage peut équiper ou non une arme
	 * 
	 * @param uneArme, l'arme que l'on veut vérifier
	 * @return un boolean, true si l'arme est équipable, false sinon
	 */
	public boolean checkArme(Arme uneArme) {
		boolean armeEquipable = false;
		if (uneArme instanceof ArmeMagique) {
			armeEquipable = true;
		}
		return armeEquipable;
	}
	

	/** Permet de savoir si le personnage peut équiper ou non une armure
	 * 
	 * @param uneArmure, l'arme que l'on veut vérifier
	 * @return un boolean, true si l'armure est équipable, false sinon
	 */
	public boolean checkArmure(Armure uneArmure) {
		boolean armureEquipable = false;
		if (uneArmure instanceof ArmureMagique) {
			armureEquipable = true;
		}
		return armureEquipable;
	}
	
	/** Implémentation de la boule de feu
	 * 
	 * @return un tableau de deux entiers, le cout de la compétence et les dégats de la compétence
	 */
	public int[] bouleDeFeu() {
		int cout = 10;
		int degats = 50;
		int[] bdf = {cout, degats};
		return bdf;
	}
}
