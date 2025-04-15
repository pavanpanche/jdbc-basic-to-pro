package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFetchDemo {
      public static void main(String[] args) {
    	  
    	          String url = "jdbc:mysql://localhost:3306/studentdbmanager";
    	          String user = "root";
    	          String password = "Siyaramji@2000";

    	          try {
    	              Class.forName("com.mysql.cj.jdbc.Driver");
    	              Connection conn = DriverManager.getConnection(url, user, password);

    	              String query = "SELECT * FROM student";
    	              Statement stmt = conn.createStatement();
    	              ResultSet rs = stmt.executeQuery(query);
    	              
    	              System.out.println("id - name  -  age");
    	              System.out.println("=================");

    	              while (rs.next()) {
    	                  int id = rs.getInt("studentId");
    	                  String name = rs.getString("firstName");
    	                  int age = rs.getInt("age");
    	                  
    	        //          System.out.print("id     -     name     -     age");
    	                  System.out.println( id + "  - " + name + " -  " + age);
    	              }

    	              conn.close();
    	          } catch (Exception e) {
    	              System.out.println(e);
    	          }
    	      }
    	  

      }

