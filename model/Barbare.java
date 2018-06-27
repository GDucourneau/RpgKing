/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;


/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Barbare par d�faut
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

	// Les m�thodes
	/** Impl�mentation de la charge
	 * 
	 * @return un tableau de deux entiers, le cout de la comp�tence et les d�gats de la comp�tence
	 */
	public int[] charge() {
		int cout = 5;
		int degats = 25;
		int[] charge = {cout, degats};
		return charge;
	}
}
