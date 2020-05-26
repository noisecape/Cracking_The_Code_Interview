/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_question;

import java.util.LinkedList;

/**
 * Solution to exercise 2.1 from Cracking the coding interview.
 * 
 * @author tommasocapecchi
 */
public class RemoveDups {
    
    void removeDups(LinkedList<Node> list){
        for(int i = 0; i<list.size()-1; i++){
            int currentValue = list.get(i).value;
            for(int j = i+1; j<list.size();j++){
                if(list.get(j).value == currentValue){
                    list.remove(j);
                }
            }
        }
    }
}
