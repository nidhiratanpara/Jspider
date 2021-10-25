package com.demo.updateApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdatejdbcDemo2 {
			public static void main(String[] args) {
				
				Connection con=null;
				Statement stmt=null;
				String upqry="update oece15jdbc.student  set name='nidhi' where id=1";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver class loaded and registered");
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
					System.out.println("connection establish with db server");
					
					stmt=con.createStatement();
					System.out.println("platfrom created");
					
					stmt.executeUpdate(upqry);
					System.out.println("Data updated!!");
					
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				finally {
					if(stmt !=null)
						
					{
						try {
							stmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(con !=null)
					{
						try {
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					System.out.println("close all costly resources.");
				
	}}

}
