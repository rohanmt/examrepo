package com.login;

import java.sql.*;

import com.database.DBConnection;

public class LoginDaoImpl implements LoginDao{

	public boolean validateLogin(Login login) {
		Connection con=null;
		String query="select * from school where uname=? and pwd=?";
		try {
			con=DBConnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, login.getUsername());
			pst.setString(2, login.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next()==true)
			{
				return true;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return false;
	}
	
}
