package servicios;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBd {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:5432/serveralumnodbs";

        String usuario = "postgres";

        String contraseña = "Contraseña1!";


        try {

            // Cargar el controlador de la base de datos (opcional desde JDBC 4.0)

            Class.forName("org.postgresql.Driver");


            // Obtener la conexión usando DriverManager

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);


            if (conexion != null) {

                System.out.println("Conexión establecida con éxito.");

                conexion.close();

            }

        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();

        }

    }

}