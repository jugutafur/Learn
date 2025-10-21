
package DiscoDurodeRoer;

import java.awt.Color;


public class Espejo extends javax.swing.JFrame {

    public Espejo() {
        initComponents();
        
//esto es para crear un grupo de radio button para que al seleccionar uno se quiten los demas
        
        buttonGroup1.add(this.rdb_1Original);
        buttonGroup1.add(this.rdb_2Original);
        buttonGroup1.add(this.rdb_3Original);
        
        buttonGroup2.add(this.rdb_1Imitador);
        buttonGroup2.add(this.rdb_2Imitador);
        buttonGroup2.add(this.rdb_3Imitador);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        rdb_1Original = new javax.swing.JRadioButton();
        rdb_2Original = new javax.swing.JRadioButton();
        rdb_3Original = new javax.swing.JRadioButton();
        rdb_1Imitador = new javax.swing.JRadioButton();
        rdb_2Imitador = new javax.swing.JRadioButton();
        rdb_3Imitador = new javax.swing.JRadioButton();
        ckb_1Original = new javax.swing.JCheckBox();
        ckb_2Original = new javax.swing.JCheckBox();
        ckb_3Original = new javax.swing.JCheckBox();
        ckb_1Imitador = new javax.swing.JCheckBox();
        ckb_2Imitador = new javax.swing.JCheckBox();
        ckb_3Imitador = new javax.swing.JCheckBox();
        txt_Imitador = new javax.swing.JTextField();
        txt_Original = new javax.swing.JTextField();
        spn_Original = new javax.swing.JSpinner();
        spn_Imitador = new javax.swing.JSpinner();
        cmb_Original = new javax.swing.JComboBox<>();
        cmb_Imitador = new javax.swing.JComboBox<>();
        txt_ItemOriginal = new javax.swing.JTextField();
        txt_ItemImitador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdb_1Original.setText("Opcion 1");
        rdb_1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_1OriginalActionPerformed(evt);
            }
        });

        rdb_2Original.setText("Opcion2");
        rdb_2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_2OriginalActionPerformed(evt);
            }
        });

        rdb_3Original.setText("Opcion 3");
        rdb_3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_3OriginalActionPerformed(evt);
            }
        });

        rdb_1Imitador.setText("Opcion 1");
        rdb_1Imitador.setEnabled(false);

        rdb_2Imitador.setText("Opcion 2");
        rdb_2Imitador.setEnabled(false);

        rdb_3Imitador.setText("Opcion3");
        rdb_3Imitador.setEnabled(false);

        ckb_1Original.setText("Opcion 4");
        ckb_1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_1OriginalActionPerformed(evt);
            }
        });

        ckb_2Original.setText("Opcion 5");
        ckb_2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_2OriginalActionPerformed(evt);
            }
        });

        ckb_3Original.setText("Opcion 6");
        ckb_3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_3OriginalActionPerformed(evt);
            }
        });

        ckb_1Imitador.setText("Opcion 4");
        ckb_1Imitador.setEnabled(false);

        ckb_2Imitador.setText("opcion 5");
        ckb_2Imitador.setEnabled(false);

        ckb_3Imitador.setText("Opcion 6");
        ckb_3Imitador.setEnabled(false);

        txt_Imitador.setEnabled(false);

        txt_Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_OriginalActionPerformed(evt);
            }
        });
        txt_Original.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_OriginalKeyPressed(evt);
            }
        });

        spn_Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_OriginalStateChanged(evt);
            }
        });

        spn_Imitador.setEnabled(false);

        cmb_Original.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_Original.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_OriginalItemStateChanged(evt);
            }
        });
        cmb_Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_OriginalActionPerformed(evt);
            }
        });

        cmb_Imitador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_Imitador.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdb_2Imitador)
                    .addComponent(rdb_1Imitador)
                    .addComponent(rdb_3Imitador, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_1Imitador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckb_3Imitador)
                    .addComponent(ckb_2Imitador))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spn_Imitador)
                    .addComponent(txt_Imitador, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_Imitador, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(txt_ItemImitador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdb_3Original)
                    .addComponent(rdb_1Original)
                    .addComponent(rdb_2Original, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckb_1Original)
                    .addComponent(ckb_2Original)
                    .addComponent(ckb_3Original))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_Original, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(cmb_Original, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spn_Original))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_ItemOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Imitador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ItemImitador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spn_Imitador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_1Original)
                            .addComponent(ckb_1Original)
                            .addComponent(txt_Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_2Original)
                            .addComponent(ckb_2Original)
                            .addComponent(cmb_Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ItemOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_3Original)
                            .addComponent(ckb_3Original)
                            .addComponent(spn_Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Imitador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ckb_1Imitador))
                            .addComponent(rdb_1Imitador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb_2Imitador)
                            .addComponent(ckb_2Imitador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb_3Imitador)
                            .addComponent(ckb_3Imitador))
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_2OriginalActionPerformed
        this.rdb_2Imitador.setSelected(this.rdb_2Original.isSelected());
        this.spn_Imitador.setEnabled(true);
        this.ckb_2Imitador.setEnabled(true);
    }//GEN-LAST:event_rdb_2OriginalActionPerformed

    private void ckb_2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_2OriginalActionPerformed
        this.ckb_2Imitador.setSelected(this.ckb_2Original.isSelected());
    }//GEN-LAST:event_ckb_2OriginalActionPerformed

    private void ckb_3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_3OriginalActionPerformed
        this.ckb_3Imitador.setSelected(this.ckb_3Original.isSelected());
    }//GEN-LAST:event_ckb_3OriginalActionPerformed

    private void rdb_1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_1OriginalActionPerformed
       
        this.rdb_1Imitador.setSelected(this.rdb_1Original.isSelected());
        this.txt_Original.setText("ahora si a escribir");
        this.rdb_1Imitador.setBackground(Color.red);
 
    }//GEN-LAST:event_rdb_1OriginalActionPerformed

    private void rdb_3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_3OriginalActionPerformed
        this.rdb_3Imitador.setSelected(this.rdb_3Original.isSelected());
    }//GEN-LAST:event_rdb_3OriginalActionPerformed

    private void ckb_1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_1OriginalActionPerformed
        this.ckb_1Imitador.setSelected(this.ckb_1Original.isSelected());
    }//GEN-LAST:event_ckb_1OriginalActionPerformed

    private void txt_OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_OriginalActionPerformed
        //this.txt_Imitador.setText(this.txt_Original.getText());
        
    }//GEN-LAST:event_txt_OriginalActionPerformed

    private void cmb_OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_OriginalActionPerformed

    private void txt_OriginalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_OriginalKeyPressed
        int num=buttonGroup1.getButtonCount();
        
        this.txt_Imitador.setText(this.txt_Original.getText()+num);
        
        
    }//GEN-LAST:event_txt_OriginalKeyPressed

    private void cmb_OriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_OriginalItemStateChanged
        
        this.cmb_Imitador.setSelectedIndex(this.cmb_Original.getSelectedIndex());
        int num2= this.cmb_Original.getSelectedIndex();
        this.txt_ItemOriginal.setText(""+num2);
        this.txt_ItemImitador.setText(""+num2);
    }//GEN-LAST:event_cmb_OriginalItemStateChanged

    private void spn_OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_OriginalStateChanged
        //                  FUNCIONA tambien sin el Integer
        this.spn_Imitador.setValue((Integer)this.spn_Original.getValue());
    }//GEN-LAST:event_spn_OriginalStateChanged

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Espejo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox ckb_1Imitador;
    private javax.swing.JCheckBox ckb_1Original;
    private javax.swing.JCheckBox ckb_2Imitador;
    private javax.swing.JCheckBox ckb_2Original;
    private javax.swing.JCheckBox ckb_3Imitador;
    private javax.swing.JCheckBox ckb_3Original;
    private javax.swing.JComboBox<String> cmb_Imitador;
    private javax.swing.JComboBox<String> cmb_Original;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdb_1Imitador;
    private javax.swing.JRadioButton rdb_1Original;
    private javax.swing.JRadioButton rdb_2Imitador;
    private javax.swing.JRadioButton rdb_2Original;
    private javax.swing.JRadioButton rdb_3Imitador;
    private javax.swing.JRadioButton rdb_3Original;
    private javax.swing.JSpinner spn_Imitador;
    private javax.swing.JSpinner spn_Original;
    private javax.swing.JTextField txt_Imitador;
    private javax.swing.JTextField txt_ItemImitador;
    private javax.swing.JTextField txt_ItemOriginal;
    private javax.swing.JTextField txt_Original;
    // End of variables declaration//GEN-END:variables
}
