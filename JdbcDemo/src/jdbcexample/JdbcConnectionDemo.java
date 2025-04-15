package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionDemo {
	
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/studentdbmanager "; // Replace 'studentdbmanager' with your DB name
	        String user = "root"; // Replace with your username
	        String password = "Siyaramji@2000"; // Replace with your password

	        try {
	            // 1. Load the MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 2. Establish the Connection
	            Connection conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Congratulation !");
	            System.out.println("You are Connected to the database!");

	            // 3. Close connection
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}



