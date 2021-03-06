/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import clases.Cliente;
import clases.Factura;
import clases.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author derhe
 */
public class SistemaFacturacionView extends javax.swing.JFrame {

    /**
     * Creates new form SistemaFacturacionView
     */
    public SistemaFacturacionView() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmpresa = new javax.swing.JPanel();
        jLabelNombreEmpresa = new javax.swing.JLabel();
        jLabelNumeroFactura = new javax.swing.JLabel();
        jLabelFechaFactura = new javax.swing.JLabel();
        jTextFieldNumeroFactura = new javax.swing.JTextField();
        jTextFieldFechaFactura = new javax.swing.JTextField();
        jPanelCliente = new javax.swing.JPanel();
        jLabelDatosCliente = new javax.swing.JLabel();
        jLabelIdCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelTelefonoCliente = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldTelefonoCliente = new javax.swing.JTextField();
        jLabelApellidoCliente = new javax.swing.JLabel();
        jTextFieldApellidoCliente = new javax.swing.JTextField();
        jPanelProducto = new javax.swing.JPanel();
        jLabelTituloProducto = new javax.swing.JLabel();
        jLabelCodigoProducto = new javax.swing.JLabel();
        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelValorProducto = new javax.swing.JLabel();
        jTextFieldCodigoProducto = new javax.swing.JTextField();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jTextFieldValorProducto = new javax.swing.JTextField();
        jLabelCantidadProducto = new javax.swing.JLabel();
        jTextFieldCantidadProducto = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jLabelSubTotal = new javax.swing.JLabel();
        jButtonGuardarProducto = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelCrearFactura = new javax.swing.JPanel();
        jLabelCrearFactura = new javax.swing.JLabel();
        jTextFieldTotalFactura = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButtonGuardarFactura = new javax.swing.JButton();
        jButtonLimpiarFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelEmpresa.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNombreEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombreEmpresa.setForeground(new java.awt.Color(0, 51, 102));
        jLabelNombreEmpresa.setText("INVERSIONES CICLO 2 JAVA");

        jLabelNumeroFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNumeroFactura.setText("Numero Factura:");

        jLabelFechaFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFechaFactura.setText("Fecha Factura:");

        javax.swing.GroupLayout jPanelEmpresaLayout = new javax.swing.GroupLayout(jPanelEmpresa);
        jPanelEmpresa.setLayout(jPanelEmpresaLayout);
        jPanelEmpresaLayout.setHorizontalGroup(
            jPanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpresaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabelNumeroFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNombreEmpresa)
                    .addGroup(jPanelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabelFechaFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEmpresaLayout.setVerticalGroup(
            jPanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreEmpresa)
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroFactura)
                    .addComponent(jTextFieldNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaFactura))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDatosCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelDatosCliente.setForeground(new java.awt.Color(0, 51, 102));
        jLabelDatosCliente.setText("Datos del cliente");

        jLabelIdCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelIdCliente.setText("ID cliente:");

        jLabelNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombreCliente.setText("Nombre:");

        jLabelTelefonoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefonoCliente.setText("Telefono:");

        jLabelApellidoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelApellidoCliente.setText("Apellido:");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIdCliente)
                                    .addComponent(jLabelNombreCliente))
                                .addGap(100, 100, 100)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombreCliente)))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabelTelefonoCliente)
                                .addGap(104, 104, 104)
                                .addComponent(jTextFieldTelefonoCliente))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabelApellidoCliente)
                                .addGap(109, 109, 109)
                                .addComponent(jTextFieldApellidoCliente))))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabelDatosCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelDatosCliente)
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelIdCliente)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellidoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefonoCliente))
                .addGap(26, 26, 26))
        );

        jPanelProducto.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloProducto.setForeground(new java.awt.Color(0, 51, 102));
        jLabelTituloProducto.setText("Ingrese Un Producto");

        jLabelCodigoProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCodigoProducto.setText("C??digo:");

        jLabelNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombreProducto.setText("Nombre:");

        jLabelValorProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValorProducto.setText("Valor:");

        jLabelCantidadProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCantidadProducto.setText("Cantidad");

        jTextFieldSubTotal.setEditable(false);
        jTextFieldSubTotal.setText("0");

        jLabelSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSubTotal.setText("SubTotal:");

        jButtonGuardarProducto.setText("Guardar");
        jButtonGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarProductoActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProductoLayout = new javax.swing.GroupLayout(jPanelProducto);
        jPanelProducto.setLayout(jPanelProductoLayout);
        jPanelProductoLayout.setHorizontalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabelTituloProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductoLayout.createSequentialGroup()
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addComponent(jLabelCodigoProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addComponent(jLabelValorProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonGuardarProducto)
                                    .addComponent(jTextFieldValorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductoLayout.createSequentialGroup()
                                    .addComponent(jLabelCantidadProducto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanelProductoLayout.createSequentialGroup()
                                    .addComponent(jLabelNombreProducto)
                                    .addGap(5, 5, 5)))
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductoLayout.createSequentialGroup()
                        .addComponent(jButtonLimpiar)
                        .addGap(74, 74, 74))))
        );
        jPanelProductoLayout.setVerticalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTituloProducto)
                .addGap(18, 18, 18)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoProducto)
                    .addComponent(jTextFieldCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorProducto)
                    .addComponent(jTextFieldCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidadProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarProducto)
                    .addComponent(jButtonLimpiar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelCrearFactura.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCrearFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCrearFactura.setForeground(new java.awt.Color(0, 51, 102));
        jLabelCrearFactura.setText("Crear Factura");

        jTextFieldTotalFactura.setEditable(false);
        jTextFieldTotalFactura.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Total Factura:");

        jButtonGuardarFactura.setText("Guardar");
        jButtonGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarFacturaActionPerformed(evt);
            }
        });

        jButtonLimpiarFactura.setText("Limpiar");
        jButtonLimpiarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearFacturaLayout = new javax.swing.GroupLayout(jPanelCrearFactura);
        jPanelCrearFactura.setLayout(jPanelCrearFacturaLayout);
        jPanelCrearFacturaLayout.setHorizontalGroup(
            jPanelCrearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearFacturaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButtonGuardarFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButtonLimpiarFactura)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCrearFactura)
                .addGap(127, 127, 127))
            .addGroup(jPanelCrearFacturaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCrearFacturaLayout.setVerticalGroup(
            jPanelCrearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearFacturaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelCrearFactura)
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarFactura)
                    .addComponent(jButtonLimpiarFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCrearFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        ArrayList<Producto> productos = new ArrayList<>();
    private void jButtonGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarProductoActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldCodigoProducto.getText();
        String nombre = jTextFieldNombreProducto.getText();
        try {
            double precio = Double.valueOf( jTextFieldValorProducto.getText());
            int cantidad = Integer.valueOf(jTextFieldCantidadProducto.getText());
            Producto producto = new Producto(id, nombre, precio, cantidad);
            double subTotal = 0;
            subTotal = subTotal + precio * cantidad;
            productos.add(producto);
            jTextFieldSubTotal.setText(String.valueOf("$"+subTotal));

        } catch (Exception e) {
            jTextFieldCantidadProducto.setText("");
            jTextFieldNombreProducto.setText("");
            jTextFieldCodigoProducto.setText("");
            jTextFieldValorProducto.setText("");
            JOptionPane.showMessageDialog(rootPane, "El precio y la cantidad deben ser numericos");
        }
        
        
        
    }//GEN-LAST:event_jButtonGuardarProductoActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        // int limpiar = JOptionPane.showConfirmDialog(null, "Desea Limpiar los campos?",
            //   "Validacion", JOptionPane.OK_CANCEL_OPTION,
               // JOptionPane.INFORMATION_MESSAGE);
        // if(limpiar == 0){
            jTextFieldCantidadProducto.setText("");
            jTextFieldNombreProducto.setText("");
            jTextFieldCodigoProducto.setText("");
            jTextFieldValorProducto.setText("");
       //  }
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarFacturaActionPerformed
        // TODO add your handling code here:
        //ArrayList<Producto> productos1 = productos;
        Producto [] allProductos = new Producto[productos.size()];
        for (int i = 0; i < productos.size(); i++) {
            allProductos[i] = productos.get(i);
        }
        String numeroFactura = jTextFieldNumeroFactura.getText();
        String fechaFactura = jTextFieldFechaFactura.getText();
        String idCliente = jTextFieldIdCliente.getText();
        String nombreCliente = jTextFieldNombreCliente.getText();
        String apellidoCLiente = jTextFieldApellidoCliente.getText();
        String Telefono = jTextFieldTelefonoCliente.getText();
        try {
            Cliente cliente = new Cliente(idCliente, nombreCliente, apellidoCLiente, Telefono);
            Factura factura = new Factura(numeroFactura, fechaFactura, cliente, allProductos);
            factura.calcularTotal(allProductos);
            String total = String.valueOf("$"+factura.getTotal());
            jTextFieldTotalFactura.setText(total);
            //creacion de nueva instancia de ImprimirFactura
            ImprimirFactura imprimir = new ImprimirFactura();
            imprimir.setVisible(true);
            this.dispose();
            //envio de datos a campos del formulario en ventana Imprimir factura
            imprimir.jTextFieldNumeroFactura.setText(jTextFieldNumeroFactura.getText());
            imprimir.jTextFieldFechaFactura.setText(jTextFieldFechaFactura.getText());
            imprimir.jTextFieldNombreCliente.setText(jTextFieldIdCliente.getText());
            imprimir.jTextFieldApellidoCliente.setText(jTextFieldNombreCliente.getText());
            imprimir.jTextFieldTelefonCliente.setText(jTextFieldApellidoCliente.getText());
            JTextField [] id ={imprimir.jTextFieldIdProducto1,imprimir.jTextFieldIdProducto2,imprimir.jTextFieldIdProducto3,
                               imprimir.jTextFieldIdProducto4,imprimir.jTextFieldIdProducto5,imprimir.jTextFieldIdProducto6,
                               imprimir.jTextFieldIdProducto7,imprimir.jTextFieldIdProducto8,imprimir.jTextFieldIdProducto9,
                               imprimir.jTextFieldIdProducto10};
            JTextField [] nombre ={imprimir.jTextFieldNombreProducto1,imprimir.jTextFieldNombreProducto2,imprimir.jTextFieldNombreProducto3,
                                   imprimir.jTextFieldNombreProducto4,imprimir.jTextFieldNombreProducto5,imprimir.jTextFieldNombreProducto6,
                                   imprimir.jTextFieldNombreProducto7,imprimir.jTextFieldNombreProducto8,imprimir.jTextFieldNombreProducto9,
                                   imprimir.jTextFieldNombreProducto10};
            JTextField [] cantidad ={imprimir.jTextFieldCantidadProducto1,imprimir.jTextFieldCantidadProducto2,imprimir.jTextFieldCantidadProducto3,
                                     imprimir.jTextFieldCantidadProducto4,imprimir.jTextFieldCantidadProducto5,imprimir.jTextFieldCantidadProducto6,
                                     imprimir.jTextFieldCantidadProducto7,imprimir.jTextFieldCantidadProducto8,imprimir.jTextFieldCantidadProducto9,
                                     imprimir.jTextFieldCantidadProducto10};
            JTextField [] precio ={imprimir.jTextFieldValorProducto1,imprimir.jTextFieldValorProducto2,imprimir.jTextFieldValorProducto3,
                                   imprimir.jTextFieldValorProducto4,imprimir.jTextFieldValorProducto5,imprimir.jTextFieldValorProducto6,
                                   imprimir.jTextFieldValorProducto7,imprimir.jTextFieldValorProducto8,imprimir.jTextFieldValorProducto9,
                                   imprimir.jTextFieldValorProducto10};
            JTextField [] subTotal ={imprimir.jTextFieldSubTotalProducto1,imprimir.jTextFieldSubTotalProducto2,imprimir.jTextFieldSubTotalProducto3,
                                   imprimir.jTextFieldSubTotalProducto4,imprimir.jTextFieldSubTotalProducto5,imprimir.jTextFieldSubTotalProducto6,
                                   imprimir.jTextFieldSubTotalProducto7,imprimir.jTextFieldSubTotalProducto8,imprimir.jTextFieldSubTotalProducto9,
                                   imprimir.jTextFieldSubTotalProducto10};
            for(int i = 0; i<allProductos.length; i++){
                id[i].setText(allProductos[i].getId());
                nombre[i].setText(allProductos[i].getNombre());
                cantidad[i].setText(String.valueOf(allProductos[i].getCantidad()));
                precio[i].setText(String.valueOf("$"+allProductos[i].getPrecio()));
                subTotal[i].setText(String.valueOf("$"+(allProductos[i].getCantidad()*allProductos[i].getPrecio())));
            }
            imprimir.jTextFieldTotal.setText(total);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonGuardarFacturaActionPerformed

    private void jButtonLimpiarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarFacturaActionPerformed
        // TODO add your handling code here:
        int limpiarFactura = JOptionPane.showConfirmDialog(null, "si limpia la factura se perderan los datos de los productos ingresados, ??desea continuar?",
        "Esta seguro de limpiar la Factura?", JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE);
        
        if (limpiarFactura == 0) {
            jTextFieldCantidadProducto.setText("");
            jTextFieldNombreProducto.setText("");
            jTextFieldCodigoProducto.setText("");
            jTextFieldValorProducto.setText("");
            jTextFieldSubTotal.setText("");
            jTextFieldNumeroFactura.setText("");
            jTextFieldFechaFactura.setText("");
            jTextFieldIdCliente.setText("");
            jTextFieldNombreCliente.setText("");
            jTextFieldApellidoCliente.setText("");
            jTextFieldTelefonoCliente.setText("");
            jTextFieldTotalFactura.setText("");
            productos.clear();
        }
    }//GEN-LAST:event_jButtonLimpiarFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaFacturacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaFacturacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaFacturacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaFacturacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaFacturacionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarFactura;
    private javax.swing.JButton jButtonGuardarProducto;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLimpiarFactura;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabelApellidoCliente;
    private javax.swing.JLabel jLabelCantidadProducto;
    private javax.swing.JLabel jLabelCodigoProducto;
    private javax.swing.JLabel jLabelCrearFactura;
    private javax.swing.JLabel jLabelDatosCliente;
    private javax.swing.JLabel jLabelFechaFactura;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreEmpresa;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JLabel jLabelNumeroFactura;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTelefonoCliente;
    private javax.swing.JLabel jLabelTituloProducto;
    private javax.swing.JLabel jLabelValorProducto;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelCrearFactura;
    private javax.swing.JPanel jPanelEmpresa;
    private javax.swing.JPanel jPanelProducto;
    public javax.swing.JTextField jTextFieldApellidoCliente;
    public javax.swing.JTextField jTextFieldCantidadProducto;
    public javax.swing.JTextField jTextFieldCodigoProducto;
    public javax.swing.JTextField jTextFieldFechaFactura;
    public javax.swing.JTextField jTextFieldIdCliente;
    public javax.swing.JTextField jTextFieldNombreCliente;
    public javax.swing.JTextField jTextFieldNombreProducto;
    public javax.swing.JTextField jTextFieldNumeroFactura;
    public javax.swing.JTextField jTextFieldSubTotal;
    public javax.swing.JTextField jTextFieldTelefonoCliente;
    public javax.swing.JTextField jTextFieldTotalFactura;
    public javax.swing.JTextField jTextFieldValorProducto;
    // End of variables declaration//GEN-END:variables
}
