/*
 * Esta vista me visualiza la paguina para ingresar
 */
package GUI;

import Logica.GestorLibreria;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class VistaIngresar extends javax.swing.JFrame {

    public GestorLibreria gestor;

    public VistaIngresar(GestorLibreria gestor) {
        this.gestor = gestor;
        initComponents();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        cambiarPaguina(new PanelIngresar(this));
    }

    public void CambiarPanel() {
        cambiarPaguina(new PanelRegistar(this));
    }

    public void cambiarPaguina(JPanel panel) {
        panel.setSize(640, 350);
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
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(770, 455));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setOpaque(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 640, 350));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondIngre.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
