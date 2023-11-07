/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.acceso;

import universidadulp.entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class AdminDAO extends Conexion{
    public boolean buscarContraseñaAdministrador(String contraseña) throws Exception {//3 OCUPADO
        try {
            String sql = "SELECT * FROM administradores WHERE contraseña like '" + contraseña + "';";
            consultarBase(sql);
            if (resultado.next()){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el Usuario");
            throw e;
        } finally {
            desconectarBase();
        }
        return false;
        
    }
    
     public boolean buscarNombreAdministrador(String nombre) throws Exception {//3 OCUPADO
        try {
            String sql = "SELECT * FROM administradores WHERE nombre like '" + nombre + "';";
            consultarBase(sql);
            if(resultado.next()){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el Usuario");
            throw e;
        } finally {
            desconectarBase();
        }
        return false;
        
    }
}
