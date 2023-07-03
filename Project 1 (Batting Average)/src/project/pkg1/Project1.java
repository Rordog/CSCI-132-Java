/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;
import java.util.ArrayList;
/**
 *
 * @author rdonl
 */
public class Project1 {
    private String[] Swing;
    ArrayList<Integer> batting_code = new ArrayList<Integer>();
    private float finalOB;
    private float OB;
    private float all_swings;
    private float finalBA;
    private float BA;
    private float all_trials;
    
    /*
    set up batting options as associated codes entered into an array
    have on_base and batting_average interpret the code numbers in the array 
    */
    public Project1(String[] results){
        Swing = results;
    }
    public ArrayList<Integer> batter_up(){
        
        for (int i=0; i < Swing.length; i++) {
            if ("Hit".equals(Swing[i])){
                batting_code.add(0);
            }
            else if ("Out".equals(Swing[i])){
                batting_code.add(1);
            }
            else if ("Ball".equals(Swing[i])){
                batting_code.add(2);
            }
            else if ("Defensive Error".equals(Swing[i])){
                batting_code.add(3);
            }
            else{
                System.out.println("There is an unexpected input. Please reread rules of baseball.");
            }
            
        }
        return batting_code;
    }
    public float on_base(){        
        for (int i = 0; i < batting_code.size(); i++){
            if (batting_code.get(i) == 0){
                OB += 1;
                all_swings += 1;
            }
            else if(batting_code.get(i) == 1){
                all_swings += 1;
            }
            else if(batting_code.get(i) == 2){
                OB += 1;
                all_swings += 1;
            }
            else{
                OB += 1;
                all_swings += 1;
            }
        
        }
        finalOB = OB / all_swings;
        
        return finalOB;
    }
    public float batting_average(){
        for (int i = 0; i < batting_code.size(); i++){
            if (batting_code.get(i) == 0){
                BA += 1;
                all_trials += 1;
            }
            else if(batting_code.get(i) == 1){
                all_trials += 1;
            }
            else if(batting_code.get(i) == 2){
                
            }
            else{
                
                all_trials += 1;
            }
        }
        finalBA = BA / all_trials;
        return finalBA;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] results = {"Hit", "Out", "Ball", "Defensive Error", "Hit"};
        Project1 Steve = new Project1(results);
        Steve.batter_up();
        System.out.println(Steve.on_base());
        System.out.println(Steve.batting_average());
        
        
        String[] results1 = {"Hit", "Hit", "Out","Ball", "Hit"};
        Project1 Chris = new Project1(results1);
        Chris.batter_up();
        System.out.println(Chris.on_base());
        System.out.println(Chris.batting_average());
        
        String[] results2 = {"Out", "Out", "Defensive Error", "Ball", "Hit", "Out"};
        Project1 John = new Project1(results2);
        John.batter_up();
        System.out.println(John.on_base());
        System.out.println(John.batting_average());
        
        
    }
    
}
