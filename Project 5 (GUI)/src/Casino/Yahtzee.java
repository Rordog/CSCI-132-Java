

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author rdonl
 */
public class Yahtzee {
    
/**
 *
 * @author rdonl
 */
    Random num = new Random();
    private int yah = 0;
    private int four = 0;
    private int full = 0;
    private int three = 0;
    private int straight = 0;
    private int nothing = 0;
    private int bank = 50;
    PaintPanel pp;
    /**
     * @param args the command line arguments
     */
    
    public void rollDice(){
        int yah = 0;
        int four = 0;
        int full = 0;
        int three = 0;
        int straight = 0;
        int nothing = 0;
        int[] rolls = new int[5];
        
        for (int j = 0; j < 5; j++){
            rolls[j] = num.nextInt(6) + 1;
        }
        int[] sorted = rolls;
        Arrays.sort(sorted);
        if (sorted[0] == sorted[4]){
            yah += 1;
        }
        else if ((sorted[0] == sorted[3]) || (sorted[1] == sorted[4])){
            four += 1;
        }
        else if ((sorted[0] == sorted[2] && sorted[3] == sorted[4]) || (sorted[0] == sorted[1] && sorted[2] == sorted[4])){
            full += 1;
        }
        else if (sorted[0] == sorted[2] || sorted[1] == sorted[3] || sorted[2] == sorted[4]){
            three += 1;
        }
        else if ((sorted[0] == sorted[1] -1) && (sorted[1] == sorted[2] - 1) && (sorted[2] == sorted[3] - 1) && (sorted[3] == sorted[4] -1)){
            straight += 1;
        }
        else{
            nothing += 1;
        }
        displayDice(rolls);
    }
    
    public void gamble(){
        pp = new PaintPanel();
        if(yah == 1){
            bank += 150;
            pp.yahtzee(bank);
        }
        else if(full == 1){
            bank += 50;
            pp.full(bank);
        }
        else if(straight == 1){
            bank += 40;
            pp.straight(bank);
        }
        else if(four == 1){
            bank += 30;
            pp.four(bank);
        }
        else if(three == 1){
            bank += 10;
            pp.three(bank);
        }
        else if(nothing == 1){
            bank -= 5;
            pp.gamblersDebt(bank);
        }
        
    }
    public void displayDice(int[] results){
        for(int i = 0; i < 5; i++){
            pp = new PaintPanel();
            switch (results[i]) {
                case 1:
                    pp.drawOne(i);
                    break;
                case 2:
                    pp.drawTwo(i);
                    break;
                case 3:
                    pp.drawThree(i);
                    break;
                case 4:
                    pp.drawFour(i);
                    break;
                case 5:
                    pp.drawFive(i);
                    break;
                case 6:
                    pp.drawSix(i);
                    break;
                default:
                    break;
            }
        }
    }
}
