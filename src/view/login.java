package view;

import business.UsuarioBo;
import db.TextPrompt;
import entity.Usuario;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    private String usua;
    private String pass;
    int xMouse, yMouse;

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);

//        icono3();
//        icono2();
        icono1();

        plaseholder();

        lblingreso();

        this.jtex_usua.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtex_usua = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jtex_pass = new javax.swing.JPasswordField();
        lblSystem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imageAvatar1 = new view.component.ImageAvatar();
        label_fond = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JPanel();
        label_ingresar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitbt = new javax.swing.JPanel();
        label_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        jtex_usua.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtex_usua.setForeground(new java.awt.Color(0, 0, 0));
        jtex_usua.setBorder(null);
        jPanel1.add(jtex_usua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 410, 30));

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 410, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, -1));

        jSeparator2.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator2.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 410, 10));

        jtex_pass.setForeground(new java.awt.Color(0, 0, 0));
        jtex_pass.setBorder(null);
        jPanel1.add(jtex_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 410, 30));

        lblSystem.setBackground(new java.awt.Color(255, 255, 255));
        lblSystem.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblSystem.setForeground(new java.awt.Color(255, 255, 255));
        lblSystem.setText("SYSTEM");
        jPanel1.add(lblSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COMPUTER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Soluciones inmediatas para la industria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Servicios Múltiples Cajamarca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, 40));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 300, 160));

        label_fond.setBackground(new java.awt.Color(21, 67, 96));
        label_fond.setForeground(new java.awt.Color(102, 102, 255));
        label_fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fond.JPG"))); // NOI18N
        jPanel1.add(label_fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 300, 480));

        btn_ingresar.setBackground(new java.awt.Color(18, 63, 0));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ingresarMousePressed(evt);
            }
        });

        label_ingresar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        label_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        label_ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ingresar.setText("INGRESAR");
        label_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_ingresarLayout = new javax.swing.GroupLayout(btn_ingresar);
        btn_ingresar.setLayout(btn_ingresarLayout);
        btn_ingresarLayout.setHorizontalGroup(
            btn_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ingresarLayout.createSequentialGroup()
                .addComponent(label_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        btn_ingresarLayout.setVerticalGroup(
            btn_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbt.setBackground(new java.awt.Color(255, 255, 255));
        exitbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_salir.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        label_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_salir.setText("X");
        label_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtLayout = new javax.swing.GroupLayout(exitbt);
        exitbt.setLayout(exitbtLayout);
        exitbtLayout.setHorizontalGroup(
            exitbtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtLayout.createSequentialGroup()
                .addComponent(label_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtLayout.setVerticalGroup(
            exitbtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 717, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void label_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseClicked
        int op = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Usted desea salir del login?", "EXIT", op);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_label_salirMouseClicked

    private void label_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseEntered
        exitbt.setBackground(Color.red);
        label_salir.setForeground(Color.white);
    }//GEN-LAST:event_label_salirMouseEntered

    private void label_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseExited
        exitbt.setBackground(Color.white);
        label_salir.setForeground(Color.black);


    }//GEN-LAST:event_label_salirMouseExited

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        this.btn_ingresar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        this.btn_ingresar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void btn_ingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMousePressed
        if (this.jtex_usua.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Le falta Ingresar el usuario", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else if (this.jtex_pass.getText().trim().isEmpty()) {

        } else {
            try {
                usua = this.jtex_usua.getText().trim();
                pass = new String(this.jtex_pass.getPassword()).trim();
                Usuario usuario = UsuarioBo.validarUsuario(usua, pass);
                jDashboard.adm = usuario.getRol();
                jDashboard.usuaa = usuario.getPersona();
                jDashboard.usua = usuario.getUsuario();
                String usu = usuario.getRol();

                if (usu.equals("empleado")) {
                    jDashboard.est = true;
                } else {
                    jDashboard.est = false;
                }

                //visualizar panel principal
                new jDashboard().setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "USUARIO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ingresarMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_ingresar;
    private javax.swing.JPanel exitbt;
    private javax.swing.JPanel header;
    private view.component.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jtex_pass;
    private javax.swing.JTextField jtex_usua;
    private javax.swing.JLabel label_fond;
    private javax.swing.JLabel label_ingresar;
    private javax.swing.JLabel label_salir;
    private javax.swing.JLabel lblSystem;
    // End of variables declaration//GEN-END:variables

    private void icono1() {
        ImageIcon imagen = new ImageIcon("src/Img/fond.jpg");

        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                label_fond.getWidth(), label_fond.getHeight(), Image.SCALE_DEFAULT));
        label_fond.setIcon(icono);
        this.repaint();

    }

//    private void icono2() {
//        ImageIcon imagen = new ImageIcon("src/Img/pc.png");
//
//        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
//                label_logo.getWidth(), label_logo.getHeight(), Image.SCALE_DEFAULT));
//        label_logo.setIcon(icono);
//        this.repaint();
//    }
    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" Ingrese el usuario", this.jtex_usua);
        TextPrompt prueba1 = new TextPrompt(" Ingrese la contraseña", this.jtex_pass);
    }

    private void lblingreso() {
        this.lblSystem.setText("SYSTEM");
    }

//    private void icono3() {
//        ImageIcon imagen = new ImageIcon("src/Img/syst.png");
//
//        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
//                this.lblSystem.getWidth(), this.lblSystem.getHeight(), Image.SCALE_DEFAULT));
//        this.lblSystem.setIcon(icono);
//        this.repaint();
//    }
}
