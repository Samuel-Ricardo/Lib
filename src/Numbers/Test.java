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
public abstract class Test {
 
    
    
    public static void main(String[] args) {
        
        Number number = new Number();
        
        System.out.println("È par? "+number.isPar(3));
        System.out.println("È impar? "+number.isImpar(3));
        
        Year year = new Year();
        
        System.out.println("è bissexto? "+ year.isBissexto(2024));
        System.out.println("è bissexto? "+ year.isBissexto(2019));
    }
}
