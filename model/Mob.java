/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalit�s de List

import com.imie.algotojava.tp09Modifie.Utilitaires;

import java.util.ArrayList; // fonctionnalit�s de ArrayList


/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Mob h�rite de Personnage.
 */
public class Mob extends Personnage {
	// Les constructeurs
	
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
		super(unPrenom, unNom, sonNiveau, nbPdvMax, nbPaMax, uneValeurDAttaque); // Appel du constructeur de la classe m�re			
	}
	
	// Les m�thodes
	
	/** Ce monstre(m�chant) va faire tomber de(une) nouvelle(s) arme(s) et/ou armure(s).
	 * Ces armes/armures sont cr�es al�atoirement.
	 * 
	 */
	public List<IButin> lacherButin() {
		// Le Mob lache un nombre al�atoire de butin, entre 1 et 6
		for (int i=0; i < Utilitaires.randomEntier(6); i++) {
			this.
		}
		
		return this.inventaire;
	}
	
}
