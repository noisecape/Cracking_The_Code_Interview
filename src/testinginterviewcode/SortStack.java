/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.Stack;

/**
 * Solution to exercise 3.6 from Cracking the coding interview
 * @author tommasocapecchi
 */
public class SortStack {
    
    Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> sorted_stack = new Stack<>();
        for(int i = stack.size()-1; i>0; i--){
            if(sorted_stack.size() == 0){
                sorted_stack.push(stack.elementAt(i));
            }else{
                if(sorted_stack.peek() < stack.elementAt(i)){
                    int temp = sorted_stack.pop();
                    sorted_stack.push(stack.elementAt(i));
                    sorted_stack.push(temp);
                }else{
                    sorted_stack.push(stack.elementAt(i));
                }
            }
        }
        return sorted_stack;
    }
}
