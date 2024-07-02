package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		
		System.out.println(DbConnection.getDb());
	}



		public static Connection getDb() {
			Connection conn=null;
			String Url="jdbc:mysql://localhost:3306/homework4";
			String username="root";
			String password="12345678";
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(Url, username, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}

}
