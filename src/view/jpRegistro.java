package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import view.Cliente.VistaCliente;
import view.Maquinaria.VistaMaqui;
import view.Material.VistaMate;
import view.Personal.VistaPers;

public class jpRegistro extends javax.swing.JPanel {



    public jpRegistro() {
        initComponents();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMaterial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEquipo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOtros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelSegundario = new FondoPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 520));

        btnMaterial.setBackground(new java.awt.Color(21, 67, 96));
        btnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaterialMousePressed(evt);
            }
        });
        btnMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/material.png"))); // NOI18N
        jLabel2.setText("Material");
        btnMaterial.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, 34));

        btnEquipo.setBackground(new java.awt.Color(21, 67, 96));
        btnEquipo.setPreferredSize(new java.awt.Dimension(129, 45));
        btnEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEquipoMousePressed(evt);
            }
        });
        btnEquipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maquinaria.png"))); // NOI18N
        jLabel3.setText("Maquinaria");
        btnEquipo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, -1, 33));

        btnPersonal.setBackground(new java.awt.Color(21, 67, 96));
        btnPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPersonalMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person.png"))); // NOI18N
        jLabel1.setText("Personal");

        javax.swing.GroupLayout btnPersonalLayout = new javax.swing.GroupLayout(btnPersonal);
        btnPersonal.setLayout(btnPersonalLayout);
        btnPersonalLayout.setHorizontalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        btnPersonalLayout.setVerticalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPersonalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOtros.setBackground(new java.awt.Color(21, 67, 96));
        btnOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOtrosMousePressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otro.png"))); // NOI18N
        jLabel4.setText("Cliente");

        javax.swing.GroupLayout btnOtrosLayout = new javax.swing.GroupLayout(btnOtros);
        btnOtros.setLayout(btnOtrosLayout);
        btnOtrosLayout.setHorizontalGroup(
            btnOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOtrosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOtrosLayout.setVerticalGroup(
            btnOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOtrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelSegundario.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout panelSegundarioLayout = new javax.swing.GroupLayout(panelSegundario);
        panelSegundario.setLayout(panelSegundarioLayout);
        panelSegundarioLayout.setHorizontalGroup(
            panelSegundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        panelSegundarioLayout.setVerticalGroup(
            panelSegundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(panelSegundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSegundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMousePressed
        this.btnPersonal.setBackground(new Color(40, 116, 166));
//        img_regis.setVisible(false);
        // Abrir sección
        VistaPers p1 = new VistaPers();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnPersonalMousePressed

    private void btnMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMousePressed
        this.btnMaterial.setBackground(new Color(40, 116, 166));
//img_regis.setVisible(false);
        // Abrir sección
        VistaMate p1 = new VistaMate();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnMaterialMousePressed

    private void btnEquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEquipoMousePressed
        this.btnEquipo.setBackground(new Color(40, 116, 166));
//img_regis.setVisible(false);
        // Abrir sección
        VistaMaqui p1 = new VistaMaqui();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnEquipoMousePressed

    private void btnOtrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtrosMousePressed
        this.btnOtros.setBackground(new Color(40, 116, 166));
//img_regis.setVisible(false);
        // Abrir sección
        VistaCliente p1 = new VistaCliente();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnOtrosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEquipo;
    private javax.swing.JPanel btnMaterial;
    private javax.swing.JPanel btnOtros;
    private javax.swing.JPanel btnPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSegundario;
    // End of variables declaration//GEN-END:variables
 

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/fon_tra.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
}
