package com.imie.algotojava.tp09Modifie.database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.imie.algotojava.tp09Modifie.database.DBManager;
import com.imie.algotojava.tp09Modifie.model.ArmePhysique;

public class ArmePhysiqueDB {
	
	private static final String INSERT = "INSERT INTO %s VALUES(%d,%d)";
	private static final String SELECT = "SELECT * FROM %s %s";
	private static final String TABLE = "ArmePhysique";
	private static final String ID = "id";
	private static final String WHERE_ID = "WHERE " + ID + " = %d";
	private static final String VALUES = "VALUES ('nom','statPhysique','pa','niveau')";
	private static final String UPDATE = "UPDATE " + TABLE + "SET nom ='%s' , statPhysique = '%d',pa ='%d',niveau = '%d'";
	private static final String DELETE = "DELETE FROM" + TABLE ;
	
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

		ResultSet rs = manager.request(String.format(SELECT, TABLE, String.format(WHERE_ID, id)));
		try {
			while (rs.next()) {
				result.setStatPhysique(rs.getInt("degat"));
				result.setPointAction(rs.getInt("actionPoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	public List<ArmePhysique> select() {
		List<ArmePhysique> result = new ArrayList<ArmePhysique>();

		ResultSet rs = manager.request(String.format(SELECT, TABLE, ""));
		try {
			while (rs.next()) {
				result.add(new ArmePhysique(rs.getString("name"),rs.getInt("degat"), rs.getInt("actionPoint"), rs.getInt("niveau")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public void insert(ArmePhysique armePhysique,int id) {
		manager.requestdata(String.format(INSERT, TABLE,armePhysique.getNom(),armePhysique.getStatPhysique(),armePhysique.getPointAction(), armePhysique.getNiveau(),String.format(WHERE_ID, id)));

	}
	
	public void update(ArmePhysique armePhysique,int id) {
		manager.requestdata(String.format(UPDATE,armePhysique.getNom(),armePhysique.getStatPhysique(),armePhysique.getPointAction(), armePhysique.getNiveau(),String.format(WHERE_ID, id)));

	}
	
	public void delete(int id) {
		manager.request(String.format(DELETE,String.format(WHERE_ID, id)));

	}
}
