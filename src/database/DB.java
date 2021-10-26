package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
   final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
   final String URL = "";
   final String USERNAME = "";
   final String PASSWORD = "";


   public DB() {
       Connection conn = null;
       try {
           conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
           System.out.println("Connection successful");
       } catch (SQLException ex) {
           System.out.println("Something went wrong");
          System.out.println(""+ex);
       }
       Statement createStatement;
       if (conn != null){
           try {
               createStatement = conn.createStatement();
           } catch (SQLException e) {
               System.out.println(""+e);
           }
       }
       DatabaseMetaData dbmd = null;
       try {
           dbmd = conn.getMetaData();
       } catch (SQLException e) {
           Logger.getLogger(DB.class.getName()).log(Level.SEVERE,null,e);
       }
       try {
           ResultSet rs = dbmd.getTables(null,"APP","TableName".toUpperCase(),null);
       } catch (SQLException e) {
           e.printStackTrace();
       }


   }

}
