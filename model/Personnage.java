/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import com.imie.algotojava.tp09.model.Arme;
import com.imie.algotojava.tp09.model.Armure;
import java.util.List; // fonctionnalités de List
import java.util.ArrayList; // fonctionnalités de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 *
 * On ne peut pas creer de Personnage, il doit être soit Mob, soit Hero.
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
	 * @param unPrenom, chaîne de caractères, le prénom du Personnage
	 * @param unNom, chaîne de caractères, le nom du Personnage
	 * @param sonNiveau, entier, le niveau du Personnage
	 * @param nbPdvMax, entier, le nombre de points de vies du Personnage
	 * @param nbPaMax, entier, le nombre de points d'actions du Personnage
	 * @param uneValeurDAttaque, entier, les dégats de base du Personnage
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
		this.inventaire = new ArrayList<IButin>(); // création de l'inventaire du personnage
	}
	
	// Les accesseurs
	/** Accesseur de nom, qui retourne le nom du Personnage
	 * 
	 * @return chaine de caracctères, nom du personnage
	 */
	public String getNom() {
		return this.nom;
	}
	
	/** Accesseur de prénom, qui retourne le prénom du Personnage
	 * 
	 * @return chaine de caracctères, prénom du personnage
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/** Accesseur de vie, qui définie les points de vie d'un personnage
	 * De plus, il test si les points de vie sont négatifs ou non
	 * 
	 * @param pointsVie, entier qui définie les points de vie d'un personnage
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
	
	
	/** Accesseur d'action, qui définie les points d'action actuel d'un personnage
	 * De plus, il test si les points d'action sont négatifs ou non
	 * 
	 * @param pointsAction, entier qui définie les points d'action actuel d'un personnage
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
	
	// Les méthodes
	/** Ce personnage enleve des points de vie au personnage renseigné en paramètres.
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
