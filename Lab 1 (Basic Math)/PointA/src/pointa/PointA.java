/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointa;

/**
 *
 * @author rdonl
 */
public class PointA {
    private int Xcoor;
    private int Ycoor;
    private float slope;
    private float b;
    
    public PointA(int X, int Y){
        Xcoor = X;
        Ycoor = Y;
    }
    public int getX(){
        return Xcoor;
    }
    public int getY(){
        return Ycoor;
    }
    public PointA reflect_x(){
        return new PointA(Xcoor, Ycoor*-1);
    }
    public float[] get_line_to(PointA endPoint){
        slope = (endPoint.Ycoor - Ycoor)/(endPoint.Xcoor - Xcoor);
        b = Ycoor - slope * Xcoor;
        System.out.println(endPoint.Xcoor);
        System.out.println(endPoint.Ycoor);
        float[] formula = {slope, b};
        return formula;
    }
    public float getSlope(){
        return slope;
    }
    
    public float getYIntercept(){
        return b;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PointA first = new PointA(3, -5);
        PointA second = first.reflect_x();
        System.out.println("First (" + first.getX() + "," + first.getY() + ") Second (" + second.getX() + "," + second.getY() + ")");
        PointA b = new PointA(-7, 10);
        first.get_line_to(b);
        System.out.println("y=" + first.getSlope() + "x+" + first.getYIntercept());
    }

   
    
}
