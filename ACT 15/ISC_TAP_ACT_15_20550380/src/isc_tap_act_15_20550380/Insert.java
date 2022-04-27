package isc_tap_act_15_20550380;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar  
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    //Variables temporales
    String IDL_T, ISBN_T, T_T, D_T, AP_T, IDA_T, IDG_T;
    Connection conex = null;
Icon i= new ImageIcon(getClass().getResource("v1.png"));
    
    public Insert() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Añadir datos");
    }

    public void LimpiarTxt() {
        txt_AP.setText("");
        txt_Desc.setText("");
        txt_IDA.setText("");
        txt_IDG.setText("");
        txt_IDL.setText("");
        txt_ISBN.setText("");
        txt_Titulo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_IDL = new javax.swing.JTextField();
        txt_Titulo = new javax.swing.JTextField();
        txt_ISBN = new javax.swing.JTextField();
        txt_AP = new javax.swing.JTextField();
        txt_IDG = new javax.swing.JTextField();
        txt_Desc = new javax.swing.JTextField();
        txt_IDA = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ID Género:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 90, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ID Autor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Año de Publicación:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 140, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Descripción:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Titulo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ISBN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID LIbro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 20));

        txt_IDL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDLKeyTyped(evt);
            }
        });
        getContentPane().add(txt_IDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, -1));

        txt_Titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TituloKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 400, -1));

        txt_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ISBNActionPerformed(evt);
            }
        });
        txt_ISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ISBNKeyTyped(evt);
            }
        });
        getContentPane().add(txt_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, -1));

        txt_AP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_APKeyTyped(evt);
            }
        });
        getContentPane().add(txt_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 150, -1));

        txt_IDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDGKeyTyped(evt);
            }
        });
        getContentPane().add(txt_IDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 110, -1));

        txt_Desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DescKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 400, 60));

        txt_IDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDAKeyTyped(evt);
            }
        });
        getContentPane().add(txt_IDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 110, -1));

        jButton4.setText("TABLA ACTUALIZADA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 160, -1));

        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -70, 720, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        MENU s = new MENU();
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimpiarTxt();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IDL_T = txt_IDL.getText(); //Guardamos lo introducido en el txt en nuestro string temporal
        ISBN_T = txt_ISBN.getText();
        T_T = txt_Titulo.getText();
        D_T = txt_Desc.getText();
        AP_T = txt_AP.getText();
        IDA_T = txt_IDA.getText();
        IDG_T = txt_IDG.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_libros", "root", "Millie2002");

            PreparedStatement add = conex.prepareStatement("INSERT INTO bd_libros.libro(ID_Libro,ISBN,Titulo,Descripción,Año_Public,ID_Autor,ID_Genero)VALUES(?,?,?,?,?,?,?)");
            add.setString(1, IDL_T);
            add.setString(2, ISBN_T);
            add.setString(3, T_T);
            add.setString(4, D_T);
            add.setString(5, AP_T);
            add.setString(6, IDA_T);
            add.setString(7, IDG_T);

            int res = add.executeUpdate();

            if (res > 0) {
                 JOptionPane.showMessageDialog(null, "Libro agregado","",JOptionPane.PLAIN_MESSAGE,i);
            } else {
                 JOptionPane.showMessageDialog(null, "No se guardo correctamente","", JOptionPane.ERROR_MESSAGE);
            }
            conex.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Operación fallida " + e, "Estado de la operación", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_IDLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDLKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de numeros
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_IDLKeyTyped

    private void txt_IDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDAKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de numeros
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_IDAKeyTyped

    private void txt_IDGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDGKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de numeros
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_IDGKeyTyped

    private void txt_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ISBNActionPerformed

    private void txt_ISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ISBNKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de numeros
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_ISBNKeyTyped

    private void txt_TituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TituloKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de letras
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_TituloKeyTyped

    private void txt_DescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DescKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de letras
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_DescKeyTyped

    private void txt_APKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_APKeyTyped
        char validar = evt.getKeyChar();  //Validar para ingreso exclusivo de numeros
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números por favor", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_APKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Table t = new Table();
        t.setVisible(true);   
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_AP;
    private javax.swing.JTextField txt_Desc;
    private javax.swing.JTextField txt_IDA;
    private javax.swing.JTextField txt_IDG;
    private javax.swing.JTextField txt_IDL;
    private javax.swing.JTextField txt_ISBN;
    private javax.swing.JTextField txt_Titulo;
    // End of variables declaration//GEN-END:variables
}
