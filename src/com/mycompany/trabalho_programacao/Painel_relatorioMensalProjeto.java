/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_programacao;

import Classes.Projeto;
import Classes.Repo;
import Classes.Tarefa;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vasco Cardoso
 */
public class Painel_relatorioMensalProjeto extends javax.swing.JPanel {

    DefaultTableModel tabela = new DefaultTableModel();
    
    Projeto projeto = null;
    boolean withData = false;
    boolean finalizado = true;
    
    
    /**
     * Creates new form Painel_relatorioMensal
     */
    public Painel_relatorioMensalProjeto(Projeto p) {
        initComponents();
        
        projeto = p;
        
        Object colunas[] = {"Nome", "Data Inicio", "Data Fim", "Total Tarefa"};
        tabela.setColumnIdentifiers(colunas);
        this.balancoTabela.setModel(tabela);
        
        Date dataInicio = new GregorianCalendar(1900,1,1).getTime();
        Date dataFim = new GregorianCalendar(2100,1,1).getTime();
        
        this.popularTabela(dataInicio, dataFim, finalizado, projeto);
        
        dataPanel.setVisible(withData);
        
    }
    
    
    public void popularTabela(Date dataInicio, Date dataFim, boolean finalizado, Projeto projeto){
             
        tabela.setRowCount(0);
        Object obj[] = new Object[4];
        
        float total = 0;
        
        for(Tarefa t : Repo.getInstance().getTarefasRelatorioProjeto(dataInicio, dataFim, finalizado, projeto)){
            obj[0] = t.getNome();
            obj[1] = t.getDataInicio().toLocaleString();
            try{
                obj[2] = t.getDataFim().toLocaleString();
                
                long ms = t.getDataFim().getTime() - t.getDataInicio().getTime();
                int dias = (int) TimeUnit.DAYS.convert(ms, TimeUnit.MILLISECONDS)+1;
                float valor = t.getPreco()*t.getDono().getnHorasDiarias()*dias;
                
                obj[3] = String.format("%,.2f", valor);
                total +=valor;
            }catch(NullPointerException e){
                obj[2] = "";
                obj[3] = "";
            }
            
            tabela.addRow(obj);
            
            
        }
        String totalString = String.format("%,.2f", total);
        this.totalLabel.setText(totalString);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        balancoTabela = new javax.swing.JTable();
        procurarButton = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        initialDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        finalDate = new org.jdesktop.swingx.JXDatePicker();
        dataCheckbox = new javax.swing.JCheckBox();
        finalizadoCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

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

        balancoTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(balancoTabela);

        procurarButton.setText("Procurar");
        procurarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procurarButtonMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 155, 50));
        jLabel2.setText("Data Inicial:");

        jLabel4.setForeground(new java.awt.Color(0, 155, 50));
        jLabel4.setText("Data Final:");

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(initialDate, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(finalDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initialDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        dataCheckbox.setText("Entre: ");
        dataCheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataCheckboxMouseClicked(evt);
            }
        });

        finalizadoCheckBox.setSelected(true);
        finalizadoCheckBox.setText("Finalizado");
        finalizadoCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizadoCheckBoxMouseClicked(evt);
            }
        });

        jLabel3.setText("Total:");

        totalLabel.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalizadoCheckBox))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(procurarButton)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(totalLabel)
                                .addGap(73, 73, 73)
                                .addComponent(voltarButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 54, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizadoCheckBox))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(procurarButton)
                    .addComponent(jLabel3)
                    .addComponent(totalLabel))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        Painel_verProjetos pInicial = new Painel_verProjetos ();
        JFrame.getFrame().trocarPainel(pInicial, this.jPanel1);
        JFrame.getFrame().setSize(450, 400);
        JFrame.getFrame().setLocationRelativeTo(null);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void dataCheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataCheckboxMouseClicked
        withData = this.dataCheckbox.isSelected();
        dataPanel.setVisible(withData);
        
    }//GEN-LAST:event_dataCheckboxMouseClicked

    private void procurarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurarButtonMouseClicked
        Date d1;
        Date d2;
        
        if(withData){
            try{
                d1 = this.initialDate.getDate();
            }catch(NullPointerException e){
                d1 = new GregorianCalendar(1900,1,1).getTime();
            }
            try{
                d2 = this.finalDate.getDate();
            }catch(NullPointerException e){
                d2 = new GregorianCalendar(2100,1,1).getTime();
            }
        }else{
            d1 = new GregorianCalendar(1900,1,1).getTime();
            d2 = new GregorianCalendar(2100,1,1).getTime();
        }
        
        
        this.popularTabela(d1, d2, finalizado, projeto);
        
    }//GEN-LAST:event_procurarButtonMouseClicked

    private void finalizadoCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizadoCheckBoxMouseClicked
        finalizado = this.finalizadoCheckBox.isSelected();
    }//GEN-LAST:event_finalizadoCheckBoxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable balancoTabela;
    private javax.swing.JCheckBox dataCheckbox;
    private javax.swing.JPanel dataPanel;
    private org.jdesktop.swingx.JXDatePicker finalDate;
    private javax.swing.JCheckBox finalizadoCheckBox;
    private org.jdesktop.swingx.JXDatePicker initialDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton procurarButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
