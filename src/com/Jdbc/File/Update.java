package com.Jdbc.File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Database.DBConnection;

public class Update {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	Update(String name, String job, int salary, int id) throws ClassNotFoundException, SQLException {

		String sql = "update emp set name=?,job=?,salary=? where id=?";
		con = DBConnection.GetConnection();
		pst = con.prepareStatement(sql);

		//pst.setInt(4, id);
		//rs = pst.executeQuery();

		
			pst.setString(1, name);
			pst.setString(2, job);
			pst.setInt(3, salary);
			pst.setInt(4, id);
			pst.executeUpdate();
			System.out.println("Updation Done");
		

		System.out.println("Updation Done");

		con.close();

	}

}
