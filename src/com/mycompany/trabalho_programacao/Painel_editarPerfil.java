/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_programacao;

import Classes.Encripta;
import Classes.Repo;
import Classes.Role;
import Classes.Utilizador;
import Exceptions.UsernameInexistente;
import Exceptions.UtilizadorRepetido;
import javax.swing.JOptionPane;

/**
 *
 * @author Vasco Cardoso
 */
public class Painel_editarPerfil extends javax.swing.JPanel {

    
    Utilizador utilizador = Repo.getInstance().getUser();
    Utilizador perfil = null;
    
    /**
     * Creates new form Painel_editarPerfil
     */
    public Painel_editarPerfil(Utilizador u) {
        initComponents();
        
        perfil = u;
        
        this.usernameField.setText(perfil.getUsername());
        this.horasField.setText(String.valueOf(perfil.getnHorasDiarias()));
        
        if(utilizador.getRole() == Role.User){
            this.permissoesPanel.setVisible(false);
        }else if(utilizador.getRole() == Role.Admin){
            this.PermissoesBox.addItem("Admin");
        }
        
        switch(perfil.getRole()){
            case User:
                this.PermissoesBox.setSelectedIndex(0);
                break;
            case UserManager:
                this.PermissoesBox.setSelectedIndex(1);
                break;
            case Admin:
                this.PermissoesBox.setSelectedIndex(2);
                break;
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
        voltarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        salvarUsernameButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passAntigaField = new javax.swing.JPasswordField();
        passField = new javax.swing.JPasswordField();
        passConfirmField = new javax.swing.JPasswordField();
        salvarPassField = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        horasField = new javax.swing.JTextField();
        salvarHorasField = new javax.swing.JButton();
        permissoesPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PermissoesBox = new javax.swing.JComboBox<>();
        salvarButton = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        salvarUsernameButton.setText("Salvar");
        salvarUsernameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarUsernameButtonMouseClicked(evt);
            }
        });

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 155, 50));
        jLabel2.setText("Mudar username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(salvarUsernameButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(salvarUsernameButton)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setForeground(new java.awt.Color(0, 155, 50));
        jLabel3.setText("Mudar senha");

        passAntigaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passAntigaFieldActionPerformed(evt);
            }
        });

        salvarPassField.setText("Salvar");
        salvarPassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarPassFieldMouseClicked(evt);
            }
        });
        salvarPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarPassFieldActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 155, 50));
        jLabel4.setText("Senha antiga");

        jLabel5.setForeground(new java.awt.Color(0, 155, 50));
        jLabel5.setText("Nova senha");

        jLabel6.setForeground(new java.awt.Color(0, 155, 50));
        jLabel6.setText("Confirmar senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(passConfirmField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(passField)
                            .addComponent(passAntigaField)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(salvarPassField)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passAntigaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(passConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarPassField)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(0, 155, 50));

        jLabel7.setForeground(new java.awt.Color(0, 155, 50));
        jLabel7.setText("Alterar horas de trabalho diarias");

        salvarHorasField.setText("Salvar");
        salvarHorasField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarHorasFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(salvarHorasField))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(horasField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(salvarHorasField)
                .addContainerGap())
        );

        permissoesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setForeground(new java.awt.Color(0, 155, 50));
        jLabel8.setText("Alterar Permissoes");

        PermissoesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "UserManager" }));
        PermissoesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermissoesBoxActionPerformed(evt);
            }
        });

        salvarButton.setText("Salvar");
        salvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout permissoesPanelLayout = new javax.swing.GroupLayout(permissoesPanel);
        permissoesPanel.setLayout(permissoesPanelLayout);
        permissoesPanelLayout.setHorizontalGroup(
            permissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permissoesPanelLayout.createSequentialGroup()
                .addGroup(permissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(permissoesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(permissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(PermissoesBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(permissoesPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(salvarButton)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        permissoesPanelLayout.setVerticalGroup(
            permissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permissoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PermissoesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(salvarButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(permissoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarButton)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(permissoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        
        if(perfil.equals(utilizador)){
            Painel_verPerfil pInicial = new Painel_verPerfil ();
            JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
            JFrame.getFrame().setSize(450, 400);
            JFrame.getFrame().setLocationRelativeTo(null);
        }else{
            Painel_listaPerfis pInicial = new Painel_listaPerfis ();
            JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
            JFrame.getFrame().setSize(450, 400);
            JFrame.getFrame().setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void salvarPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarPassFieldActionPerformed

    private void passAntigaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passAntigaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passAntigaFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void PermissoesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermissoesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PermissoesBoxActionPerformed

    private void salvarUsernameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarUsernameButtonMouseClicked
        String username = this.usernameField.getText();
        
        if(this.usernameField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username vazio!");
        }else{
            try {
                Repo.getInstance().changeUsername(perfil, username);
                JOptionPane.showMessageDialog(null, "Username alterado!");
                String historico = "Alterou o username de " + perfil.getNome() ;
                Repo.getInstance().addHistorico(historico);
            } catch (UtilizadorRepetido ex) {
                JOptionPane.showMessageDialog(null, "Nome de utilizador já exsite!");
            }
            
        }
        
        
    }//GEN-LAST:event_salvarUsernameButtonMouseClicked

    private void salvarHorasFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarHorasFieldMouseClicked
        String horasDiarias = this.horasField.getText();
        
        if(this.horasField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Horas vazias!");
        }else{
            try{
                int horas = Integer.parseInt(horasDiarias);
                if(horas > 24 || horas <0){
                    JOptionPane.showMessageDialog(null, "Insira um valor válido");
                    return;
                }
                perfil.setnHorasDiarias(horas);
                JOptionPane.showMessageDialog(null, "Número de Horas diárias alterado com sucesso!");
                String historico = "Alterou Horas Diárias de " + perfil.getNome();
                Repo.getInstance().addHistorico(historico);
                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Insira um valor válido");
            }
            
            
            
        }
        
    }//GEN-LAST:event_salvarHorasFieldMouseClicked

    private void salvarPassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarPassFieldMouseClicked
        
        String passeAntiga = this.passAntigaField.getText();
        String passeAtual = this.passField.getText();
        String passeAtualConfirmar = this.passConfirmField.getText();
        String passeAntigaEncripta = Encripta.encriptaPassword(passeAntiga);
        String passeAtualEncripta = Encripta.encriptaPassword(passeAtual);
        
        if(passeAntiga.equals("") || passeAtual.equals("") || passeAtualConfirmar.equals("")){
            JOptionPane.showMessageDialog(null, "Passe vazia!");
        }else if(passeAntiga.length() < 5 || passeAtual.length() < 5|| passeAtualConfirmar.length() < 5){
            JOptionPane.showMessageDialog(null, "Password deve conter pelo menos 5 caracteres!");
        }else try {
            if(!Repo.getInstance().utilizadorPorUsername(perfil.getUsername()).getPassword().equals(passeAntigaEncripta)){
                JOptionPane.showMessageDialog(null, "Password antiga errada!");
            }else if(!passeAtual.equals(passeAtualConfirmar)){
                JOptionPane.showMessageDialog(null, "Password não coincidem!");
            }else{
                
                Repo.getInstance().changePassword(perfil.getUsername(), passeAtualEncripta);
                JOptionPane.showMessageDialog(null, "Password alterada com sucesso!");
                this.passAntigaField.setText("");
                this.passField.setText("");
                this.passConfirmField.setText("");
                
                String historico = "Password alterada de " + perfil.getNome();
                Repo.getInstance().addHistorico(historico);
                
                
            }
        } catch (UsernameInexistente ex) {
            JOptionPane.showMessageDialog(null, "Username não existe!");
        }
    }//GEN-LAST:event_salvarPassFieldMouseClicked

    private void salvarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarButtonMouseClicked
        int index = this.PermissoesBox.getSelectedIndex();
        
        try{
            switch(index){
            case 0:
                Repo.getInstance().changeRole(perfil.getUsername(), Role.User);
                break;
            case 1:
                 Repo.getInstance().changeRole(perfil.getUsername(), Role.UserManager);
                break;
            case 2:
                 Repo.getInstance().changeRole(perfil.getUsername(), Role.Admin);
                break;
            }
            JOptionPane.showMessageDialog(null, "Role alterada!");
            String historico = "Permissões alteradas de " + perfil.getNome();

            Repo.getInstance().addHistorico(historico);
        } catch (UsernameInexistente ex) {
            JOptionPane.showMessageDialog(null, "Username não existe!");
        }
        
        
        
    }//GEN-LAST:event_salvarButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PermissoesBox;
    private javax.swing.JTextField horasField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passAntigaField;
    private javax.swing.JPasswordField passConfirmField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPanel permissoesPanel;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton salvarHorasField;
    private javax.swing.JButton salvarPassField;
    private javax.swing.JButton salvarUsernameButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
