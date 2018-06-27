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
	
	/** M�thode qui retourne un nombre entier al�atoire en 0 
	 * et l'entier en param�tre 
	 * 
	 * @param unEntier, l'entier extr�mit� du random
	 * @return int, un entier al�atoire entre 0 et maxEntier
	 */
	public static int randomEntier(int unEntier) {
		return (int)((Math.random() * unEntier + 1) % unEntier); // augmentation du c�t� al�atoire
	}

}
