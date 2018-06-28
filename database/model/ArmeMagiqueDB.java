package com.imie.algotojava.tp09Modifie.database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.imie.algotojava.tp09Modifie.database.DBManager;
import com.imie.algotojava.tp09Modifie.model.ArmeMagique;

public class ArmeMagiqueDB {
	
	private static final String INSERT = "INSERT INTO %s VALUES(%d,%d)";
	private static final String SELECT = "SELECT * FROM %s %s";
	private static final String TABLE = "ArmeMagique";
	private static final String ID = "id";
	private static final String WHERE_ID = "WHERE " + ID + " = %d";
	private static final String VALUES = "VALUES ('nom','statMagique','pa','niveau')";
	private static final String UPDATE = "UPDATE " + TABLE + "SET nom ='%s' , statsPhysique = '%d',pa ='%d',niveau = '%d'";
	private static final String DELETE = "DELETE FROM" + TABLE ;
	
	private ArmeMagique armeMagique;
	private DBManager manager = new DBManager();
	
	
	public ArmeMagique getArmeMagique() {
		return armeMagique;
	}

	public void setArmeMagique(ArmeMagique armeMagique) {
		this.armeMagique = armeMagique;
	}
	
	public ArmeMagique select(int id) {
		ArmeMagique result = new ArmeMagique();

		ResultSet rs = manager.request(String.format(SELECT, TABLE, String.format(WHERE_ID, id)));
		try {
			while (rs.next()) {
				result.setStatMagique(rs.getInt("statMagique"));
				result.setPointAction(rs.getInt("pa"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	public List<ArmeMagique> select() {
		List<ArmeMagique> result = new ArrayList<ArmeMagique>();

		ResultSet rs = manager.request(String.format(SELECT, TABLE, ""));
		try {
			while (rs.next()) {
				result.add(new ArmeMagique(rs.getString("name"),rs.getInt("degat"), rs.getInt("actionPoint"), rs.getInt("niveau")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public void insert(ArmeMagique armeMagique,int id) {
		manager.requestdata(String.format(INSERT, TABLE,armeMagique.getNom(),armeMagique.getStatMagique(),armeMagique.getPointAction(), armeMagique.getNiveau(),String.format(WHERE_ID, id)));

	}
	
	public void update(ArmeMagique armeMagique,int id) {
		manager.requestdata(String.format(UPDATE,armeMagique.getNom(),armeMagique.getStatMagique(),armeMagique.getPointAction(), armeMagique.getNiveau(),String.format(WHERE_ID, id)));

	}
	
	public void delete(int id) {
		manager.request(String.format(DELETE,String.format(WHERE_ID, id)));

	}
}