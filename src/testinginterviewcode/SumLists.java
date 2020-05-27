/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

/**
 * Solution to exeercise 2.5 from Cracking the Coding Interview
 * 
 * @author tommasocapecchi
 */
public class SumLists {
    
    //INCOMPLETE
    LinkedListNode sumLists(LinkedListNode first, LinkedListNode second){
        int remainder = 0;
        LinkedListNode prev = new LinkedListNode(0,null);
        LinkedListNode result = null;
        while(first != null && second != null){
            prev.data = first.data+second.data+remainder;
            if(prev.data % 10 != 0){
                int temp = prev.data;
                remainder = prev.data % 10;
                prev.data = remainder;
                remainder = temp / 10;
            }
            if(result != null){
                insertNode(result, prev);
            }else{
                result = prev;
            }
            first = first.next;
            second = second.next;
        }
        return result;
    }
    
    void insertNode(LinkedListNode head, LinkedListNode node_to_add){
        LinkedListNode node = head;
        while(node.prev != null){
            node = node.prev;
        }
        node.prev = node_to_add;
    }
}
