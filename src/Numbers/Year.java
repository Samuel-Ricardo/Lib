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
public class Year {
 
    public boolean isBissexto(int year){
    
        if((year%4 == 0 && year%400 == 0) || year%100 != 0){
            
            return true;
        }else{
        
            return false;
        }
    }
}
