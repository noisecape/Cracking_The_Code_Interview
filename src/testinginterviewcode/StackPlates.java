/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Solution to exercise 3.3 from Cracking the coding interview
 * @author tommasocapecchi
 */
public class StackPlates {
    
    int capacity;
    LinkedList<Stack> stack_set = new LinkedList<>();
    
    StackPlates(int capacity){
        this.capacity = capacity;
        Stack<Integer> stack = new Stack<>();
        stack_set.add(stack);
    }
    
    void addElement(int value){
        if(stack_set.getLast().size() < capacity){
            stack_set.getLast().push(value);
        }else{
            Stack<Integer> new_stack = new Stack<>();
            new_stack.push(value);
            stack_set.add(new_stack);
        }
    }
    
    int popValue(){
        int value;
        if(stack_set.getLast().size() == 1){
            value = (int) stack_set.getLast().pop();
            stack_set.removeLast();
        }else{
            value = (int) stack_set.getLast().pop();
        }
        return value;
    }
    
    int popAt(int index){
        int value;
        if(index == stack_set.size()-1){
            if(stack_set.getLast().size() == 1){
                value = (int)stack_set.getLast().pop();
                stack_set.removeLast();
            }else{
                value = (int)stack_set.getLast().pop();
            }
        }else{
            value = (int)stack_set.getLast().pop();
        }
        return value;
    }
    
}
