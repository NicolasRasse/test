package vista;

import conexionSQL.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mImpresoras extends javax.swing.JFrame {
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    
    public mImpresoras() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        mostrarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Modelo = new javax.swing.JTextField();
        txt_Marca = new javax.swing.JTextField();
        txt_Nserie = new javax.swing.JTextField();
        txt_Sector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Mostrar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        btn_Salir = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 750));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONITORES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("N° Serie:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sector:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        jt_Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_MostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Mostrar);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("BUSCAR POR NOMBRE:");

        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyReleased(evt);
            }
        });

        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_Atras.setText("ATRAS");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        btn_Nuevo.setText("NUEVO");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Modelo)
                            .addComponent(txt_Marca)
                            .addComponent(txt_Nserie)
                            .addComponent(txt_Sector)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Nuevo)
                            .addComponent(btn_Guardar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Actualizar)
                            .addComponent(btn_Eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        insertarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void jt_MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_MostrarMouseClicked
        int filaSeleccionada = jt_Mostrar.rowAtPoint(evt.getPoint());
        txt_Nombre.setText(jt_Mostrar.getValueAt(filaSeleccionada, 1).toString());
        txt_Modelo.setText(jt_Mostrar.getValueAt(filaSeleccionada, 2).toString());
        txt_Marca.setText(jt_Mostrar.getValueAt(filaSeleccionada, 3).toString());
        txt_Nserie.setText(jt_Mostrar.getValueAt(filaSeleccionada, 4).toString());
        txt_Sector.setText(jt_Mostrar.getValueAt(filaSeleccionada, 5).toString());
    }//GEN-LAST:event_jt_MostrarMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        eliminarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        actualizarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        mInventario mi = new mInventario();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void txt_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyReleased
       filtrarDatos(txt_Buscar.getText());
    }//GEN-LAST:event_txt_BuscarKeyReleased

    
    
    public void actualizarDatos(){
        try {
            String SQL = "UPDATE monitores SET nombre = ?, modelo = ?, marca = ?, nserie = ?, sector = ? WHERE idmonitores = ?";
            int filaSeleccionada = jt_Mostrar.getSelectedRow();
            String dao = (String)jt_Mostrar.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txt_Nombre.getText());
            pst.setString(2, txt_Modelo.getText());
            pst.setString(3, txt_Marca.getText());
            pst.setString(4, txt_Nserie.getText());
            pst.setString(5, txt_Sector.getText());
            pst.setString(6, dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a Actualizado Registro");
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void mostrarDatos(){
        String[] titulos = {"idmonitores","nombre","modelo","marca","nserie","sector"};
        String[] registro = new String [6];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM monitores";
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while (rs.next()){
                registro[0] = rs.getString("idmonitores");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("modelo");
                registro[3] = rs.getString("marca");
                registro[4] = rs.getString("nserie");
                registro[5] = rs.getString("sector");
                
                modelo.addRow(registro);
            }
            jt_Mostrar.setModel(modelo);
                        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    public void eliminarDatos(){
        int filaSeleccionada = jt_Mostrar.getSelectedRow();
        try {
            String SQL = "DELETE FROM monitores WHERE idmonitores = " + jt_Mostrar.getValueAt(filaSeleccionada, 0);
            Statement st = con.createStatement();
            
            int n = st.executeUpdate(SQL);
            
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    public void insertarDatos(){
        try {
            String SQL = "INSERT INTO monitores(nombre,modelo,marca,nserie,sector) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txt_Nombre.getText());
            pst.setString(2, txt_Modelo.getText());
            pst.setString(3, txt_Marca.getText());
            pst.setString(4, txt_Nserie.getText());
            pst.setString(5, txt_Sector.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Existoso");
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la Impresora");
        }
    }
    public void limpiarDatos() {
        txt_Nombre.setText("");
        txt_Marca.setText("");
        txt_Modelo.setText("");
        txt_Nserie.setText("");
        txt_Sector.setText("");
    
    }
    public void filtrarDatos(String valor){
        String[] titulos = {"Id", "Nombre", "Marca", "Modelo", "N° Serie", "Sector"};
        String[] registro = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM monitores WHERE nombre LIKE '%"+valor+"%' OR sector LIKE '%"+valor+"%'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registro[0] = rs.getString("idmonitores");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("marcas");
                registro[3] = rs.getString("modelo");
                registro[4] = rs.getString("nserie");
                registro[5] = rs.getString("sector");

                modelo.addRow(registro);

            }
            jt_Mostrar.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(mImpresoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mImpresoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mImpresoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mImpresoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mImpresoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_Mostrar;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nserie;
    private javax.swing.JTextField txt_Sector;
    // End of variables declaration//GEN-END:variables
}
