/**
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

import com.imie.algotojava.tp09Modifie.model.Arme;
import com.imie.algotojava.tp09Modifie.model.Armure;

import java.util.List; // fonctionnalités de List
import java.util.ArrayList; // fonctionnalités de ArrayList

/**
 * @author 
 * @date 26 juin 2018
 *
 * On ne peut pas creer de Personnage, il doit être soit Mob, soit Hero.
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
	protected IPersonnage classeRPG; // contient l'arme, l'armure et les compétences d'un personnage
	protected Arme arme;
	protected Armure armure;
	
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
		this.inventaire = new ArrayList<IButin>(); // création de l'inventaire du personnage
		this.classeRPG = uneClasseRPG;
		// Arme et armure de la classeRPG par défaut
		this.arme = this.classeRPG.getArme();
		this.armure = this.classeRPG.getArmure();
			
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
	
	/** Accesseur d'arme, qui retourne l'arme du personnage
	 * 
	 * @return l'arme du personnage, qu'elle soit magique, mixte ou physique
	 */
	public Arme getArme() {
		return this.arme;
	}
	
	/** Accesseur d'arme, qui permet de changer l'arme du personnage, 
	 * qui prend en compte la classe (au sens RPG) du personnage
	 * 
	 * @param uneArme, objet Arme, arme que l'on veut équiper 
	 * @return boolean, true si l'arme a été changée, false sinon
	 */
	public boolean setArme(Arme uneArme) {
		boolean armeChangee = false;
		// cas du IBarbare et de son arme physique
		if(this.classeRPG instanceof IBarbare && uneArme instanceof ArmePhysique) {
			this.arme = uneArme;
			armeChangee = true;
		}
		// cas du IMagicien et de son arme magique
		else if(this.classeRPG instanceof IMagicien && uneArme instanceof ArmeMagique) {
			this.arme = uneArme;
			armeChangee = true;
		}
		// cas du IPaladin et de son arme magique ou mixte
		else if((this.classeRPG instanceof IPaladin && uneArme instanceof ArmeMagique) || (this.classeRPG instanceof IPaladin && uneArme instanceof ArmeMixte)) {
			this.arme = uneArme;
			armeChangee = true;
		}
		return armeChangee;
	}
	
	/** Accesseur d'armure, qui retourne l'armure du personnage
	 * 
	 * @return l'armuree du personnage, qu'elle soit magique, mixte ou physique
	 */
	public Armure getArmure() {
		return this.armure;
	}
	
	/** Accesseur d'armure, qui permet de changer l'armure du personnage, 
	 * qui prend en compte la classe (au sens RPG) du personnage
	 * 
	 * @param uneArmure, objet Armure, armure que l'on veut équiper 
	 * @return boolean, true si l'armure a été changée, false sinon
	 */
	public boolean setArmure(Armure uneArmure) {
		boolean armureChangee = false;
		// cas du IBarbare et de son armure physique
		if(this.classeRPG instanceof IBarbare && uneArmure instanceof ArmurePhysique) {
			this.armure = uneArmure;
			armureChangee = true;
		}
		// cas du IMagicien et de son armure magique
		else if(this.classeRPG instanceof IMagicien && uneArmure instanceof ArmureMagique) {
			this.armure = uneArmure;
			armureChangee = true;
		}
		// cas du IPaladin et de son armure magique ou mixte
		else if((this.classeRPG instanceof IPaladin && uneArmure instanceof ArmureMagique) || (this.classeRPG instanceof IPaladin && uneArmure instanceof ArmureMixte)) {
			this.armure = uneArmure;
			armureChangee = true;
		}
		return armureChangee;
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
	
	// Les faux accesseurs	
	/** Permet de savoir si un personnage est vivant ou mort
	 * 
	 * @return boolean, true si le personnnage est vivant, false sinon.
	 */
	public boolean estVivant() {
		return this.pdv > 0;
	}
	
	/** Permet d'obtenir les dégats que le personnage inflige, sous forme de tableau de deux entiers
	 * 
	 * @return tableau de deux entiers, dégats physiques puis dégats magiques
	 */
	public int[] getAttaque() {
		int degatsPhysiques = 0;
		int degatsMagiques = 0;
		int[] degatsMixtes = new int [2];
				
		// Récupération des dégats physiques et magiques en fonction du type d'arme
		if (this.arme instanceof ArmePhysique) {
			degatsPhysiques = ((ArmePhysique) this.arme).getStatPhysique();
		}
		else if(this.arme instanceof ArmeMagique) {
			degatsMagiques = ((ArmeMagique) this.arme).getStatMagique();
		}
		else if(this.arme instanceof ArmeMixte) {
			degatsPhysiques = ((ArmeMixte) this.arme).getStatPhysique();
			degatsMagiques = ((ArmeMixte) this.arme).getStatMagique();			
		}
		
		// On rempli le tableau de resultat
		degatsMixtes[0] = this.valeurDAttaque * degatsPhysiques;
		degatsMixtes[1] = this.valeurDAttaque * degatsMagiques;
		
		return degatsMixtes;
	}
	
	/** Permet d'obtenir la réduction de dégats du personnnage, sous forme de tableau de deux entiers
	 * 
	 * @return tableau de deux entiers, réduction physique puis réduction magique
	 */
	public int[] getDefense() {
		int reductionPhysique = 0;
		int reductionMagique = 0;
		int[] reductionMixte = new int[2];		
		
		// Récupération des réduction physiques et magiques
		if (this.armure instanceof ArmurePhysique) {
			reductionPhysique = ((ArmurePhysique) this.armure).getStatPhysique();
		}
		else if(this.armure instanceof ArmureMagique) {
			reductionMagique = ((ArmureMagique) this.armure).getStatMagique();
		}
		else if(this.armure instanceof ArmureMixte) {
			reductionPhysique = ((ArmureMixte) this.armure).getStatPhysique();
			reductionMagique = ((ArmureMixte) this.armure).getStatMagique();			
		}
		
		// Rempli le tableau de résultats		
		reductionMixte[0] = reductionPhysique;
		reductionMixte[1] = reductionMagique;
		
		return reductionMixte;		
	}

}
