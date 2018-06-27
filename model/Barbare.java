/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;


/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Barbare par défaut
 * 
 */
public class Barbare implements IBarbare{
	// Les attributs 
	private ArmePhysique armePhysique;
	private ArmurePhysique armurePhysique;
	
	//constructeur
	public Barbare()
	{
		
	}
	
	public Barbare(ArmePhysique armePhysique,ArmurePhysique armurePhysique)
	{
		this.armePhysique = armePhysique;
		this.armurePhysique = armurePhysique;
	}
	
	
	// Les accesseurs
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
