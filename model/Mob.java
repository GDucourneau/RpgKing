/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalit�s de List
import java.util.ArrayList; // fonctionnalit�s de ArrayList

import com.imie.algotojava.tp09Modifie.Utilitaires;



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
	 * Ces armes/armures sont cr��es al�atoirement.
	 * Plus le Mob est puissant, plus il lache un objet interressant.
	 * 
	 */
	public List<IButin> lacherButin() {
		// le type d'arme/d'armure est al�atoire
		int choixButin = Utilitaires.randomEntier(6);
		switch (choixButin) {
			case 1:
				// tout magique
				this.inventaire.add(new ArmureMagique("L'assiette magique", this.niveau, Utilitaires.randomEntier(2*this.niveau)));
				this.inventaire.add(new ArmeMagique("La jonquille magique", this.niveau, Utilitaires.randomEntier(3*this.niveau)));					
				break;
	
			default:
				break;
		} 	
		return this.inventaire;
	}
	
}
