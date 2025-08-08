package vistas;
import controladores.HabitacionesDAO;
import modelos.HabitacionesModel;
import javax.swing.ImageIcon;

/**
 *
 * @author MaLinares BlanCosta
 */
public class FormularioHabitacion extends javax.swing.JDialog {
    private String mode;
    private int id;
    private HabitacionesDAO dao;
    private ListadoHabitaciones parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));

    public FormularioHabitacion(ListadoHabitaciones pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        
        dao = new HabitacionesDAO();
        this.mode = pMode;
        this.id = pId;
        jTFNumero.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFNumero.setText(String.valueOf(dao.SiguienteID()));
            jTFNumero.setEditable(false);
        }else if(mode.equals("UPD")){
            HabitacionesModel Habitacion = (HabitacionesModel) dao.getByNum(id);
            jTFID.setText(Habitacion.getId());
            jTFTipo.setText(Habitacion.getTipo());
            jTFPrecio.setText(Habitacion.getPrecio());
            jTFEstado.setText(Habitacion.getEstado());
        }else if(mode.equals("DLT")){
            HabitacionesModel Habitacion = (HabitacionesModel) dao.getByNum(id);
            jTFID.setText(Habitacion.getId());
            jTFTipo.setText(Habitacion.getTipo());
            jTFPrecio.setText(Habitacion.getPrecio());
            jTFEstado.setText(Habitacion.getEstado());
            jTFID.setEnabled(false);
            jTFTipo.setEnabled(false);
            jTFPrecio.setEnabled(false);
            jTFEstado.setEnabled(false);
            jButtonGuardar.setIcon(Borrar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();
        jTFTipo = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jTFEstado = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(83, 114, 110));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Habitaciones");

        jLabelNumero.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelNumero.setText("Numero de Habitacion: ");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID de Habitacion: ");

        jLabelTipo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelTipo.setText("Tipo de Habitacion:");

        jLabelPrecio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelPrecio.setText("Precio Por Noche: ");

        jLabelEstado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado de la Habitacion:");

        jTFNumero.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFNumero.setToolTipText("");
        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFTipo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFPrecio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFEstado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButtonGuardar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(102, 255, 51));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("");
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
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(18, 18, 18)
                        .addComponent(jTFID))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTipo))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPrecio))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jTFEstado))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipo)
                            .addComponent(jTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonCancelar))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEstado)
                            .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonGuardar))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(mode.equals("INS")){
            HabitacionesModel Habitacion = new HabitacionesModel();
            Habitacion.setNum(Integer.parseInt(jTFNumero.getText()));
            Habitacion.setId(jTFID.getText());
            Habitacion.setTipo(jTFTipo.getText());
            Habitacion.setPrecio(jTFPrecio.getText());
            Habitacion.setEstado(jTFEstado.getText());
            dao.insert(Habitacion);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            HabitacionesModel Habitacion = new HabitacionesModel();
            Habitacion.setId(jTFID.getText());
            Habitacion.setTipo(jTFTipo.getText());
            Habitacion.setPrecio(jTFPrecio.getText());
            Habitacion.setEstado(jTFEstado.getText());
            Habitacion.setNum(id);
            dao.update(Habitacion);
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

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed

    }//GEN-LAST:event_jTFNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFTipo;
    // End of variables declaration//GEN-END:variables
}
