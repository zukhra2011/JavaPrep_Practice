package Practice_examples;

import java.awt.*;

public class Book_ex3 extends java.applet.Applet {
    Font f=new Font("TimesRoman", Font.BOLD,36);
    public void point(Graphics g){
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Hello again!",5,25);
    }
}
