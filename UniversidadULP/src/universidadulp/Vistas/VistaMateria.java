package universidadulp.Vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.acceso.MateriaDAO;
import universidadulp.entidades.Materia;

/**
 *
 * @author johan
 */
public class VistaMateria extends javax.swing.JInternalFrame {

    Materia materia = new Materia();
    MateriaDAO mdao = new MateriaDAO();
    MainAdministrador main = new MainAdministrador();

    /**
     * Creates new form VistaMateria
     */
    public VistaMateria() {
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

        panelBuscarMateria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMateriaId = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        radioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        buttonNuevo = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();

        jLabel1.setText("Ingrese ID Materia ");

        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarMateriaLayout = new javax.swing.GroupLayout(panelBuscarMateria);
        panelBuscarMateria.setLayout(panelBuscarMateriaLayout);
        panelBuscarMateriaLayout.setHorizontalGroup(
            panelBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarMateriaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtMateriaId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(buttonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarMateriaLayout.setVerticalGroup(
            panelBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarMateriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMateriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Año");

        jLabel4.setText("Estado");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpio.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        buttonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        buttonNuevo.setText("Nueva Materia");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });

        buttonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        buttonModificar.setText("Modificar Materia");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        buttonEliminar.setText("Eliminar Materia");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buttonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(buttonModificar)
                .addGap(18, 18, 18)
                .addComponent(buttonEliminar)
                .addGap(39, 39, 39))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuevo)
                    .addComponent(buttonModificar)
                    .addComponent(buttonEliminar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBuscarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        // BOTON BUSCAR MATERIA
        if (txtMateriaId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe indicar el ID de Materia");
        } else {
            if(main.esNumerico(txtMateriaId.getText())){
            try {
                materia = mdao.buscarMateria(Integer.parseInt(txtMateriaId.getText()));
                if (materia != null) {
                    cargarDatos(materia);
                } else {
                    JOptionPane.showMessageDialog(this, "El Id no existe en la Base de Datos");
                    borrarDatos();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            }else{
                JOptionPane.showMessageDialog(null, "Ingresa un ID correcto.");
                borrarDatos();
            }
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        // NUEVA MATERIA
        Materia mate = new Materia();
        mate.setNombre(txtNombre.getText());
        mate.setAnioMateria(Integer.parseInt(txtAño.getText()));
        if (radioButton.isSelected()) {
            mate.setEstado(true);
        } else {
            mate.setEstado(false);
        }
        if (validar()) {
            try {
                mdao.guardarMateria(mate);
                JOptionPane.showMessageDialog(this, " Materia cargada a la Base de datos");
                borrarDatos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, " No se pudo cargar la nueva Materia");
                Logger.getLogger(VistaMateria.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        // MODIFICAR MATERIA
        if (validar()) {
            try {
                mdao.modificarMateria(guardarDatos());
                JOptionPane.showMessageDialog(this, " Materia modificada ");
                borrarDatos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, " No se pudo modificar la Materia");
                System.out.println(ex.getMessage());
            }
        }
        borrarDatos();
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        // ELIMINAR MATERIA
        if (validar()) {
            try {
                if (mdao.eliminarMateria(Integer.parseInt(txtMateriaId.getText()))) {
                    JOptionPane.showMessageDialog(this, " Materia eliminada");
                    borrarDatos();
                } else {
                    JOptionPane.showMessageDialog(this, " La Materia tiene Inscripciones activas. No se puede eliminar");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // LIMPIAR
        borrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validar() { // VALIDAR QUE EL ID SEA ENTERO
        boolean valido = false;
        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Debe indicar el Nombre de la Materia");
        } else if (txtAño.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Debe indicar el Año de la Materia");
        } else if (!radioButton.isSelected()) {
            JOptionPane.showMessageDialog(this, " Debe indicar el Estado de la Materia");
        } else {
            valido = true;
        }
        return valido;
    }

    public void cargarDatos(Materia m) {
        txtMateriaId.setText(String.valueOf(m.getIdMateria()));
        txtNombre.setText(m.getNombre());
        txtAño.setText(String.valueOf(m.getAnioMateria()));
        if (m.isEstado()) {
            radioButton.setSelected(true);
        }
    }

    public void borrarDatos() {
        txtMateriaId.setText("");
        txtNombre.setText("");
        txtAño.setText("");
        radioButton.setSelected(false);
    }

    public Materia guardarDatos() {
        materia.setNombre(txtNombre.getText());
        materia.setAnioMateria(Integer.parseInt(txtAño.getText()));
        if (radioButton.isSelected()) {
            materia.setEstado(true);
        } else {
            materia.setEstado(false);
        }
        System.out.println(materia.toString());
        return materia;
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscarMateria;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JRadioButton radioButton;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtMateriaId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
