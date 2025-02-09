/*
 * 
 * 
 */
package GUI;

import Modelo.Prestamo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class PanelMultasAdmin extends javax.swing.JPanel {

    public VistaPrincipalAdmin vs;
    public static int columna, row;
    DefaultTableModel modelotabla = new DefaultTableModel();

    public PanelMultasAdmin(VistaPrincipalAdmin vs) {
        this.vs = vs;
        initComponents();
        MostrarTabla();
    }

    //Este metodo me carga todos los Prestamos
    public void CargarLibrosPrestados() {
        for (Prestamo prestamo : vs.gestor.prestamos) {
            if (prestamo.getObservacion().equalsIgnoreCase("MULTA")) {
                TablaDinamico(prestamo.getLibro().getTitulo(), "" + prestamo.getUsuario().getId(),
                         "" + prestamo.getFechaPrestamo(), "" + prestamo.getFechaEntregado(),
                        prestamo.getObservacion());
            }
        }
    }
//Este metodo configura la Tabla

    public void MostrarTabla() {
        Tabla.setDefaultRenderer(Object.class, new AcVista());
        modelotabla.setColumnIdentifiers(new String[]{"TITULO",
            "ID_USUARIO", "FECHA SACADO", "FECHA ENTREGADO", "OBSERVACION"});
        Tabla.setModel(modelotabla);
        Tabla.setRowHeight(20);
        CargarLibrosPrestados();
    }
//este metodo ingresa cosas en la tabla

    public void TablaDinamico(String libro, String usuario, String Fsacad, String Fentrgo, String obs) {
        Object struct[] = {libro, usuario, Fsacad, Fentrgo, obs};
        modelotabla.addRow(struct);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MULTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked

    }//GEN-LAST:event_TablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
