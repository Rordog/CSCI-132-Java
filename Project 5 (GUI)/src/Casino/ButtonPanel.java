/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 *
 * @author rdonl
 */
public class ButtonPanel extends JPanel implements ActionListener{
    
    Yahtzee game;
    PaintPanel pp;
    private static ButtonPanel inst;
    private JButton reset;
    private JButton roll;
    
    public static ButtonPanel getInstance()
    {
        if (inst == null)
            inst = new ButtonPanel();
        return inst;
    }
    
    private ButtonPanel(){
        pp = PaintPanel.getInstance();
        setBackground(Color.GREEN);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        reset = new JButton("Clear");
        roll = new JButton("Roll Again");
        add(reset);
        add(roll);
        reset.addActionListener(this);
        roll.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getActionCommand().equals("Clear")){
            pp.clearPanel();
            roll.setEnabled(true);
            
        }
        else if(ae.getActionCommand().equals("Roll Again")){
            game = new Yahtzee();
            roll.setEnabled(false);
            pp = new PaintPanel();
            pp.dice();
            game.rollDice();
            game.gamble();
        }
    }
}
