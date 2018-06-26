package com.imie.algotojava.tp09Modifie.model;

public class Armure {
	
	protected String nom;
	protected int valeurDefense;
	protected int niveau;
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setValeurDefense(int valeurDefense) {
		this.valeurDefense = valeurDefense;
	}
	
	public int getValeurDefense() {
		return this.valeurDefense;
	}
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
}
