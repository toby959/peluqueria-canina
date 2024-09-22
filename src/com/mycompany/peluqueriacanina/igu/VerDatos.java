package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.awt.Color;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

// Buena practica -null-
    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        setUndecorated(true);
        initComponents();
        btnEliminar.setBackground(new Color(223, 32, 32));
        btnEditar.setBackground(new Color(179, 77, 179));
        btnVolver.setBackground(new Color(128, 170, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(185, 137, 44));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Toby959", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 11), new java.awt.Color(51, 255, 51))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 600));

        jLabel1.setFont(new java.awt.Font("Dosis ExtraBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 87, 3));
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBackground(new java.awt.Color(153, 213, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setBackground(new java.awt.Color(152, 188, 14));
        tablaMascotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaMascotas.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        tablaMascotas.setForeground(new java.awt.Color(0, 0, 0));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMascotas.setGridColor(new java.awt.Color(187, 187, 226));
        tablaMascotas.setSelectionBackground(new java.awt.Color(217, 62, 163));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos de Mascotas:");

        btnEliminar.setBackground(new java.awt.Color(157, 161, 158));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\curso_allura\\PeluqueriaCanina\\src\\com\\mycompany\\peluqueriacanina\\assets\\basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(157, 161, 158));
        btnEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\curso_allura\\PeluqueriaCanina\\src\\com\\mycompany\\peluqueriacanina\\assets\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(157, 161, 158));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\curso_allura\\PeluqueriaCanina\\src\\com\\mycompany\\peluqueriacanina\\assets\\volver.png")); // NOI18N
        btnVolver.setText("Volver al Inicio");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolverMouseReleased(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(143, 143, 143)
                        .addComponent(btnEditar)
                        .addGap(129, 129, 129)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// Controlo que la tabla no este vacia        
        if(tablaMascotas.getRowCount() > 0) {
// Controlo que se haya seleccionado una mascota            
          if(tablaMascotas.getSelectedRow()!= -1) {
// Obtengo id de la mascota a eliminar              
              int num_cliente = Integer.parseInt(String.valueOf(
                      tablaMascotas.getValueAt(
                              tablaMascotas.getSelectedRow(), 0)));
         control.borrarMascota(num_cliente);
         
         mostrarMensaje("Mascota eliminada correctamente", "Info",
                 "Borrado de Mascota");
         cargarTabla();
         
          } else {
              mostrarMensaje("No seleccionó ninguna Mascota", "Error",
                      "Error al Eliminar");
          }
        } else {
            mostrarMensaje("No hay nada para eliminar en la Tabla",
                    "Error", "Error al Eliminar!!!");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
// Controlo que la tabla no este vacia        
        if (tablaMascotas.getRowCount() > 0) {
// Controlo que se haya seleccionado una mascota            
            if (tablaMascotas.getSelectedRow() != -1) {

// Obtengo id de la mascota a editar  
                int num_cliente = Integer.parseInt(String.valueOf(
                        tablaMascotas.getValueAt(
                                tablaMascotas.getSelectedRow(), 0)));
            
            ModificarDatos pantallaModif =  new ModificarDatos(num_cliente);
            pantallaModif.setVisible(true);
            pantallaModif.setLocationRelativeTo(null);
            
             this.dispose();
         
            } else {
                mostrarMensaje("No seleccionó ninguna Mascota", "Error",
                        "Error al Eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la Tabla",
                    "Error", "Error al Eliminar!!!");
        }
   
       
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        Color myColor = new Color(242, 13, 13);
        btnEliminar.setBackground(myColor);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(223, 32, 32));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
         try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
       Color myColor = new Color(236, 19, 236);
        btnEditar.setBackground(myColor);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(179, 77, 179));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
       try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
         Color myColor = new Color(51, 119, 255);
        btnVolver.setBackground(myColor);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
       btnVolver.setBackground(new Color(128, 170, 255));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseReleased
          try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverMouseReleased

    
    
    
    
    
    
    
// Refactorizar mensajes 
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equals("Info")) {
        
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equals("Error")) {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }    
       
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
// Modelo definido de nuestra tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
// Las filas y columnas no sean editables  
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
// Establecemos nombres de las columnas [--"Num", Eliminamos id de la Tabla--]        
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico",
            "At. Esp.", "Dueño", "Cel. Dueño"};
        modeloTabla.setColumnIdentifiers(titulos);
// Carga de datos de DB        
        List<Mascota> listaMascotas = control.traerMascotas();

// Recorrer la lista y mostrar cada elemento en la tabla         
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                // --[ masco.getNum_cliente(), Eliminamos id de la Tabla]
                Object[] objeto = {masco.getNum_cliente(),masco.getNombre(),
                    masco.getColor(), masco.getRaza(), masco.getAlergico(),
                    masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                    masco.getUnDuenio().getCelDuenio()};

                modeloTabla.addRow(objeto);
            }

        }
        tablaMascotas.setModel(modeloTabla);
//################

// Ocultar la columna "Num" (índice 0)
  if (tablaMascotas.getColumnCount() > 0) {
tablaMascotas.getColumnModel().getColumn(0).setMinWidth(0);
tablaMascotas.getColumnModel().getColumn(0).setMaxWidth(0);
tablaMascotas.getColumnModel().getColumn(0).setWidth(0);

//################
        
  }
        
          
    }
        
}

