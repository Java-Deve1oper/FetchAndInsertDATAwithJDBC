
//STEP 1. Import required packages
import java.sql.*;

class Link {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/sample";

   // Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   Connection conn = null;
   Statement stmt = null;

   Link() {

      try {
         // STEP 2: Register JDBC driver
         Class.forName("com.mysql.cj.jdbc.Driver");

         // STEP 3: Open a connection
         System.out.println("Connecting to a selected database...");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
         System.out.println("Connected database successfully...");

      } catch (SQLException se) {
         // Handle errors for JDBC
         se.printStackTrace();
      } catch (Exception e) {
         // Handle errors for Class.forName
         e.printStackTrace();
      }
   }// end main
}// end JDBCExample