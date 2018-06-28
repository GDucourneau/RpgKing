/**
 * 
 */
package com.imie.algotojava.tp09Modifie.database;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * @author Gwenaël DUCOURNEAU
 * @date 28 juin 2018
 *
 */
public class DBOpenHelper {
	// Les attributs
	private Connection conn = null;
	
	// Le constructeurs	
	/** Constructeur privé
	 *
	 */	
    private DBOpenHelper() {
    	// Création de la connexion
    	MysqlDataSource dataSource = new MysqlDataSource();
    	dataSource.setUser("root");
    	dataSource.setPassword("1234");
    	dataSource.setServerName("127.0.0.1"); //localhost, de préférence, on met l'IP
    	dataSource.setDatabaseName("tp09Modifie");
    	try {
        	dataSource.setServerTimezone("UTC");
    		conn = dataSource.getConnection();
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}    	
    }
 
    // Le Design Pattern Singleton
    /** Instance unique non préinitialisée 
     * 
     */
    private static DBOpenHelper INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton 
     * 
     */
    public static DBOpenHelper getInstance() {   
        if (INSTANCE == null) {   
            synchronized(DBOpenHelper.class){
                if (INSTANCE == null) {   
                	INSTANCE = new DBOpenHelper();
                }
            }
        }
        return INSTANCE;
    }
    
    // Les accesseurs
    public Connection getConn() {
    	return conn;
    }
    
}
