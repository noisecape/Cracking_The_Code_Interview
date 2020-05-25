/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinginterviewcode;

import java.util.ArrayList;

/**
 *
 * @author tommasocapecchi
 */
public class Permutations {
    
    public ArrayList<int[]> permutations(int[] array){
        ArrayList<int[]> results = new ArrayList<>();
        permutations(array, 0, results);
        return results;
    }
    
    public void permutations(int[] array, int start, ArrayList<int[]> results) {
        if(start >= array.length){
            results.add(array.clone());
        }else{
            for (int i = start; i<array.length; i++){
                swap(array,start,i);
                permutations(array,start+1,results);
                swap(array,start,i);
            }
        }
    }
    
    public void swap (int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
