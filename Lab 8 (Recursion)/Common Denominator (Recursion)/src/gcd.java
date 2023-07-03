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
public class gcd {
    
    
    public static int hcf(int num1, int num2){
        if(num2 != 0){
            return hcf(num2, num1%num2);
        }
        else{
            return num1;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter an integer smaller than your last answer: ");
        int n2 = sc2.nextInt();
        int hcf = hcf(n1, n2);
        System.out.println("G.C.D. of " + n1 + " and " + n2 + " is " + hcf);
    }
    
}
