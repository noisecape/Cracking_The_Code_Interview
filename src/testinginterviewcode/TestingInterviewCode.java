/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

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
        BT_Node node1 = new BT_Node(3,null,null);
        BT_Node node2 = new BT_Node(4,node1,null);
        BT_Node node3 = new BT_Node(7,null,null);
        BT_Node node4 = new BT_Node(22,null,node3);
        BT_Node node5 = new BT_Node(11,node4,null);
        BT_Node root = new BT_Node(9,node2,node5);
        HashMap<Integer,LinkedList<BT_Node>> table = new HashMap<>();
        
        new ListOfDepths().createLists(root);
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
