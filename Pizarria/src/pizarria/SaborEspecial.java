/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class SaborEspecial extends Sabor{
    private static double valorEspecial;

    public SaborEspecial(String sabor){
        super(sabor);
    }

  

   public static void setValorEspecial(double valorR){
       valorEspecial = valorR;
   }
    
    
    @Override
    public double getValor() {
        return valorEspecial;
    }
    
    public static double getValorEspecial(){
        return valorEspecial;
    }


}
