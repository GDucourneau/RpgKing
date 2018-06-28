package com.imie.algotojava.tp09Modifie.database;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBOpenHelper {
	

    
    Connection conn = null;
	

	/** Constructeur privé */
    private DBOpenHelper()
    {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        //dataSource.setPassword("");
        dataSource.setServerName("127.0.0.1");
        dataSource.setDatabaseName("testcoursjava");
        try {
        	dataSource.setServerTimezone("UTC");
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
 
    /** Instance unique non préinitialisée */
    private static DBOpenHelper INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du DBOpenHelper */
    public static DBOpenHelper getInstance()
    {   
        if (INSTANCE == null)
        {   
            synchronized(DBOpenHelper.class)
            {
                if (INSTANCE == null)
                {   INSTANCE = new DBOpenHelper();
                }
            }
        }
        return INSTANCE;
    }
    
    public Connection getConn()
    {
    	return conn;
    }
		
    	
   
    
}	


