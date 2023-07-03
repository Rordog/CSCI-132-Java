/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author rdonl
 */
public class stacks {

    
    String s;
    Scanner console = new Scanner(System.in);
    char array[] = new char[20];
    int index;
    
    
    public void beginFun(){
        
        index = 0;
        System.out.println("Give a string");
        String input = console.nextLine();
        if(!"-1".equals(input)){
            
            for(int i = 0; i < input.length(); i++){
                array[i] = input.charAt(i);
            }
            for(int i = 0; i < input.length(); i++){
                
                if(array[i] == '0'){
                    push();
                }
                else{
                    pop();
                }
            }   
            
            if(index == 0){
                System.out.println("Accept String: " + input);
            }
            else{
                System.out.println("Reject String: " + input);
            }
            
            beginFun();
        }
        //while(!input.equals("-1"));



    }
    private void push(){
        index++;

    }
    private void pop(){
        index--;
    }
    public static void main(String[] args) {


        new stacks().beginFun();


    }


}
