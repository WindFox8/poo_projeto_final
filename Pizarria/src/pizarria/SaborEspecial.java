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
    private static double valor;

    public SaborEspecial(String sabor){
        super(sabor);
    }

    public static double getValorEspecial() {
        return valor;
    }

    public static void setValorEspecial(double valorR) {
        valor = valorR;
    }
}
