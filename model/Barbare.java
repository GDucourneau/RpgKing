package com.imie.algotojava.tp09Modifie.model;



public class Barbare implements IBarbare{
	
	private ArmePhysique armePhysique;
	private ArmurePhysique armurePhysique;
	
	public Barbare()
	{
		
	}
	
	public Barbare(ArmePhysique armePhysique,ArmurePhysique armurePhysique)
	{
		this.armePhysique = armePhysique;
		this.armurePhysique = armurePhysique;
	}
	
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

	@Override
	public int charge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
