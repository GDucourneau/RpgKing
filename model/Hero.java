/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalit�s de List
//import java.util.ArrayList; // fonctionnalit�s de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Hero h�rite de Personnage.
 */
public class Hero extends Personnage {
	
	/** Constructeur vide de la classe Hero
	 * 
	 */
	public Hero() {
		
	}
	
	/** Constructeur de la classe Hero
	 * 
	 * @param unPrenom, cha�ne de caract�res, le pr�nom du h�ro
	 * @param unNom, cha�ne de caract�res, le nom du h�ro
	 * @param sonNiveau, entier, le niveau du h�ro
	 * @param nbPdvMax, entier, le nombre de points de vies du h�ro
	 * @param nbPaMax, entier, le nombre de points d'actions du h�ro
	 * @param uneValeurDAttaque, entier, les d�gats de base du h�ro
	 * @param uneClasseRPG , Classe du h�ro, au sens RPG
	 */
	public Hero(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque, IPersonnage uneClasseRPG) {
		super(unPrenom, unNom, sonNiveau, nbPdvMax, nbPaMax, uneValeurDAttaque, uneClasseRPG); // Appel du constructeur de la classe m�re	
	}
	
	/** Ce personnage va r�cup�rer des armes ou armures.
	 * 
	 * @param laVictime, un objet Mob, le montre qui meurt et laisse de l'�quipement
	 */
	public void recupererButin(Mob laVictime) {
		List<IButin> butin = laVictime.lacherButin();
		for (int i=0; i < butin.size(); i++) {
			this.inventaire.add(butin.get(i));
		}
	}
	
}
