/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author HP_All_in_One
 */
public class Teclado {
    
    private String marca;
    private String modelo;
    private int numeroDeTeclas;
    private int multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numeroDeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeTeclas = numeroDeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numeroDeTeclas=" + numeroDeTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
}
