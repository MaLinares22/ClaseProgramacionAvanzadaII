package vistas;
import controladores.ReservasDAO;
import modelos.ReservasModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author MaLinares BlanCosta
 */
public class Formulario_Reservas extends javax.swing.JDialog {
    private String mode;
    private int id;
    private ReservasDAO dao;
    private ListadoReservas parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));
    
    public Formulario_Reservas(ListadoReservas pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        cargarCombos();
        
        dao = new ReservasDAO();
        this.mode = pMode;
        this.id = pId;
        jTFID.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFID.setText(String.valueOf(dao.SiguienteID()));
            jTFID.setEditable(false);
        }else if(mode.equals("UPD")){
            ReservasModel Reserva = (ReservasModel) dao.getById(id);
            jTFTiempo.setText(Reserva.getTiempo());
            jTFEstado.setText(Reserva.getEstado());
        }else if(mode.equals("DLT")){
            ReservasModel Reserva = (ReservasModel) dao.getById(id);
            jTFTiempo.setText(Reserva.getTiempo());
            jTFEstado.setText(Reserva.getEstado());
            jTFTiempo.setEnabled(false);
            jCBPago.setEnabled(false);
            jTFEstado.setEnabled(false);
            jCBHuesped.setEnabled(false);
            jCBHabitacion.setEnabled(false);
            jButtonGuardar.setIcon(Borrar);
        }
   }
    
    private void cargarCombos() {
    //Cargar Huéspedes
    List<Integer> huespedes = ReservasDAO.obtenerIDHuesped();
    for (Integer h : huespedes) {
        jCBHuesped.addItem(h.toString());
    }
    //Cargar Habitaciones
    List<Integer> habitaciones = ReservasDAO.obtenerIdHabitacion();
    for (Integer h : habitaciones) {
        jCBHabitacion.addItem(h.toString());
    }
    //Cargar Pagos
    List<Integer> pagos = ReservasDAO.obtenerPago();
    for (Integer h : pagos) {
        jCBPago.addItem(h.toString());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabelHuesped = new javax.swing.JLabel();
        jCBHuesped = new javax.swing.JComboBox<>();
        jLabelHabitacion = new javax.swing.JLabel();
        jCBHabitacion = new javax.swing.JComboBox<>();
        jLabelTiempo = new javax.swing.JLabel();
        jTFTiempo = new javax.swing.JTextField();
        jLabelPago = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jCBPago = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(92, 118, 118));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Reservas");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID de Reserva:");

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jLabelHuesped.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelHuesped.setText("ID del Huesped:");

        jCBHuesped.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jCBHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBHuespedActionPerformed(evt);
            }
        });

        jLabelHabitacion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelHabitacion.setText("ID de Habitacion: ");

        jCBHabitacion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jLabelTiempo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelTiempo.setText("Tiempo de la Reserva:");

        jTFTiempo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFTiempo.setToolTipText("");

        jLabelPago.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelPago.setText("Tipo del Pago:");

        jLabelTipo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelTipo.setText("Estado de Pago:");

        jTFEstado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstadoActionPerformed(evt);
            }
        });

        jCBPago.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
                .addComponent(jLabelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(18, 18, 18)
                        .addComponent(jTFID))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelHuesped)
                        .addGap(18, 18, 18)
                        .addComponent(jCBHuesped, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTiempo)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTiempo))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelPago)
                        .addGap(18, 18, 18)
                        .addComponent(jCBPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFEstado))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelHabitacion)
                        .addGap(18, 18, 18)
                        .addComponent(jCBHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
                    .addComponent(jLabelHuesped)
                    .addComponent(jCBHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHabitacion)
                            .addComponent(jCBHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton2)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTiempo)
                            .addComponent(jTFTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPago)
                            .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonGuardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
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

    private void jCBHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBHuespedActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
 
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(mode.equals("INS")){
            ReservasModel Reserva = new ReservasModel();
            Reserva.setIDReserva(Integer.parseInt(jTFID.getText()));
            Reserva.setIDHuesped(Integer.parseInt(jCBHuesped.getSelectedItem().toString()));
            Reserva.setIDHabitacion(Integer.parseInt(jCBHabitacion.getSelectedItem().toString()));
            Reserva.setTiempo(jTFTiempo.getText());
            Reserva.setTipoPago(Integer.parseInt(jCBPago.getSelectedItem().toString()));
            Reserva.setEstado(jTFEstado.getText());
            dao.insert(Reserva);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            ReservasModel Reserva = new ReservasModel();
            Reserva.setIDHuesped(Integer.parseInt(jCBHuesped.getSelectedItem().toString()));
            Reserva.setIDHabitacion(Integer.parseInt(jCBHabitacion.getSelectedItem().toString()));
            Reserva.setTiempo(jTFTiempo.getText());
            Reserva.setTipoPago(Integer.parseInt(jCBPago.getSelectedItem().toString()));
            Reserva.setEstado(jTFEstado.getText());
            Reserva.setIDReserva(id);
            dao.update(Reserva);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("DLT")){           
            dao.delete(id);
            parent.Refresh();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstadoActionPerformed
 
    }//GEN-LAST:event_jTFEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jCBHabitacion;
    private javax.swing.JComboBox<String> jCBHuesped;
    private javax.swing.JComboBox<String> jCBPago;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelHuesped;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPago;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFTiempo;
    // End of variables declaration//GEN-END:variables
}
