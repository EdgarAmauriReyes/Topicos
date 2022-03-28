
package principal;

import java.awt.Rectangle;


public class kill extends Thread{
    tiroEnemigo tE;
    int n;
    main main;
    Rectangle r;
    public kill(tiroEnemigo tE, int n, main main){
        this.main = main;
        this.tE = tE;
        this.n = n;
        r = new Rectangle(this.tE.getX(), this.n,44,30);
        this.main.posE.add(r);        
    }

    /*
    *Disparo del enemigo
    */
    @Override
    public void run() {        
        while(tE.getX() > -2){
            tE.setLocation(tE.getX()-1, n);
            r.setBounds(this.tE.getX(), this.n,44,30);
            
            try {
                Thread.sleep(5);
            } catch (Exception e) {
            }
            
        }
        
        
        main.posE.removeElement(r);
        main.tirosE.remove(tE);
        
    }
    
    
}
