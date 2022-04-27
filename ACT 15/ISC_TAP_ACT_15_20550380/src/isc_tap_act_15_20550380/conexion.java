package isc_tap_act_15_20550380;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar 
 */
public class conexion {

    Connection conex = null;

    public Connection conex() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_libros", "root", "Millie2002");
            JOptionPane.showMessageDialog(null, "Conexión exitosa", "Estado de la conexión", JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida " + e, "Estado de la conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conex;
    }
}
