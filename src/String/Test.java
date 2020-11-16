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
public abstract class Test {
    
    public static void main(String[] args) {
        
        Vogal vogal = new Vogal();
        
        System.out.println("è vogal? "+vogal.isVogal("a"));
        System.out.println("è vogal? "+vogal.isVogal("e"));
        System.out.println("è vogal? "+vogal.isVogal("i"));
        System.out.println("è vogal? "+vogal.isVogal("o"));
        System.out.println("è vogal? "+vogal.isVogal("u"));
        System.out.println("è vogal? "+vogal.isVogal("b"));
        System.out.println("è vogal? "+vogal.isVogal("f"));
        System.out.println("è vogal? "+vogal.isVogal("g"));
    }
    
}
