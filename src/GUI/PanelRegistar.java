/*
 * 
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class PanelRegistar extends javax.swing.JPanel {

    private final VistaIngresar vs;

    public PanelRegistar(VistaIngresar vs) {
        this.vs = vs;
        initComponents();
        pass.setBackground(Color.LIGHT_GRAY);
    }
//este metodo comprueba los valores de los jtextfield

    public void Comprobar() {
        if (name.getText().equals("")) {
            error1.setText("*");
            Bregistrar.setEnabled(false);
        }
        if (id.getText().equals("")) {
            error2.setText("*");
            Bregistrar.setEnabled(false);
        } else {
            try {
                Integer.parseInt(id.getText());
            } catch (Exception e) {
                error2.setText("*");
                Bregistrar.setEnabled(false);
            }
        }
        if (number.getText().equals("")) {
            error3.setText("*");
            Bregistrar.setEnabled(false);
        } else {
            try {
                Integer.parseInt(number.getText());
            } catch (Exception e) {
                error3.setText("*");
                Bregistrar.setEnabled(false);
            }
        }
        if (address.getText().equals("") && !Admin.isSelected()) {
            error4.setText("*");
            Bregistrar.setEnabled(false);
        }
        if (Admin.isSelected()) {
            if (pass.getText().equals("")) {
                error5.setText("*");
            }
        }

    }

    private void Limpiar() {
        name.setText("");
        pass.setText("");
        id.setText("");
        number.setText("");
        address.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bregistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        Admin = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bregistrar.setText("REGISTRAR");
        Bregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BregistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BregistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BregistrarMouseExited(evt);
            }
        });
        add(Bregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("INGRESAR USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 280, 30));
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, -1));
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));
        add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, -1));
        add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 130, -1));
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 130, -1));

        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setText("ADMINISTRADOR");
        Admin.setContentAreaFilled(false);
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Clave: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 80, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Direccion: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Numero: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 20));

        error5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error5.setForeground(new java.awt.Color(255, 0, 0));
        error5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 30, 20));

        error4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error4.setForeground(new java.awt.Color(255, 0, 0));
        error4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 30, 20));

        error3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error3.setForeground(new java.awt.Color(255, 0, 0));
        error3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 30, 20));

        error2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, 20));

        error1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 30, 20));

        info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        info.setForeground(new java.awt.Color(255, 0, 0));
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 270, 40));

        Volver.setText("VOLVER");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        if (Admin.isSelected()) {
            pass.setEnabled(true);
            address.setEnabled(false);
            address.setText("");
            address.setBackground(Color.LIGHT_GRAY);
            pass.setBackground(Color.white);
            title1.setText("INGRESAR ADMINISTRADOR");
        } else {
            pass.setEnabled(false);
            pass.setText("");
            address.setEnabled(true);
            address.setBackground(Color.white);
            title1.setText("INGRESAR USUARIO");
            pass.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_AdminActionPerformed

    private void BregistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BregistrarMouseEntered
        Comprobar();
    }//GEN-LAST:event_BregistrarMouseEntered

    private void BregistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BregistrarMouseExited
        error1.setText("");
        error2.setText("");
        error3.setText("");
        error4.setText("");
        info.setForeground(Color.red);
        error5.setText("");
        info.setText("");
        Bregistrar.setEnabled(true);
    }//GEN-LAST:event_BregistrarMouseExited

    private void BregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BregistrarMouseClicked
        if (Admin.isSelected()) {
            if (vs.gestor.admins.EncontrarAdmin(Integer.parseInt(id.getText()))) {
                info.setText("Ya se ingreso el id");
            } else {
                vs.gestor.admins.CrearAdmin(pass.getText(), name.getText(), Integer.parseInt(id.getText()), Integer.parseInt(number.getText()));
                Limpiar();
                info.setForeground(Color.green);
                info.setText("REGISTRO EXITOSO");
            }
        } else {
            if (vs.gestor.usuarios.EncontrarUsuario(Integer.parseInt(id.getText()))) {
                info.setText("Ya se ingreso el id");
            } else {
                vs.gestor.usuarios.CrearUsuario(address.getText(), name.getText(), Integer.parseInt(id.getText()), Integer.parseInt(number.getText()));
                Limpiar();
                info.setForeground(Color.green);
                info.setText("REGISTRO EXITOSO");
                
            }
        }
    }//GEN-LAST:event_BregistrarMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       new VistaIngresar(vs.gestor);
       vs.dispose();
    }//GEN-LAST:event_VolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JButton Bregistrar;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField address;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JTextField id;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
