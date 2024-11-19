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
public class BancoDadosSabores {
    public static List<SaborSimples> saboresSimples = new ArrayList<>();
    public static List<Sabor> saboresEspecial = new ArrayList<>();
    public static List<Sabor> saboresPremium = new ArrayList<>();

    public static void adicionarSaborSimples(SaborSimples sabor) {
        saboresSimples.add(sabor);
    }

    public static void removerSaborSimples(SaborSimples sabor) {
        saboresSimples.remove(sabor);
    }

    public static void adicionarSaborEspecial(Sabor sabor) {
        saboresEspecial.add(sabor);
    }

    public static void removerSaborEspecial(Sabor sabor) {
        saboresEspecial.remove(sabor);
    }

    public static void adicionarSaborPremium(Sabor sabor) {
        saboresPremium.add(sabor);
    }

    public static void removerSaborPremium(Sabor sabor) {
        saboresPremium.remove(sabor);
    }
    public static Sabor getSaborSimples(int i){
        return saboresSimples.get(i);
    }
    
    public static Sabor getSaborEspeciais(int i){
        return saboresEspecial.get(i);
    }
    
    public static Sabor getSaborPremium(int i){
        return saboresPremium.get(i);
    }
    
    
    public static String imprimeSabores(){
        StringBuilder todosSabores = new StringBuilder();
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES SIMPLES:\n");
        todosSabores.append("=========================\n");
        
        for (Sabor s : saboresSimples) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES ESPECIAIS:\n");        
        todosSabores.append("=========================\n");
        
        for (Sabor s : saboresEspecial) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        todosSabores.append("=========================\n");
        todosSabores.append("SABORES PREMIUM:\n");
        todosSabores.append("=========================\n");
        for (Sabor s : saboresPremium) {
            todosSabores.append(s.getSabor()).append("\n");
        }
        return todosSabores.toString();
    }

}
