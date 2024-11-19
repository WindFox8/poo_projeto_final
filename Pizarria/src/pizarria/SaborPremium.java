/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class SaborPremium extends Sabor{
    private static double valor;

    public SaborPremium(String sabor){
        super(sabor);
    }
    
    public static double getValorPremium() {
        return valor;
    }

    public static void setValorPremium(double valorR) {
        valor = valorR;
    }
}
