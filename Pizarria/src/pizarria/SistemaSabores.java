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
public class SistemaSabores {
    private List<SaborSimples> saboresSimples = new ArrayList<>();
    private List<Sabor> saboresEspecial = new ArrayList<>();
    private List<Sabor> saboresPremium = new ArrayList<>();

    public void adicionarSaborSimples(SaborSimples sabor) {
        saboresSimples.add(sabor);
    }

    public void removerSaborSimples(SaborSimples sabor) {
        saboresSimples.remove(sabor);
    }

    public void adicionarSaborEspecial(Sabor sabor) {
        saboresEspecial.add(sabor);
    }

    public void removerSaborEspecial(Sabor sabor) {
        saboresEspecial.remove(sabor);
    }

    public void adicionarSaborPremium(Sabor sabor) {
        saboresPremium.add(sabor);
    }

    public void removerSaborPremium(Sabor sabor) {
        saboresPremium.remove(sabor);
    }
}
