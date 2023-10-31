/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoii;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author baldu
 */
public class TeladeVendass extends javax.swing.JFrame {
    private ButtonGroup buttonGroup;
    /**
     * Creates new form TeladeVendass
     */
    public TeladeVendass() {
        initComponents();
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(JRBTabuleiro);
        buttonGroup.add(JRBMontardesmonta);
        buttonGroup.add(JRBsons);
        
     
        JRBTabuleiro.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    JTBBancoImobiliario.setSelected(true);
                    JTBBlocosdeMontar.setSelected(false);
                    JTBXilofone.setSelected(false);
                }
            }
        });
        
        JRBMontardesmonta.addItemListener(new ItemListener(){
             @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    JTBBancoImobiliario.setSelected(false);
                    JTBBlocosdeMontar.setSelected(true);
                    JTBXilofone.setSelected(false);
                }
            }
        });
        
        JRBsons.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JTBBancoImobiliario.setSelected(false);
                    JTBBlocosdeMontar.setSelected(false);
                    JTBXilofone.setSelected(true);
                }
            }
        });
      
        
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
        JRBTabuleiro = new javax.swing.JRadioButton();
        JRBMontardesmonta = new javax.swing.JRadioButton();
        JRBsons = new javax.swing.JRadioButton();
        JTBBancoImobiliario = new javax.swing.JToggleButton();
        JTBBlocosdeMontar = new javax.swing.JToggleButton();
        JTBXilofone = new javax.swing.JToggleButton();
        JCBMaterialBrinquedo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        JCBPlastico = new javax.swing.JCheckBox();
        JCBPapel = new javax.swing.JCheckBox();
        JCBPoliéster = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLGarantia = new javax.swing.JList<>();
        JBAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTIdade = new javax.swing.JTable();
        JBDetalhes = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBConfirmar = new javax.swing.JButton();
        JLTema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        JRBTabuleiro.setText("Tabuleiro");
        JRBTabuleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBTabuleiroActionPerformed(evt);
            }
        });

        JRBMontardesmonta.setText("Montar e desmontar");
        JRBMontardesmonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMontardesmontaActionPerformed(evt);
            }
        });

        JRBsons.setText("Fazer sons");
        JRBsons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBsonsActionPerformed(evt);
            }
        });

        JTBBancoImobiliario.setText("Banco Imobiliario ");

        JTBBlocosdeMontar.setText("Blocos de Montar ");

        JTBXilofone.setText("Xilofone");
        JTBXilofone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBXilofoneActionPerformed(evt);
            }
        });

        JCBMaterialBrinquedo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o material do seu Brinquedo" }));

        JCBPlastico.setText("Plástico");

        JCBPapel.setText("Papel");
        JCBPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBPapelActionPerformed(evt);
            }
        });

        JCBPoliéster.setText("Poliéster");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JCBPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(JCBPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(JCBPoliéster, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBPlastico)
                    .addComponent(JCBPapel)
                    .addComponent(JCBPoliéster))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        JLGarantia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Garantias:", "Empresa", "Fornecedor", "Loja" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JLGarantia);

        jScrollPane1.setViewportView(jScrollPane2);

        JBAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-adição-20.png"))); // NOI18N
        JBAdicionar.setText("Adicionar ");

        JTIdade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meninos +10", "Meninas +10", "Meninos -10", "Meninas -10"
            }
        ));
        jScrollPane3.setViewportView(JTIdade);

        JBDetalhes.setText("Detalhes");

        JBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-x-20.png"))); // NOI18N
        JBExcluir.setText("Excluir");

        JBConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-conta-verificada-20.png"))); // NOI18N
        JBConfirmar.setText("Confirmar");
        JBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmarActionPerformed(evt);
            }
        });

        JLTema.setBackground(new java.awt.Color(255, 255, 255));
        JLTema.setText("Escolha o seu Brinquedo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(JLTema, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(149, 149, 149))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JRBTabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTBBancoImobiliario, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JRBMontardesmonta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTBBlocosdeMontar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(JRBsons, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JTBXilofone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBMaterialBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(JBConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLTema))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBTabuleiro)
                    .addComponent(JRBMontardesmonta)
                    .addComponent(JRBsons))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTBBancoImobiliario)
                    .addComponent(JTBBlocosdeMontar)
                    .addComponent(JTBXilofone))
                .addGap(38, 38, 38)
                .addComponent(JCBMaterialBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBAdicionar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBDetalhes)
                        .addGap(37, 37, 37)
                        .addComponent(JBExcluir))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JBConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JTBXilofoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBXilofoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTBXilofoneActionPerformed

    private void JCBPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBPapelActionPerformed

    private void JRBTabuleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBTabuleiroActionPerformed
        boolean condicaoDeValidacao = false;
        // TODO add your handling code here:
        if (condicaoDeValidacao) {
        }else{
        }
    }//GEN-LAST:event_JRBTabuleiroActionPerformed

    private void JRBMontardesmontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMontardesmontaActionPerformed
       boolean condicaoDeValidacao = false;
        // TODO add your handling code here:
        if (condicaoDeValidacao) {
        }else{
        
        }
    }//GEN-LAST:event_JRBMontardesmontaActionPerformed

    private void JRBsonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBsonsActionPerformed
         boolean condicaoDeValidacao = false;
        // TODO add your handling code here:
        if (condicaoDeValidacao) {
        }else{
            
        }
    }//GEN-LAST:event_JRBsonsActionPerformed

    private void JBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TeladeVendass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeVendass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeVendass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeVendass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeVendass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBConfirmar;
    private javax.swing.JButton JBDetalhes;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JComboBox<String> JCBMaterialBrinquedo;
    private javax.swing.JCheckBox JCBPapel;
    private javax.swing.JCheckBox JCBPlastico;
    private javax.swing.JCheckBox JCBPoliéster;
    private javax.swing.JList<String> JLGarantia;
    private javax.swing.JLabel JLTema;
    private javax.swing.JRadioButton JRBMontardesmonta;
    private javax.swing.JRadioButton JRBTabuleiro;
    private javax.swing.JRadioButton JRBsons;
    private javax.swing.JToggleButton JTBBancoImobiliario;
    private javax.swing.JToggleButton JTBBlocosdeMontar;
    private javax.swing.JToggleButton JTBXilofone;
    private javax.swing.JTable JTIdade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
