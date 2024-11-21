/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class PizzaQuadrada extends Pizza {
    public PizzaQuadrada(double lado, Sabor sabor1) {
        super("Quadrada",lado, sabor1);
    }

    public PizzaQuadrada(double lado, Sabor sabor1, Sabor sabor2) {
        super("Quadrada", lado, sabor1, sabor2);
    }

    public PizzaQuadrada(double area, Sabor sabor1, boolean isArea) {
        super("Quadrada", area, sabor1, isArea);
    }

    public PizzaQuadrada(double area, Sabor sabor1, Sabor sabor2, boolean isArea) {
        super("Quadrada", area, sabor1, sabor2, isArea);
    }

    @Override
    public double calcularArea() {
        double lado = getDimensao();
        return lado * lado;
    }

    @Override
    public double calcularDimensao() {
        return Math.sqrt(getArea());
    }
}
