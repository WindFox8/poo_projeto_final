/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rafae
 */
public class BancoDadosSabores {
    //matriz de sabores - 0 :list saborSimples - 1 :list saborEspecial - 2 :list saborPremium 
    public static List<Sabor> saborSimples = new ArrayList<>();
    public static List<Sabor> saborEspecial = new ArrayList<>();
    public static List<Sabor> saborPremium = new ArrayList<>();

    public static List<List<Sabor>> sabores = Arrays.asList(saborSimples, saborEspecial, saborPremium);

    public static void adicionarSaborSimples(Sabor sabor) {
        sabores.get(0).add(sabor);
    }

    public static void removerSaborSimples(Sabor sabor) {
        sabores.get(0).remove(sabor);
    }

    public static void adicionarSaborEspecial(Sabor sabor) {
        sabores.get(1).add(sabor);
    }

    public static void removerSaborEspecial(Sabor sabor) {
        sabores.get(1).remove(sabor);
    }

    public static void adicionarSaborPremium(Sabor sabor) {
        sabores.get(2).add(sabor);
    }

    public static void removerSaborPremium(Sabor sabor) {
        sabores.get(2).remove(sabor);
    }
    public static Sabor getSaborSimples(int i){
        return sabores.get(0).get(i);
    }
    
    public static List<Sabor> getSaboresSimples(){
        return sabores.get(0);
    }
    
    public static Sabor getSaborEspeciais(int i){
        return sabores.get(1).get(i);
    }
    
    public static List<Sabor> getSaboresEspeciais(){
        return sabores.get(1);
    }
    
    public static Sabor getSaborPremium(int i){
        return sabores.get(2).get(i);
    }
    
    public static List<Sabor> getSaboresPremium(){
        return sabores.get(2);
    }
    
    
    public static String imprimeSabores(){
        StringBuilder todosSabores = new StringBuilder();
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES SIMPLES:\n");
        todosSabores.append("=========================\n");
        
        for (Sabor s : sabores.get(0)) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES ESPECIAIS:\n");        
        todosSabores.append("=========================\n");
        
        for (Sabor s : sabores.get(1)) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES PREMIUM:\n");
        todosSabores.append("=========================\n");
        for (Sabor s : sabores.get(2)) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        return todosSabores.toString();
    }

}
