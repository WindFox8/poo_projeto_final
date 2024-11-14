/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public abstract class Pizza {
    private List<Sabor> sabores = new ArrayList<>();
    private double dimensao;
    private double area;
    private double valor;

    public Pizza(double dimensao, Sabor sabor1) {
        this.dimensao = dimensao;
        this.sabores.add(sabor1);
        this.sabores.add(sabor1);
        this.area = calcularArea();   
        this.valor = calcularValor(); 
    }

    public Pizza(double area, Sabor sabor1, boolean isArea) {
        this.area = area;
        this.sabores.add(sabor1);
        this.sabores.add(sabor1);
        this.dimensao = calcularDimensao(); 
        this.valor = calcularValor(); 
    }

    public Pizza(double dimensao, Sabor sabor1, Sabor sabor2) {
        this.dimensao = dimensao;
        this.sabores.add(sabor1);
        this.sabores.add(sabor2);
        this.area = calcularArea();   
        this.valor = calcularValor(); 
    }

    public Pizza(double area, Sabor sabor1, Sabor sabor2, boolean isArea) {
        this.area = area;
        this.sabores.add(sabor1);
        this.sabores.add(sabor2);
        this.dimensao = calcularDimensao(); 
        this.valor = calcularValor(); 
    }


    public void setSabores(Sabor sabor1, Sabor sabor2) {
        this.sabores.set(0, sabor1);
        this.sabores.set(1, sabor2);
    }

    public abstract double calcularArea();

    public abstract double calcularDimensao();

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
        this.area = calcularArea();  
        this.valor = calcularValor(); 
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.dimensao = calcularDimensao();
        this.valor = calcularValor();   
    }

    public double getValor() {
        return valor;
    }

    public double calcularValor() {
        double mediaPrecoSabores = (sabores.get(0).getValor() + sabores.get(1).getValor()) / 2;
        return getArea() * mediaPrecoSabores; 
    }
}
