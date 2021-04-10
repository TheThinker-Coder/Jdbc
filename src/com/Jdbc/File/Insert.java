package com.Jdbc.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Database.DBConnection;

public class Insert {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
 Insert (int id, String name,String job,int salary) throws ClassNotFoundException, SQLException
 {
	 con =DBConnection.GetConnection();
	 String sql = "insert into emp(id,name,job,salary)values(?,?,?,?)";
	  
	  pst = con.prepareStatement(sql);
	  
	
	  pst.setInt(1, id);
	  
	  pst.setString(2,name);
	  pst.setString(3,job);
	  pst.setInt(4,salary);
	  pst.execute();
	 
	  System.out.println("Successfull Inserted");

	  con.close();

 }
 
 



	
	
	
}
