
package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.UIManager;




public class main extends javax.swing.JFrame {
Toolkit t = Toolkit.getDefaultToolkit();
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
public final int sfinal = screenSize.height;
public final int spo = screenSize.width;
public static Vector<Rectangle> posJ = new Vector<Rectangle>();
public static Vector<Rectangle> posE = new Vector<Rectangle>();
public Vector<tiro> tirosJ = new Vector<tiro>();
public Vector<tiroEnemigo> tirosE = new Vector<tiroEnemigo>();

    public main() {        
        initComponents();
        setTitle("Juego de tiros");
        System.out.println(""+screenSize.width+":"+screenSize.height);
        setSize(screenSize.width, sfinal-150);
        disparoEnemigo dE = new disparoEnemigo(this);
        dE.start();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 102));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        avion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/200w.gif"))); // NOI18N
        avion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                avionKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jugador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador.setForeground(new java.awt.Color(0, 153, 0));
        jugador.setText("Disparos pegados:");

        colisiones.setBackground(new java.awt.Color(255, 153, 0));
        colisiones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colisiones.setForeground(new java.awt.Color(204, 102, 0));
        colisiones.setText("Colisiones:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colisiones)
                    .addComponent(jugador))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opciones");

        jMenu3.setText("Juego");

        jMenuItem1.setText("Salir");
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(avion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(777, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(avion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avionKeyTyped

    }//GEN-LAST:event_avionKeyTyped
    
    
    
    //Color color = new Color(171, 178, 185);
    Color color = new Color(  41, 128, 185  );
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.VK_W == evt.getKeyCode()) {            
            if (!(avion.getY() < (-40))) {
                avion.setLocation(avion.getX(), avion.getY() - 5);
            }
        }
        if (evt.VK_S == evt.getKeyCode()) {
            if (!(avion.getY() > (308))) {              
                avion.setLocation(avion.getX(), avion.getY() + 5);
            }
        }
        if(evt.VK_K == evt.getKeyCode()){
            UIManager.put("control", color);
            this.repaint();            
            try {
                tiro t = new tiro();
                add(t);
                tirosJ.add(t);
                disparar d = new disparar(t,this);                
                d.start();
                
            } catch (Exception e) {
            }
        }
        
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.VK_W == evt.getKeyCode()) {           
            if (!(avion.getY() < (-40))) {
                avion.setLocation(avion.getX(), avion.getY() - 5);
            }
        }
        if (evt.VK_S == evt.getKeyCode()) {
            if (!(avion.getY() > (308))) {               
                avion.setLocation(avion.getX(), avion.getY() + 5);
            }
        }
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Color color = new Color(171, 235, 198);
        UIManager.put("nimbusBase", Color.BLACK);
        UIManager.put("control", color);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel avion = new javax.swing.JLabel();
    public static final javax.swing.JLabel colisiones = new javax.swing.JLabel();
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JLabel jugador = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
