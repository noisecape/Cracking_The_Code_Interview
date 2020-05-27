/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tommasocapecchi
 */
public class TestingInterviewCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestingInterviewCode main = new TestingInterviewCode();
        StackPlates stack_plates = new StackPlates(3);
        stack_plates.addElement(4);
        stack_plates.addElement(2);
        stack_plates.addElement(433);
        stack_plates.addElement(4);
        stack_plates.addElement(11);
        stack_plates.addElement(12);
        stack_plates.addElement(34);
        stack_plates.popValue();
        stack_plates.popAt(1);
    }
    
    boolean solution_ex1_1(String string){
        if(string.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i<string.length(); i++){
            int value = string.charAt(i);
            if(char_set[value]){
                return false;
            }
            char_set[value] = true;
        }
        return true;
    }
    
    boolean solution_ex1_2(String str1, String str2){
        char[] char_str1 = str1.toCharArray();
        char[] char_str2 = str2.toCharArray();
        if(char_str1.length != char_str2.length)
            return false;
        Arrays.sort(char_str1);
        Arrays.sort(char_str2);
        String sorted_str1 = new String(char_str1);
        String sorted_str2 = new String(char_str2);
        
        return sorted_str1.equals(sorted_str2);
    }
    
    boolean solution_ex1_2_alternative(String s, String t){
        if( s.length() != t.length())
            return false;
        //Assuming we are using ASCII strings
        int[] charCounts = new int[128];
        for(int i = 0; i< s.length(); i++){
            charCounts[s.charAt(i)]++;
        }
        for(int i = 0; i < t.length();i++){
            charCounts[t.charAt(i)]--;
            if (charCounts[t.charAt(i)] < 0)
                return false;
        }
        return true;
    }
    
    String solution_ex1_3(String s, int realLength){
        String substring = s.substring(0, realLength);
        return substring.replace(" ", "%20");
    }
}
