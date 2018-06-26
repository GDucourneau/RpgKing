/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Paladin par d�faut
 * 
 */
public abstract class Paladin implements IPaladin {
	// Les attributs
	
	private ArmeMagique armeMagique;
	private ArmeMixte armeMixte;
	private ArmureMagique armureMagique;
	private ArmureMixte armureMixte;
	
	// Les accesseurs
	
	//get armeMagique
	public ArmeMagique getArmeMagique() {
		return armeMagique;
	}

	public void setArmeMagique(ArmeMagique armeMagique) {
		this.armeMagique = armeMagique;
	}
	
	//get armeMixte
	public ArmeMixte getArmeMixte() {
		return armeMixte;
	}

	public void setArmeMixte(ArmeMixte armeMixte) {
		this.armeMixte = armeMixte;
	}
	
	//get ArmureMagique
	public ArmureMagique getArmureMagique() {
		return armureMagique;
	}

	public void setArmureMagique(ArmureMagique armureMagique) {
		this.armureMagique = armureMagique;
	}
	
	//get ArmureMixte
	public ArmureMixte getArmureMixte() {
		return armureMixte;
	}

	public void setArmureMixte(ArmureMixte armureMixte) {
		this.armureMixte = armureMixte;
	}
	
	
}
