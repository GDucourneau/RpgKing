package com.imie.algotojava.tp09Modifie.database.model;

import com.imie.algotojava.tp09Modifie.database.DBManager;
import com.imie.algotojava.tp09Modifie.model.ArmePhysique;

public class ArmePhysiqueDB {
	private ArmePhysique armePhysique;
	private DBManager manager = new DBManager();
	
	
	public ArmePhysique getArmePhysique() {
		return armePhysique;
	}

	public void setArmePhysique(ArmePhysique armePhysique) {
		this.armePhysique = armePhysique;
	}
	
	public ArmePhysique select(int id) {
		ArmePhysique result = new ArmePhysique();
		manager.request("SELECT * FROM %s where %s")
		
		
		return result;
	}
	
	
	public void insert(ArmePhysique armePhysique) {
		
	}
	
	public void update(ArmePhysique armePhysique) {
		
	}
	
	public void delete(ArmePhysique armePhysique) {
		
	}
}
