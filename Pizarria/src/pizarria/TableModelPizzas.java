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
    private String[] colunas=new String[]{"Forma","Área","Sabor 1", "Sabor 2","Preço Total"};

    private List<Pizza> lista=new ArrayList();

    
   
    public TableModelPizzas(){
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
        Pizza pizza = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return pizza.getForma();//if column 0 (code)
            case 1: return pizza.getSabor1();//if column 1 (name)
            case 2: return pizza.getSabor2();//if column 2 (birthday)
            case 3: return pizza.getArea();//if column 2 (birthday)
            case 4: return pizza.getPrecoTotal();

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

    public void setListaContatos(List<Pizza> pizzas) {
        this.lista = pizzas;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
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
