package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con = null;
	final static String driver = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost/test1";
	static final String Username = "root";
	static final String Password = "abcd1234";

	public static Connection GetConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		 con = DriverManager.getConnection(url, Username, Password);
		return con;

	}
	

}
