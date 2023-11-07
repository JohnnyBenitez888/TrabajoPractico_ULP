/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universidadulp.Vistas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class MainAdministrador extends javax.swing.JFrame {

    /** Creates new form MainAdministrador */
   
    public MainAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administrador ULP");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MIagregarAlumno = new javax.swing.JMenuItem();
        MIeliminarAlumno = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpEscritorio.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Administración");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin.png"))); // NOI18N

        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Admin");

        jdpEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(lbNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jdpEscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNombre)))
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jMenu1.setText("Gestion Administrativa");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MIagregarAlumno.setText("Gestion Alumnos");
        MIagregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIagregarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(MIagregarAlumno);

        MIeliminarAlumno.setText("Gestion Materias");
        MIeliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIeliminarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(MIeliminarAlumno);

        jMenuItem3.setText("Gestion Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Listas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Materias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIagregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIagregarAlumnoActionPerformed
        // Abrimos la ventana interna Vista Alumno
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VistaAlumno vista = new VistaAlumno();
        vista.setVisible(true);
        jdpEscritorio.add(vista);
        jdpEscritorio.moveToFront(vista);
        
    }//GEN-LAST:event_MIagregarAlumnoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MIeliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIeliminarAlumnoActionPerformed
        // Abrimos la ventana interna Vista Materia
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VistaMateria vm = new VistaMateria();
        vm.setVisible(true);
        jdpEscritorio.add(vm);
        jdpEscritorio.moveToFront(vm);
    }//GEN-LAST:event_MIeliminarAlumnoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Abrimos la ventana interna Vista Materia
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VistaInscripcion vi ;
        try{
            vi = new VistaInscripcion();
            vi.setVisible(true);
        jdpEscritorio.add(vi);
        jdpEscritorio.moveToFront(vi);
        }catch(Exception ex){
            Logger.getLogger(MainAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // CONSULTAS -> LISTAS
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        Listas listas = new Listas();
        listas.setVisible(true);
        jdpEscritorio.add(listas);
        jdpEscritorio.moveToFront(listas);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // CONSULTAS -> MATERIAS:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ConsultasMaterias CMaterias = new ConsultasMaterias();
        CMaterias.setVisible(true);
        jdpEscritorio.add(CMaterias);
        jdpEscritorio.moveToFront(CMaterias);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ConsultasMaterias CMaterias = new ConsultasMaterias();
        CMaterias.setVisible(true);
        jdpEscritorio.add(CMaterias);
        jdpEscritorio.moveToFront(CMaterias);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public boolean esNumerico(String cadena) {//verificar si es un entero
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException ex) {
            resultado = false;
        }
        return resultado;
    }
    public void adminNombre(String nombre) {//METODO Label ----------------------------------------
        lbNombre.setText(nombre);
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
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIagregarAlumno;
    private javax.swing.JMenuItem MIeliminarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables

}
