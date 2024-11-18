/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizarria;

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

        cliente.addPedido(pedido);

        System.out.println();
        System.out.println(cliente.getNome());
        System.out.println(cliente.getSobreNome());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.listaPedidos);
        System.out.println(cliente.getId());
    }
    
}
