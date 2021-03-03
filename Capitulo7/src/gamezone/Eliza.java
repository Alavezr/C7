/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone;

/**
 *
 * @author alave
 */
public class Eliza {
    
    
    public static void main(String[] args) {
        String texto = " You can never cross the ocean until you hace the courage to lose sight of the shore";
       int num = texto.indexOf("karim");
       texto.charAt(3);
       texto.endsWith("ore");
       texto.replace("the", "karim");
      
        
        System.out.println(num);
        System.out.println(texto.charAt(1));
        System.out.println(texto.endsWith("or"));
        System.out.println(texto.replace("the", "karim"));
        System.out.println(texto.toUpperCase().replace("THE", "the"));
            }
    
}