/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_programacao;

import Classes.Repo;
import Classes.Utilizador;
import Exceptions.ListaVazia;
import Exceptions.LoginErrado;
import Exceptions.UtilizadorRepetido;
import javax.swing.JOptionPane;

/**
 *
 * @author Vasco Cardoso
 */
public class PainelLogin extends javax.swing.JPanel {

    private Utilizador utilizador = null;
    
    /**
     * Creates new form PainelLogin
     */
    public PainelLogin() throws UtilizadorRepetido {
        initComponents();
        
        try{
            Repo.getInstance().addAdmin();
        }catch(UtilizadorRepetido ex){
            System.out.println(ex);
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
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();

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

        jLabel2.setForeground(new java.awt.Color(0, 155, 50));
        jLabel2.setText("Insira seu username");

        jLabel3.setForeground(new java.awt.Color(0, 155, 50));
        jLabel3.setText("Insira sua password");

        entrarButton.setText("Entrar");
        entrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButtonMouseClicked(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entrarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Voltar))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar)
                    .addComponent(entrarButton))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtonMouseClicked
        
        String user = this.usernameField.getText();
        String password = this.passwordField.getText();
        
        if(this.usernameField.equals("")){
            JOptionPane.showMessageDialog(null, "Username vazio!");
        }else if (passwordField.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "A password tem que ter 5 ou mais carateres!");
        }else{
            //String passwordEncriptada = this.encriptaPassword(password);
            //String passwordEncriptada = Encripta.encriptaPassword(password);
            
            try {
                Repo.getInstance().login(user, password);
                
                Painel_menuUtilizador pInicial = new Painel_menuUtilizador ();  
                JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
                JFrame.getFrame().setSize(600, 400);
                JFrame.getFrame().setLocationRelativeTo(null);
                
            } catch (ListaVazia ex) {
                JOptionPane.showMessageDialog(null, "Username ou Password errados!");
            } catch (LoginErrado ex) {
                System.out.println("Username ou Password errados!");
            }
        }
        
    }//GEN-LAST:event_entrarButtonMouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        Painel_inicial pInicial = new Painel_inicial ();  
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(418, 300);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_VoltarMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
