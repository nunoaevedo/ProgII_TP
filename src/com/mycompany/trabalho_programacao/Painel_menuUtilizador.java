/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_programacao;

import Classes.Repo;
import Classes.Role;
import javax.swing.JOptionPane;

/**
 *
 * @author Vasco Cardoso
 */
public class Painel_menuUtilizador extends javax.swing.JPanel {

    /**
     * Creates new form Painel_menuUtilizador
     */
    public Painel_menuUtilizador() {
        initComponents();
        
        if(Repo.getInstance().getUser().getRole().equals(Role.User)){
            this.painelAdmin.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        verPerfilButton = new javax.swing.JButton();
        terminarSessaoButton = new javax.swing.JButton();
        relatorioMensalButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        novoProjetoButton = new javax.swing.JButton();
        verProjetosButton = new javax.swing.JButton();
        novaTarefaButton = new javax.swing.JButton();
        verTarefasButton = new javax.swing.JButton();
        terminarTarefasButton = new javax.swing.JButton();
        verConvitesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        painelAdmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        adicionarUtilizadorButton = new javax.swing.JButton();
        listarPerfisButton = new javax.swing.JButton();

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 155, 50));
        jLabel2.setText("Utilizador");

        verPerfilButton.setText("Ver perfil");
        verPerfilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPerfilButtonMouseClicked(evt);
            }
        });

        terminarSessaoButton.setText("Terminar sessão");
        terminarSessaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarSessaoButtonMouseClicked(evt);
            }
        });

        relatorioMensalButton.setText("Imprimir Relatorio Mensal");
        relatorioMensalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioMensalButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(relatorioMensalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(terminarSessaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verPerfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verPerfilButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminarSessaoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorioMensalButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 155, 50));
        jLabel3.setText("Tarefas/Projetos");

        novoProjetoButton.setText("Novo Projeto");
        novoProjetoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoProjetoButtonMouseClicked(evt);
            }
        });

        verProjetosButton.setText("Ver Projetos");
        verProjetosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProjetosButtonMouseClicked(evt);
            }
        });

        novaTarefaButton.setText("Nova Tarefa");
        novaTarefaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novaTarefaButtonMouseClicked(evt);
            }
        });

        verTarefasButton.setText("Ver Tarefas");
        verTarefasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTarefasButtonMouseClicked(evt);
            }
        });

        terminarTarefasButton.setText("Terminar tarefas");
        terminarTarefasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarTarefasButtonMouseClicked(evt);
            }
        });

        verConvitesButton.setText("Ver convites");
        verConvitesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verConvitesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verProjetosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novoProjetoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novaTarefaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verTarefasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(terminarTarefasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(verConvitesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novoProjetoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verProjetosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novaTarefaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verTarefasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminarTarefasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verConvitesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        painelAdmin.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 155, 50));
        jLabel4.setText("Admin");

        adicionarUtilizadorButton.setText("Adicionar Utilizador");
        adicionarUtilizadorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarUtilizadorButtonMouseClicked(evt);
            }
        });

        listarPerfisButton.setText("Listar Perfis");
        listarPerfisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarPerfisButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelAdminLayout = new javax.swing.GroupLayout(painelAdmin);
        painelAdmin.setLayout(painelAdminLayout);
        painelAdminLayout.setHorizontalGroup(
            painelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(adicionarUtilizadorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(listarPerfisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        painelAdminLayout.setVerticalGroup(
            painelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adicionarUtilizadorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarPerfisButton)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void terminarSessaoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminarSessaoButtonMouseClicked
        Painel_inicial pInicial = new Painel_inicial ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(418, 289);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_terminarSessaoButtonMouseClicked

    private void terminarTarefasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminarTarefasButtonMouseClicked
        Painel_terminarTarefa pInicial = new Painel_terminarTarefa ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_terminarTarefasButtonMouseClicked

    private void verProjetosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProjetosButtonMouseClicked
        Painel_verProjetos pInicial = new Painel_verProjetos();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);        
    }//GEN-LAST:event_verProjetosButtonMouseClicked

    private void novoProjetoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProjetoButtonMouseClicked
        Painel_novoProjeto pInicial = new Painel_novoProjeto ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_novoProjetoButtonMouseClicked

    private void novaTarefaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaTarefaButtonMouseClicked
        Painel_novaTarefa pInicial = new Painel_novaTarefa ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_novaTarefaButtonMouseClicked

    private void verPerfilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPerfilButtonMouseClicked
        Painel_verPerfil pInicial = new Painel_verPerfil ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_verPerfilButtonMouseClicked

    private void verTarefasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTarefasButtonMouseClicked
        Painel_verTarefas pInicial = new Painel_verTarefas ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_verTarefasButtonMouseClicked

    private void adicionarUtilizadorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarUtilizadorButtonMouseClicked
        Painel_CriarUserAdmin pInicial = new Painel_CriarUserAdmin (Repo.getInstance().getUser());
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_adicionarUtilizadorButtonMouseClicked

    private void listarPerfisButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarPerfisButtonMouseClicked
        Painel_listaPerfis pInicial = new Painel_listaPerfis ();
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_listarPerfisButtonMouseClicked

    private void relatorioMensalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioMensalButtonMouseClicked
        Painel_relatorioMensal pInicial = new Painel_relatorioMensal (Repo.getInstance().getUser());
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(800, 500);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_relatorioMensalButtonMouseClicked

    private void verConvitesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verConvitesButtonMouseClicked
        
        if(Repo.getInstance().getUser().getConvites().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não tem novos convites para projetos!");
            return;
        }
        
        Painel_verConvites pInicial = new Painel_verConvites ();
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(400, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_verConvitesButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarUtilizadorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listarPerfisButton;
    private javax.swing.JButton novaTarefaButton;
    private javax.swing.JButton novoProjetoButton;
    private javax.swing.JPanel painelAdmin;
    private javax.swing.JButton relatorioMensalButton;
    private javax.swing.JButton terminarSessaoButton;
    private javax.swing.JButton terminarTarefasButton;
    private javax.swing.JButton verConvitesButton;
    private javax.swing.JButton verPerfilButton;
    private javax.swing.JButton verProjetosButton;
    private javax.swing.JButton verTarefasButton;
    // End of variables declaration//GEN-END:variables
}
