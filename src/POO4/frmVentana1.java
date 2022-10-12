
package POO4;

public class frmVentana1 extends javax.swing.JFrame {

    private static void inicializar() 
    {
        for(int i=0 ; i < 20 ;i++) deporte[i] = new Deporte();
    }

    /**
     * Creates new form frmVentana1
     */
    public frmVentana1() 
    {
        initComponents();
    }
    
    public static Deporte[] deporte = new Deporte[20];
    public static int contador = 21;
    int equipoEliminado = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfCancha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTiempo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfInstrumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbnBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbnAgregar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbnEliminar = new javax.swing.JButton();
        jbnLimpiar = new javax.swing.JButton();
        jtfJugador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfCancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCanchaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Medida de la Cancha");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Tiempo del Partido");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Instrumentos");

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Introduzca los valores");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jbnBuscar.setText("Buscar");
        jbnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBuscarActionPerformed(evt);
            }
        });

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnBuscar)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Deportes");

        jbnAgregar.setText("Agregar");
        jbnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAgregarActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jbnEliminar.setText("Eliminar");
        jbnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarActionPerformed(evt);
            }
        });

        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Numero de Jugadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel1)
                .addGap(82, 365, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(118, 118, 118)
                                .addComponent(jtfNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfInstrumento)
                                    .addComponent(jtfTiempo)
                                    .addComponent(jtfCancha)
                                    .addComponent(jtfJugador))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbnEliminar)
                            .addComponent(jbnAgregar)
                            .addComponent(jbnLimpiar))
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfCancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbnEliminar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbnLimpiar)))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCanchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCanchaActionPerformed

    private void jbnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnBuscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_jbnBuscarActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAgregarActionPerformed
        // TODO add your handling code here:
        if(contador!=21){
            agregar();
        }else{
            contador=0;
            agregar();
        }
        limpiar();
    }//GEN-LAST:event_jbnAgregarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        limpiar();
    }//GEN-LAST:event_jbnEliminarActionPerformed

    private void jbnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        inicializar();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnAgregar;
    private javax.swing.JButton jbnBuscar;
    private javax.swing.JButton jbnEliminar;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfCancha;
    private javax.swing.JTextField jtfInstrumento;
    private javax.swing.JTextField jtfJugador;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTiempo;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
            
            String name = jtfNombre.getText();
            deporte[contador].setNombre(name);
            try
            {
                int player = Integer.parseInt(jtfJugador.getText());
                deporte[contador].setNumeroJugadores(player);
            }catch(NumberFormatException e)
                {
                     System.out.println("No pusiste un valor decimal");
                }
            
            try
            {
                float field = Float.parseFloat(jtfCancha.getText());
                deporte[contador].setMedidaCancha(field);
            }catch(NumberFormatException e)
                { 
                    System.out.println("No pusiste un valor decimal");
                }
            try
            {
                double time = Double.parseDouble(jtfTiempo.getText());
                deporte[contador].setTiempo(time);       
            }catch(NumberFormatException e)
                {
                    System.out.println("no pusiste un valor decimal double");
                }
            
 
            String instrument = jtfInstrumento.getText();
            deporte[contador].setInstrumento(instrument);
           contador++;
    }

    private void limpiar() 
    {
        jtfNombre.setText("");
        jtfJugador.setText("");
        jtfCancha.setText("");
        jtfTiempo.setText("");
        jtfInstrumento.setText("");
        jtfNombre.requestFocus();
    }

    private void buscar()
    {
        for(int i = 0 ; i < contador ; i++)
        {
            if(deporte[i].getNombre().equals(jtfBuscar.getText())) //El atributo al que vamos a buscar es el Nombre
            {
                jtfNombre.setText(deporte[i].getNombre());
                jtfJugador.setText(String.valueOf(deporte[i].getNumeroJugadores()));
                jtfCancha.setText(String.valueOf(deporte[i].getMedidaCancha()));
                jtfTiempo.setText(String.valueOf(deporte[i].getTiempo()));
                jtfInstrumento.setText(deporte[i].getIntrumento());
                equipoEliminado = i;
                break; 
            }
            else 
                System.out.println("No se encontro el Atributo ");  
        }
    }

    private void eliminar() {
        buscar(); //Metodo buscar el atributo para despues recorrerlo
        
        for(int i = equipoEliminado; i < contador ; i++)//Para recorrer el arreglo
        {
            deporte[i].setNombre(deporte[i + 1].getNombre());
            deporte[i].setNumeroJugadores(deporte[i + 1].getNumeroJugadores());
            deporte[i].setMedidaCancha(deporte[i + 1].getMedidaCancha());
            deporte[i].setTiempo(deporte[i + 1].getTiempo());
            deporte[i].setInstrumento(deporte[i + 1].getIntrumento());
        }
    }
}