package view.Maquinaria;

import business.MaquinariaBo;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import view.jDashboard;

public class lista_eliminar extends javax.swing.JPanel {

    private DefaultTableModel MaquinaTableModel;
    private int index;
    protected static int id = 0;
    protected static String maqu = "";
    protected static String hora;
    protected static String dia;
    protected static double prec;
    protected static double tota;

    public lista_eliminar() {
        initComponents();
        MaquinaTable.fixTable(jScrollPane2);

        loadTablePerson();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MaquinaTable = new component.table.Table();

        setBackground(new java.awt.Color(204, 0, 204));
        setPreferredSize(new java.awt.Dimension(739, 331));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 331));

        MaquinaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        MaquinaTable.setShowHorizontalLines(false);
        MaquinaTable.setShowVerticalLines(false);
        MaquinaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MaquinaTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(MaquinaTable);

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

    private void MaquinaTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaquinaTableMousePressed
        cargar_datos_actualizar_eliminar(evt);

    }//GEN-LAST:event_MaquinaTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.table.Table MaquinaTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void loadTablePerson() {
        try {
            TableColumn columna;
            this.MaquinaTableModel = MaquinariaBo.ListaTable();
            this.MaquinaTable.setModel(this.MaquinaTableModel);
//            setAnchoColumnas();
            columna = this.MaquinaTable.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargar_datos_actualizar_eliminar(MouseEvent evt) {
        try {
            index = this.MaquinaTable.getSelectedRow();
            maqu = this.MaquinaTable.getValueAt(index, 0).toString();
            hora = this.MaquinaTable.getValueAt(index, 1).toString();
            dia = this.MaquinaTable.getValueAt(index, 2).toString();
            prec = Double.parseDouble(this.MaquinaTable.getValueAt(index, 3).toString());
            tota = Double.parseDouble(this.MaquinaTable.getValueAt(index, 4).toString());

        } catch (Exception e) {

        }
    }

}
