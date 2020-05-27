/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

/**
 * Solution to exercise 3.2 from Cracking the Coding Interview
 * @author tommasocapecchi
 */
public class CustomStack {
    int min = 0;
    int size;
    int numberOfElement = 0;
    int[] stack;
    
    CustomStack(int size){
        this.size = size;
        stack = new int[size];
        initStack();
    }
    
    void initStack(){
        for(int i = 0; i<size; i++){
            stack[i] = -1;
        }
    }
    
    void updateMinIndex(){
        int minIndex = 0;
        int i = 0;
        while(stack[i] != -1 && i < size ){
            if(i != minIndex && stack[i] < stack[minIndex])
                minIndex = i;
            i++;
        }
        min = minIndex;
    }
    
    void push(int value) throws Exception {
        if(numberOfElement < size){
            stack[numberOfElement] = value;
            updateMinIndex();
            numberOfElement++;
        }else{
            throw new Exception();
        }
    }
    
    int pop() throws Exception {
        if(numberOfElement > 0){
            numberOfElement--;
            stack[numberOfElement] = -1;
            updateMinIndex();
            return stack[numberOfElement];
        }else{
            throw new Exception();
        }
    }
    
    int getMin(){
        return stack[min];
    }
}
