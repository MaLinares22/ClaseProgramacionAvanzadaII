package vistas;
import controladores.ServiciosDAO;
import modelos.ServiciosModel;
import javax.swing.ImageIcon;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author MaLinares BlanCosta
 */
public class FormularioServicios extends javax.swing.JDialog {
    private String mode;
    private int id;
    private ServiciosDAO dao;
    private ListadoServicios parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));
    
    public FormularioServicios(ListadoServicios pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        
        dao = new ServiciosDAO();
        this.mode = pMode;
        this.id = pId;
        jTFID.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFID.setText(String.valueOf(dao.SiguienteID()));
            jTFID.setEditable(false);
        }else if(mode.equals("UPD")){
            ServiciosModel Servicio = (ServiciosModel) dao.getById(id);
            jTFServicio.setText(Servicio.getServicio());
            jTFDescripcion.setText(Servicio.getDescripcion());
            jTFPrecio.setText(Servicio.getPrecio());
            jTFDuracion.setText(Servicio.getDuracion());
        }else if(mode.equals("DLT")){
            ServiciosModel Servicio = (ServiciosModel) dao.getById(id);
            jTFServicio.setText(Servicio.getServicio());
            jTFDescripcion.setText(Servicio.getDescripcion());
            jTFPrecio.setText(Servicio.getPrecio());
            jTFDuracion.setText(Servicio.getDuracion());
            jTFServicio.setEnabled(false);
            jTFDescripcion.setEnabled(false);
            jTFPrecio.setEnabled(false);
            jTFDuracion.setEnabled(false);
            jButtonGuardar.setIcon(Borrar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelServicio = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelDuracion = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFServicio = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jTFDuracion = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(81, 93, 106));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Servicios");
        jLabelTitulo.setToolTipText("");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID de Servicio: ");

        jLabelServicio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelServicio.setText("Servicio: ");

        jLabelDescripcion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelDescripcion.setText("Descripcion: ");

        jLabelPrecio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelPrecio.setText("Precio: ");

        jLabelDuracion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelDuracion.setText("Duracion: ");

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFServicio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFDescripcion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFPrecio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFDuracion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(51, 255, 51));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jButtonGuardar.setToolTipText("");
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
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(18, 18, 18)
                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelServicio)
                        .addGap(18, 18, 18)
                        .addComponent(jTFServicio))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDescripcion))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPrecio))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelDuracion)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDuracion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelServicio)
                            .addComponent(jTFServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDuracion)
                            .addComponent(jTFDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonGuardar))
                .addGap(0, 40, Short.MAX_VALUE))
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
            ServiciosModel Servicio = new ServiciosModel();
            Servicio.setId(Integer.parseInt(jTFID.getText()));
            Servicio.setServicio(jTFServicio.getText());
            Servicio.setDescripcion(jTFDescripcion.getText());
            Servicio.setPrecio(jTFPrecio.getText());
            Servicio.setDuracion(jTFDuracion.getText());
            dao.insert(Servicio);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            ServiciosModel Servicio = new ServiciosModel();
            Servicio.setServicio(jTFServicio.getText());
            Servicio.setDescripcion(jTFDescripcion.getText());
            Servicio.setPrecio(jTFPrecio.getText());
            Servicio.setDuracion(jTFDuracion.getText());
            Servicio.setId(id);
            dao.update(Servicio);
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
            java.util.logging.Logger.getLogger(FormularioServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelServicio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFDuracion;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFServicio;
    // End of variables declaration//GEN-END:variables
}
