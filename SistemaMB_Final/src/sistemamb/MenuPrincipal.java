package sistemamb;
import vistas.ListadoEmpleados;
import vistas.ListadoHabitaciones;
import vistas.ListadoHuespedes;
import vistas.ListadoReservas;
import vistas.ListadoRoles;
import vistas.ListadoPagos;
import vistas.ListadoServicios;
import vistas.ListadoServiciosReservados;
/**
 *
 * @author MaLinares BlanCosta
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal(Login log) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jBHuespedes = new javax.swing.JButton();
        jBEmpleados = new javax.swing.JButton();
        jBHabitaciones = new javax.swing.JButton();
        jBReservas = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBRoles = new javax.swing.JButton();
        jBServicios = new javax.swing.JButton();
        jBPagos = new javax.swing.JButton();
        jBSReservados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(java.awt.Color.darkGray);

        jPanelFondo.setBackground(new java.awt.Color(124, 148, 144));

        jLabelTitulo.setBackground(new java.awt.Color(149, 175, 173));
        jLabelTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        jLabelTitulo.setText("Sistema de Administracion Hotelera MB");

        jBHuespedes.setBackground(new java.awt.Color(0, 102, 204));
        jBHuespedes.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HuespedesIcon.png"))); // NOI18N
        jBHuespedes.setText("Huespedes");
        jBHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHuespedesActionPerformed(evt);
            }
        });

        jBEmpleados.setBackground(new java.awt.Color(51, 153, 255));
        jBEmpleados.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EmpleadosIcon.png"))); // NOI18N
        jBEmpleados.setText("Empleados");
        jBEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadosActionPerformed(evt);
            }
        });

        jBHabitaciones.setBackground(new java.awt.Color(153, 51, 255));
        jBHabitaciones.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HabitacionesIcon.png"))); // NOI18N
        jBHabitaciones.setText("Habitaciones");
        jBHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jBHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHabitacionesActionPerformed(evt);
            }
        });

        jBReservas.setBackground(new java.awt.Color(204, 102, 255));
        jBReservas.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReservasIcon.png"))); // NOI18N
        jBReservas.setText("Reservas");
        jBReservas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReservasActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 51, 51));
        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitIIcon.png"))); // NOI18N
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRoles.setBackground(new java.awt.Color(102, 153, 255));
        jBRoles.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RolesIcon.png"))); // NOI18N
        jBRoles.setText("Roles");
        jBRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRolesActionPerformed(evt);
            }
        });

        jBServicios.setBackground(new java.awt.Color(204, 0, 255));
        jBServicios.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ServiciosIcon.png"))); // NOI18N
        jBServicios.setText("Servicios");
        jBServicios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBServiciosActionPerformed(evt);
            }
        });

        jBPagos.setBackground(new java.awt.Color(102, 102, 255));
        jBPagos.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PagosIcon.png"))); // NOI18N
        jBPagos.setText("Pagos");
        jBPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPagosActionPerformed(evt);
            }
        });

        jBSReservados.setBackground(new java.awt.Color(204, 51, 255));
        jBSReservados.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBSReservados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ServiciosResIcon.png"))); // NOI18N
        jBSReservados.setText("<html>Servicios<br> Reservados</html>");
        jBSReservados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSReservados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBSReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSReservadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addComponent(jBRoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addComponent(jBHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBSReservados)
                        .addComponent(jBServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jBHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jBEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRoles, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSReservados, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jBPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHuespedesActionPerformed
        ListadoHuespedes ventana = new ListadoHuespedes(this);
        ventana.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jBHuespedesActionPerformed

    private void jBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadosActionPerformed
         ListadoEmpleados ventana = new ListadoEmpleados(this);
        ventana.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jBEmpleadosActionPerformed

    private void jBHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHabitacionesActionPerformed
        ListadoHabitaciones ventana = new ListadoHabitaciones(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBHabitacionesActionPerformed

    private void jBReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReservasActionPerformed
        ListadoReservas ventana = new ListadoReservas(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBReservasActionPerformed

    private void jBRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRolesActionPerformed
        ListadoRoles ventana = new ListadoRoles(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBRolesActionPerformed

    private void jBPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPagosActionPerformed
        ListadoPagos ventana = new ListadoPagos(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBPagosActionPerformed

    private void jBServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBServiciosActionPerformed
        ListadoServicios ventana = new ListadoServicios(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBServiciosActionPerformed

    private void jBSReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSReservadosActionPerformed
        ListadoServiciosReservados ventana = new ListadoServiciosReservados(this);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBSReservadosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBHabitaciones;
    private javax.swing.JButton jBHuespedes;
    private javax.swing.JButton jBPagos;
    private javax.swing.JButton jBReservas;
    private javax.swing.JButton jBRoles;
    private javax.swing.JButton jBSReservados;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBServicios;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
