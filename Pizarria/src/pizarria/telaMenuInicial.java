/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizarria;

import java.awt.Button;
import javax.swing.JOptionPane;
import static pizarria.BancoDadosClientes.incrementaCont;
import static pizarria.BancoDadosSabores.*;
import static pizarria.SaborEspecial.setValorEspecial;
import static pizarria.SaborPremium.setValorPremium;
import static pizarria.SaborSimples.setValorSimples;

/**
 *
 * @author joaow
 */
public class telaMenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaMenuInicial
     */
    public telaMenuInicial() {
        initComponents();
    }
    //inicializar banco de dados de sabores
    BancoDadosSabores BancoSabores = new BancoDadosSabores();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadastrarClientes = new javax.swing.JButton();
        btnRealizarPedidos = new javax.swing.JButton();
        btnVerPedidos = new javax.swing.JButton();
        btnAlterarPizzas = new javax.swing.JButton();
        btnCadastrarValores = new javax.swing.JButton();
        btnPopular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PIZZARIA");

        btnCadastrarClientes.setText("Cadastrar Clientes");
        btnCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClientesActionPerformed(evt);
            }
        });

        btnRealizarPedidos.setText("Realizar/Alterar Pedidos");
        btnRealizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidosActionPerformed(evt);
            }
        });

        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        btnAlterarPizzas.setText("Alterar Pizzas");
        btnAlterarPizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPizzasActionPerformed(evt);
            }
        });

        btnCadastrarValores.setText("Cadastrar Sabores");
        btnCadastrarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarValoresActionPerformed(evt);
            }
        });

        btnPopular.setText("Popular");
        btnPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarValores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPopular))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarPizzas)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1))
                            .addComponent(btnCadastrarClientes)
                            .addComponent(btnRealizarPedidos)
                            .addComponent(btnVerPedidos))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCadastrarClientes)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarPedidos)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarPizzas)
                .addGap(18, 18, 18)
                .addComponent(btnVerPedidos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarValores)
                    .addComponent(btnPopular))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidosActionPerformed
        // TODO add your handling code here:
        //levar para a tela de Fazer Pedidos
        new telaPedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRealizarPedidosActionPerformed

    private void btnCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClientesActionPerformed
        // TODO add your handling code here:
        //levar para a tela de cadastro
        new telaCadastraCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarClientesActionPerformed

    private void btnCadastrarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarValoresActionPerformed
        // ir para tela de casdastrar asbores
        
        new telaCadastrarSabores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarValoresActionPerformed

    private void btnAlterarPizzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPizzasActionPerformed
        //ir para alterar preco dos tipos
        
        new telaAlterarPizzas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlterarPizzasActionPerformed

    private void btnPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopularActionPerformed
        //popular banco de dados
        
        //populando banco de Clientes
        int id = incrementaCont();
        String sId = Integer.toString(id);
        Cliente c1 = new Cliente("Teste 1", "Sobrenome 1", "42999788478", id);
        BancoDadosClientes.listaClientes.put(sId, c1);

        id = incrementaCont();
        sId = Integer.toString(id);
        Cliente c2 = new Cliente("Teste 2", "Sobrenome 2", "42999788479", id);
        BancoDadosClientes.listaClientes.put(sId, c2);

        id = incrementaCont();
        sId = Integer.toString(id);
        Cliente c3 = new Cliente("Teste 3", "Sobrenome 3", "42999788480", id);
        BancoDadosClientes.listaClientes.put(sId, c3);

        id = incrementaCont();
        sId = Integer.toString(id);
        Cliente c4 = new Cliente("Teste 4", "Sobrenome 4", "42999788481", id);
        BancoDadosClientes.listaClientes.put(sId, c4);

        id = incrementaCont();
        sId = Integer.toString(id);
        Cliente c5 = new Cliente("Teste 5", "Sobrenome 5", "42999788482", id);
        BancoDadosClientes.listaClientes.put(sId, c5);
      
                   
        //popular banco de sabores
          
        Sabor saborPremium1 = new SaborPremium("Toscana");
        adicionarSaborPremium(saborPremium1);

        Sabor saborPremium2 = new SaborPremium("Fiorenttinna");
        adicionarSaborPremium(saborPremium2);

        Sabor saborPremium3 = new SaborPremium("Carne Seca com Abóbora");
        adicionarSaborPremium(saborPremium3);
        
        Sabor saborSimples1 = new SaborSimples("Margarita");
        adicionarSaborSimples(saborSimples1);

        Sabor saborSimples2 = new SaborSimples("Calabresa");
        adicionarSaborSimples(saborSimples2);

        Sabor saborSimples3 = new SaborSimples("Margherita");
        adicionarSaborSimples(saborSimples3);
       
        Sabor saborEspecial1 = new SaborEspecial("Frango com Catupiry");
        adicionarSaborEspecial(saborEspecial1);

        Sabor saborEspecial2 = new SaborEspecial("Portuguesa");
        adicionarSaborEspecial(saborEspecial2);

        Sabor saborEspecial3 = new SaborEspecial("4 Queijos");
        adicionarSaborEspecial(saborEspecial3);
        
        //popula valores dos tipos de pizza
        setValorEspecial(4.0);
        setValorPremium(5.0);
        setValorSimples(3.50);
        
        
        
        JOptionPane.showMessageDialog(null, "BANCOS POPULADOS COM SUCESSO!!\n", "BANCOS POPULADOS", JOptionPane.INFORMATION_MESSAGE);
        btnPopular.setVisible(false);
    }//GEN-LAST:event_btnPopularActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        // TODO add your handling code here:
        
        new telaVerPedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPizzas;
    private javax.swing.JButton btnCadastrarClientes;
    private javax.swing.JButton btnCadastrarValores;
    private javax.swing.JButton btnPopular;
    private javax.swing.JButton btnRealizarPedidos;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
