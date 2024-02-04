package view.Personal;

import business.PersonBo;
import db.TextPrompt;
import entity.Person;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static view.Personal.VistaPers.PanelVistaPer;

public class registro_actualizar extends javax.swing.JPanel {
    
    Person objPerson = new Person();
    
    public registro_actualizar() {
        initComponents();
        plaseholder();
        cargar_txt_hijos(false);
        cargar_campos(VistaPers.estado);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        panel_radio = new javax.swing.JPanel();
        raSoltero = new javax.swing.JRadioButton();
        raCasado = new javax.swing.JRadioButton();
        raDivorsiado = new javax.swing.JRadioButton();
        raViudo = new javax.swing.JRadioButton();
        cheHijoos = new javax.swing.JCheckBox();
        txtHijos = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(739, 325));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 325));

        panel_radio.setBackground(new java.awt.Color(255, 255, 255));
        panel_radio.setBorder(javax.swing.BorderFactory.createTitledBorder("Esatdo civil"));

        raSoltero.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(raSoltero);
        raSoltero.setText("Soltero");

        raCasado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(raCasado);
        raCasado.setText("Casado");

        raDivorsiado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(raDivorsiado);
        raDivorsiado.setText("Divorsiado");

        raViudo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(raViudo);
        raViudo.setText("Viudo");

        javax.swing.GroupLayout panel_radioLayout = new javax.swing.GroupLayout(panel_radio);
        panel_radio.setLayout(panel_radioLayout);
        panel_radioLayout.setHorizontalGroup(
            panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_radioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raSoltero)
                    .addComponent(raDivorsiado))
                .addGap(18, 18, 18)
                .addGroup(panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raViudo)
                    .addComponent(raCasado))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panel_radioLayout.setVerticalGroup(
            panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_radioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raCasado)
                    .addComponent(raSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raDivorsiado)
                    .addComponent(raViudo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cheHijoos.setBackground(new java.awt.Color(255, 255, 255));
        cheHijoos.setText("Hijos");
        cheHijoos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheHijoosMouseClicked(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jLabel1.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sexo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cheHijoos)
                                .addGap(18, 18, 18)
                                .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel_radio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(txtTelefono))
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 133, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cheHijoos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cheHijoosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheHijoosMouseClicked
        this.txtHijos.setEditable(true);
    }//GEN-LAST:event_cheHijoosMouseClicked

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        switch (VistaPers.op) {
            case 'N':
                if (this.txtNombre.getText().equals("") || this.txtDni.getText().equals("")
                        || this.txtTelefono.getText().equals("") || this.txtDireccion.getText().equals("")
                        || this.txtCorreo.getText().equals("")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.txtNombre.requestFocus();
                } else {
                    this.registrar();
                }
                break;
            case 'M':
                
                this.modificar();
                
                break;
        }
    }//GEN-LAST:event_btnAgregarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cheHijoos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_radio;
    private javax.swing.JRadioButton raCasado;
    private javax.swing.JRadioButton raDivorsiado;
    private javax.swing.JRadioButton raSoltero;
    private javax.swing.JRadioButton raViudo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" Ingrese el nombre completo", this.txtNombre);
        TextPrompt prueba1 = new TextPrompt(" Ingrese la dirección", this.txtDireccion);
        TextPrompt prueba2 = new TextPrompt(" Ingrese el N° DNI", this.txtDni);
        TextPrompt prueba3 = new TextPrompt(" Ingrese el teléfono", this.txtTelefono);
        TextPrompt prueba4 = new TextPrompt(" Ingrese el correo", this.txtCorreo);
        TextPrompt prueba5 = new TextPrompt(" Ingrese el N° hijos", this.txtHijos);
    }
    
    private void cargar_txt_hijos(boolean b) {
        this.txtHijos.setEditable(b);
    }
    
    private void registrar() {
        this.cargar_obj();
        try {
            if (PersonBo.grabarPerson(objPerson)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Personal", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();
                
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Personal", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Personal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargar_obj() {
        
        objPerson.setNombre(this.txtNombre.getText());
        objPerson.setNum_dni(Integer.parseInt(this.txtDni.getText()));
        objPerson.setDireccion(this.txtDireccion.getText());
        objPerson.setTelefono(Integer.parseInt(this.txtTelefono.getText()));
        objPerson.setCorreo(this.txtCorreo.getText());
        objPerson.setSexo(this.ComboSexo.getSelectedItem().toString());
        objPerson.setEstado(1);
        
        if (cheHijoos.isSelected() == true) {
            objPerson.setHijo("SI");
            objPerson.setCan_hijo(Integer.parseInt(this.txtHijos.getText()));
            
        } else {
            objPerson.setHijo("NO");
            objPerson.setCan_hijo(0);
        }
        
        if (raSoltero.isSelected() == true) {
            objPerson.setEs_civil("Soltero");
        } else if (raCasado.isSelected() == true) {
            objPerson.setEs_civil("Casado");
        } else if (raDivorsiado.isSelected() == true) {
            objPerson.setEs_civil("Divorsiado");
        } else if (raViudo.isSelected() == true) {
            objPerson.setEs_civil("Viudo");
            
        }
    }
    
    private void limpiarcampos() {
        this.txtHijos.setEditable(false);
        this.txtNombre.setText("");
        this.txtDireccion.setText("");
        this.txtDni.setText("");
        this.txtCorreo.setText("");
        this.txtTelefono.setText("");
        this.txtHijos.setText("");
    
        this.cheHijoos.setSelected(false);
        this.raSoltero.setSelected(false);
        this.raCasado.setSelected(false);
        this.raDivorsiado.setSelected(false);
        this.raViudo.setSelected(false);
        this.ComboSexo.setSelectedIndex(0);
    }
    
    private void modificar() {
        this.cargar_obj();
        try {
            if (PersonBo.modificarPerson(objPerson)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Personal", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();
                
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Personal", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Personal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargar_campos(boolean estado) {
        if (VistaPers.estado == true) {
            objPerson.setIdpersona(lista_eliminar.id);
            this.txtNombre.setText(lista_eliminar.nom);
            this.txtDireccion.setText(lista_eliminar.dir);
            this.txtDni.setText("" + lista_eliminar.dni);
            this.txtCorreo.setText(lista_eliminar.correo);
            this.txtTelefono.setText("" + lista_eliminar.tel);
            this.ComboSexo.setSelectedItem(lista_eliminar.sex);
            
            if ("SI".equals(lista_eliminar.hijo)) {
                this.txtHijos.setEditable(true);
                this.txtHijos.setText("" + lista_eliminar.nun_hijo);
                this.cheHijoos.setSelected(true);
            } else {
                this.cheHijoos.setSelected(false);
            }
            
            if (null != lista_eliminar.est_civil) {
                switch (lista_eliminar.est_civil) {
                    case "Soltero":
                        this.raSoltero.setSelected(true);
                        break;
                    case "Casado":
                        this.raCasado.setSelected(true);
                        break;
                    case "Divorsiado":
                        this.raDivorsiado.setSelected(true);
                        break;
                    case "Viudo":
                        this.raViudo.setSelected(true);
                        break;
                    default:
                        break;
                }
            }
            
        } else {
            limpiarcampos();
        }
        
    }
    
    private void cargar_tabla() {
        lista_eliminar p1 = new lista_eliminar();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);
        
        PanelVistaPer.removeAll();
        PanelVistaPer.add(p1, BorderLayout.CENTER);
        PanelVistaPer.revalidate();
        PanelVistaPer.repaint();
    }
}
