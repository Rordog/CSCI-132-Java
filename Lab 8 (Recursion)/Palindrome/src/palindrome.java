/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author rdonl
 */
public class palindrome {

    /**
     * @param word
     * @param args the command line arguments
     * @return 
     */
    public static boolean checkPalindrome(String word){
        
        if(word.length() == 0 || word.length() == 1)
            return true; 
        else if(word.charAt(0) == word.charAt(word.length() - 1))
            return checkPalindrome(word.substring(1, word.length() - 1));
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine();
        if(checkPalindrome(input) == true){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is not a palindrome");
        }
    }
    
}
