/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizarria;

import java.util.ArrayList;
import java.util.List;
import static pizarria.BancoDadosSabores.adicionarSaborEspecial;
import static pizarria.BancoDadosSabores.adicionarSaborPremium;
import static pizarria.BancoDadosSabores.adicionarSaborSimples;

/**
 *
 * @author rafae
 */
public class Pizarria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sabor saborPremium1 = new SaborPremium("Toscana");
        adicionarSaborPremium(saborPremium1);
        
        Sabor saborSimples1 = new SaborSimples("Margarita");
        adicionarSaborSimples(saborSimples1);
        
        Sabor saborEspecial1 = new SaborEspecial("Frango com Catupiry");
        adicionarSaborEspecial(saborEspecial1);
        
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
