/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import com.imie.algotojava.tp09Modifie.model.Arme;
import com.imie.algotojava.tp09Modifie.model.Armure;

import java.util.List; // fonctionnalit�s de List
import java.util.ArrayList; // fonctionnalit�s de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 *
 * On ne peut pas creer de Personnage, il doit �tre soit Mob, soit Hero.
 */
public abstract class Personnage implements IPersonnage {
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
	protected IPersonnage classeRPG; // contient l'arme, l'armure et les comp�tences d'un personnage
	
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
	 * @param uneClasseRPG , Classe du personnage, au sens RPG
	 */
	public Personnage(String unPrenom, String unNom, int sonNiveau, int nbPdvMax, int nbPaMax, int uneValeurDAttaque, IPersonnage uneClasseRPG) {
		this.prenom = unPrenom;
		this.nom = unNom;
		this.niveau = sonNiveau;
		this.pdvMax = nbPdvMax;
		this.pdv = nbPdvMax;
		this.paMax = nbPaMax;
		this.pa = nbPaMax;
		this.valeurDAttaque = uneValeurDAttaque;	
		this.inventaire = new ArrayList<IButin>(); // cr�ation de l'inventaire du personnage
		this.classeRPG = uneClasseRPG;
			
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
	 * @return l'armure du personnage, qu'elle soit magique, mixte ou physique
	 */
	public Armure getArmure() {
		return this.classeRPG.getArmure();
	}
	
	/** Accesseur d'arme, qui retourne l'arme du personnage
	 * 
	 * @return l'arme du personnage, qu'elle soit magique, mixte ou physique
	 */
	public Arme getArme() {
		return this.classeRPG.getArme();
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
	
	// Les faux accesseurs	
	/** Permet de savoir si un personnage est vivant ou mort
	 * 
	 * @return boolean, true si le personnnage est vivant, false sinon.
	 */
	public boolean estVivant() {
		return this.pdv > 0;
	}
	
	/** Permet d'obtenir les d�gats que le personnage inflige, sous forme de tableau de deux entiers
	 * 
	 * @return tableau de deux entiers, d�gats physiques puis d�gats magiques
	 */
	public int[] getAttaque() {
		int degatsPhysiques = 0;
		int degatsMagiques = 0;
		int[] degatsMixtes = new int [2];
				
		// R�cup�ration des d�gats physiques et magiques en fonction de la classe, sens RPG du personnage
		if (this.classeRPG instanceof IBarbare) {
			degatsPhysiques = ((ArmePhysique) this.classeRPG.getArme()).getStatPhysique();
		}
		else if(this.classeRPG instanceof IMagicien) {
			degatsMagiques = ((ArmeMagique) this.classeRPG.getArme()).getStatMagique();
		}
		else if(this.classeRPG instanceof IPaladin) {
			degatsPhysiques = ((ArmeMixte) this.classeRPG.getArme()).getStatPhysique();
			degatsMagiques = ((ArmeMixte) this.classeRPG.getArme()).getStatMagique();			
		}
		
		// On rempli le tableau de resultat
		degatsMixtes[0] = this.valeurDAttaque * degatsPhysiques;
		degatsMixtes[1] = this.valeurDAttaque * degatsMagiques;
		
		return degatsMixtes;
	}
	
	/** Permet d'obtenir la r�duction de d�gats du personnnage, sous forme de tableau de deux entiers
	 * 
	 * @return tableau de deux entiers, r�duction physique puis r�duction magique
	 */
	public int[] getDefense() {
		int reductionPhysique = 0;
		int reductionMagique = 0;
		int[] reductionMixte = new int[2];		
		
		// R�cup�ration des r�duction physiques et magiques, li�s � la victime
		if (this.classeRPG instanceof IBarbare) {
			reductionPhysique = ((ArmurePhysique) this.classeRPG.getArmure()).getStatPhysique();
		}
		else if(this.classeRPG instanceof IMagicien) {
			reductionMagique = ((ArmureMagique) this.classeRPG.getArmure()).getStatMagique();
		}
		else if(this.classeRPG instanceof IPaladin) {
			reductionPhysique = ((ArmureMixte) this.classeRPG.getArmure()).getStatPhysique();
			reductionMagique = ((ArmureMixte) this.classeRPG.getArmure()).getStatMagique();			
		}
		
		// Rempli le tableau de r�sultats		
		reductionMixte[0] = reductionPhysique;
		reductionMixte[1] = reductionMagique;
		
		return reductionMixte;		
	}

}
