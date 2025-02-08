/*
 * 
 * 
 */
package GUI;

import Modelo.Libro;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class PanelLibroAdmin extends javax.swing.JPanel {

    public VistaPrincipalAdmin vs;
    public static int columna, row;
    javax.swing.JButton boton1 = new javax.swing.JButton();
    javax.swing.JButton boton2 = new javax.swing.JButton();
    DefaultTableModel modelotabla = new DefaultTableModel();

    public PanelLibroAdmin(VistaPrincipalAdmin vs) {
        this.vs = vs;
        initComponents();
        MostrarTabla();
    }
//Este metodo me carga todos los libros

    public void CargarLibros() {
        for (Libro libro : vs.gestor.getLibros()) {
            TablaDinamico(libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getDisponible());
        }
    }
//Este metodo configura la Tabla
    public void MostrarTabla() {
        Tabla.setDefaultRenderer(Object.class, new AcVista());
        modelotabla.setColumnIdentifiers(new String[]{"TITULO",
            "AUTOR", "GENERO", "DIPONIBLES", " ", " "});
        Tabla.setModel(modelotabla);
        Tabla.setRowHeight(20);
        CargarLibros();
    }
//este metodo ingresa cosas en la tabla
    public void TablaDinamico(String title, String autor, String gene, int dispo) {
        boton1.setText("EDITAR");
        boton2.setText("ELIMINAR");
        boton2.setBackground(Color.red);
        Object struct[] = {title, autor, gene, dispo, boton1, boton2};
        modelotabla.addRow(struct);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        Agregar.setText("AGREGAR");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        columna = Tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / Tabla.getRowHeight();
        if (columna==4) {
            vs.cambiarPaguina(new PanelConfLibro(row,vs));
        }
        if (columna==5) {
            vs.gestor.EliminarLibro(row);
            vs.cambiarPaguina(new PanelLibroAdmin(vs));
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        vs.cambiarPaguina(new PanelConfLibro(vs));
    }//GEN-LAST:event_AgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
