package estudiante;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class InternalFrameEstudiante extends javax.swing.JInternalFrame {

    ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
   
    public InternalFrameEstudiante() {
        initComponents();
        setTitle("Registro de estudiante");
        
        
    }
    
     private void limpiarCampos() {
        this.jtxtCarnet.setText("");
        this.jtxtNombre.setText("");
        this.jtxtApellido.setText("");
        this.jtxtCarrera.setText("");
        this.jtxtNivel.setText("");
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtNivel = new javax.swing.JTextField();
        jtxtCarrera = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCarnet = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaMostrar = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnVerEstudiante = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Datos Estudiante");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Carnet :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Nombre :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Apellido :");
        jLabel2.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Carrera :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Nivel :");

        jtxtNivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNivel.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNivel.setText("Escribe tu nivel...");
        jtxtNivel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNivelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNivelFocusLost(evt);
            }
        });

        jtxtCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCarrera.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCarrera.setText("Escribe tu carrera...");
        jtxtCarrera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCarreraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCarreraFocusLost(evt);
            }
        });

        jtxtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtApellido.setForeground(new java.awt.Color(153, 153, 153));
        jtxtApellido.setText("Escribe tus apellidos...");
        jtxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusLost(evt);
            }
        });

        jtxtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombre.setText("Escribe tus nombres...");
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });

        jtxtCarnet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCarnet.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCarnet.setText("Escribe tu carnet...");
        jtxtCarnet.setToolTipText("");
        jtxtCarnet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCarnetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCarnetFocusLost(evt);
            }
        });
        jtxtCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCarnetActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jtxtAreaMostrar.setColumns(20);
        jtxtAreaMostrar.setRows(5);
        jScrollPane1.setViewportView(jtxtAreaMostrar);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVerEstudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVerEstudiante.setForeground(new java.awt.Color(0, 0, 255));
        btnVerEstudiante.setText("Ver Estudiante");
        btnVerEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnVerEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jtxtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNivelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNivelFocusGained
        // TODO add your handling code here:
        if (jtxtNivel.getText().trim().equals("Escribe tu nivel...")) {
            jtxtNivel.setText("");
        }
        jtxtNivel.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jtxtNivelFocusGained

    private void jtxtNivelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNivelFocusLost
        // TODO add your handling code here:
        if (jtxtNivel.getText().trim().equals("")) {
            jtxtNivel.setText("Escribe tu nivel...");
        }
        jtxtNivel.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jtxtNivelFocusLost

    private void jtxtCarreraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCarreraFocusGained
        // TODO add your handling code here:
        if (jtxtCarrera.getText().trim().equals("Escribe tu carrera...")) {
            jtxtCarrera.setText("");
        }
        jtxtCarrera.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jtxtCarreraFocusGained

    private void jtxtCarreraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCarreraFocusLost
        // TODO add your handling code here:
        if (jtxtCarrera.getText().trim().equals("")) {
            jtxtCarrera.setText("Escribe tu carrera...");
        }
        jtxtCarrera.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jtxtCarreraFocusLost

    private void jtxtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusGained
        // TODO add your handling code here:
        if (jtxtApellido.getText().trim().equals("Escribe tus apellidos...")) {
            jtxtApellido.setText("");
        }
        jtxtApellido.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jtxtApellidoFocusGained

    private void jtxtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusLost
        // TODO add your handling code here:
        if (jtxtApellido.getText().trim().equals("")) {
            jtxtApellido.setText("Escribe tus apellidos...");
        }
        jtxtApellido.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jtxtApellidoFocusLost

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        // TODO add your handling code here:
        if (jtxtNombre.getText().trim().equals("Escribe tus nombres...")) {
            jtxtNombre.setText("");
        }
        jtxtNombre.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        // TODO add your handling code here:
        if (jtxtNombre.getText().trim().equals("")) {
            jtxtNombre.setText("Escribe tus nombres...");
        }
        jtxtNombre.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtCarnetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCarnetFocusGained
        // TODO add your handling code here:
        if (jtxtCarnet.getText().trim().equals("Escribe tu carnet...")) {
            jtxtCarnet.setText("");
            jtxtCarnet.setForeground(new Color(153,153,153));
        }
        jtxtCarnet.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_jtxtCarnetFocusGained

    private void jtxtCarnetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCarnetFocusLost
        // TODO add your handling code here:
        if (jtxtCarnet.getText().trim().equals("")) {
            jtxtCarnet.setText("Escribe tu carnet...");
        }
        jtxtCarnet.setForeground(new Color(153, 153, 153));

    }//GEN-LAST:event_jtxtCarnetFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String carneT = this.jtxtCarnet.getText();
        String nombrE = this.jtxtNombre.getText();
        String apellidO = this.jtxtApellido.getText();
        String carrerA = this.jtxtCarrera.getText();
        String niveL = this.jtxtNivel.getText();
        try {
            double car = Double.parseDouble(carneT);
            Estudiante estudiante = new Estudiante(car, nombrE, apellidO, carrerA, niveL);
            this.listaEstudiante.add(estudiante);
            this.limpiarCampos();
            JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo datos no se han agregado", "ERROR",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Este metodo esta aqui porque necesito limpiar los campos de los JTextField.
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVerEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudianteActionPerformed
        // TODO add your handling code here:
        String lE = "";
        for (Estudiante es : listaEstudiante) {
            lE += es.getNombre() + " " + es.getApellido() + "\n";
        }
        this.jtxtAreaMostrar.setText(lE);
    }//GEN-LAST:event_btnVerEstudianteActionPerformed

    private void jtxtCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCarnetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVerEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextArea jtxtAreaMostrar;
    private javax.swing.JTextField jtxtCarnet;
    private javax.swing.JTextField jtxtCarrera;
    private javax.swing.JTextField jtxtNivel;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
