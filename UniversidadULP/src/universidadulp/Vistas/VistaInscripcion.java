package universidadulp.Vistas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.acceso.AlumnoDAO;
import universidadulp.acceso.InscripcionDAO;
import universidadulp.acceso.MateriaDAO;
import universidadulp.entidades.*;

/**
 *
 * @author johan
 */
public class VistaInscripcion extends javax.swing.JInternalFrame {
   private DefaultTableModel modelo = new DefaultTableModel();
    InscripcionDAO insdao = new InscripcionDAO();
    Alumno a ;
    AlumnoDAO alumndao = new AlumnoDAO();
    ArrayList<Alumno> listaAlumno;
    Materia m;
    MateriaDAO mdao = new MateriaDAO();
    List<Materia> listaMaterias;
    /**
     * Creates new form VistaInscripcion
     */
    public VistaInscripcion() throws Exception {
        initComponents();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevaInscripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnEliminarIns = new javax.swing.JButton();
        comboMaterias = new javax.swing.JComboBox<>();
        comboAlumno = new javax.swing.JComboBox<>();
        btnModificarIns = new javax.swing.JButton();
        btnNuevaInscripcion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelInscripcionAlumno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        idAlumnoInscrp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Nota");

        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });

        btnEliminarIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarIns.setText("Eliminar Inscripción");
        btnEliminarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInsActionPerformed(evt);
            }
        });

        btnModificarIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificarIns.setText("Modificar Nota");
        btnModificarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarInsActionPerformed(evt);
            }
        });

        btnNuevaInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnNuevaInscripcion.setText("Nueva Inscripción");
        btnNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaInscripcionActionPerformed(evt);
            }
        });

        jLabel2.setText(" Alumno");

        jLabel3.setText("Materia");

        javax.swing.GroupLayout panelNuevaInscripcionLayout = new javax.swing.GroupLayout(panelNuevaInscripcion);
        panelNuevaInscripcion.setLayout(panelNuevaInscripcionLayout);
        panelNuevaInscripcionLayout.setHorizontalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaInscripcion)
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                                        .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaInscripcionLayout.createSequentialGroup()
                                        .addComponent(btnModificarIns, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
                                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarIns)
                                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(35, 35, 35)
                                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNuevaInscripcionLayout.setVerticalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarIns)
                    .addComponent(btnModificarIns)
                    .addComponent(btnNuevaInscripcion))
                .addGap(25, 25, 25))
        );

        jLabel6.setText("Id Alumno");

        idAlumnoInscrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlumnoInscrpActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion3.png"))); // NOI18N
        jButton5.setText("Inscripciones por Alumno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpio.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Inscripcion", "Nota", "Id Alumno", "Id Materia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelInscripcionAlumnoLayout = new javax.swing.GroupLayout(panelInscripcionAlumno);
        panelInscripcionAlumno.setLayout(panelInscripcionAlumnoLayout);
        panelInscripcionAlumnoLayout.setHorizontalGroup(
            panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                .addGroup(panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(idAlumnoInscrp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInscripcionAlumnoLayout.setVerticalGroup(
            panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idAlumnoInscrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInscripcionAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(panelInscripcionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTON INSCRIPCIONES POR ALUMNO
        if (idAlumnoInscrp.getText().isEmpty() || idAlumnoInscrp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe indicar el ID del Alumno");
        } else {
            if (esNumerico(idAlumnoInscrp.getText())) {
                try {
                    int idA = Integer.parseInt(idAlumnoInscrp.getText());
                    List<Inscripcion> lista = insdao.obtenerInscripcionesPorAlumno(idA);
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Id Inscripcion");
                    modelo.addColumn("Nota");
                    modelo.addColumn("Id Alumno");
                    modelo.addColumn("Id Materia");
                    jTable1.setModel(modelo);
                    for (Inscripcion i : lista) {
                        modelo.addRow(new Object[]{i.getIdInscripto(), i.getNota(), i.getAlumno().getIdAlumno(), i.getMateria().getIdMateria()});
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al Obtener las inscripciones");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un Número válido");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaInscripcionActionPerformed
   //BOTON NUEVA INSCRIPCION         
        Alumno alu = (Alumno) comboAlumno.getSelectedItem();
        Materia mate = (Materia) comboMaterias.getSelectedItem();
        if (validar()) {
            String nota = nota();
            if (esNumerico(nota)) {
                try {
                    Inscripcion ins = new Inscripcion(0, alu, mate);
                    ins.setNota(Integer.parseInt(nota));
                    insdao.guardarInscripcion(ins);
                    JOptionPane.showMessageDialog(this, "Se ha guardado la Inscripción");
                    borrarDatosInscricion();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar una Inscripción");
                    borrarDatosInscricion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa datos válidos en los espacios");
                borrarDatosInscricion();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ha cancelado la operacion");
        }
    }//GEN-LAST:event_btnNuevaInscripcionActionPerformed

    private void btnModificarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarInsActionPerformed
        //BOTON MODIFICAR NOTA      
        Alumno alu = (Alumno) comboAlumno.getSelectedItem();;
        Materia mate = (Materia) comboMaterias.getSelectedItem(); 
        if (validar()) {
            if (esNumerico( nota())) {
                
                Inscripcion ins = new Inscripcion(0, alu, mate);
                ins.setNota(Integer.parseInt(nota()));
                try {
                    insdao.modificarInscripcion(alu.getIdAlumno(), mate.getIdMateria(), ins.getNota());
                    System.out.println(alu.toString());
                    System.out.println(mate.toString());
                    System.out.println(ins.toString());
                    JOptionPane.showMessageDialog(null, "Se ha modificado la Nota");
                    borrarDatosInscricion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al modificar la Inscripción");
                    borrarDatosInscricion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa datos válidos en los espacios");
                borrarDatosInscricion();
            }
        }
    
    }//GEN-LAST:event_btnModificarInsActionPerformed

    private void btnEliminarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInsActionPerformed
        // BOTON ELIMINAR INSCRIPCION
        Alumno a = (Alumno) comboAlumno.getSelectedItem();
        int idA = a.getIdAlumno();
        Materia mater = (Materia) comboMaterias.getSelectedItem();
        int idM = mater.getIdMateria();
        try {
            insdao.borrarInscrpcionMateriaAlumno(idA, idM);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la Inscripción");
            borrarDatosInscricion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Inscripción");
            borrarDatosInscricion();
        }

    }//GEN-LAST:event_btnEliminarInsActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtNotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON LIMPIAR
        borrarDatosInscricion();
        modelo.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idAlumnoInscrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlumnoInscrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAlumnoInscrpActionPerformed

    public boolean validar() {
        boolean vali = false;
        if (txtNota.getText().equals("") || txtNota.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar la Nota");
        } else {
            vali = true;
        }
        return vali;
    }


    public void borrarDatosInscricion() {
        txtNota.setText("");
        idAlumnoInscrp.setText("");
    }

    public boolean esNumerico(String a) {//verificar si es un entero
        boolean resultado;
        try {
            Integer.parseInt(a);
            resultado = true;
        } catch (NumberFormatException ex) {
            resultado = false;
        }
        return resultado;
    }
    public void cargarCombo() throws Exception{
        listaAlumno = (ArrayList)alumndao.listarAlumno();
        for (Alumno aux : listaAlumno) {
            comboAlumno.addItem(aux);
        }
        listaMaterias = mdao.listarMaterias();
        for (Materia aux : listaMaterias) {
            comboMaterias.addItem(aux);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarIns;
    private javax.swing.JButton btnModificarIns;
    private javax.swing.JButton btnNuevaInscripcion;
    private javax.swing.JComboBox<Alumno> comboAlumno;
    private javax.swing.JComboBox<Materia> comboMaterias;
    private javax.swing.JTextField idAlumnoInscrp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelInscripcionAlumno;
    private javax.swing.JPanel panelNuevaInscripcion;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables



    public String nota() {
        String nota = txtNota.getText();
        return nota;
    }

 

}
