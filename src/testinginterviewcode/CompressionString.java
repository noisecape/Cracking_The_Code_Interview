/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_question;

/**Solution Exercise 1.6 from Cracking the coding interview
 *
 * @author tommasocapecchi
 */
public class CompressionString {
    
    String stringCompression(String str){
        int[] occurrencies = new int[str.length()];
        int j = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                occurrencies[j]++;
            }else{
                occurrencies[j]++;
                j++;
            }
        }
        String compressed = computeCompression(str, occurrencies);
        if(compressed.length() >= str.length())
            return str;
        else
            return compressed;
    }
    
    String computeCompression(String str, int[] occurrencies){
        String result = "";
        int i = 0;
        int j = 0;
        while(i<str.length()-1){
            if(str.charAt(i) != str.charAt(i+1)){
                int value = occurrencies[j];
                if(value == 0)
                    break;
                result = result + str.substring(i,i+1) + value;
                j++;
            }
            i++;
        }
        int value = occurrencies[j];
        result = result + str.substring(i,i+1)+value;
        return result;
    }
}
