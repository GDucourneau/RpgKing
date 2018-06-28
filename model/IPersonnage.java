package com.imie.algotojava.tp09Modifie.model;

public interface IPersonnage   {
	// Classe RPG
	public Arme getArme();
	public Armure getArmure();
	public boolean checkArme(Arme uneArme);
	public void setArme(Arme uneArme);
	public boolean checkArmure(Armure uneArmure);
	public void setArmure(Armure uneArmure);
	
}
