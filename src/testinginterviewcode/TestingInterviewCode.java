/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.ArrayList;
import java.util.Arrays;
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
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        
        LinkedList<GraphNode> list0 = new LinkedList<>();
        list0.add(node1);
        list0.add(node2);
        node0.adjacents = list0;
        
        LinkedList<GraphNode> list1 = new LinkedList<>();
        list1.add(node3);
        node1.adjacents = list1;
        
        LinkedList<GraphNode> list2 = new LinkedList<>();
        list2.add(node3);
        list2.add(node1);
        node2.adjacents = list2;
        
        LinkedList<GraphNode> list3 = new LinkedList<>();
        list3.add(node4);
        node3.adjacents = list3;
        
        LinkedList<GraphNode> list4 = new LinkedList<>();
        list4.add(node5);
        list4.add(node2);
        node4.adjacents = list4;
        
        LinkedList<GraphNode> list5 = new LinkedList<>();
        node5.adjacents = list5;
        
        System.out.println(new RouteBetweenNodes().isPath(node3, node2));
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
