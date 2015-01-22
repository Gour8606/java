/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

/**
 *
 * @author WEL
 */
public class MyEvent extends Applet implements MouseListener, MouseMotionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
     public int x;
     public int y;
     String str = "";
     Scanner in = new Scanner(System.in);
     @Override
     public int getX(){
        return x; 
     }
     public void setX(){
         x = 10;
     }
     @Override
     public int getY(){
        return y; 
     }
     public void setY(){
         y = 20;
     }
     @Override
    public void init() {
       this.addMouseListener(this);
        this.addMouseMotionListener(this);
     
       repaint();
        // TODO start asynchronous download of heavy resources
    }
    
     @Override
    public void mouseEntered(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is entered";
        repaint();
    }
     @Override
    public void mouseExited(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is exited";
        repaint();
    }
     @Override
    public void mousePressed(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is pressed";
        repaint();
    }
     @Override
    public void mouseReleased(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is released";
        repaint();
    }
    
     @Override
    public void mouseDragged(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is dragged";
        repaint();
    }
     @Override
    public void mouseClicked(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is clicked";
        repaint();
    }
     @Override
    public void mouseMoved(MouseEvent me){
        x =  me.getX();
        y = me.getY();
        str = "mouse is clicked";
        repaint();
    }
     @Override
    public void paint(Graphics g){
        g.drawString(str, x, y);
        
    }

}
    // TODO overwrite start(), stop() and destroy() methods

