package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.*;

public class conexion {

    public static Connection ConectarnosBD(){
        Connection result=null;
        try {
            String dbDriver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/";

            String dbName = "aplicativoweb";
            String dbUser = "root";
            String dbPassword = "";

            forName(dbDriver);
            Connection conex = DriverManager.getConnection(dbUrl+dbName,dbUser,dbPassword);
            System.out.println("Conexion Establecida");
            result=conex;
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexion Fallida");
            ex.printStackTrace(System.out);
        }
        return result;
    }
}
