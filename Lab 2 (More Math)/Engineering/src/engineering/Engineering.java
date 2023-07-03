/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineering;

/**
 *
 * @author rdonl
 */
public class Engineering {
    private int radius;
    private int width;
    private int height;
    
    Engineering(int ra){radius = ra;}
    Engineering(int wi, int he){width = wi;
    height = he;
    }
    public void changeLength(int x){radius += x; height += x;}
    
    public double circle(){
        return (3.14 * radius * radius);
    }
    public int rect(){
        return width * height;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Engineering r = new Engineering(6,7);
        Engineering c = new Engineering(7);
        c.changeLength(4);
        System.out.println(c.circle());
        r.changeLength(-5);
        System.out.println(r.rect());
       
        
        
        
    }
    
}
