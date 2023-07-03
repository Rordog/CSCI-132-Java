/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistspring2021;

/**
 *
 * @author Hunter
 */
public class LinkedList {
    private Node first;
    private Node last;
    
    LinkedList()
    {
        first = null;
    }
  
    public void deleteList()
    {
        first = null;
    }
    public void add(int x){
       
        Node temp  = new Node(x);
        
            temp.setNext(first);
            if(first == null){
               first = temp;
            }
            else{
               last.setNext(temp);
            }
            last = temp;
            last.setNext(first);
    }
    
    public void print()
    {
        Node temp = first;
        int c = 0;
        while (temp != null){ 
            if (temp == first){
                c++;
                if (c < 2){
                    System.out.println(temp.getData());
                    temp = temp.getNext();
                }
                else{
                    break;
                }
            }
            else{
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
            
    }
    public void printBackwards(){
        Node temp = last;
        int c = 0;
        while (temp != null){ 
            if (temp == last){
                c++;
                if (c < 2){
                    System.out.println(temp.getData());
                    temp = temp.getPrev();
                }
                else{
                    break;
                }
            }
            else{
                System.out.println(temp.getData());
                temp = temp.getPrev();
            }
        }
    }
    
    public void search(int index)
    {
        Node temp = first;
        boolean found = false;
        int c = 0;
        while(temp !=  null){
            while(found == false && c != 1){
                if (temp == last){
                    c++;
                }
                if (temp.getData() == index){
                    found = true;
                    System.out.println("Found " + index);
                    return;
                }
                temp = temp.getNext();
            }
            System.out.println("Didn't find " + index);
            break;
        }
        
        
            
     }
    public void deleteNode(int x){
        Node temp = first;
        
        if(temp == null)
            return;
        
        if (temp.getData() == x)
        {
            first.getNext();
            first = temp.getNext();
            return;
        }
        else{
           //lagptr = first;
            temp = temp.getNext();
        }
        while(temp !=  null)    
        {
            if (temp.getData() == x)
            {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                return;
             }
            //lagptr = temp;
            temp = temp.getNext();
        }
        
        System.out.println("Didn't find " + x);
    }
}
