// Jdbc Result Set Example And I'ts Methods
package com.Jdbc.File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.Database.DBConnection;

public class Rs_Method {
	static Connection con;
	PreparedStatement pst;
	ResultSet rs;
	static String sql = "Select * from emp";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		con = DBConnection.GetConnection();
		 PreparedStatement ps= con.prepareStatement(sql);
	 ResultSet	rs = ps.executeQuery();
	 ResultSetMetaData rsmd = rs.getMetaData();
	 System.out.println("Total Columns: "+ rsmd.getColumnCount());
	 System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
	 System.out.println("Column Type Name of st column: "+ rsmd.getColumnTypeName(1));
	}

}
