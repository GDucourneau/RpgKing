/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Mob h�rite de Personnage.
 */
public class Mob extends Personnage {

	/** Constructeur vide de la classe Mob
	 * 
	 */
	public Mob() {
		
	}
	
	/** Constructeur de la classe Mob(m�chant)
	 * 
	 * @param unPrenom, cha�ne de caract�res, le pr�nom du monstre(m�chant)
	 * @param unNom, cha�ne de caract�res, le nom du monstre(m�chant)
	 * @param sonNiveau, entier, le niveau du monstre(m�chant)
	 * @param nbPdvMax, entier le nombre de points de vies du monstre(m�chant)
	 * @param nbPaMax, entier, le nombre de points d'actions du monstre(m�chant)
	 * @param uneValeurDAttaque, entier, les d�gats de base du monstre(m�chant)
	 */
	public Mob(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque) {
		super(); // Appel du constructeur de la classe m�re			
	}
	
	/** Ce monstre(m�chant) va r�cup�rer une nouvelle arme ou armure.
	 * 
	 */
	public void lacherButin() {
		
	}
	
}
