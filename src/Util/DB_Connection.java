/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author janan
 */
public class DB_Connection {
        public Connection connect() 
	{
		Connection con = null;
		
			try
			{
				// Provide the correct details: DBServer/DBName, username, password
				
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itpm","root","");
				
				//For testing
				System.out.print("Successfully Connected");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return con;
	}
    
    
}
