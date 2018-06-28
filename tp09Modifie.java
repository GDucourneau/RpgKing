/**
 * 
 */
package com.imie.algotojava.tp09Modifie;

import java.sql.SQLException;

import com.imie.algotojava.tp09Modifie.database.DBManager;
import com.imie.algotojava.tp09Modifie.database.DBOpenHelper;
import com.imie.algotojava.tp09Modifie.manager.RpgKing;

/**
 * @author 
 * @date 26 juin 2018
 *
 */
public class tp09Modifie {

	public static void main(String[] args) {
		// Lancement d'une partie
		DBOpenHelper.getInstance();
		setUp();
		
		//System.out.println(new DBManager().request("SHOW TABLES"));
		
		
		try {
			DBOpenHelper.getInstance().getConn().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void setUp() {
		RpgKing.commencer();
	}

}
