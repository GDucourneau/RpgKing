/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;


/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Paladin par défaut
 * 
 */
public class Paladin implements IPaladin {	
	// Les attributs	
	private ArmeMagique armeMagique;
	private ArmeMixte armeMixte;
	private ArmureMagique armureMagique;
	private ArmureMixte armureMixte;

	// Les constructeurs
	/** Construceur vide de la classe Paladin
	 * 
	 */
	public Paladin () {
		
	}
	
	/** Constrcteur de la classe Paladin
	 * 
	 * @param uneArmeMagique, l'arme du Paladin
	 * @param uneArmeMixte, l'arme du Paladin
	 * @param uneArmureMagique, l'armure du Paladin
	 * @param uneArmureMixte, l'armure du Paladin
	 */
	public Paladin(ArmeMagique armeMagique,ArmeMixte armeMixte,ArmureMagique armureMagique,ArmureMixte armureMixte)
	{
		this.armeMagique = armeMagique;
		this.armeMixte = armeMixte;
		this.armureMagique = armureMagique;
		this.armureMixte = armureMixte;
	}

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

	// Les faux-asseceurs
	
	// On vera plus tard pour les autres armes et armures
	public Arme getArme() {
		return this.getArmeMixte();
	}
	
	public Armure getArmure() {
		return this.getArmureMixte();
	}

	// Les méthodes
	/** Implémentation du soin
	 * 
	 * @return un tableau de deux entiers, le cout de la compétence et les points de vie soignés
	 */
	public int[] Soin() {
		int cout = 10;
		int pdvSoignes = 40;
		int[] soin = {cout, pdvSoignes};
		return soin;
	}
	
}
