/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Samuel
 */
public class Vogal {
    
    public boolean isVogal(String string){
        
        if("a".equals(string) || "e".equals(string) || "i".equals(string) || "o".equals(string) || "u".equals(string)){
            
            return true;
        }else{
            return false;
        }
    }
}
