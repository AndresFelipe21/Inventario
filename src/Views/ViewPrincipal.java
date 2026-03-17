package Views;

import java.awt.CardLayout;
import javax.swing.JFrame;


public class ViewPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewPrincipal.class.getName());
    private CardLayout ventanas;

    public ViewPrincipal() {
        initComponents();
        this.setTitle("Gestor de Inventario");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        ViewPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btbProducts = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btbSuppliers = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btbCustomers = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btbStock = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ViewProducts = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btbVolver = new javax.swing.JButton();
        ViewCustomer = new javax.swing.JPanel();
        ViewSuppliers = new javax.swing.JPanel();
        ViewStock = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setLayout(new java.awt.CardLayout());

        ViewPrincipal.setBackground(new java.awt.Color(244, 246, 248));
        ViewPrincipal.setPreferredSize(new java.awt.Dimension(853, 340));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestionar Productos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto 128x128.png"))); // NOI18N

        btbProducts.setBackground(new java.awt.Color(230, 233, 237));
        btbProducts.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        btbProducts.setForeground(new java.awt.Color(70, 70, 70));
        btbProducts.setText("Administar Productos");
        btbProducts.addActionListener(this::btbProductsActionPerformed);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestionar Proveedores");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor 128x128.jpg"))); // NOI18N

        btbSuppliers.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        btbSuppliers.setText("Administar Proveedores");
        btbSuppliers.addActionListener(this::btbSuppliersActionPerformed);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Clientes");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cliente 128x128.png"))); // NOI18N

        btbCustomers.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        btbCustomers.setText("Administar Clientes");
        btbCustomers.addActionListener(this::btbCustomersActionPerformed);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel7.setText("BIENVENIDO AL SISTEMA DE GESTION DEL INVENTARIO");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock 128x128.png"))); // NOI18N

        btbStock.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        btbStock.setText("Gestionar Stock");
        btbStock.addActionListener(this::btbStockActionPerformed);

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Stock");

        javax.swing.GroupLayout ViewPrincipalLayout = new javax.swing.GroupLayout(ViewPrincipal);
        ViewPrincipal.setLayout(ViewPrincipalLayout);
        ViewPrincipalLayout.setHorizontalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbSuppliers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPrincipalLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btbCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbStock, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addGap(22, 22, 22))
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewPrincipalLayout.setVerticalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(72, 72, 72)
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel4))
                        .addGroup(ViewPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btbProducts)
                                .addComponent(btbSuppliers))))
                    .addGroup(ViewPrincipalLayout.createSequentialGroup()
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btbCustomers)
                            .addComponent(btbStock))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PanelPrincipal.add(ViewPrincipal, "card4");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel10.setText("Gestion De Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "NOMBRE", " CATEGORIA", "PRECIO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        btbVolver.setText("Volver");
        btbVolver.addActionListener(this::btbVolverActionPerformed);

        javax.swing.GroupLayout ViewProductsLayout = new javax.swing.GroupLayout(ViewProducts);
        ViewProducts.setLayout(ViewProductsLayout);
        ViewProductsLayout.setHorizontalGroup(
            ViewProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewProductsLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(ViewProductsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ViewProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewProductsLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(ViewProductsLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btbVolver)))
                .addContainerGap())
        );
        ViewProductsLayout.setVerticalGroup(
            ViewProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewProductsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ViewProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btbVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ViewProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        PanelPrincipal.add(ViewProducts, "card2");

        javax.swing.GroupLayout ViewCustomerLayout = new javax.swing.GroupLayout(ViewCustomer);
        ViewCustomer.setLayout(ViewCustomerLayout);
        ViewCustomerLayout.setHorizontalGroup(
            ViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        ViewCustomerLayout.setVerticalGroup(
            ViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        PanelPrincipal.add(ViewCustomer, "card3");

        javax.swing.GroupLayout ViewSuppliersLayout = new javax.swing.GroupLayout(ViewSuppliers);
        ViewSuppliers.setLayout(ViewSuppliersLayout);
        ViewSuppliersLayout.setHorizontalGroup(
            ViewSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        ViewSuppliersLayout.setVerticalGroup(
            ViewSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        PanelPrincipal.add(ViewSuppliers, "card5");

        javax.swing.GroupLayout ViewStockLayout = new javax.swing.GroupLayout(ViewStock);
        ViewStock.setLayout(ViewStockLayout);
        ViewStockLayout.setHorizontalGroup(
            ViewStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ViewStockLayout.setVerticalGroup(
            ViewStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        PanelPrincipal.add(ViewStock, "card6");

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbProductsActionPerformed
        ventanas = (CardLayout)this.PanelPrincipal.getLayout();
        ventanas.show(PanelPrincipal, "card2");
    }//GEN-LAST:event_btbProductsActionPerformed

    private void btbSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSuppliersActionPerformed
        ventanas = (CardLayout)this.PanelPrincipal.getLayout();
        ventanas.show(PanelPrincipal, "card5");
    }//GEN-LAST:event_btbSuppliersActionPerformed

    private void btbCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCustomersActionPerformed
        ventanas = (CardLayout)this.PanelPrincipal.getLayout();
        ventanas.show(PanelPrincipal, "card3");
    }//GEN-LAST:event_btbCustomersActionPerformed

    private void btbStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbStockActionPerformed
        ventanas = (CardLayout)this.PanelPrincipal.getLayout();
        ventanas.show(PanelPrincipal, "card6");
    }//GEN-LAST:event_btbStockActionPerformed

    private void btbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbVolverActionPerformed
        ventanas = (CardLayout)this.PanelPrincipal.getLayout();
        ventanas.show(PanelPrincipal, "card4");
    }//GEN-LAST:event_btbVolverActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new ViewPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel ViewCustomer;
    private javax.swing.JPanel ViewPrincipal;
    private javax.swing.JPanel ViewProducts;
    private javax.swing.JPanel ViewStock;
    private javax.swing.JPanel ViewSuppliers;
    private javax.swing.JButton btbCustomers;
    private javax.swing.JButton btbProducts;
    private javax.swing.JButton btbStock;
    private javax.swing.JButton btbSuppliers;
    private javax.swing.JButton btbVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
