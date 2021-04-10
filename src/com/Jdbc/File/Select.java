package com.Jdbc.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Database.DBConnection;
public class Select {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	Select(int id) throws ClassNotFoundException, SQLException {
		con = DBConnection.GetConnection(); // Singlton connection concept 
		String sql = "select * from emp where id  = ?";
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		if (rs.next()) {
			int eid = rs.getInt(1);
			String name = rs.getString(2);
			String job = rs.getString(3);
			int salary = rs.getInt(4);
			System.out.println(" | " + eid + " | " + name + " | " + " | " + salary + " | " + job);
			System.out.println("----------------------------------------------------");
		}
		else

		{
			System.out.println("Invalid Id");
		}
		rs.close();
		con.close();
	}

}
