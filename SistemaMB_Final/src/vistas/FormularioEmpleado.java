package vistas;
import controladores.EmpleadosDAO;
import modelos.EmpleadosModel;
import javax.swing.ImageIcon;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MaLinares BlanCosta
 */
public class FormularioEmpleado extends javax.swing.JDialog {
    private String mode;
    private int id;
    private EmpleadosDAO dao;
    private ListadoEmpleados parent;
    private ImageIcon Borrar = new ImageIcon(getClass().getResource("/Images/Borrar.png"));
    
    public FormularioEmpleado(ListadoEmpleados pParent, boolean modal, String pMode, int pId) {
        super(pParent, modal);
        this.parent = pParent;
        initComponents();
        cargarCombos();
        
        dao = new EmpleadosDAO();
        this.mode = pMode;
        this.id = pId;
        jTFID.setText(String.valueOf(pId));
        
        if(mode.equals("INS")){
            jTFID.setText(String.valueOf(dao.SiguienteID()));
            jTFID.setEditable(false);
        }else if(mode.equals("UPD")){
            EmpleadosModel Empleado = (EmpleadosModel) dao.getById(id);
            jTFNombre.setText(Empleado.getNombre());
            jTFApellido.setText(Empleado.getApellido());
            jTFFecha.setText(Empleado.getFechaEntrada());
            jTFNumero.setText(Empleado.getNumeroEmpleado());
            jTFCorreo.setText(Empleado.getCorreo());
            jTFSueldo.setText(Empleado.getSueldo());
            jTFDNI.setText(Empleado.getDni());
            jTFEntrada.setText(Empleado.getHoraEntrada());
            jTFSalida.setText(Empleado.getHoraSalida());
        }else if(mode.equals("DLT")){
            EmpleadosModel Empleado = (EmpleadosModel) dao.getById(id);
            jTFNombre.setText(Empleado.getNombre());
            jTFApellido.setText(Empleado.getApellido());
            jTFFecha.setText(Empleado.getFechaEntrada());
            jTFNumero.setText(Empleado.getNumeroEmpleado());
            jTFCorreo.setText(Empleado.getCorreo());
            jTFSueldo.setText(Empleado.getSueldo());
            jTFDNI.setText(Empleado.getDni());
            jTFEntrada.setText(Empleado.getHoraEntrada());
            jTFSalida.setText(Empleado.getHoraSalida());
            jTFNombre.setEnabled(false);
            jTFApellido.setEnabled(false);
            jTFFecha.setEnabled(false);
            jTFNumero.setEnabled(false);
            jTFCorreo.setEnabled(false);
            jTFSueldo.setEnabled(false);
            jCBRol.setEnabled(false);
            jTFDNI.setEnabled(false);
            jTFEntrada.setEnabled(false);
            jTFSalida.setEnabled(false);
            jButtonGuardar.setIcon(Borrar);
        }
    }
    
    private void cargarCombos() {
    //Cargar huéspedes
    List<Integer> empleado = EmpleadosDAO.obtenerIDRol();
    for (Integer h : empleado) {
        jCBRol.addItem(h.toString());
    }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelSueldo = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelEntrada = new javax.swing.JLabel();
        jLabelSalida = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFFecha = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFSueldo = new javax.swing.JTextField();
        jTFDNI = new javax.swing.JTextField();
        jTFEntrada = new javax.swing.JTextField();
        jTFSalida = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jCBRol = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(95, 121, 126));

        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Empleados");

        jLabelID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelID.setText("ID De Empleado: ");

        jLabelNombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre de Empleado: ");

        jLabelApellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido de Empleado: ");

        jLabelFecha.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelFecha.setText("Fecha de Entrada: ");

        jLabelNumero.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelNumero.setText("Numero Telefonico: ");

        jLabelCorreo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelCorreo.setText("Correo Electronico: ");

        jLabelSueldo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelSueldo.setText("Sueldo:");

        jLabelRol.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelRol.setText("Rol De Empleado: ");

        jLabelDNI.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelDNI.setText("DNI: ");

        jLabelEntrada.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelEntrada.setText("Hora de Entrada: ");

        jLabelSalida.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabelSalida.setText("Hora De Salida: ");

        jTFID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jTFNombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jTFApellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFFecha.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFNumero.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        jTFCorreo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFSueldo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFDNI.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFEntrada.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jTFSalida.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        jButtonGuardar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(51, 255, 51));
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
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jCBRol.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTitulo)
                        .addGroup(jPanelFondoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelFondoLayout.createSequentialGroup()
                                    .addComponent(jLabelID)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelFondoLayout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelFondoLayout.createSequentialGroup()
                                    .addComponent(jLabelApellido)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFApellido))
                                .addGroup(jPanelFondoLayout.createSequentialGroup()
                                    .addComponent(jLabelFecha)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFFecha)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelSalida)
                                .addGap(18, 18, 18)
                                .addComponent(jTFSalida))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelEntrada)
                                .addGap(18, 18, 18)
                                .addComponent(jTFEntrada))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelDNI)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDNI))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelNumero)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNumero))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelCorreo)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCorreo))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelSueldo)
                                .addGap(18, 18, 18)
                                .addComponent(jTFSueldo))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabelRol)
                                .addGap(18, 18, 18)
                                .addComponent(jCBRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSueldo)
                            .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRol)
                            .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI)
                            .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEntrada)
                            .addComponent(jTFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSalida)
                            .addComponent(jTFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed

    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(mode.equals("INS")){
            EmpleadosModel Empleado = new EmpleadosModel();
            Empleado.setId(Integer.parseInt(jTFID.getText()));
            Empleado.setNombre(jTFNombre.getText());
            Empleado.setApellido(jTFApellido.getText());
            Empleado.setFechaEntrada(jTFFecha.getText());
            Empleado.setNumeroEmpleado(jTFNumero.getText());
            Empleado.setCorreo(jTFCorreo.getText());
            Empleado.setSueldo(jTFSueldo.getText());
            Empleado.setRol(jCBRol.getSelectedItem().toString());
            Empleado.setDni(jTFDNI.getText());
            Empleado.setHoraEntrada(jTFEntrada.getText());
            Empleado.setHoraSalida(jTFSalida.getText());
            dao.insert(Empleado);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("UPD")){
            EmpleadosModel Empleado = new EmpleadosModel();
            Empleado.setNombre(jTFNombre.getText());
            Empleado.setApellido(jTFApellido.getText());
            Empleado.setFechaEntrada(jTFFecha.getText());
            Empleado.setNumeroEmpleado(jTFNumero.getText());
            Empleado.setCorreo(jTFCorreo.getText());
            Empleado.setSueldo(jTFSueldo.getText());
            Empleado.setRol(jCBRol.getSelectedItem().toString());
            
            Empleado.setDni(jTFDNI.getText());
            Empleado.setHoraEntrada(jTFEntrada.getText());
            Empleado.setHoraSalida(jTFSalida.getText());
            Empleado.setId(id);
            dao.update(Empleado);
            parent.Refresh();
            this.dispose();
        }
        if(mode.equals("DLT")){           
            dao.delete(id);
            parent.Refresh();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed

    }//GEN-LAST:event_jTFIDActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jCBRol;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelEntrada;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFEntrada;
    private javax.swing.JTextField jTFFecha;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFSalida;
    private javax.swing.JTextField jTFSueldo;
    // End of variables declaration//GEN-END:variables
}
