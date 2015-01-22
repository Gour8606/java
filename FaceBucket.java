/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author WEL
 */
public class FaceBucket extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    @Override
    public void paint(Graphics g){
      g.drawArc(100, 25, 100, 100, 150, 60);
      g.drawArc(200, 25, 100, 100, 150, 60);
      g.drawArc(300, 25, 100, 100, 150, 60);
      g.drawArc(400, 25, 100, 100, 150, 60);
      g.drawArc(500, 25, 100, 100, 150, 60);
      g.drawArc(580, 25, 100, 100, 150, 60);
        
      g.drawLine(100, 100, 600, 100);
      g.drawOval(200, 200, 50, 50);
      g.drawOval(420, 200, 50, 50);
      g.drawLine(300, 400, 400, 400);
      g.drawLine(300, 400, 350, 300);
      g.drawLine(350, 300, 400, 400);
      g.drawLine(100, 100, 200, 600);
      g.drawLine(600, 100, 500, 600);
      g.drawArc(250, 400, 200, 100, 180, 180);
      g.drawLine(200, 600, 500, 600);
    }


    // TODO overwrite start(), stop() and destroy() methods
}
