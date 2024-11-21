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
    //implementar forma 
    private String forma;
    private List<Sabor> sabores = new ArrayList<>();
    private double dimensao;
    private double area;
    private double valor;

    public Pizza(String forma,double dimensao, Sabor sabor1) {
        this.forma = forma;
        this.dimensao = dimensao;
        this.sabores.add(sabor1);
        this.area = calcularArea();   
        this.valor = calcularValorTotal(); 
    }

    public Pizza(String forma, double area, Sabor sabor1, boolean isArea) {
        this.forma = forma;
        this.area = area;
        this.sabores.add(sabor1);
        this.dimensao = calcularDimensao(); 
        this.valor = calcularValorTotal(); 
    }

    public Pizza(String forma, double dimensao, Sabor sabor1, Sabor sabor2) {
        this.forma = forma;
        this.dimensao = dimensao;
        this.sabores.add(sabor1);
        this.sabores.add(sabor2);
        this.area = calcularArea();   
        this.valor = calcularValorTotal(); 
    }

    public Pizza(String forma, double area, Sabor sabor1, Sabor sabor2, boolean isArea) {
        this.forma = forma;
        this.area = area;
        this.sabores.add(sabor1);
        this.sabores.add(sabor2);
        this.dimensao = calcularDimensao(); 
        this.valor = calcularValorTotal(); 
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
        this.valor = calcularValorTotal(); 
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.dimensao = calcularDimensao();
        this.valor = calcularValorTotal();   
    }

    public double getValor() {
        return valor;
    }

    public double calcularValorTotal() {
        double mediaPrecoSabores;
        if (sabores.size() >= 2) {
            mediaPrecoSabores = (sabores.get(0).getValor() + sabores.get(1).getValor()) / 2;
        } else {
            mediaPrecoSabores = sabores.get(0).getValor(); // Se só há um sabor, usa o valor do único sabor
        }
        return getArea() * mediaPrecoSabores;
    }


  
   public List<Sabor> getSabores (){
       return this.sabores;
   }
    
    public String getForma(){
        return this.forma;
    }

    public double getPrecoTotal (){
        return this.valor;
    }
    
    
    
    
}
