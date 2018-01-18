/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("frmLogin"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, 40));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 50));

        txtContrasenia.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 500, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        if (txtUsuario.getText().equals("") & String.valueOf(txtContrasenia.getPassword()).equals("")) {
            
            JOptionPane.showMessageDialog(this, "Ingresa tus datos en los campos e intentalo de nuevo.");

        }else if (!"".equals(txtUsuario.getText()) & String.valueOf(txtContrasenia.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa tu contraseña e intentalo de nuevo.");
        }else if (txtUsuario.getText().equals("") & !"".equals(String.valueOf(txtContrasenia.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Ingresa tu usuario e intentalo de nuevo.");
        }else{
        
            String contrasenia = String.valueOf(txtContrasenia.getPassword());
            String result = login(txtUsuario.getText(), contrasenia);
            String TipoUsuario[] = result.split("/");
            if (TipoUsuario[2].equals("Administrador")) {
                new IndexAdministrador().setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Bienvenido administrador!");
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                txtContrasenia.setText("");
            }
            
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private static String login(java.lang.String usuario, java.lang.String contrasenia) {
        webservices.WSSeguros_Service service = new webservices.WSSeguros_Service();
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.login(usuario, contrasenia);
    }
}