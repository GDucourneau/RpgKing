/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

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
	 */
	public Hero(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque) {
		super(); // Appel du constructeur de la classe mère	
	}
	
	/** Ce personnage va récupérer une nouvelle arme ou armure.
	 * 
	 */
	public void recupererButin() {
		
	}
	
}
