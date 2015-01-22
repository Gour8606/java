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
public class FaceCircle extends Applet {

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
      g.drawOval(100, 100, 500, 500);
      g.drawOval(200, 200, 50, 50);
      g.drawOval(420, 200, 50, 50);
      g.drawLine(300, 400, 400, 400);
      g.drawLine(300, 400, 350, 300);
      g.drawLine(350, 300, 400, 400);
      g.drawLine(250, 450, 450, 450);
      g.drawArc(250, 400, 200, 100, 180, 180);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
