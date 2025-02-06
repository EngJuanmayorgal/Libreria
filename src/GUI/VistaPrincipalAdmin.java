/*
 * 
 * 
 */
package GUI;

import Logica.GestorLibreria;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class VistaPrincipalAdmin extends javax.swing.JFrame {

    public GestorLibreria gestor;

    public VistaPrincipalAdmin(GestorLibreria gestor) {
        this.gestor=gestor;
        initComponents();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void cambiarPaguina(JPanel panel) {
        panel.setSize(600, 410);
        panel.setLocation(0, 0);
        Panel.removeAll();
        Panel.add(panel, BorderLayout.CENTER);
        Panel.revalidate();
        Panel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        Multas = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();
        Prestamos = new javax.swing.JButton();
        Libros = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setOpaque(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 600, 410));

        Multas.setText("MULTAS");
        jPanel1.add(Multas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 140, 50));

        Usuarios.setText("USUARIOS");
        Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, 50));

        Estadisticas.setText("ESTADISTICAS");
        Estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstadisticasMouseClicked(evt);
            }
        });
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 50));

        Prestamos.setText("PRESTAMOS");
        Prestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrestamosMouseClicked(evt);
            }
        });
        jPanel1.add(Prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 50));

        Libros.setText("LIBROS");
        Libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibrosMouseClicked(evt);
            }
        });
        jPanel1.add(Libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 50));

        Exit.setText("SALIR");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fond.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadisticasActionPerformed

    private void LibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrosMouseClicked
        Panel.setOpaque(true);
        cambiarPaguina(new PanelLibroAdmin(this));
        
    }//GEN-LAST:event_LibrosMouseClicked

    private void PrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamosMouseClicked
       cambiarPaguina(new PanelPrestamosAdmin(this));
    }//GEN-LAST:event_PrestamosMouseClicked

    private void EstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadisticasMouseClicked
        gestor.LibroPopular();
    }//GEN-LAST:event_EstadisticasMouseClicked

    private void UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseClicked
       cambiarPaguina(new PanelUsuarios(this));
    }//GEN-LAST:event_UsuariosMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        gestor.VistaIngresar();
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Estadisticas;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Libros;
    private javax.swing.JButton Multas;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Prestamos;
    private javax.swing.JButton Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
