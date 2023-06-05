
package com.desafio.login.igu;

import com.desafio.login.logica.Controladora;
import com.desafio.login.logica.Usuario;

public class LoginInicial extends javax.swing.JFrame {

    Controladora control;
  
    public LoginInicial() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        txtContrasenia.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 148, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 81, 197, 40));

        jSeparator1.setBackground(new java.awt.Color(82, 82, 82));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 209, 324, 10));

        jSeparator2.setBackground(new java.awt.Color(82, 82, 82));
        jSeparator2.setToolTipText("");
        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 286, 324, 11));

        btnLimpiar.setBackground(new java.awt.Color(51, 153, 255));
        btnLimpiar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 231, 112, -1));

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 231, 112, -1));

        txtMensaje.setEditable(false);
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(0, 153, 0));
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 315, 324, 123));

        txtPassword.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 139, 197, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\PROGRAMACION\\JAVA\\Proyectos\\JAVA TodoCode\\proyectos\\Login\\src\\main\\java\\com\\desafio\\login\\Imagenes\\01.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtUsuario.setText("");
        txtPassword.setText("");
        txtMensaje.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String usuario = txtUsuario.getText();
        String contrasenia = txtPassword.getText();
        
        Usuario user = control.validarUsuario(usuario, contrasenia);
        
        if (user != null) {
        
            String rol = user.getRol().getRolName();
            
            if (rol.equals("admin")) {
                
                PrincipalAdmin pAdmin = new PrincipalAdmin(control, user);
                pAdmin.setVisible(true);
                pAdmin.setLocationRelativeTo(null);
                this.dispose();
            
            }
            if(rol.equals("user")){
                PrincipalUser pUser = new PrincipalUser(control, user);
                pUser.setVisible(true);
                pUser.setLocationRelativeTo(null);
                this.dispose();
            }
            
        }else {
            txtMensaje.setText("Usuario o contraseña incorrecto");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
