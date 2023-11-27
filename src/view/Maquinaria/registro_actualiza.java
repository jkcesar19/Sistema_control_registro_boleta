package view.Maquinaria;

import business.MaquinaBo;
import business.ProveedorBo;
import db.TextPrompt;
import entity.Maquina;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static view.Maquinaria.VistaMaqui.PanelVistaMaquina;
import static view.Maquinaria.lista_eliminar.prec;

public class registro_actualiza extends javax.swing.JPanel {

    Maquina objMaquina = new Maquina();
    private DefaultComboBoxModel Proveedor;
    private DefaultComboBoxModel Unidad;

    public registro_actualiza() throws Exception {
        initComponents();
        plaseholder();
        cargarComboProveedor();
        cargar_campos(VistaMaqui.estado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtMaquina = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnRegistrarProveedor = new javax.swing.JPanel();
        jlAgregarProv = new javax.swing.JLabel();
        ComboProve = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtF_fin = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtF_inicio = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(739, 325));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 325));

        btnRegistrarProveedor.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarProveedorMousePressed(evt);
            }
        });
        btnRegistrarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlAgregarProv.setForeground(new java.awt.Color(255, 255, 255));
        jlAgregarProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAgregarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jlAgregarProv.setText("Prov.");
        btnRegistrarProveedor.add(jlAgregarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 107, -1));

        ComboProve.setBackground(new java.awt.Color(255, 255, 255));
        ComboProve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jLabel2.setText("Agregar");
        btnAgregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 110, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFecha)
                        .addGap(18, 18, 18)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaquina, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboProve, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtF_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboProve, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtF_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void btnRegistrarProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorMousePressed
        this.cargar_registro_proveedor();
    }//GEN-LAST:event_btnRegistrarProveedorMousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        switch (VistaMaqui.op) {
            case 'N':
                if (this.txtMaquina.getText().equals("") || this.txtDias.getText().equals("")
                        || this.txtF_fin.getText().equals("") || this.txtHoras.getText().equals("")
                        || this.txtSerie.getText().equals("") || this.txtFecha.getText().equals("")
                        || this.txtNumero.getText().equals("")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.txtMaquina.requestFocus();
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
    private javax.swing.JComboBox<String> ComboProve;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnRegistrarProveedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAgregarProv;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtF_fin;
    private javax.swing.JTextField txtF_inicio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtMaquina;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" 07-11-2023", this.txtFecha);
        TextPrompt prueba1 = new TextPrompt(" Ingrese el Maquina", this.txtMaquina);
        TextPrompt prueba2 = new TextPrompt(" Ing. los dias", this.txtDias);
        TextPrompt prueba3 = new TextPrompt(" F. fin", this.txtF_fin);
        TextPrompt prueba4 = new TextPrompt(" 001", this.txtSerie);
        TextPrompt prueba5 = new TextPrompt(" N° 000001", this.txtNumero);
        TextPrompt prueba6 = new TextPrompt(" Ing. las horas", this.txtHoras);
        TextPrompt prueba7 = new TextPrompt(" F. Inicio", this.txtF_inicio);
        TextPrompt prueba8 = new TextPrompt(" P por hora", this.txtPrecio);
        TextPrompt prueba9 = new TextPrompt(" Total", this.txtTotal);
    }

    private void registrar() {
        this.cargar_obj();
        try {
            if (MaquinaBo.grabarMaquina(objMaquina)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Material", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargar_obj() {
        objMaquina.setProve(this.ComboProve.getSelectedItem().toString());
        objMaquina.setFecha(this.txtFecha.getText());
        objMaquina.setSerie(this.txtSerie.getText());
        objMaquina.setNumero(this.txtNumero.getText());
        objMaquina.setMaquina(this.txtMaquina.getText());
        objMaquina.setHoras(this.txtHoras.getText());
        objMaquina.setDias(this.txtDias.getText());
        objMaquina.setPrecio_hora(Double.parseDouble(this.txtPrecio.getText()));
        objMaquina.setTotal(Double.parseDouble(this.txtTotal.getText()));
        objMaquina.setFecha_inicio(this.txtF_inicio.getText());
        objMaquina.setFecha_fin(this.txtF_fin.getText());

    }

    private void limpiarcampos() {
        this.txtMaquina.setText("");
        this.txtHoras.setText("");
        this.txtDias.setText("");
        this.txtSerie.setText("");
        this.txtF_fin.setText("");
        this.txtF_inicio.setText("");
        this.txtPrecio.setText("");
        this.txtTotal.setText("");
        this.txtNumero.setText("");
        this.txtFecha.setText("");
        this.ComboProve.setSelectedIndex(0);
       
    }

    private void modificar() {
        this.cargar_obj();
        try {
            if (MaquinaBo.modificarMaquina(objMaquina)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Material", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargar_campos(boolean estado) throws Exception {
        if (VistaMaqui.estado == true) {
            objMaquina.setIdMaquinaria(lista_eliminar.id);
            Maquina maquina = MaquinaBo.validarMaquina(lista_eliminar.id);
            this.ComboProve.setSelectedItem(maquina.getProve());
            this.txtFecha.setText(maquina.getFecha());
            this.txtSerie.setText(maquina.getSerie());
            this.txtNumero.setText(maquina.getNumero());
            this.txtMaquina.setText(lista_eliminar.maqu);
            this.txtDias.setText(lista_eliminar.dia);
            this.txtHoras.setText(lista_eliminar.hora);
            this.txtPrecio.setText(""+lista_eliminar.prec);
            this.txtTotal.setText("" + lista_eliminar.tota);
            this.txtF_inicio.setText(maquina.getFecha_inicio());
            this.txtF_fin.setText(maquina.getFecha_fin());
            this.txtTotal.setText("" + lista_eliminar.prec);

        }

    }

    private void cargar_tabla() {
        lista_eliminar p1 = new lista_eliminar();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);

        PanelVistaMaquina.removeAll();
        PanelVistaMaquina.add(p1, BorderLayout.CENTER);
        PanelVistaMaquina.revalidate();
        PanelVistaMaquina.repaint();
    }

    private void cargarComboProveedor() {
        try {
            Proveedor = ProveedorBo.obtenerProveedor();
            ComboProve.setModel(Proveedor);
            ComboProve.setPreferredSize(new Dimension(600, 22));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    
    private void cargar_registro_proveedor() {
        registro_proveedor p1 = new registro_proveedor();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);

        PanelVistaMaquina.removeAll();
        PanelVistaMaquina.add(p1, BorderLayout.CENTER);
        PanelVistaMaquina.revalidate();
        PanelVistaMaquina.repaint();
    }
}
