/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import webservices.Afiliado;
import webservices.Siniestro;

/**
 *
 * @author Andres
 */
public class SiniestrosRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form SiniestrosRegistrados
     */
    public SiniestrosRegistrados() {
        initComponents();
        
        DefaultTableModel modeloTabla= (DefaultTableModel) tblSiniestrosRealizados.getModel();
        String fecha[];
        List<Afiliado>listaAfiliado = consultaAll();
        for (Afiliado afiliado : listaAfiliado) {
            
            List<Siniestro>listaSiniestro = siniestroBuscar(afiliado.getIdAfiliado());
            if (listaSiniestro.size() > 0) {
                for(Siniestro siniestro : listaSiniestro){
                    fecha = String.valueOf(String.valueOf(siniestro.getFecha())).split("T");
                    Vector vecSiniestro = new Vector();
                    vecSiniestro.add(fecha[0]);
                    vecSiniestro.add(siniestro.getTipo());
                    vecSiniestro.add(afiliado.getNombre()+" "+afiliado.getApellido());
                    vecSiniestro.add(afiliado.getCiudad());
                    modeloTabla.addRow(vecSiniestro);
                    
                }
                
            }
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

        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAtras7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSiniestrosRealizados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Siniestros Registrados");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        btnAtras7.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andres\\Documents\\NetBeansProjects\\SegurosClient\\src\\Recursos\\Circled Left 2_35px.png")); // NOI18N
        btnAtras7.setText("Atras");
        btnAtras7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtras7MouseClicked(evt);
            }
        });
        jPanel8.add(btnAtras7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andres\\Documents\\NetBeansProjects\\SegurosClient\\src\\Recursos\\Shutdown_15px.png")); // NOI18N
        jLabel5.setText("Cerrar Sesión");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblSiniestrosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Siniestro", "Tipo Siniestro", "Nombre Afiliado", "Ciudad Afiliado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSiniestrosRealizados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 690, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtras7MouseClicked
        // TODO add your handling code here:
        new IndexAdministrador().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(SiniestrosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiniestrosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiniestrosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiniestrosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiniestrosRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAtras7;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSiniestrosRealizados;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<webservices.Afiliado> consultaAll() {
        webservices.WSSeguros_Service service = new webservices.WSSeguros_Service();
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.consultaAll();
    }

    private static java.util.List<webservices.Siniestro> siniestroBuscar(int idAfiliado) {
        webservices.WSSeguros_Service service = new webservices.WSSeguros_Service();
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.siniestroBuscar(idAfiliado);
    }

    

}