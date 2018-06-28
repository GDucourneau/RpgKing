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
	private ArmePhysique armePhysiqueSecondaire;
	private ArmurePhysique armurePhysique;
	
	//constructeur
	/** Constructeur de la classe Barbare
	 * 
	 */
	public Barbare()
	{
		
	}
	
	/** Constructeur de la classe Barbare
	 * Il utilisera la m�me arme en main gauche et en main droite
	 * 
	 * @param armePhysique, l'arme que le barbare utilisira
	 * @param armurePhysique, l'armure que le barbare utilisira
	 */
	public Barbare(ArmePhysique armePhysique,ArmurePhysique armurePhysique)
	{
		this.armePhysique = armePhysique;
		this.armePhysiqueSecondaire = armePhysique; // par d�faut, le barbare � deux fois la m�me arme
		this.armurePhysique = armurePhysique;
	}
	
	
	// Les accesseurs
	public ArmePhysique getArme() {		
		return armePhysique;
		
	}

	public void setArme(Arme armePhysique) {
		this.armePhysique = (ArmePhysique) armePhysique;
	}
	
	public ArmurePhysique getArmure() {
		return armurePhysique;
	}

	public void setArmure(Armure armurePhysique) {
		this.armurePhysique = (ArmurePhysique) armurePhysique;
	}
	
	public ArmePhysique getArmeSecondaire() {
		return armePhysiqueSecondaire;
	}

	public void setArmeSecondaire (ArmePhysique uneArmePhysiqueSecondaire) {
		this.armePhysiqueSecondaire = uneArmePhysiqueSecondaire;
	}

	// Les m�thodes
	/** Permet de savoir si le personnage peut �quiper ou non une arme
	 * 
	 * @param uneArme, l'arme que l'on veut v�rifier
	 * @return un boolean, true si l'arme est �quipable, false sinon
	 */
	public boolean checkArme(Arme uneArme) {
		boolean armeEquipable = false;
		if (uneArme instanceof ArmePhysique) {
			armeEquipable = true;
		}
		return armeEquipable;
	}
	

	/** Permet de savoir si le personnage peut �quiper ou non une armure
	 * 
	 * @param uneArmure, l'arme que l'on veut v�rifier
	 * @return un boolean, true si l'armure est �quipable, false sinon
	 */
	public boolean checkArmure(Armure uneArmure) {
		boolean armureEquipable = false;
		if (uneArmure instanceof ArmurePhysique) {
			armureEquipable = true;
		}
		return armureEquipable;
	}
	
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
