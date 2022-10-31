// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);

        for (int y = 1; y < 30; y++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 32.6;
            y2 -= 21.3;
        }

        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;
        for (int y = 1; y < 30; y++) {
            g.drawLine(x2, y2, x1, y1);
            y1 -= 21.3;
            x2 -= 32.6;
        }

        x1 = 10;
        y1 = 10;
        x2 = 990;
        y2 = 10;
        for (int y = 1; y < 30; y++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 21.3;
            x2 -= 32.6;
        }
        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 10;
        for (int y = 1; y < 30; y++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 21.3;
            x2 += 32.6;
        }
    }
}






