package com.Jdbc.File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Database.DBConnection;

public class SelectAll {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	SelectAll () throws ClassNotFoundException, SQLException
 {
	 con =DBConnection.GetConnection();
	 String sql = "select * from emp ";
	  
	  pst = con.prepareStatement(sql);
	  //pst.setInt(1);
	  rs = pst.executeQuery();
	  		
	  while (rs.next())
	  {
		  	
		  int eid = rs.getInt(1);
		  String name = rs.getString(2);
		  String job = rs.getString(3);
		  int salary = rs.getInt(4);
		  
		  System.out.println(" | "+ eid+" | "+name+" | "+" | "+salary+" | "+ job);	  
		  System.out.println("----------------------------------------------------");	 
	  }
	  		
	 
	  rs.close();
	  con.close();
	  }

}
