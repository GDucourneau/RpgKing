/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalités de List
//import java.util.ArrayList; // fonctionnalités de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 * 
 * La classe Hero hérite de Personnage.
 */
public class Hero extends Personnage {
	
	/** Constructeur vide de la classe Hero
	 * 
	 */
	public Hero() {
		
	}
	
	/** Constructeur de la classe Hero
	 * 
	 * @param unPrenom, chaîne de caractères, le prénom du héro
	 * @param unNom, chaîne de caractères, le nom du héro
	 * @param sonNiveau, entier, le niveau du héro
	 * @param nbPdvMax, entier, le nombre de points de vies du héro
	 * @param nbPaMax, entier, le nombre de points d'actions du héro
	 * @param uneValeurDAttaque, entier, les dégats de base du héro
	 * @param uneClasseRPG , Classe du héro, au sens RPG
	 */
	public Hero(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque, IPersonnage uneClasseRPG) {
		super(unPrenom, unNom, sonNiveau, nbPdvMax, nbPaMax, uneValeurDAttaque, uneClasseRPG); // Appel du constructeur de la classe mère	
	}
	
	/** Ce personnage va récupérer des armes ou armures.
	 * 
	 * @param laVictime, un objet Mob, le montre qui meurt et laisse de l'équipement
	 */
	public void recupererButin(Mob laVictime) {
		List<IButin> butin = laVictime.lacherButin();
		for (int i=0; i < butin.size(); i++) {
			this.inventaire.add(butin.get(i));
		}
	}
	
}
