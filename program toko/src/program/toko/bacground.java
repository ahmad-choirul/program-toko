/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.toko;

import javax.swing.JDesktopPane;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


/**
 *
 * @author acer
 */
public class bacground extends JDesktopPane{
    protected void paintcomponent (Graphics g){
    Graphics2D graphics = (Graphics2D)g.create();
    ImageIcon img2= new ImageIcon(getClass().getResource("src/image/back1.png"));
    Image img=img2.getImage();
    graphics.drawImage(img,0, 0,getWidth(),getHeight(),null);
    }
}
