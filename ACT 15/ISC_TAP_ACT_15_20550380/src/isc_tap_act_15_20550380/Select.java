package isc_tap_act_15_20550380;

import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar 
 */
public class Select extends javax.swing.JFrame {

    Connection conex = null;

    /**
     * Creates new form Select
     */
    public Select() {
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

        grupo_datos = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RB_IDL = new javax.swing.JRadioButton();
        RB_ISBN = new javax.swing.JRadioButton();
        RB_T = new javax.swing.JRadioButton();
        RB_D = new javax.swing.JRadioButton();
        RB_AP = new javax.swing.JRadioButton();
        RB_IDA = new javax.swing.JRadioButton();
        RBIDG = new javax.swing.JRadioButton();
        RB_TODAS = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        grupo_datos.add(RB_IDL);
        RB_IDL.setText("ID_Libro");
        RB_IDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_IDLMouseClicked(evt);
            }
        });
        RB_IDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_IDLActionPerformed(evt);
            }
        });

        grupo_datos.add(RB_ISBN);
        RB_ISBN.setText("ISBN");
        RB_ISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_ISBNMouseClicked(evt);
            }
        });

        grupo_datos.add(RB_T);
        RB_T.setText("Título");
        RB_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_TMouseClicked(evt);
            }
        });
        RB_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_TActionPerformed(evt);
            }
        });

        grupo_datos.add(RB_D);
        RB_D.setText("Descripción");
        RB_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_DMouseClicked(evt);
            }
        });

        grupo_datos.add(RB_AP);
        RB_AP.setText("Año de Publicación");
        RB_AP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_APMouseClicked(evt);
            }
        });
        RB_AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_APActionPerformed(evt);
            }
        });

        grupo_datos.add(RB_IDA);
        RB_IDA.setText("ID_Autor");
        RB_IDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_IDAMouseClicked(evt);
            }
        });

        grupo_datos.add(RBIDG);
        RBIDG.setText("ID_Género");
        RBIDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBIDGMouseClicked(evt);
            }
        });

        grupo_datos.add(RB_TODAS);
        RB_TODAS.setText("Todas las categorías");
        RB_TODAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_TODASMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_IDL)
                    .addComponent(RB_ISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_T)
                    .addComponent(RB_D))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_AP)
                    .addComponent(RB_IDA))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBIDG)
                    .addComponent(RB_TODAS))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RB_IDL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_ISBN))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(RB_T)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RB_D))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(RB_AP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RB_IDA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(RBIDG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_TODAS)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 120));

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 660, 190));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB_IDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_IDLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_IDLActionPerformed

    private void RB_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_TActionPerformed

    private void RB_APActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_APActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_APActionPerformed

    private void RB_IDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_IDLMouseClicked
        String OP = "ID_Libro";
        conex(OP);
    }//GEN-LAST:event_RB_IDLMouseClicked

    private void RB_ISBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_ISBNMouseClicked
        String OP = "ISBN";
        conex(OP);
    }//GEN-LAST:event_RB_ISBNMouseClicked

    private void RB_TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_TMouseClicked
        String OP = "Titulo";
        conex(OP);
    }//GEN-LAST:event_RB_TMouseClicked

    private void RB_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_DMouseClicked
        String OP = "Descripción";
        conex(OP);
        
    }//GEN-LAST:event_RB_DMouseClicked

    private void RB_APMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_APMouseClicked
        String OP = "Año_Public";
        conex(OP);
    }//GEN-LAST:event_RB_APMouseClicked

    private void RB_IDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_IDAMouseClicked
        String OP = "ID_Autor";
        conex(OP);
    }//GEN-LAST:event_RB_IDAMouseClicked

    private void RBIDGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBIDGMouseClicked
        String OP = "ID_Genero";
        conex(OP);
    }//GEN-LAST:event_RBIDGMouseClicked

    private void RB_TODASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_TODASMouseClicked
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_libros", "root", "Millie2002");

            PreparedStatement consulta = conex.prepareStatement("select * from libro");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                txtA.append(res.getString("ID_Libro") + " | " + res.getString("ISBN") + " | " + res.getString("Titulo")
                        + " | " + res.getString("Descripción") + " | " + res.getString("Año_Public") + " | " + res.getString("ID_Autor") + " | " + res.getString("ID_Genero") + "\n");

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida " + e, "Estado de la conexión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RB_TODASMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtA.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        MENU s = new MENU();
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public Connection conex(String OP) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_libros", "root", "Millie2002");

            PreparedStatement consulta = conex.prepareStatement("select * from libro");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                txtA.append(res.getString(OP) + "\n");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida " + e, "Estado de la conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conex;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBIDG;
    private javax.swing.JRadioButton RB_AP;
    private javax.swing.JRadioButton RB_D;
    private javax.swing.JRadioButton RB_IDA;
    private javax.swing.JRadioButton RB_IDL;
    private javax.swing.JRadioButton RB_ISBN;
    private javax.swing.JRadioButton RB_T;
    private javax.swing.JRadioButton RB_TODAS;
    private javax.swing.ButtonGroup grupo_datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    // End of variables declaration//GEN-END:variables
}
