/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class SaborSimples extends Sabor{
    private static double valorSimples;

    public SaborSimples(String sabor){
      super(sabor);
    }

  
     @Override
    public double getValor() {
        return this.valorSimples;
    }

    public static void setValorSimples(double valorR){
       valorSimples = valorR;
   }
    
    public static double getValorSimples(){
        return valorSimples;
    }
    
}
