/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

/**
 * Solution to exercise 2.2 from Cracking the coding interview
 * @author tommasocapecchi
 */
public class KtoLastElement {
    
    //iterative solution
    int getKtoLastElement(int k, LinkedListNode head){
        int i = 0;
        LinkedListNode next = head.next;
        LinkedListNode current = head;
        while(next != null){
            if(i != k){
                i++;
                next = next.next;
            }else{
                current = current.next;
                next = next.next;
            }
        }
        return current.data;
    }
    
    //recursive solution
    int getKtoLastElement_Recursive(int i, int k, LinkedListNode element, LinkedListNode head){
        LinkedListNode current = head;
        if(element == null){
            if(i == k){
                return current.data;
            }else{
                i++;
                return getKtoLastElement_Recursive(i,k,element,current.next);
            }
        }else{
            LinkedListNode next = element.next;
            return getKtoLastElement_Recursive(0,k,next.next,current);
        }
    }
    
}
