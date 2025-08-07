package vistas;
import controladores.HuespedesDAO;
import modelos.HuespedesModel;
import javax.swing.ImageIcon;

/**
 *
 * @author MaLinares BlanCosta
 */
public class FormularioHuespedes extends javax.swing.JDialog {
    private String mode;
    private int id;
    private HuespedesDAO dao;
    private ListadoHuespedes parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));
    
    public FormularioHuespedes(ListadoHuespedes pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        
        dao = new HuespedesDAO();
        this.mode = pMode;
        this.id = pId;
        jTFID.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFID.setText(String.valueOf(dao.SiguienteID()));
            jTFID.setEditable(false);
        }else if(mode.equals("UPD")){
            HuespedesModel Huesped = (HuespedesModel) dao.getById(id);
            jTFNombre.setText(Huesped.getNombre());
            jTFApellido.setText(Huesped.getApellido());
            jTFCorreo.setText(Huesped.getCorreo());
            jTFDNI.setText(Huesped.getDNI());
            jTFTelefono.setText(Huesped.getTelefono());
        }else if(mode.equals("DLT")){
            HuespedesModel Huesped = (HuespedesModel) dao.getById(id);
            jTFNombre.setText(Huesped.getNombre());
            jTFApellido.setText(Huesped.getApellido());
            jTFCorreo.setText(Huesped.getCorreo());
            jTFDNI.setText(Huesped.getDNI());
            jTFTelefono.setText(Huesped.getTelefono());
            jTFNombre.setEnabled(false);
            jTFApellido.setEnabled(false);
            jTFCorreo.setEnabled(false);
            jTFDNI.setEnabled(false);
            jTFTelefono.setEnabled(false);
            jButtonGuardar.setIcon(Borrar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFDNI = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(75, 90, 104));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Huespedes");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID del Huesped:");

        jLabelNombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre del Huesped:");

        jLabelApellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido del Huesped: ");

        jLabelCorreo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelCorreo.setText("Correo del Huesped:");

        jLabelDNI.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelDNI.setText("DNI del Huesped:");

        jLabelTelefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelTelefono.setText("Telefono del Huesped:");

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFNombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFApellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFCorreo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFDNI.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFTelefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButtonGuardar.setBackground(new java.awt.Color(51, 255, 51));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(18, 18, 18)
                        .addComponent(jTFID))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCorreo))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelDNI)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDNI))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTelefono))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelApellido)
                        .addGap(18, 18, 18)
                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellido)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDNI)
                                    .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonGuardar)))
                    .addComponent(jButtonCancelar))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(mode.equals("INS")){
            HuespedesModel Huesped = new HuespedesModel();
            Huesped.setId(Integer.parseInt(jTFID.getText()));
            Huesped.setNombre(jTFNombre.getText());
            Huesped.setApellido(jTFApellido.getText());
            Huesped.setCorreo(jTFCorreo.getText());
            Huesped.setDNI(jTFDNI.getText());
            Huesped.setTelefono(jTFTelefono.getText());
            dao.insert(Huesped);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            HuespedesModel Huesped = new HuespedesModel();
            Huesped.setNombre(jTFNombre.getText());
            Huesped.setApellido(jTFApellido.getText());
            Huesped.setCorreo(jTFCorreo.getText());
            Huesped.setDNI(jTFDNI.getText());
            Huesped.setTelefono(jTFTelefono.getText());
            Huesped.setId(id);
            dao.update(Huesped);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("DLT")){           
            dao.delete(id);
            parent.Refresh();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
