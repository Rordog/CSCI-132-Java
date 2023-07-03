/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author rdonl
 */
public class LinkedList {
    private Node first;
    //private Node last;
    private Node stun;
    private Node cow;
    private int stunAmount;
    private int cowAmount;
    private int arenaSize;
    private int printStun;
    private int printCow;
    //private LinkedList arena = new LinkedList();
    private PrintStream out;
    
    LinkedList()
    {
        first = null;
        readFile("input.txt");
    }
    
    public void readFile(String fileName){
        
        try{
           Scanner fin = new Scanner(new File(fileName));
           out = new PrintStream("LinkedListProgram.txt");
           while(fin.hasNext()){
               arenaSize = fin.nextInt();
               stunAmount = fin.nextInt();
               cowAmount = fin.nextInt();
               if (arenaSize == 0 && stunAmount == 0 && cowAmount == 0){
                   break;
               }
               else{
                   createFile();
                   buildArena();
                   elect();
                   
               }
           }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    
    }
    
    public void buildArena(){
        
        for(int i = 1; i <= arenaSize; i++){
            add(i);
        }
    }
    
    public void add(int x){
       
        Node temp  = new Node(x);
        
        if(first == null){
            temp.setNext(temp);
            temp.setPrev(temp);
            first = temp;
        } 
        else {
            Node before = first.getPrev();
            Node after = first;

            before.setNext(temp);
            after.setPrev(temp);
            temp.setNext(after);
            temp.setPrev(before);
        }
    }
    public void delete(Node temp){
        if(temp == first){
            first.getNext().setPrev(first.getPrev());
            first.getPrev().setNext(first.getNext());
            first = first.getNext();
        } 
        else {
            temp.getNext().setPrev(temp.getPrev());
            temp.getPrev().setNext(temp.getNext());
        }
    }
    public void elect(){
        //last = first.getPrev();
        stun = first;
        cow = first.getPrev();
        int ballot = arenaSize;
        
        while(ballot > 0){
            
            for(int i = 1; i < stunAmount; i++){
                stun = stun.getNext();
            }
            for(int i = 1; i < cowAmount; i++){
                cow = cow.getPrev();
            }
            if (stun.getData() == cow.getData()){
                printStun = stun.getData();
                printOne(printStun);
                delete(stun);
                stun = stun.getNext();
                cow = cow.getPrev();
                ballot--;
            }
            else{
                printStun = stun.getData();
                printCow = cow.getData();
                printTwo(printStun, printCow);
                delete(stun);
                delete(cow);
                if (stun.getNext() == cow){
                    stun = stun.getNext().getNext();
                    cow = cow.getPrev();
                }
                else{
                    stun = stun.getNext();
                    cow = cow.getPrev();
                }
                ballot = ballot - 2;
            }
        }
        
    }
    
    public void createFile(){
        out.println("Program 4");
        out.println("_________");
        out.println("N = " + arenaSize + ", k = " + stunAmount + ", m = " + cowAmount);
    }
    
    public void printOne(int printStun){
        out.println(printStun);
    }
    public void printTwo(int printStun, int printCow){
        out.println(printStun + " " + printCow);
    }
}
