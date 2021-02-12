/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_programacao;

import Classes.Repo;
import Classes.Role;
import Classes.Utilizador;
import Exceptions.UsernameInexistente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vasco Cardoso
 */
public class Painel_listaPerfis extends javax.swing.JPanel {

    DefaultTableModel tabela = new DefaultTableModel();
    
    
    /**
     * Creates new form Painel_listaPerfis
     */
    public Painel_listaPerfis() {
        initComponents();
        
        Object colunas[] = {"Nome", "Username", "Role"};
        tabela.setColumnIdentifiers(colunas);
        this.tabelaUsers.setModel(tabela);
        
        this.popularTabela();
        
    }
    
    
    public void popularTabela(){
        
        Role role = Repo.getInstance().getUser().getRole();
        Object obj[] = new Object[3];
        
        for(Utilizador u : Repo.getInstance().utilizadoresPorRole(role)){
            obj[0] = u.getNome();
            obj[1] = u.getUsername();
            obj[2] = u.getRole();
            
            tabela.addRow(obj);
        }
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsers = new javax.swing.JTable();
        editarPerfilButton = new javax.swing.JButton();
        historicoButton = new javax.swing.JButton();
        relatorioMensalButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();

        tabelaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsers);

        editarPerfilButton.setText("Editar perfil");
        editarPerfilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarPerfilButtonMouseClicked(evt);
            }
        });

        historicoButton.setText("Historico de ações");
        historicoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historicoButtonMouseClicked(evt);
            }
        });

        relatorioMensalButton.setText("Imprimir relatorio Mensal");
        relatorioMensalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioMensalButtonMouseClicked(evt);
            }
        });
        relatorioMensalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioMensalButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de rastreio de tempo em tarefas");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(152, 55));
        jLabel1.setMinimumSize(new java.awt.Dimension(152, 55));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(152, 25));

        voltarButton.setText("Voltar");
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(historicoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarPerfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(relatorioMensalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(relatorioMensalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarPerfilButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historicoButton)
                    .addComponent(voltarButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void relatorioMensalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioMensalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioMensalButtonActionPerformed

    private void editarPerfilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarPerfilButtonMouseClicked
        
        int row = this.tabelaUsers.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Escolha um utilizador");
            return;
        }
            
        String username = (String) this.tabelaUsers.getValueAt(row, 1);
        try {
            Utilizador utilizador = Repo.getInstance().utilizadorPorUsername(username);
            
            
            Painel_editarPerfil pInicial = new Painel_editarPerfil (utilizador);
            JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
            JFrame.getFrame().setSize(400, 525);
            JFrame.getFrame().setLocationRelativeTo(null);
        } catch (UsernameInexistente ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_editarPerfilButtonMouseClicked

    private void relatorioMensalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioMensalButtonMouseClicked
        
        int row = this.tabelaUsers.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Escolha um utilizador");
            return;
        }
        
        String username = (String) this.tabelaUsers.getValueAt(row, 1);
        try {
            Utilizador utilizador = Repo.getInstance().utilizadorPorUsername(username);
            
            
            Painel_relatorioMensal pInicial = new Painel_relatorioMensal (utilizador);
            JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
            JFrame.getFrame().setSize(800, 500);
            JFrame.getFrame().setLocationRelativeTo(null);
        } catch (UsernameInexistente ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        /*Painel_relatorioMensal pInicial = new Painel_relatorioMensal ();
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(650, 300);
        JFrame.getFrame().setLocationRelativeTo(null);*/
    }//GEN-LAST:event_relatorioMensalButtonMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        Painel_menuUtilizador pInicial = new Painel_menuUtilizador ();
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(600, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void historicoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historicoButtonMouseClicked
        int row = this.tabelaUsers.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Escolha um utilizador");
            return;
        }
        
        String username = (String) this.tabelaUsers.getValueAt(row, 1);
        try {
            Utilizador utilizador = Repo.getInstance().utilizadorPorUsername(username);
            
            Painel_verHistorico pInicial = new Painel_verHistorico (utilizador);
            JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
            JFrame.getFrame().setSize(400, 525);
            JFrame.getFrame().setLocationRelativeTo(null);
        } catch (UsernameInexistente ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_historicoButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarPerfilButton;
    private javax.swing.JButton historicoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton relatorioMensalButton;
    private javax.swing.JTable tabelaUsers;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
