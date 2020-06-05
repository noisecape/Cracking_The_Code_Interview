/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

/**
 *
 * @author tommasocapecchi
 */
public class BT_Node {
    
    int value;
    BT_Node left_child;
    BT_Node right_child;
    
    BT_Node(int value, BT_Node left_child, BT_Node right_child){
        this.value = value;
        this.left_child = left_child;
        this.right_child = right_child;
    }
}
