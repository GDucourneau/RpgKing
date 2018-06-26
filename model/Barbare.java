package com.imie.algotojava.tp09Modifie.model;



public abstract class Barbare implements IBarbare{
	
	private ArmePhysique armePhysique;
	private ArmurePhysique armurePhysique;
	
	public ArmePhysique getArme() {
		
		return armePhysique;
		
	}

	public void setArme(ArmePhysique armePhysique) {
		this.armePhysique = armePhysique;
	}
	
	public ArmurePhysique getArmure() {
		return armurePhysique;
	}

	public void setArmure(ArmurePhysique armurePhysique) {
		this.armurePhysique = armurePhysique;
	}
}
