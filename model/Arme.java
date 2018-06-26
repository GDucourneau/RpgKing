package com.imie.algotojava.tp09Modifie.model;

public class Arme implements IButin{
	
	protected String nom;
	protected int valeurAttaque;
	protected int pA;
	protected int niveau;
	
	
	public Arme () {
		
	}
	
	public Arme (String nom, int niveau, int valeurAttaque,int pA) {
		this.nom = nom;
		this.valeurAttaque = valeurAttaque;
		this.pA = pA;
		this.niveau = niveau;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setValeurAttaque(int valeurAttaque) {
		this.valeurAttaque = valeurAttaque;
	}
	
	public int getValeurAttaque() {
		return this.valeurAttaque;
	}
	
	public void setPointAction(int pointAction) {
		this.pA = pointAction;
	}
	
	public int getPointAction() {
		return this.pA;
	}
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
}
