package view.Usuario;


import business.UsuarioBo;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class lista_eliminar extends javax.swing.JPanel {

    private DefaultTableModel UsuarioTableModel;
    private int index;
    protected static int id = 0;
    protected static String usu;
    protected static String con;
    protected static String per;
    protected static String rol;
    


    public lista_eliminar() {
        initComponents();
        UsuarioTable.fixTable(jScrollPane2);
        loadTablePerson();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsuarioTable = new component.table.Table();

        setBackground(new java.awt.Color(204, 0, 204));
        setPreferredSize(new java.awt.Dimension(739, 331));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 331));

        UsuarioTable.setModel(new javax.swing.table.DefaultTableModel(
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
        UsuarioTable.setShowHorizontalLines(false);
        UsuarioTable.setShowVerticalLines(false);
        UsuarioTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(UsuarioTable);

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

    private void UsuarioTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioTableMousePressed
        cargar_datos_actualizar_eliminar(evt);

    }//GEN-LAST:event_UsuarioTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.table.Table UsuarioTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void loadTablePerson() {
        try {
            TableColumn columna;
            this.UsuarioTableModel = UsuarioBo.ListaTable();
            this.UsuarioTable.setModel(this.UsuarioTableModel);
//            setAnchoColumnas();
            columna = this.UsuarioTable.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargar_datos_actualizar_eliminar(MouseEvent evt) {
        try {
            index = this.UsuarioTable.getSelectedRow();
            per = this.UsuarioTable.getValueAt(index, 0).toString();
            usu = this.UsuarioTable.getValueAt(index, 1).toString();
            rol = this.UsuarioTable.getValueAt(index, 2).toString();   
        } catch (Exception e) {

        }
    }
}
