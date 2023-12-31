/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.Vistas;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.acceso.AlumnoDAO;
import universidadulp.acceso.InscripcionDAO;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class ConsultasMaterias extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo = new DefaultTableModel();
 InscripcionDAO insDao = new InscripcionDAO() ; 
    AlumnoDAO alumDao = new AlumnoDAO();
    /**
     * Creates new form ConsultasMaterias
     */
    public ConsultasMaterias() {
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

        jLabel6 = new javax.swing.JLabel();
        panelNuevaInscripcion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtIdMateria = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel6.setText("Id Materia");

        jLabel2.setText("Id Alumno");

        jButton1.setText("Materias Cursadas");
        jButton1.setMaximumSize(new java.awt.Dimension(147, 26));
        jButton1.setMinimumSize(new java.awt.Dimension(147, 26));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Materias no Cursadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaInscripcionLayout = new javax.swing.GroupLayout(panelNuevaInscripcion);
        panelNuevaInscripcion.setLayout(panelNuevaInscripcionLayout);
        panelNuevaInscripcionLayout.setHorizontalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        panelNuevaInscripcionLayout.setVerticalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaInscripcionLayout.createSequentialGroup()
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Inscripcion", "Nota", "Id Alumno", "Id Materia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMateriaActionPerformed(evt);
            }
        });

        jButton3.setText("Alumnos por Materia");
        jButton3.setMaximumSize(new java.awt.Dimension(147, 26));
        jButton3.setMinimumSize(new java.awt.Dimension(147, 26));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpio.png"))); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.setMaximumSize(new java.awt.Dimension(147, 26));
        jButton4.setMinimumSize(new java.awt.Dimension(147, 26));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMateriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // MATERIA CURSADA ID MATERIA / NOMBRE / AÑO / ESTADO
        if (validar(txtIdAlumno.getText())) {
            try {
                List<Materia> cursadas = insDao.obtenerMateriaCursada(Integer.parseInt(txtIdAlumno.getText()));
                cargarMateriaCursada(cursadas);
            } catch (Exception ex) {
                Logger.getLogger(ConsultasMaterias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // MATERIA NO CURSADA
        if (validar(txtIdAlumno.getText())) {
            try {
                List<Materia> cursadas = insDao.obtenerMateriaNoCursada(Integer.parseInt(txtIdAlumno.getText()));
                cargarMateriaCursada(cursadas);
            } catch (Exception ex) {
                Logger.getLogger(ConsultasMaterias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // ALUMNOS POR MATERIA
        if (validar(txtIdMateria.getText())) {
            try {
                List<Alumno> alumnos = insDao.obtenerAlumnosPorMateria(Integer.parseInt(txtIdMateria.getText()));
                cargarListaAlumno(alumnos);
            } catch (Exception ex) {
                Logger.getLogger(ConsultasMaterias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTON LIMPIAR
        txtIdAlumno.setText("");
        txtIdMateria.setText("");
        modelo.setRowCount(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    public boolean validar (String id) {
        boolean valido = false;
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar un Id de Alumno");
        } else {
            try {
                int idEntero = Integer.parseInt(id);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debe indicar un Id válido de Alumno");
            }
        }
        return valido;
    }
    
    public void cargarMateriaCursada(List<Materia> materias) {
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
        for (Materia aux : materias) {
            modelo.addRow(new Object[]{aux.getIdMateria(), aux.getNombre(), aux.getAnioMateria(), aux.isEstado()});
        }        
    }
     public void cargarListaAlumno(List<Alumno> alumnos) throws Exception {
        modelo = new DefaultTableModel();
        modelo.addColumn("ID Alumno");
        modelo.addColumn("DNI Alumno");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de nacimiento");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
        for (Alumno a : alumnos) {
            modelo.addRow(new Object[]{a.getIdAlumno(),a.getDni(),a.getApellido(),a.getNombre(),a.getFechaNacimiento(),a.isEstado()});
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelNuevaInscripcion;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdMateria;
    // End of variables declaration//GEN-END:variables
}
