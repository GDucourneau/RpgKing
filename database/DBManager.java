package com.imie.algotojava.tp09Modifie.database;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	public DBManager(){}
	
public ResultSet request(String request) {
	Statement stmt = null;
	ResultSet rs = null;
	try {
		stmt = DBOpenHelper.getInstance().getConn().createStatement();
		 rs = stmt.executeQuery(request);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return rs;
	
}
	
	public void requestdata(String request) {
		Statement stmt = null;
		try {
			stmt = DBOpenHelper.getInstance().getConn().createStatement();
			stmt.executeUpdate(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}



}
