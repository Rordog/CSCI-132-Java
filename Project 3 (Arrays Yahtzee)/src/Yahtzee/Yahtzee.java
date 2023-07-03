/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yahtzee;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author rdonl
 */
public class Yahtzee {
    Random num = new Random();
    private float yah = 0;
    private float four = 0;
    private float full = 0;
    private float three = 0;
    private float straight = 0;
    private float nothing = 0;
    /**
     * @param args the command line arguments
     */
    
    public void rollDice(){
        for (int i = 0; i < 5000; i++){
            int[] rolls = new int[5];
            for (int j = 0; j < 5; j++){
                rolls[j] = num.nextInt(6) + 1;
            }
            Arrays.sort(rolls);
            if (rolls[0] == rolls[4]){
                yah += 1;
            }
            else if ((rolls[0] == rolls[3]) || (rolls[1] == rolls[4])){
                four += 1;
            }
            else if ((rolls[0] == rolls[2] && rolls[3] == rolls[4]) || (rolls[0] == rolls[1] && rolls[2] == rolls[4])){
                full += 1;
            }
            else if (rolls[0] == rolls[2] || rolls[1] == rolls[3] || rolls[2] == rolls[4]){
                three += 1;
            }
            else if ((rolls[0] == rolls[1] -1) && (rolls[1] == rolls[2] - 1) && (rolls[2] == rolls[3] - 1) && (rolls[3] == rolls[4] -1)){
                straight += 1;
            }
            else{
                nothing += 1;
            }
        }
    }
    
    public void printResults(){
        float yahPercent = (yah * 100)/5000;
        float fullPercent = (full * 100)/5000;
        float straightPercent = (straight * 100)/5000;
        float fourPercent = (four * 100)/5000;
        float threePercent = (three * 100)/5000;
        float nothingPercent = (nothing * 100)/5000;
        System.out.println("Number of rolls: 5000");
        System.out.println("---------------------");
        System.out.println("Number of Yahtzees: " + yah);
        System.out.println("Yahtzee Percent: " + yahPercent + "%");
        System.out.println();
        System.out.println("Number of Full Houses: " + full);
        System.out.println("Full House Percent: " + fullPercent + "%");
        System.out.println();
        System.out.println("Number of Large Straights: " + straight);
        System.out.println("Large Straight Percent: " + straightPercent + "%");
        System.out.println();
        System.out.println("Number of Four of a Kind: " + four);
        System.out.println("Four of a Kind Percent: " + fourPercent + "%");
        System.out.println();
        System.out.println("Number of Three of a Kind: " + three);
        System.out.println("Three of a Kind Percent: " + threePercent + "%");
        System.out.println();
        System.out.println("Number of Losers: " + nothing);
        System.out.println("Losers Percentage: " + nothingPercent + "%");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Yahtzee y = new Yahtzee();
        y.rollDice();
        y.printResults();
    }
    
}
