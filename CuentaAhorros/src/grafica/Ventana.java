/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafica;

import datos.Cuenta;
import java.util.Map;
import javax.swing.JOptionPane;
import logica.GestorCuentas;

/**
 *
 * @author Asus
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        jPanelcrearcuenta.setVisible(false);
        jbotoncuentaexistente.setVisible(true);
        jbotoncrearcuenta.setVisible(true);
        jbotonbuscar.setEnabled(false);
        jPanelcuentaex.setVisible(false);
        jbotonretirar.setVisible(false);
        jbotonadicionar.setVisible(false);
        jbotonsalir.setVisible(false);
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
        jbotonsalir = new javax.swing.JToggleButton();
        jPanelcrearcuenta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextvalorinicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTexnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbotonguardar = new javax.swing.JToggleButton();
        jboxtidentificacion = new javax.swing.JComboBox<>();
        jTexidentificacion = new javax.swing.JTextField();
        jbotoncrearcuenta = new javax.swing.JButton();
        jbotoncuentaexistente = new javax.swing.JButton();
        jPanelcuentaex = new javax.swing.JPanel();
        jbotonbuscar = new javax.swing.JButton();
        jTextnumidenti = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbotonretirar = new javax.swing.JButton();
        jbotonadicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("CUENTA DE AHORROS");

        jbotonsalir.setBackground(new java.awt.Color(204, 255, 255));
        jbotonsalir.setText("SALIR");
        jbotonsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbotonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonsalirActionPerformed(evt);
            }
        });

        jPanelcrearcuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 102)));
        jPanelcrearcuenta.setForeground(new java.awt.Color(204, 153, 255));

        jLabel2.setText("NOMBRES COMPLETOS :");

        jTextvalorinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextvalorinicialActionPerformed(evt);
            }
        });

        jLabel3.setText("TIPO DE IDENTIFICACION : ");

        jLabel4.setText("VALOR INICIAL :");

        jTexnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexnombreActionPerformed(evt);
            }
        });

        jLabel5.setText("$");

        jbotonguardar.setBackground(new java.awt.Color(153, 255, 153));
        jbotonguardar.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotonguardar.setText("GUARDAR");
        jbotonguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbotonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonguardarActionPerformed(evt);
            }
        });

        jboxtidentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Tarjerta de Identidad", "PASAPORTE", " " }));
        jboxtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxtidentificacionActionPerformed(evt);
            }
        });

        jTexidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexidentificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelcrearcuentaLayout = new javax.swing.GroupLayout(jPanelcrearcuenta);
        jPanelcrearcuenta.setLayout(jPanelcrearcuentaLayout);
        jPanelcrearcuentaLayout.setHorizontalGroup(
            jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                .addGroup(jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextvalorinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                                        .addComponent(jboxtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTexidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jbotonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelcrearcuentaLayout.setVerticalGroup(
            jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcrearcuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanelcrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextvalorinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jbotonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbotoncrearcuenta.setBackground(new java.awt.Color(51, 255, 204));
        jbotoncrearcuenta.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotoncrearcuenta.setText("CREAR CUENTA");
        jbotoncrearcuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbotoncrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotoncrearcuentaActionPerformed(evt);
            }
        });

        jbotoncuentaexistente.setBackground(new java.awt.Color(255, 102, 102));
        jbotoncuentaexistente.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotoncuentaexistente.setText("CUENTA EXISTENTE");
        jbotoncuentaexistente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbotoncuentaexistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotoncuentaexistenteActionPerformed(evt);
            }
        });

        jPanelcuentaex.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));

        jbotonbuscar.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotonbuscar.setText("BUSCAR");
        jbotonbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbotonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonbuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("N?? IDENTIFICACI??N:");

        javax.swing.GroupLayout jPanelcuentaexLayout = new javax.swing.GroupLayout(jPanelcuentaex);
        jPanelcuentaex.setLayout(jPanelcuentaexLayout);
        jPanelcuentaexLayout.setHorizontalGroup(
            jPanelcuentaexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcuentaexLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanelcuentaexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcuentaexLayout.createSequentialGroup()
                        .addGroup(jPanelcuentaexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextnumidenti, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbotonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcuentaexLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanelcuentaexLayout.setVerticalGroup(
            jPanelcuentaexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcuentaexLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextnumidenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbotonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbotonretirar.setBackground(new java.awt.Color(255, 153, 51));
        jbotonretirar.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotonretirar.setText("RETIRAR");
        jbotonretirar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbotonretirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonretirarActionPerformed(evt);
            }
        });

        jbotonadicionar.setBackground(new java.awt.Color(153, 255, 51));
        jbotonadicionar.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jbotonadicionar.setText("ADICIONAR");
        jbotonadicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbotonadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonadicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jbotoncrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbotoncuentaexistente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelcrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jbotonretirar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbotonadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelcuentaex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbotonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbotoncrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbotoncuentaexistente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelcuentaex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbotonretirar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbotonadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbotonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelcrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbotonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonsalirActionPerformed

        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbotonsalirActionPerformed

    private void jbotonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonguardarActionPerformed
        
     jbotoncuentaexistente.setEnabled(true);
     jbotonadicionar.setVisible(false);
     jbotonretirar.setVisible(false);
        jbotonsalir.setVisible(false);
        jPanelcrearcuenta.setVisible(false);
        jbotoncrearcuenta.setEnabled(false);
        cargarCuentas();
      AlamcenarDatosCrearCuenta();
     
// TODO add your handling code here:
    }//GEN-LAST:event_jbotonguardarActionPerformed

    private void jbotoncrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotoncrearcuentaActionPerformed
        jPanelcrearcuenta.setVisible(true);
        jbotonretirar.setVisible(false);
        jbotonadicionar.setVisible(false);
        jbotonsalir.setVisible(false);
        jbotoncrearcuenta.setVisible(true);
        jbotonbuscar.setEnabled(false);
        jPanelcuentaex.setVisible(false);
        jbotonguardar.setVisible(true);
        jbotoncuentaexistente.setEnabled(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbotoncrearcuentaActionPerformed

    private void jbotonadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonadicionarActionPerformed

      new Vadicionar().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jbotonadicionarActionPerformed

    private void jbotonretirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonretirarActionPerformed

       new Vretirar().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jbotonretirarActionPerformed

    private void jTextvalorinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextvalorinicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextvalorinicialActionPerformed

    private void jbotoncuentaexistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotoncuentaexistenteActionPerformed
        jPanelcrearcuenta.setEnabled(false);
        jbotoncuentaexistente.setEnabled(false);
        jbotoncrearcuenta.setEnabled(false);
        jbotonbuscar.setEnabled(true);
        jPanelcuentaex.setVisible(true);
        jbotonretirar.setVisible(false);
        jbotonadicionar.setVisible(false);
        jbotonsalir.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jbotoncuentaexistenteActionPerformed

    private void jTexnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexnombreActionPerformed

    private void jTexidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexidentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexidentificacionActionPerformed

    private void jboxtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxtidentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxtidentificacionActionPerformed

    private void jbotonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonbuscarActionPerformed
        JOptionPane.showMessageDialog(this, "SE??OR USUARIO,LA CUENTA YA ESTA CREADA CORRECAMENTE");
        jbotonadicionar.setVisible(true);
     jbotonretirar.setVisible(true);
        jbotonsalir.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbotonbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelcrearcuenta;
    private javax.swing.JPanel jPanelcuentaex;
    private javax.swing.JTextField jTexidentificacion;
    private javax.swing.JTextField jTexnombre;
    private javax.swing.JTextField jTextnumidenti;
    private javax.swing.JTextField jTextvalorinicial;
    private javax.swing.JButton jbotonadicionar;
    private javax.swing.JButton jbotonbuscar;
    private javax.swing.JButton jbotoncrearcuenta;
    private javax.swing.JButton jbotoncuentaexistente;
    private javax.swing.JToggleButton jbotonguardar;
    private javax.swing.JButton jbotonretirar;
    private javax.swing.JToggleButton jbotonsalir;
    private javax.swing.JComboBox<String> jboxtidentificacion;
    // End of variables declaration//GEN-END:variables
   
    public void AlamcenarDatosCrearCuenta(){
     String nombre = jTexnombre.getText();
     String identificacion = jTexidentificacion.getText();
     String tidentificacion = jboxtidentificacion.getSelectedItem().toString();
     String SALDO = jTextvalorinicial.getText();
     
     double saldo = Double.parseDouble(SALDO);
     
     GestorCuentas g = new GestorCuentas();
     Cuenta p = g.crearCuenta(nombre, identificacion, tidentificacion, saldo);
     
     if (p!=null){
         cargarCuentas();
         JOptionPane.showMessageDialog(this,"se creo la cuenta:"+p);
        
     }else 
     {
       JOptionPane.showMessageDialog(this,"no creo la cuenta");  
     }
     
    }
    
    public void cargarCuentas()
    {
        GestorCuentas gestor = new GestorCuentas();
        Map<String, Cuenta> lista = gestor.obtenerLista();
        for (Map.Entry<String, Cuenta> datos  : lista.entrySet()) {
            Cuenta nova = datos.getValue();
            Object[] datos1 = {
                nova.obtenerCliente(),
                    nova.obtenerNumCuenta(),
                        nova.obtenerCliente()
                

            };
           System.out.println(""+nova.obtenerCliente()); 
        }
    }
}
