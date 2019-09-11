/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

public class conexiones {
     Connection conect;
    public conexiones(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         conect=DriverManager.getConnection("jdbc:mysql://localhost:3306/siskara","root","");
      } catch (Exception e) {
          System.err.println("Enlace Imposible" +e);
    }
}
    public Connection getConnection(){
        return conect;
    }
}
