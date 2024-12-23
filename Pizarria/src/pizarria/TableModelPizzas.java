/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joaow
 */
public class TableModelPizzas extends AbstractTableModel{
    private String[] colunas=new String[]{"Forma","Sabor 1","Sabor 2", "Dimensao","Area","Preço Total"};

    private List<Pizza> lista=new ArrayList();

    
   
    public TableModelPizzas(){
    }
    
    public TableModelPizzas(List<Pizza> pizzas){
        this.lista = pizzas;
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        /*if(column==0)
            return true;
        return false;*/
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        //tratar caso nao tenha 2 sabor e escrever nenhum na tabelinha
        Pizza pizza = lista.get(rowIndex);
        String sabor2 = "";
        List<Sabor> lista = pizza.getSabores();
        String sabor1 = lista.get(0).getSabor();
        if (lista.size() == 2){
            sabor2 = lista.get(1).getSabor();
        } else {
            sabor2 = "Nenhum";
        }
        
        
        switch (columnIndex) {
            case 0: return pizza.getForma();//if column 0 (code)
            case 1: return sabor1;//if column 1 (name)
            case 2: return sabor2;//if column 2 (birthday)
            case 3: return pizza.getDimensaoFormatada();
            case 4: return pizza.getAreaFormatada();//if column 2 (birthday)
            case 5: return pizza.getValorFormatado();

            default : return null;
        }
    }

    public boolean removePizza(Pizza pizza) {
        int linha = this.lista.indexOf(pizza);
        boolean result = this.lista.remove(pizza);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaPizza(Pizza pizza) {
        this.lista.add(pizza);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaPizzas(List<Pizza> pizzas) {
        this.lista = pizzas;
        this.fireTableDataChanged();
        this.fireTableRowsInserted(0,pizzas.size()-1);//update JTable
    }
    
    public void setListaPizzas(HashMap<String,Pizza> pizza) {
        
        this.lista = new ArrayList<Pizza>();
        for(Pizza p:pizza.values()){
            this.lista.add(p);
        }
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Pizza getPizza(int linha){
        return lista.get(linha);
    }

    public void removePizzas(List<Pizza> listaParaExcluir) {
        for(Pizza p:listaParaExcluir)
            removePizza(p);
    }
    
    public void atualizarPizza(int linha){
        this.fireTableRowsUpdated(linha, linha);
    }    
}
