/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_question;

/**
 *
 * @author tommasocapecchi
 */
public class Node {
    int value;
    Node prev;
    Node next;
    
    Node(int value){
        this.value = value;
    }
    
    void setPrev(Node prev){
        this.prev = prev;
    }
    
    void setNext(Node next){
        this.next = next;
    }
    
    Node getPrev(){
        return this.prev;
    }
    
    Node getNext(){
        return this.next;
    }
    
}
