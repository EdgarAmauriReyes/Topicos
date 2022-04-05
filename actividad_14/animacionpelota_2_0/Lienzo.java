
package animacionpelota_2_0;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lienzo extends javax.swing.JPanel implements Runnable{

    Thread hilo;
    Color azulCustome = new Color(46, 59, 255),
            verde = new Color(0, 255, 0);
    int ejeX = 0, ejeY = 0;
    boolean iniciado = false;
    
    public Lienzo() {
        initComponents();
        hilo = new Thread(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(azulCustome);
        g.fillOval(ejeX, ejeY, 30, 30);
        
        g.setColor(verde);
        g.fillOval(ejeX, (getHeight() - 30) / 2, 30, 30);
        
        g.setColor(Color.RED);
        g.fillOval(ejeX, getHeight() - 30 - ejeY, 30, 30);
        
        g.setColor(Color.BLACK);
        g.fillOval((getWidth() - 30) / 2, ejeY, 30, 30);
    }
    
    public void inicio(){
        if (iniciado) {
            hilo.stop();
            hilo = null;
            hilo = new Thread(this);
            ejeX = 0;
            ejeY = 0;
            iniciado = false;
            repaint();
        }
        
        else{
            hilo.start();
            iniciado = true;
        }
    }
    
    public void pausa(){
        hilo.suspend();
    }
    
    public void continuar(){
        hilo.resume();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        while (true) {            
            while (ejeX < getWidth() - 30) {
                try {
                    Thread.sleep(100);
                    ejeX += 10;
                    ejeY = ejeX;
                    repaint();
                } catch (Exception e) {
                    Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            while (ejeX > 0) {
                try {
                    Thread.sleep(100);
                    ejeX -= 10;
                    ejeY = ejeX;
                    repaint();
                } catch (Exception e) {
                    Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
