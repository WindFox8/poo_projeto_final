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
    private static double valor;

    public SaborSimples(String sabor){
      super(sabor);
    }

    @Override
    public double getValor() {
      return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}