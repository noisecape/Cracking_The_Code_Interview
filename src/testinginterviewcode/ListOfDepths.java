/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Solution to exercise 4.3 from Cracking the Coding Interview
 * @author tommasocapecchi
 */
public class ListOfDepths {
    
    ArrayList<LinkedList<BT_Node>> createLists(BT_Node root){
        ArrayList<LinkedList<BT_Node>> lists = new ArrayList<>();
        createLinkedLists(root,lists,0);
        return lists;
    }
    
    void createLinkedLists(BT_Node root, ArrayList<LinkedList<BT_Node>> lists, int level){
        if (root == null)
            return;
        LinkedList<BT_Node> list = null;
        if(lists.size() == level){
            list = new LinkedList<>();
            lists.add(list);
        }else{
            list = lists.get(level);
        }
        list.add(root);
        createLinkedLists(root.left_child,lists,level+1);
        createLinkedLists(root.right_child,lists,level+1);
    }
    
}
