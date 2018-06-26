/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalités de List
import java.util.ArrayList; // fonctionnalités de ArrayList

import com.imie.algotojava.tp09Modifie.Utilitaires;



/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Mob hérite de Personnage.
 */
public class Mob extends Personnage {
	// Les constructeurs
	
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
		super(unPrenom, unNom, sonNiveau, nbPdvMax, nbPaMax, uneValeurDAttaque); // Appel du constructeur de la classe mère			
	}
	
	// Les méthodes
	
	/** Ce monstre(méchant) va faire tomber de(une) nouvelle(s) arme(s) et/ou armure(s).
	 * Ces armes/armures sont créées aléatoirement.
	 * 
	 */
	public List<IButin> lacherButin() {
		// Plus le Mob est puissant, plus il lache un objet interressant
		this.inventaire.add();
		
		return this.inventaire;
	}
	
}
