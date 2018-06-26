/*
 * 
 */
package com.imie.algotojava.tp09Modifie.model;

/**
 *  
 * @author
 * @date 26 juin 2018
 *
 */
public class Arme implements IButin{
	// Les attributs
	protected String nom;
	protected int pA; // Co�t d'un coup avec l'arme
	protected int niveau; // Niveau requis pour �quiper l'arme
	
	// Les constructeurs
	/** Connstructeur vide de la classe Arme
	 * 
	 */
	public Arme () {
		
	}
	
	/** Constructeur de la classe Arme
	 * 
	 * @param nom, cha�ne de caract�res, designant le nom de l'arme
	 * @param niveau, entier, niveau requis pour �quiper l'arme
	 * @param pA, entier, co�t d'un coup avec l'arme
	 */
	public Arme (String nom, int niveau,int pA) {
		this.nom = nom;
		this.pA = pA;
		this.niveau = niveau;
	}
	
	// Les accesseurs
	/** Permet de modifier le nom de l'arme
	 * 
	 * @param nom, cha�ne de caract�re, nom que l'on veut donner � l'arme
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/** Permet d'obtenir le nom de l'arme sous forme de String
	 * 
	 * @return cha�ne de caract�re, nom de l'arme
	 */
	public String getNom() {
		return this.nom;
	}
	

	/**  Permet de modifier le co�t d'un coup avec l'arme
	 * 
	 * @param pointAction, entier, co�t d'un coup avec l'arme
	 */
	public void setPointAction(int pointAction) {
		this.pA = pointAction;
	}
	
	/** Permet d'obtenir le co�t d'un coup avec l'arme sous forme d'entier
	 * 
	 * @return int, co�t d'un coup avec l'arme
	 */
	public int getPointAction() {
		return this.pA;
	}
	
	/** Permet de modifier le niveau requis pour porter l'arme
	 * 
	 * @param niveau, entier, nouveau niveau requis de l'arme
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	/** Permet de conna�tre le niveau requis pour �quiper l'arme
	 * 
	 * @return entier, niveau requis pour utiliser l'arme
	 */
	public int getNiveau() {
		return this.niveau;
	}
}
