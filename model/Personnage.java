/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import com.imie.algotojava.tp09.model.Arme;
import com.imie.algotojava.tp09.model.Armure;
import java.util.List; // fonctionnalit�s de List
import java.util.ArrayList; // fonctionnalit�s de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 *
 * On ne peut pas creer de Personnage, il doit �tre soit Mob, soit Hero.
 */
public abstract class Personnage {
	// Les attributs	
	protected String prenom;
	protected String nom;
	protected int niveau;
	protected int pdvMax;
	protected int pdv; // Points de vie actuels
	protected int paMax;
	protected int pa; // Points d'action actuels
	protected int valeurDAttaque;
	protected List<IButin> inventaire;
	protected Armure armure;
	protected Arme arme;
	
	// Les constructeurs
	/** Constructeur vide de la classe Personnage
	 * 
	 */
	public Personnage() {
		
	}
	
	/** Constructeur de la classe Personnage
	 * 
	 * @param unPrenom, cha�ne de caract�res, le pr�nom du Personnage
	 * @param unNom, cha�ne de caract�res, le nom du Personnage
	 * @param sonNiveau, entier, le niveau du Personnage
	 * @param nbPdvMax, entier, le nombre de points de vies du Personnage
	 * @param nbPaMax, entier, le nombre de points d'actions du Personnage
	 * @param uneValeurDAttaque, entier, les d�gats de base du Personnage
	 */
	public Personnage(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque) {
		this.prenom = unPrenom;
		this.nom = unNom;
		this.niveau = sonNiveau;
		this.pdvMax = nbPdvMax;
		this.pdv = nbPdvMax;
		this.paMax = nbPaMax;
		this.pa = nbPaMax;
		this.valeurDAttaque = uneValeurDAttaque;	
		this.inventaire = new ArrayList<IButin>(); // cr�ation de l'inventaire du personnage
	}
	
	// Les accesseurs
	/** Accesseur de nom, qui retourne le nom du Personnage
	 * 
	 * @return chaine de caracct�res, nom du personnage
	 */
	public String getNom() {
		return this.nom;
	}
	
	/** Accesseur de pr�nom, qui retourne le pr�nom du Personnage
	 * 
	 * @return chaine de caracct�res, pr�nom du personnage
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/** Accesseur de vie, qui d�finie les points de vie d'un personnage
	 * De plus, il test si les points de vie sont n�gatifs ou non
	 * 
	 * @param pointsVie, entier qui d�finie les points de vie d'un personnage
	 */
	public void setVie(int pointsVie) {
		if (pointsVie < 0) {
			pointsVie = 0;
		}
		this.pdv = pointsVie;
	}
	
	/** Accesseur de vie, qui retourne le nombre de points de vie d'un personnage
	 * 
	 * @return entier, valeur du nombre de points de vie d'un personnage
	 */
	public int getVie() {
		return this.pdv;
	}
	
	/** Accesseur d'armure, qui retourne l'armure du personnage
	 * 
	 * @return objet (voir Armure.java), qui est l'armure du personnage
	 */
	public Armure getArmure() {
		return this.armure;
	}
	
	/** Accesseur d'arme, qui retourne l'armure du personnage
	 * 
	 * @return objet (voir Arme.java), qui est l'armure du personnage
	 */
	public Arme getArme() {
		return this.arme;
	}
	
	
	/** Accesseur d'action, qui d�finie les points d'action actuel d'un personnage
	 * De plus, il test si les points d'action sont n�gatifs ou non
	 * 
	 * @param pointsAction, entier qui d�finie les points d'action actuel d'un personnage
	 */
	public void setAction(int pointsAction) {
		if (pointsAction < 0) {
			pointsAction = 0;
		}
		this.pa = pointsAction;
	}
	
	/** Accesseur d'action, qui retourne le nombre d'action actuel d'un personnage
	 * 
	 * @return entier, valeur du nombre de points d'action actuel d'un personnage
	 */
	public int getAction() {
		return this.pa;
	}
	
	
	/** Accesseur d'ACTIONMAX, qui retourne le nombre d'action maximum d'un personnage
	 * 
	 * @return entier, valeur du nombre de points d'action maximum d'un personnage
	 */
	public int getACTIONMAX() {
		return this.paMax;
	}
	
	// Les m�thodes
	/** Ce personnage enleve des points de vie au personnage renseign� en param�tres.
	 * 
	 * @param unPersonnage, objet Personnage, que l'on va attaquer
	 */
	public void attaquer(Personnage unPersonnage) {
		
	}
	
	/** Ce personnage se defend.
	 * 
	 */
	public void seDefendre() {
		
	}

}
