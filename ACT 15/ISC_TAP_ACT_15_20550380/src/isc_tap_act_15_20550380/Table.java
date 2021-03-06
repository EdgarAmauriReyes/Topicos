package isc_tap_act_15_20550380;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edgar 
 */
public class Table extends javax.swing.JFrame {

    Connection conex = null;
    Icon i= new ImageIcon(getClass().getResource("v1.png"));

    /**
     * Creates new form Table
     */
    public Table() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, 30));

        btnS.setText("MOSTRAR TABLA");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        getContentPane().add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 180, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 550, 180));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -50, 710, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_libros", "root", "Millie2002");
            Statement st = conex.createStatement();
            ResultSet res = st.executeQuery("select * from libro");
            ResultSetMetaData rsmd = res.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            int columnas = rsmd.getColumnCount();
            String[] columNomb = new String[columnas];
            for (int i = 0; i < columnas; i++) {
                columNomb[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(columNomb);

            String ID_Libro, ISBN, Titulo, Descripción, Año_Public, ID_Autor, ID_Genero;
            while (res.next()) {
                ID_Libro = res.getString(1);
                ISBN = res.getString(2);
                Titulo = res.getString(3);
                Descripción = res.getString(4);
                Año_Public = res.getString(5);
                ID_Autor = res.getString(6);
                ID_Genero = res.getString(7);

                String[] fila = {ID_Libro, ISBN, Titulo, Descripción, Año_Public, ID_Autor, ID_Genero};
                model.addRow(fila);
            }
            st.close();
            conex.close();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: No se elimino el registro" + e, "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        MENU s = new MENU();
        s.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
