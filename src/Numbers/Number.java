/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

/**
 *
 * @author Samuel
 */
public class Number {
    
    public boolean isPar(int number){
        
        if(number%2 == 0){
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isImpar(int number){
        
        if(number%2 != 0){
            
            return true;
        }else{
            return false;
        }
    }
}
