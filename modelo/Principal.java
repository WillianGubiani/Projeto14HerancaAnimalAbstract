/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cao cao1 = new Cao();
        Lobo lob1 = new Lobo();
        Gato gat1 = new Gato();
        Leao leo1 = new Leao();
        Tigre tig1 = new Tigre();
        
        System.out.println(cao1.makeNoise());
        System.out.println(lob1.makeNoise());
        System.out.println(gat1.makeNoise());
        System.out.println(leo1.makeNoise());
        System.out.println(tig1.makeNoise());
        
        
        
    }
    
}
