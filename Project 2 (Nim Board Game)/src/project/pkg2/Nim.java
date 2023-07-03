/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rdonl
 */
public class Nim {
    
    /*Scanner sc = new Scanner(System.in);
    private int turnAmount = sc.nextInt();*/
    Random num = new Random();
    private int marbles = num.nextInt(91) + 10;
    Random mode = new Random();
    private int CMode = mode.nextInt(2);
    Random flip = new Random();
    private int firstMove = flip.nextInt(2);
    
    public void startGame(){
        System.out.println("The starting amount of marbles will be: " + marbles);
        if (firstMove == 0){
            System.out.println("Human goes first");
        }
        if (firstMove == 1){
            System.out.println("Computer goes first");          
        }
    }
    
    public void takeTurns(){
        int turnAmount = 0;
        while (marbles > 1){
            if (firstMove == 0){
                if (marbles != 1){
                int turnLimit = marbles/2;    
                Scanner sc = new Scanner(System.in);
                System.out.println("There are " + marbles + " marbles in the stack");
                System.out.println("You can take between 1 and " + turnLimit + " marbles");
                System.out.println("How many marbles would you like to take?");
                String amount = sc.nextLine();
                turnAmount = Integer.parseInt(amount);
                marbles -= turnAmount;
                System.out.println("There are " + marbles + " left");
                firstMove = 1;
                }
                else if (marbles == 1){
                    
                }
            }
            if (firstMove == 1){
                if (CMode == 0){
                    if (marbles != 1){
                    int turnLimit = marbles/2;
                    Random dumb = new Random();
                    int dumbComp = dumb.nextInt(turnLimit) + 1;
                    System.out.println("Computer takes " + dumbComp + " marbles");
                    marbles -= dumbComp;
                    }
                    else {
                        System.out.println("Human wins!");
                        marbles = 0;
                    }
                    if (marbles == 1){
                        System.out.println("There is 1 marble in the stack");
                        System.out.println("You can take between 1 and 1 marble");
                        System.out.println("Computer wins!"); 
                        marbles = 0;
                    }
                }
                if (CMode == 1){
                    if (marbles != 1){
                    int smartComp = smort(marbles);
                    System.out.println("Computer takes " + smartComp + " marbles");
                    marbles -= smartComp;
                    }
                    else {
                        System.out.println("Human wins!");
                        marbles = 0;
                    }
                    if (marbles == 1){
                        System.out.println("There is 1 marble in the stack");
                        System.out.println("You can take between 1 and 1 marble");
                        System.out.println("Computer wins!"); 
                        marbles = 0;
                    }
                }
                firstMove = 0;
            }
        }
    }
    
    public int smort(int num){
        int turnLimit = num / 2;
        int turn = 0;
        Random legal = new Random();
        int randomLegal = legal.nextInt(turnLimit) + 1;
        if (num == 63){
            turn = randomLegal;
        }
        else if (num == 31){
            turn = randomLegal;
        }
        else if (num == 15){
            turn = randomLegal;
        }
        else if (num == 7){
            turn = randomLegal;
        }
        else if (num == 3){
            turn = randomLegal;
        }
        else if (num == 2){
            turn = 1;
        }
        
        else{
            if (4 <= num && num <= 6){
                turn = num - 3;
            }
            else if (8 <= num && num <= 14){
                turn = num - 7;
            }
            else if (16 <= num && num <= 30){
                turn = num - 15;
            }
            else if (32 <= num && num <= 62){
                turn = num - 31;
            }
            else if (64 <= num && num <= 100){
                turn = num - 63;
            }
        }
        return turn;
    }
    
    public static void main(String[] args) {
        Nim Game = new Nim();
        Game.startGame();
        Game.takeTurns();   
    }
    
}
