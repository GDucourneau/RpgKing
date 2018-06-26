package com.imie.algotojava.tp09Modifie.model;

public abstract class Magicien implements IMagicien{
	
	private ArmeMagique armeMagique;
	private ArmureMagique armureMagique;
	
	
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
