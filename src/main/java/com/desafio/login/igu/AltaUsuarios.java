
package com.desafio.login.igu;

import com.desafio.login.logica.Controladora;
import com.desafio.login.logica.Rol;
import com.desafio.login.logica.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class AltaUsuarios extends javax.swing.JFrame {
    
    Controladora control;
    Usuario user;

    public AltaUsuarios(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        CmbRol = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Alta de Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Rol:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 187, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 130, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 79, 257, -1));

        txtContrasenia.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 127, 257, -1));

        CmbRol.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        CmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbRolActionPerformed(evt);
            }
        });
        jPanel1.add(CmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 182, 157, -1));

        btnLimpiar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 120, 50));

        btnGuardar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 121, 50));

        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\PROGRAMACION\\JAVA\\Proyectos\\JAVA TodoCode\\proyectos\\Desafio4.Login\\src\\main\\java\\com\\desafio\\login\\Imagenes\\04.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setText("");
        txtContrasenia.setText("");        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void CmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbRolActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        List<Rol> listaRoles = control.traerRoles();
        
        if(listaRoles != null){
            for (Rol rol : listaRoles) {

                CmbRol.addItem(rol.getRolName());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String usuario = txtUsuario.getText();
        String password = txtContrasenia.getText();
        String rol = (String) CmbRol.getSelectedItem();
        
        control.crearUsuario(usuario,password,rol);
        JOptionPane.showMessageDialog(null, "Usuario guardado con exito");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       
       PrincipalAdmin admin = new PrincipalAdmin(control, user);
       admin.cargartabla();
       admin.setVisible(true);
       admin.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbRol;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
