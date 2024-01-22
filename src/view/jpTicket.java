package view;

import business.ClienteBo;
import business.Detalle_TicketBo;
import business.MaquinariaBo;
import business.MaterialBo;
import business.PersonBo;
import business.TicketBo;
import db.Conexion;
import db.TextPrompt;
import entity.Detalle_Ticket;
import entity.Maquinaria;
import entity.Material;
import entity.Ticket;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class jpTicket extends javax.swing.JPanel {

    private DefaultTableModel MaquinaTableModel;
    private DefaultTableModel MaterialTableModel;
    private DefaultComboBoxModel Persona;
    private DefaultComboBoxModel Cliente;
    Material obj = new Material();
    Maquinaria objM = new Maquinaria();
    DefaultTableModel modelo2 = new DefaultTableModel();
    Ticket objTicket = new Ticket();
    Detalle_Ticket objDetalle = new Detalle_Ticket();

    private String numero;
    private String serie;
    private String usua;
    private String cliente;
    private String trabajador;

    private String descri;
    private int id;
    private int dias;
    private int horas;
    private int canti;

    private double precio;
    private double total;
    private double precio1;
    private double subtotal;
    private double total1;
    private char opt;

    public jpTicket() {
        initComponents();
        loadTableMaquina();
        loadTableMateria();
        loadComboPersona();
        loadComboCliente();
        numeroTicket();
        plaseholder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNun_tiket = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ComboCliente = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MaterialTable = new javax.swing.JTable();
        btnListaM = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CantAgregar = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MaquinaTable = new javax.swing.JTable();
        btnListarMa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_detalle_ticket = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnListar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ComboPersona = new javax.swing.JComboBox<>();
        txtDias = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1040, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1039, 520));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("NUEVO TICKET");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 191, 30));

        txtNun_tiket.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(txtNun_tiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 147, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("#Ticket:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        ComboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ComboCliente)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("SubTotal: S/.");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtsubtotal.setText("000001");
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Total:  S/.");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setText("0000001");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de material"));

        MaterialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Stock", "Unidad", "Precio"
            }
        ));
        MaterialTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaterialTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MaterialTable);

        btnListaM.setBackground(new java.awt.Color(10, 95, 1));
        btnListaM.setPreferredSize(new java.awt.Dimension(83, 30));
        btnListaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListaMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListaMMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListaMMousePressed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        jLabel7.setText("Agregar");

        javax.swing.GroupLayout btnListaMLayout = new javax.swing.GroupLayout(btnListaM);
        btnListaM.setLayout(btnListaMLayout);
        btnListaMLayout.setHorizontalGroup(
            btnListaMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        btnListaMLayout.setVerticalGroup(
            btnListaMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CantAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListaM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de maquinaria "));

        MaquinaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maquina", "Horas", "Dias", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MaquinaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaquinaTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(MaquinaTable);

        btnListarMa.setBackground(new java.awt.Color(10, 95, 1));
        btnListarMa.setPreferredSize(new java.awt.Dimension(83, 30));
        btnListarMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListarMaMousePressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        jLabel8.setText("Agregar");

        javax.swing.GroupLayout btnListarMaLayout = new javax.swing.GroupLayout(btnListarMa);
        btnListarMa.setLayout(btnListarMaLayout);
        btnListarMaLayout.setHorizontalGroup(
            btnListarMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnListarMaLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnListarMaLayout.setVerticalGroup(
            btnListarMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListarMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnListarMa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_detalle_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Dias", "Horas", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane4.setViewportView(table_detalle_ticket);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGenerar.setBackground(new java.awt.Color(10, 95, 1));
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarMousePressed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generar.png"))); // NOI18N
        jLabel9.setText("Generar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnGenerarLayout = new javax.swing.GroupLayout(btnGenerar);
        btnGenerar.setLayout(btnGenerarLayout);
        btnGenerarLayout.setHorizontalGroup(
            btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        btnGenerarLayout.setVerticalGroup(
            btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(10, 95, 1));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jLabel10.setText("Eliminar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnImprimir.setBackground(new java.awt.Color(10, 95, 1));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImprimirMousePressed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        jLabel11.setText("Imprimir");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnImprimirLayout = new javax.swing.GroupLayout(btnImprimir);
        btnImprimir.setLayout(btnImprimirLayout);
        btnImprimirLayout.setHorizontalGroup(
            btnImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        btnImprimirLayout.setVerticalGroup(
            btnImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del trabajdor"));

        btnListar.setBackground(new java.awt.Color(10, 95, 1));
        btnListar.setPreferredSize(new java.awt.Dimension(83, 30));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListarMousePressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        jLabel5.setText("Agregar");

        javax.swing.GroupLayout btnListarLayout = new javax.swing.GroupLayout(btnListar);
        btnListar.setLayout(btnListarLayout);
        btnListarLayout.setHorizontalGroup(
            btnListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        btnListarLayout.setVerticalGroup(
            btnListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ComboPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboPersona.setMaximumSize(new java.awt.Dimension(65, 26));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        this.btnListar.setBackground(new Color(0, 128, 0));
        this.btnListar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        this.btnListar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnListarMouseExited

    private void btnListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMousePressed
        if (!"".equals(txttotal.getText()))
        {
            try
            {
                descri = ComboPersona.getSelectedItem().toString();
                dias = Integer.parseInt(this.txtDias.getText());
                precio = Double.parseDouble(this.txtPrecio.getText());
                total = Double.parseDouble(this.txttotal.getText());
                cargar_ragistro_tiket();
                limpiar();
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }

        } else
        {
            JOptionPane.showMessageDialog(this, "Seleccione el usuario",
                    "TRABAJADOR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnListarMousePressed

    private void btnListaMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMMouseEntered
        this.btnListaM.setBackground(new Color(0, 128, 0));
        this.btnListaM.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnListaMMouseEntered

    private void btnListaMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMMouseExited
        this.btnListaM.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnListaMMouseExited

    private void btnListaMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMMousePressed
        if (!"".equals(descri))
        {
            try
            {
                int cant = Integer.parseInt(CantAgregar.getValue().toString());
                if (cant != 0)
                {
                    Material material = MaterialBo.validarMaterialId(descri);
                    System.out.println("id material2: " + material.getIdMaterial());
                    int stc = Integer.parseInt(material.getCantidad());
                    if (stc >= cant)
                    {
                        int st = (stc - cant);

                        obj.setIdMaterial(material.getIdMaterial());
                        obj.setCantidad("" + st);
                        canti = cant;
                        if (st == 0)
                        {
                            obj.setEstado(0);
                        } else
                        {
                            obj.setEstado(1);
                        }
                        double tot = (precio * cant);
                        total = tot;
                        System.out.println("" + tot);
                        cargar_ragistro_tiket();
                        MaterialBo.stockMaterial(obj);
                        CantAgregar.setValue(0);
                        loadTableMateria();
                    } else
                    {
                        JOptionPane.showMessageDialog(this, "la cantidad es mayor al stock",
                                "Material", JOptionPane.WARNING_MESSAGE);
                    }

                } else
                {
                    System.out.println("precio: " + precio);
                    System.out.println("cantidad: " + canti);
                    double tot = (precio * canti);
                    total = tot;
                    obj.setEstado(0);
                    Material material = MaterialBo.validarMaterialId(descri);
                    int id = material.getIdMaterial();
                    System.out.println("Id material: " + id);
                    obj.setIdMaterial(material.getIdMaterial());
                    obj.setCantidad("0");
                    MaterialBo.stockMaterial(obj);
                    cargar_ragistro_tiket();
                    loadTableMateria();
                }

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }

        } else
        {
            JOptionPane.showMessageDialog(this, "Seleccione el Material",
                    "Material", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnListaMMousePressed

    private void btnListarMaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMaMouseEntered
        this.btnListarMa.setBackground(new Color(0, 128, 0));
        this.btnListarMa.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnListarMaMouseEntered

    private void btnListarMaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMaMouseExited
        this.btnListarMa.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnListarMaMouseExited

    private void btnListarMaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMaMousePressed
        if (!"".equals(descri))
        {
            try
            {
                Maquinaria maquina = MaquinariaBo.validariMaquinaId(descri);
                objM.setIdMaquinaria(maquina.getIdMaquinaria());
                MaquinariaBo.eliminarMaquina(objM);
                cargar_ragistro_tiket();
                loadTableMaquina();
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }

        } else
        {
            JOptionPane.showMessageDialog(this, "Seleccione la Maquinaria",
                    "MAQUINARIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnListarMaMousePressed

    private void btnGenerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseEntered
        this.btnGenerar.setBackground(new Color(0, 128, 0));
        this.btnGenerar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnGenerarMouseEntered

    private void btnGenerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseExited
        this.btnGenerar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnGenerarMouseExited

    private void btnGenerarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarMousePressed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        this.btnEliminar.setBackground(new Color(0, 128, 0));
        this.btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        this.btnEliminar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        this.btnImprimir.setBackground(new Color(0, 128, 0));
        this.btnImprimir.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        this.btnImprimir.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnImprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirMousePressed

    private void MaterialTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaterialTableMouseClicked
        try
        {
            int index = MaterialTable.getSelectedRow();
            descri = MaterialTable.getValueAt(index, 0).toString();
            canti = Integer.parseInt(MaterialTable.getValueAt(index, 1).toString());
            precio = Double.parseDouble(MaterialTable.getValueAt(index, 3).toString());
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_MaterialTableMouseClicked

    private void MaquinaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaquinaTableMouseClicked
        try
        {
            int index = MaquinaTable.getSelectedRow();
            descri = MaquinaTable.getValueAt(index, 0).toString();
            horas = Integer.parseInt(MaquinaTable.getValueAt(index, 1).toString());
            dias = Integer.parseInt(MaquinaTable.getValueAt(index, 2).toString());
            precio = Double.parseDouble(MaquinaTable.getValueAt(index, 3).toString());
            total = Double.parseDouble(MaquinaTable.getValueAt(index, 4).toString());
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_MaquinaTableMouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        registrar();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        try
        {
            Connection con = null;
            JasperReport reporteJasper = null;
            String dir = "src\\Reporte\\report1.jasper";
            Map parametro = new HashMap<String, Object>();
            parametro.put("idtik_e", id);
            con = Conexion.getConexion();

            reporteJasper = (JasperReport) JRLoader.loadObjectFromFile(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(dir, parametro, con);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception JRException)
        {
            JOptionPane.showMessageDialog(null, "Error al intentar abrir el reporte");
        }
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed

        int fila;
        int resp;

        try
        {
            fila = table_detalle_ticket.getSelectedRow();
            if (fila == -1)
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar la fila a eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else
            {
                resp = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este fila?", "eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_NO_OPTION)
                {

                    modelo2 = (DefaultTableModel) table_detalle_ticket.getModel();
                    modelo2.removeRow(fila);

                }
            }
        } catch (Exception e)
        {

        }

    }//GEN-LAST:event_jLabel10MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CantAgregar;
    private javax.swing.JComboBox<String> ComboCliente;
    private javax.swing.JComboBox<String> ComboPersona;
    private javax.swing.JTable MaquinaTable;
    private javax.swing.JTable MaterialTable;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnGenerar;
    private javax.swing.JPanel btnImprimir;
    private javax.swing.JPanel btnListaM;
    private javax.swing.JPanel btnListar;
    private javax.swing.JPanel btnListarMa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table_detalle_ticket;
    private javax.swing.JTextField txtDias;
    private javax.swing.JLabel txtNun_tiket;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private void loadTableMaquina() {
        try
        {
            TableColumn columna;
            this.MaquinaTableModel = MaquinariaBo.ListaTable();
            this.MaquinaTable.setModel(this.MaquinaTableModel);
//            setAnchoColumnas();
            columna = this.MaquinaTable.getColumnModel().getColumn(0);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void loadTableMateria() {
        try
        {
            TableColumn columna;
            this.MaterialTableModel = MaterialBo.ListaTable_ticket();
            this.MaterialTable.setModel(this.MaterialTableModel);
//            setAnchoColumnas();
            columna = this.MaterialTable.getColumnModel().getColumn(0);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void loadComboPersona() {
        try
        {
            Persona = PersonBo.obtenerPersona();
            ComboPersona.setModel(Persona);
            ComboPersona.setPreferredSize(new Dimension(600, 22));

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void loadComboCliente() {
        try
        {
            Cliente = ClienteBo.obtenerPersona();
            ComboCliente.setModel(Cliente);
            ComboCliente.setPreferredSize(new Dimension(600, 22));

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void numeroTicket() {

        try
        {
            String serie = TicketBo.NumId();
            if (serie == null)
            {
                txtNun_tiket.setText("0000001");
            } else
            {
                int increment = Integer.parseInt(serie);
                increment = increment + 1;
                if (increment <= 10)
                {
                    txtNun_tiket.setText("0000" + increment);
                } else if (increment >= 10 && increment <= 99)
                {
                    txtNun_tiket.setText("000" + increment);
                } else if (increment >= 100 && increment <= 999)
                {
                    txtNun_tiket.setText("0" + increment);
                } else if (increment >= 1000 && increment <= 9999)
                {
                    txtNun_tiket.setText("0" + increment);
                } else if (increment >= 10000 && increment <= 99999)
                {
                    txtNun_tiket.setText("0" + increment);

                }

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private void cargar_ragistro_tiket() {
        modelo2 = (DefaultTableModel) table_detalle_ticket.getModel();
        ArrayList lista = new ArrayList();
        if (descri != null)
        {
            lista.add(descri);
            lista.add(dias);
            lista.add(horas);
            lista.add(canti);
            lista.add(precio);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modelo2.addRow(ob);
            limpiar_variables();
            table_detalle_ticket.setModel(modelo2);
            calculatTotal();

        }
    }

    private void calculatTotal() {
        double total = 0.0, sbto = 0.0;
        for (int i = 0; i < table_detalle_ticket.getRowCount(); i++)
        {
            total1 = Double.parseDouble(table_detalle_ticket.getValueAt(i, 5).toString());

            sbto = redondear(sbto + total1);
            total = redondear(total + total1);
        }
        txtsubtotal.setText("" + sbto + "0");
        txtTotal.setText("" + total + "0");

    }

    private void limpiar_variables() {
        id = 0;
        descri = "";
        dias = 0;
        horas = 0;
        precio = 0.0;
        total = 0.0;
    }

    private void registrar() {
        try
        {
            guardarVenta();
            String idT = TicketBo.NumId();
            id = Integer.parseInt(idT);

            guardarDetalle();

            limpiarTodo();
            numeroTicket();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error " + ex);
        }

    }

    private void guardarVenta() {
        try
        {
            objTicket.setIdU(jDashboard.usua);
            objTicket.setIdC(ComboCliente.getSelectedItem().toString());
            objTicket.setSerie("F0001");
            objTicket.setNum(this.txtNun_tiket.getText());
            objTicket.setSubtotal(Double.parseDouble(txtsubtotal.getText()));
            objTicket.setTotal(Double.parseDouble(txtTotal.getText()));

            if (TicketBo.grabarTicket(objTicket))
            {
                JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> Ticket", JOptionPane.INFORMATION_MESSAGE);

            } else
            {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Ticket", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> VENTA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarDetalle() {
        try
        {

            for (int i = 0; i < table_detalle_ticket.getRowCount(); i++)
            {
                objDetalle.setIdticket(id);
                objDetalle.setDes(table_detalle_ticket.getValueAt(i, 0).toString());
                objDetalle.setDia(Integer.parseInt(table_detalle_ticket.getValueAt(i, 1).toString()));
                objDetalle.setHora(Integer.parseInt(table_detalle_ticket.getValueAt(i, 2).toString()));
                objDetalle.setCant(Integer.parseInt(table_detalle_ticket.getValueAt(i, 3).toString()));
                objDetalle.setPrecio(Double.parseDouble(table_detalle_ticket.getValueAt(i, 4).toString()));
                objDetalle.setTotal(Double.parseDouble(table_detalle_ticket.getValueAt(i, 5).toString()));

                Detalle_TicketBo.grabarTicket(objDetalle);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> DETALLE TICKET", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarTodo() {
        this.txtsubtotal.setText("");
        this.txtTotal.setText("");
        for (int i = 0; i < modelo2.getRowCount(); i++)
        {
            modelo2.removeRow(i);
            i = i - 1;
        }
    }

    private void limpiar() {
        txtDias.setText("");
        txtPrecio.setText("");
        txttotal.setText("");
    }

    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt("Dias 001", this.txtDias);
        TextPrompt prueba1 = new TextPrompt("Precio 11,2", this.txtPrecio);
        TextPrompt prueba2 = new TextPrompt("Total 11,2", this.txttotal);
    }

    private double redondear(double num) {
        return Math.rint(num * 100) / 100;
    }
}
