/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.LinkedList;

/**
 *
 * @author tommasocapecchi
 */
public class GraphNode {
    boolean visited = false;
    int value;
    LinkedList<GraphNode> adjacents = new LinkedList<>();
    GraphNode(int value){
        this.value = value;
    }
}
