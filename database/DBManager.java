/**
 * 
 */
package com.imie.algotojava.tp09Modifie.database;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

import com.imie.algotojava.tp09Modifie.database.DBOpenHelper;

/**
 * @author 
 * @date 28 juin 2018
 *
 */
public class DBManager {
	public DBManager() {
		
	}
	
	/*
	public String request(String requete) {
		StringBuilder result = new StringBuilder();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = DBOpenHelper.getInstance().getConn().createStatement();
			rs = stmt.executeQuery(requete);
			while (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				// getString commence à compter à partir de 1
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					result.append(rs.getString(i) + " ");
				}
				result.append("\n");
			}
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}
		finally {
			try {
				rs.close();
				stmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result.toString();
	}*/
	
	public ResultSet request(String requete) {		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = DBOpenHelper.getInstance().getConn().createStatement();
			rs = stmt.executeQuery(requete);
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}
		finally {
			try {
				rs.close();
				stmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	public int execute(String requete) {		
		Statement stmt = null;
		int nbLignes = 0;
		
		try {
			stmt = DBOpenHelper.getInstance().getConn().createStatement();
			nbLignes = stmt.executeUpdate(requete);
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}
		finally {
			try {
				stmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return nbLignes;
	}
}
