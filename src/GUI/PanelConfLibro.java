/*
 * 
 * 
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class PanelConfLibro extends javax.swing.JPanel {

    /**
     * Creates new form PanelConfLibro
     */
    public VistaPrincipalAdmin vs;
    public int libro;

    public PanelConfLibro(int libro, VistaPrincipalAdmin vs) {
        initComponents();
        this.vs = vs;
        this.libro = libro;
        title.setText("Editar Libro");
        titulo.setText(vs.gestor.libros.get(libro).getTitulo());
        autor.setText(vs.gestor.libros.get(libro).getAutor());
        genero.setText(vs.gestor.libros.get(libro).getGenero());
        dispo.setText("" + vs.gestor.libros.get(libro).getDisponible());
        boton.setText("EDITAR");
        Limpiar();
    }

    public PanelConfLibro(VistaPrincipalAdmin vs) {
        initComponents();
        this.vs = vs;
        title.setText("Agregar Libro");
        boton.setText("AGREGAR");
        Limpiar();
    }

    public void Comprobar() {
        info.setForeground(Color.green);
        if (titulo.getText().equals("")) {
            error1.setText("*");
            boton.setEnabled(false);
        }
        if (autor.getText().equals("")) {
            error2.setText("*");
            boton.setEnabled(false);
        }
        if (genero.getText().equals("")) {
            error3.setText("*");
            boton.setEnabled(false);
        }
        if (dispo.getText().equals("")) {
            error4.setText("*");
            boton.setEnabled(false);
        } else {
            try {
                Integer.parseInt(dispo.getText());
            } catch (Exception e) {
                error4.setText("*");
                boton.setEnabled(false);
            }
        }
    }
//este metodo limpia los jtext

    public void Limpiar() {
        titulo.setText("");
        autor.setText("");
        genero.setText("");
        dispo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        dispo = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        info = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 131, 100, -1));
        add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 131, 103, -1));
        add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 246, 100, -1));
        add(dispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 246, 103, -1));

        boton.setText("jButton1");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 362, 100, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("jLabel1");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 600, 38));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TITULO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, 100, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("GENERO:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 249, 100, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("AUTOR:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 134, 100, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DISPONIBLES:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 249, 100, -1));

        error2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 60, 22));

        error1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 130, 60, 22));

        error3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error3.setForeground(new java.awt.Color(255, 0, 0));
        error3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 33, 22));

        error4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error4.setForeground(new java.awt.Color(255, 0, 0));
        error4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(error4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 50, 22));

        Volver.setText("VOLVER");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 362, 118, -1));

        info.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 307, 382, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseEntered
        Comprobar();
    }//GEN-LAST:event_botonMouseEntered

    private void botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseExited
        boton.setEnabled(true);
        error1.setText("");
        error2.setText("");
        error3.setText("");
        error4.setText("");
        info.setText("");
    }//GEN-LAST:event_botonMouseExited

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
        if (boton.getText().equals("EDITAR")) {
            vs.gestor.EditarLibro(libro, titulo.getText(), autor.getText(), genero.getText(), Integer.parseInt(dispo.getText()));
            info.setText("SE EDITO CORRECTAMENTE");
        }
        if (boton.getText().equals("AGREGAR")) {
            vs.gestor.AgregarLibro(titulo.getText(), autor.getText(), genero.getText(), Integer.parseInt(dispo.getText()));
            info.setText("SE AGREGO CORRECTAMENTE");
            Limpiar();
        }
    }//GEN-LAST:event_botonMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        vs.cambiarPaguina(new PanelLibroAdmin(vs));
    }//GEN-LAST:event_VolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JTextField autor;
    private javax.swing.JButton boton;
    private javax.swing.JTextField dispo;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JTextField genero;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel title;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
