package view.Personal;

import business.PersonBo;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class lista_eliminar extends javax.swing.JPanel {

    private DefaultTableModel PersonTableModel;
    private int index;
    protected static int id = 0;
    protected static String nom = " ";
    protected static int dni;
    protected static String dir;
    protected static int tel;
    protected static String est_civil;
    protected static int nun_hijo;
    protected static String hijo;
    protected static String est;
    protected static String sex;
    protected static String correo;

    public lista_eliminar() {
        initComponents();
        PersonTable.fixTable(jScrollPane2);
        loadTablePerson();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PersonTable = new component.table.Table();

        setBackground(new java.awt.Color(204, 0, 204));
        setPreferredSize(new java.awt.Dimension(739, 331));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 331));

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PersonTable.setShowHorizontalLines(false);
        PersonTable.setShowVerticalLines(false);
        PersonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PersonTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(PersonTable);

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

    private void PersonTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonTableMousePressed
        cargar_datos_actualizar_eliminar(evt);

    }//GEN-LAST:event_PersonTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.table.Table PersonTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void loadTablePerson() {
        try {
            TableColumn columna;
            this.PersonTableModel = PersonBo.ListaTable();
            this.PersonTable.setModel(this.PersonTableModel);
//            setAnchoColumnas();
            columna = this.PersonTable.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargar_datos_actualizar_eliminar(MouseEvent evt) {
        try {
            index = this.PersonTable.getSelectedRow();
           
            nom = this.PersonTable.getValueAt(index, 0).toString();
            dni = Integer.parseInt(this.PersonTable.getValueAt(index, 1).toString());
            dir = this.PersonTable.getValueAt(index, 2).toString();
            tel = Integer.parseInt(this.PersonTable.getValueAt(index, 3).toString());
            correo = this.PersonTable.getValueAt(index, 4).toString();
            est_civil = this.PersonTable.getValueAt(index, 5).toString();
            hijo = this.PersonTable.getValueAt(index, 6).toString();
            nun_hijo = Integer.parseInt(this.PersonTable.getValueAt(index, 7).toString());
            sex = this.PersonTable.getValueAt(index, 8).toString();
            est = this.PersonTable.getValueAt(index, 9).toString();
        } catch (Exception e) {

        }
    }
}
