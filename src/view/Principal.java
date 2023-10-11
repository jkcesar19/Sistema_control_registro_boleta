package view;

import componente.EventAction;
import componente.Message;
import componente.ModelStudent;
import javax.swing.ImageIcon;

/**
 *
 * @author llagu
 */
public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initTableData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new componente.Table();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Perfil", "Nombre", "Estado", "Curso", "Precio", "Disponible", "Accion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setShowHorizontalLines(false);
        table1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private componente.Table table1;
    // End of variables declaration//GEN-END:variables

    private void initTableData() {
        EventAction eventAction = new EventAction() {
            @Override
            public void delete(ModelStudent student) {
                if (showMessage("Delete Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(ModelStudent student) {
                if (showMessage("Update Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

        };

        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));

        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/img/perfil.jpeg")), "Cesar Llaguento", "Soltero", "Java", 300, "Activo").toRowTable(eventAction));

    }

    private boolean showMessage(String message) {
        Message obj = new Message(jDashboard.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }
}
