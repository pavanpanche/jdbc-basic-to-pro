package jdbcexaple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcSelectDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		String name;
		String major;
		int age;
	
		
		String url = "jdbc:mysql://localhost:3306/studentdbmanager";
		String user = "root";
		String password = "Siyaramji@2000";

		try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		    Connection con = DriverManager.getConnection(url, user, password);
		   
		   String query = "Select* from student";
		   Statement stm = con.createStatement();
		   ResultSet rs = stm.executeQuery(query);
		
			System.out.println(" ✅   Succesfully  Connected    ✅mysql");
		
		    System.out.println("===== Welcome To My Database ==============");
		    
            System.out.println("Id  -    Name   -  Age  -   Major");
		    
		    System.out.println("===========================================");      
		    
		    while(rs.next()) {
		    	
		    	int studentID = rs.getInt("studentId");
		    	String nameFirst = rs.getString("firstName");
		    	int Age = rs.getInt("age");
		    	String Branch = rs.getString("major");
		    	
		    	
		    	System.out.println(studentID+ "   -    " +nameFirst+ "  -  " +Age+ "   -  " +Branch); 	
		    	
		    
		    }
		    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		 
	     con.close();
		   
		   
		   
	
				
		}
		catch (Exception e){
			
			System.out.println(e);
			
			
		}
	}

}
