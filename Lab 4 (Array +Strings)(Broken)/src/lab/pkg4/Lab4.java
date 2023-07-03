/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author rdonl
 */
public class Lab4 {
    
    private int[] array = new int[10];
    
    public void populate(){
        for (int i =0; i < array.length; i++){
            Random num = new Random();
            array[i] = num.nextInt(10) + 1;
        }
    }
    public void printForward(){     
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void printBackwards(){
        for(int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
    public void secondLargest(){
        Arrays.sort(array);
        for(int i = 8; i >= 0; i--){
            if(array[i] < array[i+1])
                System.out.println("The second largest number is" + array[i]);
        }
    }
    public void average(){
        int average = 0;
        for(int i = 0; i < array.length; i++){
            average += array[i];
        }
        System.out.println("The average of the array is" + average/array.length);
    }
    public void histogram(){
        for(int i = 0; i < array.length; i++){
            String asterick = "";
            for(int k = 0; k < array[i]; k++){
                asterick += "*";
            }
            System.out.println(asterick);
        }
    }
    public void frequency(){
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int count = 1;
            int counted = -1;
            for(int j = 1; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                    array[j] = counted;
                }
            }
            if(array[i] != counted){
                count++;
            }
            if(array[i] != counted){
               System.out.println("The number " + array[i] + " is in the array " + count + " times"); 
            }
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        array.populate();
        array.printForward();
        array.printBackwards();
        array.secondLargest();
        array.average();
        array.histogram();
        array.frequency();
        
    }
    
}
