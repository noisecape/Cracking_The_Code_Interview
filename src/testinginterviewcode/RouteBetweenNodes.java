/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Solution to exercise 4.1 from Cracking the coding interview
 * @author tommasocapecchi
 */
public class RouteBetweenNodes {
    
    boolean isPath(GraphNode s, GraphNode e){
        boolean result = false;
        Queue <GraphNode> queue = new LinkedList<>();
        s.visited = true;
        queue.add(s);
        while(!queue.isEmpty() && !result){
            GraphNode current = queue.poll(); //deque
            System.out.println(current.value);
            for(GraphNode node : current.adjacents){
                if(node.visited != true){
                    node.visited = true;
                    queue.add(node);
                    if(node == e){
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
