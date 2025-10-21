
package DiscoDurodeRoer;

import javax.swing.JOptionPane;


public class Ingresar_Pelicula extends javax.swing.JFrame {

  
    public Ingresar_Pelicula() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_pelicula = new javax.swing.JTextField();
        cmb_Pelicula = new javax.swing.JComboBox<>();
        btn_Añadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el nombre de la pelicula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 19, -1, -1));

        txt_pelicula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_pelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, 242, -1));

        cmb_Pelicula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(cmb_Pelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 351, -1));

        btn_Añadir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Añadir.setText("Añadir");
        btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AñadirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 109, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AñadirActionPerformed
        String NombrePelicula;

        NombrePelicula= txt_pelicula.getText().trim();
        
        
        if((txt_pelicula.getText().equalsIgnoreCase(""))){
        JOptionPane.showMessageDialog(null,"Ingreso de un valor invalido", "ERROR", JOptionPane.INFORMATION_MESSAGE);    
        //NombrePelicula= txt_pelicula.getText().trim();

        }else{
        txt_pelicula.setText("");
        cmb_Pelicula.addItem(NombrePelicula);        
        JOptionPane.showMessageDialog(null, "Pelicula ingresada con exito", "CORREECTAMENTE",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_AñadirActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Pelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Añadir;
    private javax.swing.JComboBox<String> cmb_Pelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_pelicula;
    // End of variables declaration//GEN-END:variables
}
