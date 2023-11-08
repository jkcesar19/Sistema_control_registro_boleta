package view.Material;

import business.MaterialBo;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class lista_eliminar extends javax.swing.JPanel {

    private DefaultTableModel MaterialTableModel;
    private int index;
    protected static int id = 0;
    protected static String mate = " ";
    protected static String cant;
    protected static String unid;
    protected static double prec;
    protected static double tota;


    public lista_eliminar() {
        initComponents();
        MaterialTable.fixTable(jScrollPane2);
        loadTablePerson();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MaterialTable = new component.table.Table();

        setBackground(new java.awt.Color(204, 0, 204));
        setPreferredSize(new java.awt.Dimension(739, 331));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 331));

        MaterialTable.setModel(new javax.swing.table.DefaultTableModel(
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
        MaterialTable.setShowHorizontalLines(false);
        MaterialTable.setShowVerticalLines(false);
        MaterialTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MaterialTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(MaterialTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MaterialTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaterialTableMousePressed
        cargar_datos_actualizar_eliminar(evt);

    }//GEN-LAST:event_MaterialTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.table.Table MaterialTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void loadTablePerson() {
        try {
            TableColumn columna;
            this.MaterialTableModel = MaterialBo.ListaTable();
            this.MaterialTable.setModel(this.MaterialTableModel);
//            setAnchoColumnas();
            columna = this.MaterialTable.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargar_datos_actualizar_eliminar(MouseEvent evt) {
        try {
            index = this.MaterialTable.getSelectedRow();
            id = Integer.parseInt(this.MaterialTable.getValueAt(index, 0).toString());
            mate = this.MaterialTable.getValueAt(index, 1).toString();
            cant = this.MaterialTable.getValueAt(index, 2).toString();
            unid = this.MaterialTable.getValueAt(index, 3).toString();
            prec = Double.parseDouble(this.MaterialTable.getValueAt(index, 4).toString());
            tota = Double.parseDouble(this.MaterialTable.getValueAt(index, 5).toString());
            
        } catch (Exception e) {

        }
    }
}
