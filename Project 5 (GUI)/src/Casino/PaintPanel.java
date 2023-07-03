/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
/**
 *
 * @author rdonl
 */

public class PaintPanel extends JPanel{
    
    /*
    int paintX;
    int paintY;
    private final int NUMDICE = 5;
    private final int DW = 80;
    */
    Graphics2D gc;
    BufferedImage bi = new BufferedImage(80, 60,BufferedImage.TYPE_INT_RGB);
    Graphics2D g2 = bi.createGraphics();
    BufferedImage grid;
    
    
    private static PaintPanel inst;
    
    public static PaintPanel getInstance()
    {
        if (inst == null)
            inst = new PaintPanel();
        return inst;
    }
    
    public PaintPanel(){
        setBackground(Color.GREEN);
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if (grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid =  (BufferedImage) (this.createImage(w, h));
            gc = grid.createGraphics();
            gc.setColor(Color.green);
            gc.fillRect(0,0, w, h);
        }
        g2.drawImage(grid, null, 0, 0);   
      
    }  
    public void clearPanel(){
        grid = null;
        repaint();
    }
    
    public void dice(){
        
        //Donley
        gc.setColor(new Color(0,0,255));
        gc.fillRect(16, 20, 80, 80);
        gc.fillRect(113, 50, 80, 80);
        gc.fillRect(210, 50, 80, 80);
        gc.fillRect(307, 50, 80, 80);
        gc.fillRect(404, 50, 80, 80);
        repaint();
    }
    
    //Creates the dots on each die
    public void drawOne(int space){
        g2.setColor(Color.red);
        int bonus = space * 97;
        g2.fillOval(46 + bonus, 50, 20, 20);
        repaint();
    }
    public void drawTwo(int space){
        g2.setColor(Color.red);
        int bonus = space * 97;
        //top dot
        g2.fillOval(21 + bonus, 25, 20, 20);
        //bottom dot
        g2.fillOval(71 + bonus, 75, 20, 20);
        repaint();
    }
    public void drawThree(int space){
        g2.setColor(Color.red);
        int bonus = space * 97;
        //top dot
        g2.fillOval(71 + bonus, 25, 20, 20);
        //middle dot
        g2.fillOval(46 + bonus, 50, 20, 20);
        //bottom dot
        g2.fillOval(21 + bonus, 75, 20, 20);
        repaint();
    }
    public void drawFour(int space){
        g2.setColor(Color.red);
        int bonus = space * 97;
        //top left
        g2.fillOval(21 + bonus, 25, 20, 20);
        //top right
        g2.fillOval(71 + bonus, 25, 20, 20);
        //bottom left
        g2.fillOval(21 + bonus, 75, 20, 20);
        //bottom right
        g2.fillOval(71 + bonus, 75, 20, 20);
    }
    public void drawFive(int space){
        drawOne(space);
        drawFour(space);
    }
    public void drawSix(int space){
        g2.setColor(Color.red);
        int bonus = space * 97;
        //top left
        g2.fillOval(21 + bonus, 25, 20, 20);
        //top right
        g2.fillOval(71 + bonus, 25, 20, 20);
        //middle left
        g2.fillOval(21 + bonus, 50, 20, 20);
        //middle right
        g2.fillOval(71 + bonus, 50, 20, 20);
        //bottom left
        g2.fillOval(21 + bonus, 75, 20, 20);
        //bottom right
        g2.fillOval(71 + bonus, 75, 20, 20);
        repaint();
    }
    
    //Prints the money balance
    public void yahtzee(int money){        
        g2.drawString("Yahtzee, winner", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
    public void straight(int money){        
        g2.drawString("Straight, winner", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
    public void full(int money){
        g2.drawString("Full House, winner", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
    public void four(int money){
        g2.drawString("Four of a kind, winner", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
    public void three(int money){        
        g2.drawString("Three of a kind, winner", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
    public void gamblersDebt(int money){
        g2.drawString("Losing roll", 50, 120);
        g2.drawString("$" + money, 50, 150);
        repaint();
    }
}
