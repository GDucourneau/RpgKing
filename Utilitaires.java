/**
 * 
 */
package com.imie.algotojava.tp09Modifie;

/**
 * @author 
 * @date 26 juin 2018
 * 
 * Classe rassemblant les fonctions utiles pour plusieurs classes
 *  
 */
public class Utilitaires {
	
	/** Méthode qui retourne un nombre entier aléatoire en 0 
	 * et l'entier en paramètre 
	 * 
	 * @param unEntier, l'entier extrémité du random
	 * @return int, un entier aléatoire entre 0 et maxEntier
	 */
	public static int randomEntier(int unEntier) {
		return (int)((Math.random() * unEntier + 1) % unEntier); // augmentation du côté aléatoire
	}

}
