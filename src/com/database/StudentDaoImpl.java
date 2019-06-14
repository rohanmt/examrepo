package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentInterface
{
	Connection con=null;
	public ArrayList<Student> show() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void insertRecord(Student student) 
	{
		String query="insert into school values(default,?,?,?,?,?,?,?)";
		try {
			con=DBConnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, student.getName());
			pst.setString(2, student.getUname());
			pst.setString(3, student.getPwd());
			pst.setString(4, student.getDob());
			pst.setString(5, student.getGender());
			pst.setString(6, student.getEmail());
			pst.setString(7, student.getComments());
			int record=pst.executeUpdate();
			if(record==1)
			{
				System.out.println("Inserted Successfully");
				return;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateRecord(String name, String pwd) {
		// TODO Auto-generated method stub
		
	}

	public void deleteRecord(String name) {
		// TODO Auto-generated method stub
		
	}

}
