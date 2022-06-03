/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplication1;

import javax.microedition.midlet.*;

/**
 * @author anacr
 */
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public class Midlet_pelota extends MIDlet {

    Display d;
    MyCanvas m;
    Timer t;
    MyTask mt;
    int x = 10, y = 10;
    int xiner = 1, yiner = 1;
    Command start, stop;
    Command c;

    public void startApp() {
        d = Display.getDisplay(this);
        m = new MyCanvas();
        d.setCurrent(m);

    }

    class MyTask extends TimerTask {

        public void run() {
            m.repaint();

        }
    }

    class MyCanvas extends Canvas implements CommandListener {

        MyCanvas() {
            start = new Command("start", Command.SCREEN, 1);
            addCommand(start);
            stop = new Command("stop", Command.SCREEN, 2);
            addCommand(stop);
            setCommandListener(this);
        }

        public void paint(Graphics g) {
            g.setColor(255, 255, 255);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(205, 180, 219); //PELOTA MORADA

            x += 20 * xiner;
            y += 50 * yiner;
            if (x > getWidth() - 20 || x < 0) {
                xiner *= -1;
            }
            if (y > getHeight() - 50 || y < 0) {
                yiner *= -1;

            }
            g.fillArc(x, y, 20, 20, 0, 360);

            g.setColor(162, 210, 255); //PELOTA AZUL

            x += 20 * xiner;
            y += 50 * yiner;
            if (x > getWidth() - 20 || x < 0) {
                xiner *= -1;
            }
            if (y > getHeight() - 50 || y < 0) {
                yiner *= -1;

            }
            g.fillArc(x, y, 20, 20, 0, 360);

            g.setColor(255, 175, 204);//PELOTA ROSA

            x += 20 * xiner;
            y += 50 * yiner;
            if (x > getWidth() - 20 || x < 0) {
                xiner *= -1;
            }
            if (y > getHeight() - 50 || y < 0) {
                yiner *= -1;

            }
            g.fillArc(x, y, 20, 20, 0, 360);
        }

        public void commandAction(Command c, Displayable d) {
            //  throw new UnsupportedOperationException("Not supported yet.");
            if (c == start) {
                t = new Timer();
                mt = new MyTask();
                t.schedule(mt, 1000, 500);
            } else if (c == stop) {
                t.cancel();
                mt.cancel();
            }
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

}
