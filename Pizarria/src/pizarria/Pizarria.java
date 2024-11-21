/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizarria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Pizarria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Walter", "XXXX-XXXX",54);
        
        Pedido pedido = new Pedido(1);
        List<Sabor> lista = new ArrayList();
        Sabor saborTeste = new SaborPremium("Teste");
        Sabor saborTeste2 = new SaborEspecial("Teste2");
        SaborEspecial.setValorEspecial(6);
        SaborPremium.setValorPremium(10);
        lista.add(saborTeste);
//        lista.add(saborTeste2);
        
        double mediaPrecoSabores = 0;
        if (lista.size() == 2) {
        mediaPrecoSabores = (lista.get(0).getValor() + lista.get(1).getValor()) / 2;
        System.out.println(mediaPrecoSabores);
            System.out.println("2 SABOR");
    } else {
        mediaPrecoSabores = lista.get(0).getValor(); // Se só há um sabor, usa o valor do único sabor
            System.out.println(mediaPrecoSabores);
            System.out.println("1 SABOR");
    }
        
//        
//        System.out.println(cliente.getNome());
//        System.out.println(cliente.getSobreNome());
//        System.out.println(cliente.getTelefone());
//       // System.out.println(cliente.listaPedidos);
//        System.out.println(cliente.getId());
//        
//        Sabor saborTeste3 = new SaborPremium("Teste3");
//        Sabor saborTeste4 = new SaborSimples("Teste3");
//
//
//        System.out.println(saborTeste.getValor());
//        System.out.println(saborTeste2.getValor());
//        System.out.println(saborTeste3.getValor());
//        System.out.println(saborTeste4.getValor());
//        
//        SaborSimples.setValorSimples(5);
//        System.out.println(saborTeste4.getValor());
    }
    
}
