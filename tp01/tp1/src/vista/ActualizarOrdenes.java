package vista;


import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.Color;
import modelo.Modelo;

public class ActualizarOrdenes extends javax.swing.JFrame {
    
boolean setGrabar = false;  
      

   // OrdenesProduccion vista = new OrdenesProduccion();
    
    public JTextField getSku() {
        return sku;
    }

    public void setSku(JTextField sku) {
        this.sku = sku;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public void setCodigo(JTextField codigo) {
        this.codigo = codigo;
    }

    public JComboBox<Object> getComboDenominacion() {
        return comboDenominacion;
    }

    public void setComboDenominacion(JComboBox<Object> comboDenominacion) {
        this.comboDenominacion = comboDenominacion;
    }

    public JComboBox<Object> getComboDescripcion() {
        return comboDescripcion;
    }

    public void setComboDescripcion(JComboBox<Object> comboDescripcion) {
        this.comboDescripcion = comboDescripcion;
    }

    public ActualizarOrdenes() {
        initComponents();
        setLocation(370,90);
        llenarArregloObjetos();
    }
    
    private void llenarArregloObjetos(){
        ArrayList<Modelo> modelos = new ArrayList<>();
        Modelo trekking = new Modelo(001,"Trekking");
        Modelo running = new Modelo(002,"Runnig");
        Modelo urban = new Modelo(003,"Urban");
        modelos.add(trekking);
        modelos.add(running);
        modelos.add(urban);
        
        for(Modelo m : modelos){
            comboDenominacion.addItem(m);
        }

        ArrayList<Color> colores = new ArrayList<>();
        Color azul = new Color("Azul");
        Color amarillo = new Color("Amarillo");
        Color verde = new Color("Verde");
        Color rojo = new Color("Rojo");
        Color negro = new Color("Negro");
        Color blanco = new Color("Blanco");
        
        for(Color c : colores){
            comboDescripcion.addItem(c);
        }        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sku = new javax.swing.JTextField();
        comboDenominacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        comboDescripcion = new javax.swing.JComboBox<>();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Codigo:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("MODELO:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("SKU:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Denominacion: ");

        sku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skuActionPerformed(evt);
            }
        });

        comboDenominacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trekking", "Runners", "Urban", " " }));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("COLOR:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Codigo:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Descripcion:");

        comboDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Amarillo", "Verde", "Rojo", "Negro", "Blanco", "Rosa", " " }));

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(187, 187, 187))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGrabar)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addComponent(codigo)
                            .addComponent(comboDenominacion, 0, 177, Short.MAX_VALUE)
                            .addComponent(comboDescripcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        setVisible(false);
        ActualizarOrdenes.setGrabar (true);
        
    }//GEN-LAST:event_btnGrabarActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<Object> comboDenominacion;
    private javax.swing.JComboBox<Object> comboDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField sku;
    // End of variables declaration//GEN-END:variables
}
