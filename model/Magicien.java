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
public abstract class Magicien implements IMagicien{
	// Les attributs
	private ArmeMagique armeMagique;
	private ArmureMagique armureMagique;
	
	// Les accesseurs
	//get armeMagique
	public ArmeMagique getArme() {
		return armeMagique;
	}

	public void setArme(ArmeMagique armeMagique) {
		this.armeMagique = armeMagique;
	}
	
	//get ArmureMagique
	public ArmureMagique getArmureMagique() {
		return armureMagique;
	}

		public void setArmureMagique(ArmureMagique armureMagique) {
			this.armureMagique = armureMagique;
		}
}
