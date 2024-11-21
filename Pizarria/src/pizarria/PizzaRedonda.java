/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class PizzaRedonda extends Pizza {
    public PizzaRedonda(double raio, Sabor sabor1) {
        super("Circular",raio, sabor1);
    }

    public PizzaRedonda(double raio, Sabor sabor1, Sabor sabor2) {
        super("Circular", raio, sabor1, sabor2);
    }

    public PizzaRedonda(double area, Sabor sabor1, boolean isArea) {
        super("Circular", area, sabor1, isArea);
    }

    public PizzaRedonda(double area, Sabor sabor1, Sabor sabor2, boolean isArea) {
        super("Circular", area, sabor1, sabor2, isArea);
    }

    @Override
    public double calcularArea() {
        double raio = getDimensao();
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularDimensao() {
        return Math.sqrt(getArea() / Math.PI);
    }
}
