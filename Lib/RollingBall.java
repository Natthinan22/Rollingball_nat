package Lib;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RollingBall extends JPanel implements ActionListener{
   
    int x = 100;
    int y = 100;
    int start_ang = 0;
    
    public RollingBall(){
        Timer f = new Timer(50,this);
        f.start();
    }
    public void paintComponent(Graphics g) {
        g.drawOval(x,y, 80, 80);
        g.fillArc(x, y, 80, 80,start_ang, 180);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       x +=10;
       start_ang -= 4;
       repaint();

       if(x>300){
        x=0;
       }

    }
}



