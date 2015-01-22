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
public class OvalSquare extends Applet {

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
      g.drawRect(100, 100, 500, 500);
      g.drawOval(200, 100, 300, 500);
      g.drawLine(200, 400, 500, 400);
      g.drawLine(200, 400, 350, 100);
      g.drawLine(350, 100, 500, 400);
    }
    

    // TODO overwrite start(), stop() and destroy() methods
}
