package vista;


import controlador.ControladorAutenticar;
import controlador.ControladorOrdenes;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Color;
import modelo.Modelo;
import modelo.Orden;

public class OrdenesProduccion extends javax.swing.JFrame {

    ArrayList<Orden> ordenes = new ArrayList<>();
    ActualizarOrdenes actualizar = new ActualizarOrdenes();
    private DefaultTableModel modelo = new DefaultTableModel();
    private TableRowSorter orden = new TableRowSorter(modelo);
    private String filtro = "", filtro1 = "", filtro2 = "";

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public JTextField getCol() {
        return col;
    }

    public void setCol(JTextField col) {
        this.col = col;
    }

    public JTextField getMod() {
        return mod;
    }

    public void setMod(JTextField mod) {
        this.mod = mod;
    }

    public TableRowSorter getOrden() {
        return orden;
    }

    public void setOrden(TableRowSorter orden) {
        this.orden = orden;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getFiltro1() {
        return filtro1;
    }

    public void setFiltro1(String filtro1) {
        this.filtro1 = filtro1;
    }

    public String getFiltro2() {
        return filtro2;
    }

    public void setFiltro2(String filtro2) {
        this.filtro2 = filtro2;
    }
    
    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public JTable getTablaOrden() {
        return tablaOrden;
    }

    public void setTablaOrden(JTable tablaOrden) {
        this.tablaOrden = tablaOrden;
    }
    
    
    public OrdenesProduccion() {
        initComponents();
        setLocation(370,90);
        modelo.addColumn("Linea");        
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Estado");  
        this.tablaOrden.setModel(modelo);
        //ControladorOrdenes.refrescarPantalla(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnRenaudar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOrden = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mod = new javax.swing.JTextField();
        col = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Ordenes de Produccion");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/application_form_delete.png"))); // NOI18N
        btnParar.setText("PARAR");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnRenaudar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arrow_refresh.png"))); // NOI18N
        btnRenaudar.setText("RENAUDAR");

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR SESION");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tablaOrden.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarOrden(evt);
            }
        });
        jScrollPane2.setViewportView(tablaOrden);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("MODELO:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("COLOR:");

        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modfiltraPorModelo(evt);
            }
        });

        col.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtraPorColor(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnParar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRenaudar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRenaudar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParar)
                    .addComponent(btnFinalizar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         Color c = new Color();
         Modelo m = new Modelo();
         
         String sku = actualizar.getSku().getText();
         String denom = actualizar.getComboDenominacion().getSelectedItem().toString();  
         String codigo = actualizar.getCodigo().getText();
         String descri = actualizar.getComboDescripcion().getSelectedItem().toString();
         
         Orden o = new Orden(sku+denom,codigo+descri);
         ordenes.add(o);
         System.out.println(ordenes);
         
         llenarTable();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        actualizar.setVisible(true);
        this.setVisible(false);
        ControladorAutenticar.botonAcceso(actualizar); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void seleccionarOrden(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarOrden
        col.setText((String) tablaOrden.getValueAt(tablaOrden.getSelectedRow(), 2));
        mod.setText((String) tablaOrden.getValueAt(tablaOrden.getSelectedRow(), 3));
    }//GEN-LAST:event_seleccionarOrden

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

    private void modfiltraPorModelo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modfiltraPorModelo
        filtro2 = "^" + mod.getText();
        ArrayList<RowFilter<Object, Object>> filtros = new ArrayList<RowFilter<Object,Object>>(2);
        filtros.add(RowFilter.regexFilter(filtro1));
        filtros.add(RowFilter.regexFilter(filtro2));
        TableRowSorter sorter = new TableRowSorter<TableModel>(tablaOrden.getModel());
        sorter.setRowFilter(RowFilter.andFilter(filtros));
        tablaOrden.setRowSorter(sorter);
    }//GEN-LAST:event_modfiltraPorModelo

    private void filtraPorColor(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtraPorColor
        filtro1 = "^" + col.getText();
        ArrayList<RowFilter<Object, Object>> filtros = new ArrayList<RowFilter<Object,Object>>(2);
        filtros.add(RowFilter.regexFilter(filtro1));
        filtros.add(RowFilter.regexFilter(filtro2));
        TableRowSorter sorter = new TableRowSorter<TableModel>(tablaOrden.getModel());
        sorter.setRowFilter(RowFilter.andFilter(filtros));
        tablaOrden.setRowSorter(sorter);
    }//GEN-LAST:event_filtraPorColor

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        ControladorOrdenes.parar(this);
    }//GEN-LAST:event_btnPararActionPerformed
 
    public void llenarTable(){
        actualizar.setVisible(true);
        DefaultTableModel datos = (DefaultTableModel) tablaOrden.getModel();
        
        for(Orden o : ordenes){
            Object[] fila = {"",o.getColor(),o.getModelo(),"ACTIVO"};
//Object[] fila = {"", actualizar.getSku().getText() + "-" + actualizar.getComboDenominacion().getSelectedItem().toString(), actualizar.getCodigo().getText() + "-" + actualizar.getComboDescripcion().getSelectedItem().toString(), "ACTIVO"};
            datos.addRow(fila);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnRenaudar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField col;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mod;
    private javax.swing.JTable tablaOrden;
    // End of variables declaration//GEN-END:variables
}
