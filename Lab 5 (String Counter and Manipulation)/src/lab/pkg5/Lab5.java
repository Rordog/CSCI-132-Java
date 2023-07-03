/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.util.Scanner;

/**
 *
 * @author rdonl
 */
public class Lab5 {
    
    public void runLab(String input){
        int menu = 0;
        while (menu != 5){
            printMenu();
            Scanner sc = new Scanner(System.in);
            int menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("What letter do you want to count?");
                    Scanner inputLetter = new Scanner(System.in);
                    String strLetter = inputLetter.nextLine();
                    char letter = strLetter.charAt(0);
                    int letterCount = 0;
                    for (int i = 0; i < input.length(); i++){
                        if(input.charAt(i) == letter){
                            letterCount += 1;
                        }
                    }
                    System.out.println("The letter " + letter + " was found " + letterCount + " times.");
                    break;
                    
                case 2:
                    int wordCount = 1;
                    input.concat(" ");
                    char ch[] = new char[input.length()];
                    for (int i = 0; i < input.length(); i++){
                        ch[i] = input.charAt(i);
                        if((ch[i] == ' ') && (ch[i-1] != ' ')){
                            wordCount += 1;
                        }
                    }
                    System.out.println("There are " + wordCount + " words in the input");
                    break;
                    
                case 3:
                    
                    System.out.println(input.replaceAll("\\s", ""));
                    break;
                    
                case 4:
                    System.out.println("What is your new string?");
                    Scanner str = new Scanner(System.in);
                    String newStr = str.nextLine();
                    System.out.println("Your string has been changed to: " + newStr);
                    input = newStr;
                    break;
                    
                case 5:
                    return;
                    
                default:
                    break;
            }
        }
    }
    public void printMenu(){
        System.out.println("Press 1 to count the occurrence of a particular letter");
        System.out.println("Press 2 to count the total words in your string");
        System.out.println("Press 3 to print the string without spaces");
        System.out.println("Press 4 to change your string");
        System.out.println("Press 5 to exit");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please write a string to start");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Lab5 test = new Lab5();
        test.runLab(input);
    }
    
}
