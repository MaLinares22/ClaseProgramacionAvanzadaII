package vistas;
import controladores.RolesDAO;
import modelos.RolesModel;
import javax.swing.ImageIcon;
/**
 *
 * @author MaLinares BlanCosta
 */
public class FormularioRoles extends javax.swing.JDialog {
    private String mode;
    private int id;
    private RolesDAO dao;
    private ListadoRoles parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));
    
    public FormularioRoles(ListadoRoles pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        
        dao = new RolesDAO();
        this.mode = pMode;
        this.id = pId;
        jTFID.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFID.setText(String.valueOf(dao.SiguienteID()));
            jTFID.setEditable(false);
        }else if(mode.equals("UPD")){
            RolesModel Rol = (RolesModel) dao.getById(id);
            jTFDescripcion.setText(Rol.getDescripcion());
        }else if(mode.equals("DLT")){
            RolesModel Rol = (RolesModel) dao.getById(id);
            jTFDescripcion.setText(Rol.getDescripcion());
            jButtonGuardar.setIcon(Borrar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(84, 113, 121));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Roles");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID de Rol: ");

        jLabelDescripcion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelDescripcion.setText("Descripcion: ");

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFDescripcion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(51, 255, 51));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addGap(18, 18, 18)
                                .addComponent(jTFID))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelDescripcion)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancelar)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescripcion)
                            .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(mode.equals("INS")){
            RolesModel Rol = new RolesModel();
            Rol.setId(Integer.parseInt(jTFID.getText()));
            Rol.setDescripcion(jTFDescripcion.getText());
            dao.insert(Rol);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            RolesModel Rol = new RolesModel();
            Rol.setDescripcion(jTFDescripcion.getText());
            Rol.setId(id);
            dao.update(Rol);
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
            java.util.logging.Logger.getLogger(FormularioRoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFID;
    // End of variables declaration//GEN-END:variables
}
