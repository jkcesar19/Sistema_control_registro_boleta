package view.Material;

import business.MaterialBo;
import business.ProductoBo;
import business.ProveedorBo;
import business.UnidadBo;
import db.TextPrompt;
import entity.Material;
import java.awt.BorderLayout;

import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static view.Material.VistaMate.PanelVistaMat;

public class registro_actualiza extends javax.swing.JPanel {
    
    Material objMaterial = new Material();
    private DefaultComboBoxModel Proveedor;
    private DefaultComboBoxModel Unidad;
    private DefaultComboBoxModel Producto;
    
    public registro_actualiza() throws Exception {
        initComponents();
        plaseholder();
        cargarComboProveedor();
        cargarComboUnidad();
        cargarComboProducto();
        cargar_campos(VistaMate.estado);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPrecioUni = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnRegistrarProveedor = new javax.swing.JPanel();
        jlAgregarProv = new javax.swing.JLabel();
        ComboProve = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        comboUnMedida = new javax.swing.JComboBox<>();
        ComboProducto = new javax.swing.JComboBox<>();
        btnAgregarProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(739, 325));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 325));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtPrecioUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 166, 194, 35));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 166, 210, 35));
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 74, 167, 35));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 75, 185, 34));

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

        jPanel1.add(btnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 34, 120, 34));

        ComboProve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 34, 507, 34));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 74, 253, 35));

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

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 227, -1, 34));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 166, 205, 35));

        comboUnMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboUnMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 212, 126, 34));

        ComboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 507, 35));

        btnAgregarProducto.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMousePressed(evt);
            }
        });
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jLabel1.setText("Prod");
        btnAgregarProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 120, -1, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorMousePressed
        this.cargar_registro_proveedor();
    }//GEN-LAST:event_btnRegistrarProveedorMousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        switch (VistaMate.op)
        {
            case 'N':
                if (this.txtPrecioUni.getText().equals("")
                        || this.txtTotal.getText().equals("") || this.txtCantidad.getText().equals("")
                        || this.txtSerie.getText().equals("") || this.txtFecha.getText().equals("")
                        || this.txtNumero.getText().equals(""))
                {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.txtFecha.requestFocus();
                } else
                {
                    this.registrar();
                }
                break;
            case 'M':
                
                this.modificar();
                
                break;
        }
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnAgregarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMousePressed
        this.cargar_registro_producto();
    }//GEN-LAST:event_btnAgregarProductoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProducto;
    private javax.swing.JComboBox<String> ComboProve;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnRegistrarProveedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboUnMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAgregarProv;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecioUni;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" 07-11-2023", this.txtFecha);
        TextPrompt prueba2 = new TextPrompt(" 11,2", this.txtPrecioUni);
        TextPrompt prueba3 = new TextPrompt(" 672", this.txtTotal);
        TextPrompt prueba4 = new TextPrompt(" 001", this.txtSerie);
        TextPrompt prueba5 = new TextPrompt(" N° 000001", this.txtNumero);
        TextPrompt prueba6 = new TextPrompt(" 60", this.txtCantidad);
    }
    
    private void registrar() {
        this.cargar_obj();
        try
        {
            if (MaterialBo.grabarMaterial(objMaterial))
            {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Material", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();
                
            } else
            {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
                
            }
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargar_obj() {
        objMaterial.setProve(this.ComboProve.getSelectedItem().toString());
        objMaterial.setFecha_ingreso(this.txtFecha.getText());
        objMaterial.setSerie(this.txtSerie.getText());
        objMaterial.setNumero(this.txtNumero.getText());
        objMaterial.setMaterial(this.ComboProducto.getSelectedItem().toString());
        objMaterial.setCantidad(this.txtCantidad.getText());
        objMaterial.setUnidad(this.comboUnMedida.getSelectedItem().toString());
        objMaterial.setPrecio(Double.parseDouble(this.txtPrecioUni.getText()));
        objMaterial.setTotal(Double.parseDouble(this.txtTotal.getText()));
        objMaterial.setEstado(1);
        
    }
    
    private void limpiarcampos() {
        this.ComboProducto.setSelectedIndex(0);
        this.txtCantidad.setText("");
        this.txtPrecioUni.setText("");
        this.txtSerie.setText("");
        this.txtTotal.setText("");
        this.txtNumero.setText("");
        this.txtFecha.setText("");
        this.ComboProve.setSelectedIndex(0);
        this.comboUnMedida.setSelectedIndex(0);
    }
    
    private void modificar() {
        this.cargar_obj();
        try
        {
            if (MaterialBo.ModificarMaterial(objMaterial))
            {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Material", JOptionPane.INFORMATION_MESSAGE);
                this.cargar_tabla();
                this.limpiarcampos();
                
            } else
            {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
            }
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Material", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargar_campos(boolean estado) throws Exception {
        if (VistaMate.estado == true)
        {
            Material material = MaterialBo.validarMaterialId(lista_eliminar.mate);
            int id = material.getIdMaterial();
            objMaterial.setIdMaterial(id);
            this.ComboProve.setSelectedItem(material.getProve());
            this.txtFecha.setText(material.getFecha_ingreso());
            this.txtSerie.setText(material.getSerie());
            this.txtNumero.setText(material.getNumero());
            this.ComboProducto.setSelectedItem(lista_eliminar.mate);
            this.txtPrecioUni.setText("" + lista_eliminar.prec);
            this.txtCantidad.setText(lista_eliminar.cant);
            this.txtTotal.setText("" + lista_eliminar.tota);
            this.comboUnMedida.setSelectedItem(lista_eliminar.unid);
        }
        
    }
    
    private void cargar_tabla() {
        lista_eliminar p1 = new lista_eliminar();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);
        
        PanelVistaMat.removeAll();
        PanelVistaMat.add(p1, BorderLayout.CENTER);
        PanelVistaMat.revalidate();
        PanelVistaMat.repaint();
    }
    
    private void cargarComboProveedor() {
        try
        {
            Proveedor = ProveedorBo.obtenerProveedor();
            ComboProve.setModel(Proveedor);
            ComboProve.setPreferredSize(new Dimension(600, 22));
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cargarComboUnidad() {
        try
        {
            Unidad = UnidadBo.obtenerUnidad();
            comboUnMedida.setModel(Unidad);
            comboUnMedida.setPreferredSize(new Dimension(600, 22));
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cargar_registro_proveedor() {
        registro_proveedor p1 = new registro_proveedor();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);
        
        PanelVistaMat.removeAll();
        PanelVistaMat.add(p1, BorderLayout.CENTER);
        PanelVistaMat.revalidate();
        PanelVistaMat.repaint();
    }

    private void cargarComboProducto() {
         try
        {
            Producto = ProductoBo.obtenerProducto();
            ComboProducto.setModel(Producto);
            ComboProducto.setPreferredSize(new Dimension(600, 22));
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void cargar_registro_producto() {
        registro_producto p1 = new registro_producto();
        p1.setSize(750, 343);
        p1.setLocation(0, 0);
        
        PanelVistaMat.removeAll();
        PanelVistaMat.add(p1, BorderLayout.CENTER);
        PanelVistaMat.revalidate();
        PanelVistaMat.repaint();
    }
}
