package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			
			//INSERTION USING PREPARED STATEMENT
			PreparedStatement pstmt=con.prepareStatement("insert into student (sid,sname,fees)values(?,?,?)");
			pstmt.setInt(1, 107);
			pstmt.setString(2,"aaa");
			pstmt.setFloat(3,5000);
			pstmt.executeUpdate();
			
			//UPDATE USING PREPARED STATEMENT
/*			PreparedStatement ps=con.prepareStatement("update student set sname=? where sid=?");
			ps.setString(1,"Chaitanya");
			ps.setInt(2, 106);
			ps.executeUpdate();*/

/*			//CREATE TABLE USING STATEMENT
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table student(sid int,sname varchar(50),fees float(7,3) primary key(sid));");*/
			
			/*//INSERT USING STATEMENT
			int i=stmt.executeUpdate("insert into student values(101,'sathish',1000.00)");*/
			
			/*//UPDATE USING STATEMENT
			stmt.executeUpdate("update student set sname='atul' where sid=101");*/
			
			/*//READ ALL THE RECORDS
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}*/
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		

	}

}
