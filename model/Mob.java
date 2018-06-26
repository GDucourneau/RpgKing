/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Mob hérite de Personnage.
 */
public class Mob extends Personnage {

	/** Constructeur vide de la classe Mob
	 * 
	 */
	public Mob() {
		
	}
	
	/** Constructeur de la classe Mob(méchant)
	 * 
	 * @param unPrenom, chaîne de caractères, le prénom du monstre(méchant)
	 * @param unNom, chaîne de caractères, le nom du monstre(méchant)
	 * @param sonNiveau, entier, le niveau du monstre(méchant)
	 * @param nbPdvMax, entier le nombre de points de vies du monstre(méchant)
	 * @param nbPaMax, entier, le nombre de points d'actions du monstre(méchant)
	 * @param uneValeurDAttaque, entier, les dégats de base du monstre(méchant)
	 */
	public Mob(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque) {
		super(); // Appel du constructeur de la classe mère			
	}
	
	/** Ce monstre(méchant) va récupérer une nouvelle arme ou armure.
	 * 
	 */
	public void lacherButin() {
		
	}
	
}
