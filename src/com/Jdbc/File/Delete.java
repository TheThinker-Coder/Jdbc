package com.Jdbc.File;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import com.Database.DBConnection;

public class Delete {
	Connection con;
	PreparedStatement pst;

	Delete(int id) throws ClassNotFoundException, SQLException {
		con = DBConnection.GetConnection();
		String sql = "delete from emp where id=?";

		pst = con.prepareStatement(sql);

		pst.setInt(1, id);

		pst.execute();
		pst.executeUpdate();

		System.out.println("Deletion Done");

		con.close();

	}

}
