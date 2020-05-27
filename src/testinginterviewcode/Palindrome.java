/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

/**
 * Solution for exercise 2.6 chapter 2
 * @author tommasocapecchi
 */
public class Palindrome {
    
    
    //Solution which suppose the size of the list is known.
    //If it isn't known, then you would iterate throught all the elements counting them.
    boolean checkPalindrome(LinkedListNode head, int size){
        boolean result = true;
        LinkedListNode current = head;
        for(int i = 0; i<(size+1)/2; i++){
            LinkedListNode correspondant = getCorrespondantNode(head,size,i);
            if(current.data != correspondant.data){
                return false;
            }
            current = current.next;
        }
        return result;
    }
    
    LinkedListNode getCorrespondantNode(LinkedListNode head, int size, int i){
        LinkedListNode node = head;
        for(int j = 0; j<size-1-i;j++){
            if(node.next == null)
                break;
            node = node.next;
        }
        return node;
    }
    
}
