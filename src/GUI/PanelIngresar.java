/**
 *
 *
 *
 * */
package GUI;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class PanelIngresar extends javax.swing.JPanel {

    private final VistaIngresar vs;

    public PanelIngresar(VistaIngresar vs) {
        this.vs = vs;
        initComponents();
        pass.setBackground(Color.LIGHT_GRAY);
    }
//este metodo comprueba q las casillas esten llenas

    public void comprobar() {
        if (id.getText().equals("")) {
            error2.setText("*");
            Bingresar.setEnabled(false);
        } else {
            try {
                Integer.parseInt(id.getText());
            } catch (Exception e) {
                error2.setText("*");
                Bingresar.setEnabled(false);
            }
        }
        if (Admin.isSelected()) {
            if (pass.getText().equals("")) {
                error1.setText("*");
                Bingresar.setEnabled(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error1 = new javax.swing.JLabel();
        Bingresar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Admin = new javax.swing.JRadioButton();
        Bregistrar = new javax.swing.JButton();
        error2 = new javax.swing.JLabel();

        setOpaque(false);

        error1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Bingresar.setText("INGRESAR");
        Bingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BingresarMouseExited(evt);
            }
        });

        pass.setEnabled(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INGRESAR USUARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CLAVE:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setText("ADMINISTRADOR");
        Admin.setContentAreaFilled(false);
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        Bregistrar.setText("REGISTRAR");
        Bregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregistrarActionPerformed(evt);
            }
        });

        error2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365)
                        .addComponent(Bingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Admin)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(Admin)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Bregistrar))
                            .addComponent(Bingresar)))
                    .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        if (Admin.isSelected()) {
            pass.setEnabled(true);
            pass.setBackground(Color.white);
            title.setText("INGRESAR ADMINISTRADOR");
        } else {
            pass.setEnabled(false);
            title.setText("INGRESAR USUARIO");
            pass.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_AdminActionPerformed

    private void BregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregistrarActionPerformed
        vs.CambiarPanel();
    }//GEN-LAST:event_BregistrarActionPerformed

    private void BingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BingresarMouseEntered
        comprobar();
    }//GEN-LAST:event_BingresarMouseEntered

    private void BingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BingresarMouseExited
        error1.setText("");
        error2.setText("");
        Bingresar.setEnabled(true);
    }//GEN-LAST:event_BingresarMouseExited

    private void BingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BingresarMouseClicked
        if (Admin.isSelected()) {
            if (vs.gestor.admins.EncontrarAdmin(Integer.parseInt(id.getText()))) {
                if (!vs.gestor.admins.ConfirmarClave(Integer.parseInt(id.getText()), pass.getText())) {
                    error1.setText("*");
                } else {
                    vs.gestor.VistaAppAdmin(Integer.parseInt(id.getText()));
                    vs.dispose();
                }
            } else {
                error2.setText("*");
            }
        } else {
            if (vs.gestor.usuarios.EncontrarUsuario(Integer.parseInt(id.getText()))) {
                vs.gestor.usuarios.VistaAppUsuario(Integer.parseInt(id.getText()));
                vs.dispose();
            } else {
                error2.setText("*");
            }
        }
    }//GEN-LAST:event_BingresarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JButton Bingresar;
    private javax.swing.JButton Bregistrar;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
