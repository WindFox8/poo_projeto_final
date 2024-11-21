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
    private static double valorPremium;

    public SaborPremium(String sabor){
        super(sabor);
    }
    
   @Override
    public double getValor() {
        return this.valorPremium;
    }
    public static void setValorPremium(double valorR){
       valorPremium = valorR;
    }
    
    public static double getValorPremium(){
        return valorPremium;
    }
   
    
}
