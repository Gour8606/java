/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author WST
 */
public class FaceBasket extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
  public void paint (Graphics g){
   g.drawLine(100,100,200,300);
   g.drawLine(500,100,400,300);
   g.drawLine(200,300,400,300);
   g.drawLine(100,100,500,100);
   g.drawArc(245, 220, 100, 50, 180, 180);
   g.drawLine(270,230,320,230);
     g.drawLine(270,230,300,200);
       g.drawLine(300,200,320,230);
   g.drawOval(WIDTH, WIDTH, WIDTH, WIDTH);
   
  }
    
    
}
