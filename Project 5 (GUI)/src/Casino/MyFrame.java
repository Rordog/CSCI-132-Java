/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author rdonl
 */
public class MyFrame extends JFrame{
    
    private static MyFrame inst;
    
    public static MyFrame getInstance()
    {
        if (inst == null)
            inst = new MyFrame();
        return inst;
    }
    MyFrame(){
       setSize(500,300);
       setLocation(400,100);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ButtonPanel bp = ButtonPanel.getInstance();
       PaintPanel pp = PaintPanel.getInstance();
       getContentPane().add(bp, BorderLayout.SOUTH);
       getContentPane().add(pp, BorderLayout.CENTER);
       
       setVisible(true);
       
    }
    
    

    
}
