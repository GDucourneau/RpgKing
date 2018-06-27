/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import java.util.List; // fonctionnalit�s de List
//import java.util.ArrayList; // fonctionnalit�s de ArrayList

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
	 * @param uneClasseRPG , Classe du monstre(m�chant), au sens RPG
	 */
	public Mob(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque, IPersonnage uneClasseRPG) {
		super(unPrenom, unNom, sonNiveau, nbPdvMax, nbPaMax, uneValeurDAttaque, uneClasseRPG); // Appel du constructeur de la classe m�re			
	}
	
	// Les m�thodes
	
	/** Ce monstre(m�chant) va faire tomber de(une) nouvelle(s) arme(s) et/ou armure(s).
	 * Ces armes/armures sont cr��es al�atoirement.
	 * Plus le Mob est puissant, plus il lache un objet interressant.
	 * 
	 */
	public List<IButin> lacherButin() {
		int niveau = this.niveau;
		// le type d'arme/d'armure est al�atoire
		int choixButin = Utilitaires.randomEntier(6);
		switch (choixButin) {
			case 1:
				// tout magique
				this.inventaire.add(new ArmureMagique("L'assiette magique", niveau, 2*niveau));
				this.inventaire.add(new ArmeMagique("La jonquille magique", niveau, 2*niveau, 3*niveau));					
				break;

			case 2:
				// tout physique
				this.inventaire.add(new ArmurePhysique("L'armure de plAque", niveau, 2*niveau));
				this.inventaire.add(new ArmePhysique("L'�p�e de l'ours en bois", niveau, 2*niveau, 2*niveau));					
				break;
				
			case 3:
				// tout mixte
				this.inventaire.add(new ArmureMixte("L'assiette de maille", niveau, 2*niveau, 2*niveau));
				this.inventaire.add(new ArmeMixte("Le marteau magique de l'ours en bois", niveau, 2*niveau, 2*niveau, 2*niveau));					
				break;
			default:
				// le jackpot
				this.inventaire.add(new ArmureMagique("La coupelle magique", niveau, 2*niveau));
				this.inventaire.add(new ArmeMagique("La fl�te magique", niveau, 2*niveau, Utilitaires.randomEntier(3*niveau)));					
				this.inventaire.add(new ArmurePhysique("La combinaison de plAque", niveau, choixButin*niveau));
				this.inventaire.add(new ArmePhysique("L'�p�e en bois", niveau, 2*niveau, Utilitaires.randomEntier(2*niveau)));					
				this.inventaire.add(new ArmureMixte("Le maillot de maille", niveau, 2*niveau, 2*niveau));
				this.inventaire.add(new ArmeMixte("Le mateau magique de l'ours en or", niveau, 2*niveau, 3*niveau, 2*niveau));					
				break;
		} 	
		return this.inventaire;
	}
	
}
