/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.LinkedList;

/**
 * Solution to exercise 4.2 from Cracking the Coding Interview
 * @author tommasocapecchi
 */
public class MinimalTree {
        
    Node_BST minimalTree(int[] list){
        return createBST(list,0,list.length-1);
    }

    Node_BST createBST(int[] list, int start, int end) {
        if(end<start){
            return null;
        }else{
            int mid = (start+end)/2;
            Node_BST node = new Node_BST(list[mid]);
            node.left_child = createBST(list,start, mid-1);
            node.right_child = createBST(list,mid+1, end);
            return node;
        }
    }
}
