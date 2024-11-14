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
public class Cliente {
    
    private String nome;
    private String sobreNome;
    private String telefone;
    public List<Pedido> listaPedidos = new ArrayList<>();

    public Cliente(String nome, String sobreNome, String telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        if (pedido != null && listaPedidos.contains(pedido)) {
            listaPedidos.remove(pedido);
        }
    }
}
