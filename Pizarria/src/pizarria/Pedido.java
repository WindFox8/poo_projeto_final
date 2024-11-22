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
public class Pedido {
    private static int count = 0;
    private int id;
    private List<Pizza> listaItens = new ArrayList<>(); 
    private Estado estado;    

    public enum Estado {
        ABERTO,    
        CAMINHO,   
        ENTREGUE  
    }

    public Pedido(int id) {
        this.id = id;
        estado = Estado.ABERTO;
    
    }
    
    public Pedido (){
        estado = Estado.ABERTO;
    }

    public int getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }
    
    public String getEstadoString () {
        return estado.toString();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void addPizza(Pizza item) {
        listaItens.add(item);
    }
    public Pizza getPizza (int i){
        return listaItens.get(i);
    }
    
    public void removerPizza(Pizza item) {
        if (item != null && listaItens.contains(item)) {
            listaItens.remove(item);
        }
    }
    
    public void limparLIstaPizza (){
        this.listaItens.clear();
    }
    
    public List<Pizza> getListPizza (){
        return listaItens;
    }
}
