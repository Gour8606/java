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
public class MyHome extends Applet {

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
        g.drawLine(250, 100, 720, 100);
        g.drawLine(720, 100, 800, 200);
        
      g.drawRect(300, 200, 500, 300);
      g.drawRect(200, 200, 100, 300);
      g.drawRect(235, 450, 30, 50);
      
      g.drawLine(470, 337, 620, 337);
      g.drawLine(500, 375, 500, 301);
      g.drawLine(530, 375, 530, 301);
      g.drawLine(560, 375, 560, 301);
      g.drawLine(590, 375, 590, 301);
      g.drawOval(235, 150, 30, 30);
     
      g.drawLine(200, 200, 300, 200);
      g.drawLine(200, 200, 250, 100);
      g.drawLine(250, 100, 300, 200);
      g.drawRoundRect(470, 300, 150, 75,10,10);
      
      g.drawLine(800, 550, 800, 650);
      g.drawLine(850, 550, 850, 650);
      
      g.drawOval(785, 480, 80, 80);
      
      
      g.drawLine(800, 650, 760, 670);
      g.drawLine(800, 650, 780, 680);
      g.drawLine(800, 650, 820, 680);
      
      g.drawLine(850, 650, 820, 670);
      g.drawLine(850, 650, 840, 680);
      g.drawLine(850, 650, 880, 680);
      
      
      
      
    }
    

    // TODO overwrite start(), stop() and destroy() methods
}
