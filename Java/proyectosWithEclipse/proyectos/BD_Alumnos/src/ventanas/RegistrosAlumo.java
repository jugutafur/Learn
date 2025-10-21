package ventanas;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegistrosAlumo extends javax.swing.JFrame {

    public RegistrosAlumo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        txt_Nombre = new javax.swing.JTextField();
        txt_Grupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Grupo");

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GrupoActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresar el codigo del alumno ");

        txt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarActionPerformed(evt);
            }
        });

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_Grupo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_Registrar)
                                    .addGap(33, 33, 33)
                                    .addComponent(btn_Modificar)
                                    .addGap(32, 32, 32)
                                    .addComponent(btn_Eliminar))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel3)
                            .addGap(31, 31, 31)
                            .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_Buscar))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_Buscar)
                .addGap(18, 18, 18)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        
        //esto es tracciones a sqlserver para capturar exeptiones o errores en la conexion 
        try{
            String ID= txt_Buscar.getText().trim();
            
            //Establecer la conexion
            
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "root");
            PreparedStatement pst= cn.prepareStatement("update alumnos set NombreAlumno =?, Grupo=? where Id= "+ID);
            
            pst.setString(1, txt_Nombre.getText().trim());
            pst.setString(2, txt_Grupo.getText().trim());
            pst.executeUpdate();
            
            label_status.setText("Modificacion exitosa");
            
            
        }catch(Exception e){
            
            System.out.println("mis_errores en modificar"+e.toString());
            JOptionPane.showMessageDialog(null, "error en conexion en modificar"+e );
            
        }
        
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void txt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarActionPerformed
        
    }//GEN-LAST:event_txt_BuscarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        
        try{
            
     // "la ruta y el nombre de la BD a laque nos queremos conectar","el nombre de la BD en caso de tenerla","la contraseña "
            Connection sn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "root");
            //las instrucciones para la BD 
            PreparedStatement pst= sn.prepareStatement("insert into alumnos values (?,?,?)");
            
            pst.setString(1, "0");
            pst.setString(2, txt_Nombre.getText().trim());      //con trim quita espacios en blanco ej="xxJUANxx"
            pst.setString(3, txt_Grupo.getText().trim());
            pst.executeUpdate();
            
            //limpiar los txt
            txt_Nombre.setText("");
            txt_Grupo.setText("");
            label_status.setText("registro Existo.");
            
        }catch(Exception e){
            
            System.out.println("mis_errores en registrar"+e.toString());
            JOptionPane.showMessageDialog(null, "error en conexion en registrar"+e );
        }
       
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
        
        try{    
        //la ruta y el nombre de la BD a la que nos queremos conectar", el nombre de la BD en caso de tenerla","la constraseña" 
            Connection sn= DriverManager.getConnection("jdbc:mysql://localhost/bd_ins","root","root");
            //instrucciones para la BD
            PreparedStatement pst= sn.prepareStatement("select * from alumnos where ID= ?");
            //enviarle a al BD el valor que el usuario quiere buscar
            
            //  (1, de donde lo va a buscar)
            pst.setString(1, txt_Buscar.getText().trim());
            
            ResultSet rs=pst.executeQuery();
            
            //ahora tomar una desicion dependiendosi encontro los valores o no
            
            if(rs.next()){
                txt_Nombre.setText(rs.getString("NombreAlumno"));
                txt_Grupo.setText(rs.getString("Grupo"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no resgistrado");
            }
            
            
        }catch(Exception e){
            
            System.out.println("mis_errores en buscar"+e.toString());
            JOptionPane.showMessageDialog(null, "error en conexion en buscar"+e );
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void txt_GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GrupoActionPerformed

  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrosAlumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosAlumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosAlumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosAlumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosAlumo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Grupo;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}