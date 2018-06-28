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
		// Creation des tables dans la base de données
		DBManager gestionDB =  new DBManager();	
		gestionDB.execute("DROP TABLE IF EXISTS Role");
		gestionDB.execute("CREATE TABLE Role(id int(5) Auto_increment NOT NULL, nom Varchar(50), PRIMARY KEY (id)");
		gestionDB.execute("INSERT INTO Role (nom) VALUES (Barbare), (Magicien), (Paladin)");
		gestionDB.execute("CREATE TABLE ArmePhysique(id int(11) Auto_increment NOT NULL, nom Varchar(50), niv int(3), cout int(3), dgtsPhy int(3), PRIMARY KEY (id)");
		gestionDB.execute("CREATE TABLE ArmeMagique(id int(11) Auto_increment NOT NULL, nom Varchar(50), niv int(3), cout int(3), dgtsMag int(3), PRIMARY KEY (id)");
		gestionDB.execute("CREATE TABLE ArmeMixte(id int(11) Auto_increment NOT NULL, nom Varchar(50), niv int(3), cout int(3), dgtsPhy int(3), dgtsMag int(3),  PRIMARY KEY (id)");	
		gestionDB.execute("CREATE TABLE Personnage(id int(10) Auto_increment NOT NULL, nom Varchar(50), prenom Varchar(50), nbPV int(3), nbPVMax int(3),  nbPA int(3), nbPVMax int(3), atk int(5), PRIMARY KEY (id )");
		
		
		
		/*
		 * 
		 * CREATE TABLE User(
        id      int (11) Auto_increment  NOT NULL ,
        name    Varchar (50) ,
        id_role Int NOT NULL ,
        PRIMARY KEY (id ) ,
        UNIQUE (name )
		)
		 */
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
