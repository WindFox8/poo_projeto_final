package pizarria;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaow
 */
public class BancoDadosClientes {
    
    
    //lista para a adicao dos clientes e a permanencia dos seus cadastros durante o uso da aplicação
    public static HashMap<String,Cliente> listaClientes = new HashMap<>();

    //variável para identificar os clientes dentro do hasmap
    static int cont = 0;
    
    public static int incrementaCont (){
        cont++; 
        return cont; 
    }
    
  
    
}
