
package principal;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class tiroEnemigo extends JLabel{
    main main;
    Random nA = new Random();
    int n;
    public tiroEnemigo(main main) {
        this.main = main;
        try {
            setIcon(new ImageIcon(getClass().getResource("/img/matador1.png")));
            //generamos una posicion para Y (en esa posicion aparecera el disparo enemigo)
            n = nA.nextInt(430-50+1) + 50;
            setBounds(main.spo-30, n, 44, 30);
            main.add(this);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
}
