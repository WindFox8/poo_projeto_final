/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

/**
 *
 * @author rafae
 */
public class PizzaTriangular extends Pizza {
    public PizzaTriangular(double lado, Sabor sabor1) {
        super(lado, sabor1);
    }

    public PizzaTriangular(double lado, Sabor sabor1, Sabor sabor2) {
        super(lado, sabor1, sabor2);
    }

    public PizzaTriangular(double area, Sabor sabor1, boolean isArea) {
        super(area, sabor1, isArea);
    }

    public PizzaTriangular(double area, Sabor sabor1, Sabor sabor2, boolean isArea) {
        super(area, sabor1, sabor2, isArea);
    }

    @Override
    public double calcularArea() {
        double lado = getDimensao();
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularDimensao() {
        return Math.sqrt((4 * getArea()) / Math.sqrt(3));
    }
}