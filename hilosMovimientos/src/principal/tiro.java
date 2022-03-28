
package principal;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class tiro extends JLabel {

    public tiro() {
        try {
            setIcon(new ImageIcon(getClass().getResource("/img/chiquitomore.png")));
            setBounds(195, main.avion.getY()+110, 24, 15);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }

    }

}
