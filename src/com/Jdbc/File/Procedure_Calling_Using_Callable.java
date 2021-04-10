// Procedure_Calling_Using_Callable in Jdbc
package com.Jdbc.File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import com.Database.DBConnection;


public class Procedure_Calling_Using_Callable {
	static Connection con;
	PreparedStatement pst;
	ResultSet rs;


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		con = DBConnection.GetConnection();
		CallableStatement cb = con.prepareCall("{call GetAllREcordsEmp()}");
	boolean flag = 	cb.execute();
	if(flag) {
		ResultSet rs = cb.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id"));

		}
		System.out.println("Loaded");
	}
	else
	{
		System.out.println("Error while loading procedure");

	}
		
	}

}
