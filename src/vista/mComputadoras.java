/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexionSQL.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class mComputadoras extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    
    
    public mComputadoras() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        mostrarDatos();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMemoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxWindows = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxArquitectura = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDatos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPUTADORAS");

        jLabel2.setText("MODELO:");

        jLabel3.setText("MARCA:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Escritorio", "Notebook" }));

        jLabel4.setText("TIPO:");

        jLabel5.setText("PROCESADOR:");

        jLabel6.setText("MEMORIA:");

        cbxWindows.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Windows XP", "Windows 7", "Windows 8", "Windows 10", "Linux", " " }));

        jLabel7.setText("WINDOWS:");

        cbxArquitectura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "x32 Bits", "x64 Bits", "x86 Bits", "No se sabe" }));

        jLabel8.setText("ARQUITECTURA:");

        jLabel9.setText("RESPONSABLE:");

        jLabel10.setText("SECTOR:");

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("ACTUALIZAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.setPreferredSize(new java.awt.Dimension(86, 50));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel11.setText("BUSCAR NOMBRE");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel12.setText("IP:");

        jLabel13.setText("NOMBRE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(792, 792, 792))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSector)
                                    .addComponent(txtResponsable)
                                    .addComponent(cbxArquitectura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxWindows, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMemoria)
                                    .addComponent(txtProcesador)
                                    .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModelo)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(941, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxWindows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxArquitectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarDatos();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        actualizarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        int filaSeleccionada = jtDatos.rowAtPoint(evt.getPoint());

        txtNombre.setText(jtDatos.getValueAt(filaSeleccionada, 1).toString());
        txtIp.setText(jtDatos.getValueAt(filaSeleccionada, 2).toString());
        txtModelo.setText(jtDatos.getValueAt(filaSeleccionada, 3).toString());
        txtMarca.setText(jtDatos.getValueAt(filaSeleccionada, 4).toString());
        cbxTipo.setSelectedItem(jtDatos.getValueAt(filaSeleccionada, 5));
        txtProcesador.setText(jtDatos.getValueAt(filaSeleccionada, 6).toString());
        txtMemoria.setText(jtDatos.getValueAt(filaSeleccionada, 7).toString());
        cbxWindows.setSelectedItem(jtDatos.getValueAt(filaSeleccionada, 8));
        cbxArquitectura.setSelectedItem(jtDatos.getValueAt(filaSeleccionada, 9));
        txtResponsable.setText(jtDatos.getValueAt(filaSeleccionada, 10).toString());
        txtSector.setText(jtDatos.getValueAt(filaSeleccionada, 11).toString());
        
    }//GEN-LAST:event_jtDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        mInventario mi = new mInventario();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void actualizarDatos(){
        try {
            String SQL = "UPDATE computadoras SET nombrePC = ?,ipPC = ?,modelo = ?,marca = ?,tipo = ?,procesador = ?,memoria = ?,windows = ?,arquitectura = ?,responsable = ?,sector = ? WHERE id = ?";
            int filaSeleccionada = jtDatos.getSelectedRow();
            String dao = (String)jtDatos.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtIp.getText());
            pst.setString(3, txtModelo.getText());
            pst.setString(4, txtMarca.getText());
            int seleccionado = cbxTipo.getSelectedIndex();
            pst.setString(5, cbxTipo.getItemAt(seleccionado));
            pst.setString(6, txtProcesador.getText());
            pst.setString(7, txtMemoria.getText());
            int seleccionado1 = cbxWindows.getSelectedIndex();
            pst.setString(8, cbxWindows.getItemAt(seleccionado1));
            int seleccionado2 = cbxArquitectura.getSelectedIndex();
            pst.setString(9, cbxArquitectura.getItemAt(seleccionado2));
            pst.setString(10, txtResponsable.getText());
            pst.setString(11, txtSector.getText());
            pst.setString(12, dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a Actualizado Registro");
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void eliminarDatos(){
        int filaSeleccionada = jtDatos.getSelectedRow();
        try {
            String SQL = "DELETE FROM computadoras WHERE id = " + jtDatos.getValueAt(filaSeleccionada, 0);
            Statement st = con.createStatement();
            
            int n = st.executeUpdate(SQL);
            
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void filtrarDatos(String valor){
        String[] titulos = {"id","nombrePC","ipPC","modelo","marca","tipo","procesador","memoria","windows","arquitectura","responsable","sector"};
        String[] registro = new String[12];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM computadoras WHERE nombrePC LIKE '%"+valor+"%' OR ipPC LIKE '%"+valor+"%'OR sector LIKE '%"+valor+"%'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombrePC");
                registro[2] = rs.getString("ipPC");
                registro[3] = rs.getString("modelo");
                registro[4] = rs.getString("marca");
                registro[5] = rs.getString("tipo");
                registro[6] = rs.getString("procesador");
                registro[7] = rs.getString("memoria");
                registro[8] = rs.getString("windows");
                registro[9] = rs.getString("arquitectura");
                registro[10] = rs.getString("responsable");
                registro[11] = rs.getString("sector");
                modelo.addRow(registro);

            }
            jtDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void mostrarDatos(){
    
        String[] titulos = {"id","nombrePC","ipPC","modelo","marca","tipo","procesador","memoria","windows","arquitectura","responsable","sector"};
        String[] registro = new String [12];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM computadoras";
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while (rs.next()){
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombrePC");
                registro[2] = rs.getString("ipPC");
                registro[3] = rs.getString("modelo");
                registro[4] = rs.getString("marca");
                registro[5] = rs.getString("tipo");
                registro[6] = rs.getString("procesador");
                registro[7] = rs.getString("memoria");
                registro[8] = rs.getString("windows");
                registro[9] = rs.getString("arquitectura");
                registro[10] = rs.getString("responsable");
                registro[11] = rs.getString("sector");
                
                modelo.addRow(registro);
            }
            jtDatos.setModel(modelo);
                        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public void insertarDatos(){
        try {
            String SQL = "INSERT INTO computadoras (nombrePC,ipPC,modelo,marca,tipo,procesador,memoria,windows,arquitectura,responsable,sector) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtIp.getText());
            pst.setString(3, txtModelo.getText());
            pst.setString(4, txtMarca.getText());
                        
            int seleccionado = cbxTipo.getSelectedIndex();
            pst.setString(5, cbxTipo.getItemAt(seleccionado));
            
            pst.setString(6, txtProcesador.getText());
            pst.setString(7, txtMemoria.getText());
            
            int seleccionado2 = cbxWindows.getSelectedIndex();
            pst.setString(8, cbxWindows.getItemAt(seleccionado2));
            
            int seleccionado3 = cbxArquitectura.getSelectedIndex();
            pst.setString(9, cbxArquitectura.getItemAt(seleccionado3));
            
            pst.setString(10, txtResponsable.getText());
            pst.setString(11, txtSector.getText());

            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Existoso");
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la Impresora");
        }
    }
    
    public void limpiarDatos(){
        txtNombre.setText("");
        txtIp.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        cbxTipo.setSelectedItem("Seleccione");
        txtProcesador.setText("");
        txtMemoria.setText("");
        cbxWindows.setSelectedItem("Seleccione");
        cbxArquitectura.setSelectedItem("Seleccione");
        txtResponsable.setText("");
        txtSector.setText("");
        
    }
    
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
            java.util.logging.Logger.getLogger(mComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mComputadoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxArquitectura;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxWindows;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMemoria;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtSector;
    // End of variables declaration//GEN-END:variables
}
