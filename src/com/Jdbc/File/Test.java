package com.Jdbc.File;
import java.sql.Connection;
import java.sql.SQLException;

import com.Database.*;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
	 Connection con= DBConnection.GetConnection();
	 System.out.println(con);
	 

	}

}
