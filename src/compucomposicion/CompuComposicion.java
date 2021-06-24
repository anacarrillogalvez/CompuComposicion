/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compucomposicion;

import ico.fes.componentes.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author HP_All_in_One
 */
public class CompuComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora co = new Computadora("HP", "R2D2");
        System.out.println(co); 
       
        Monitor com = new Monitor("Dell", "E4523", 14);
        System.out.println(com);
        
        Cpu comp = new Cpu("Dell", "HP", 4);
        System.out.println(comp);
        
        Mouse compu = new Mouse("HP", "RE23", "1");
        System.out.println(compu);
        
        Teclado comput = new Teclado("Cooler","Master", 90, 45);
        System.out.println(comput);
        
        
    }
    
}
