
package principal;


import java.awt.Rectangle;

/**
 *
 */
public class disparar extends Thread {

    tiro t;
    Rectangle r;
    main main;
   
    
    public disparar(tiro t, main main) {        
        this.main = main;
        this.t = t;
        r = new Rectangle(this.t.getX(), this.t.getY(), 24, 15);
        this.main.posJ.add(r);
    }
    
    /*
    *Disparo del jugador
     */
    @Override
    public void run() {

        while (t.getX() < 1600) {
            t.setLocation(t.getX() + 3, t.getY());
            r.setBounds(this.t.getX(), this.t.getY(), 24, 15);
            try {
                for (int i = 0; i < this.main.posJ.size(); i++) {
                    for (int j = 0; j < this.main.posE.size(); j++) {
                        if (this.main.posJ.get(i).intersects(this.main.posE.get(j))) {
                            this.main.tirosE.get(j).setLocation(-50, this.main.tirosE.get(j).getY());
                            
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("");
            }
            try {
                Thread.sleep(2);
            } catch (Exception e) {
            }

        }
        main.posJ.removeElement(r);       
        main.tirosJ.remove(t);
        
    }

}
