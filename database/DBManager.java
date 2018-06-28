package com.imie.algotojava.tp09Modifie.database;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	public DBManager(){}
	
public String request(String request) {
	StringBuilder result = new StringBuilder();
	Statement stmt = null;
	ResultSet rs = null;
	try {
		stmt = DBOpenHelper.getInstance().getConn().createStatement();
		 rs = stmt.executeQuery(request);
		 while(rs.next()) {
			 ResultSetMetaData rsmd = rs.getMetaData();
			 for(int i = 1; i<= rsmd.getColumnCount();i++)
			 {
				 result.append(rs.getString(i)+ " ");
			 }
			 result.append("\n");
		 }
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
	return result.toString();
	
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
