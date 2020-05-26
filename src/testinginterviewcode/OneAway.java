/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_question;

/**
 * Exercise 1.5 from Cracking code interview
 * @author tommasocapecchi
 */
public class OneAway {
    
    boolean one_edit_away(String str1, String str2){
        if(str1.equals(str2))
            return true;
        else
            if(str1.length() > str2.length()){
                return manage_one_edit(str1,str2);
            }else if (str1.length() == str2.length()){
                return manage_replace(str1,str2);
            }else{
                return manage_one_edit(str2,str1);
            }
    }
    
    boolean manage_one_edit(String bigger, String shorter) {
        for(int i = 0; i<shorter.length(); i++){
            if(shorter.charAt(i) != bigger.charAt(i)){
                String managed_string = manage_delete(bigger,i);
                return shorter.equals(managed_string);
            }
        }
        String managed_string = manage_delete(bigger, bigger.length());
        return managed_string.equals(shorter);
    }
    
    String manage_delete(String bigger, int index){
        String prefix = bigger.substring(0,index);
        String suffix = bigger.substring(index+1);
        return prefix + suffix;
    }
    
    boolean manage_replace(String str1, String str2){
        String final_string = "";
        for(int i = 0; i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                String different_char = str2.substring(i,i+1);
                String prefix = str1.substring(0,i);
                String suffix = str1.substring(i+1);
                final_string = prefix + different_char +suffix;
                break;
            }
        }
        
        return final_string.equals(str2);
    }
}
