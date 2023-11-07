package universidadulp.acceso;

import java.util.*;
import universidadulp.entidades.Materia;

/**
 *
 * @author cisco
 */
public final class MateriaDAO extends Conexion {

    public void guardarMateria(Materia materia) throws Exception { // OCUPADO

        try {
            String query = "INSERT INTO materia(nombre, año, estado) VALUES ('" + materia.getNombre() + "', "
                    + materia.getAnioMateria() + ", " + materia.isEstado() + ")";
            modificarBase(query);
        } catch (Exception e) {
            System.out.println("Error al guardar la materia");
        } finally {
            desconectarBase();
        }
    }

    // Materia BuscarMateria(int idMateria)
    public Materia buscarMateria(int idMateria) throws Exception { // OCUPADO
        Materia materia = null;
        try {
            String sql = "SELECT * FROM materia WHERE idMateria = " + idMateria;
            consultarBase(sql);

            while (resultado.next()) {
                materia = new Materia();
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre"));
                materia.setAnioMateria(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
            }
            desconectarBase();
        } catch (Exception e) {
            System.out.println("Error al buscar la materia");
        } finally {
            desconectarBase();
        }
        return materia;

    }

    // ModificarMateria(Materia materia)
    public void modificarMateria(Materia materia) throws Exception { // OCUPADO
        try {
            String sql = "UPDATE materia SET nombre = '" + materia.getNombre()
                    + "' , año = " + materia.getAnioMateria() + " , estado =  "
                    + materia.isEstado() + " WHERE idMateria = " + materia.getIdMateria();
            modificarBase(sql);
            System.out.println("Modificación exitosa");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // EliminarMateria(int idMateria)
    public boolean eliminarMateria(int idMateria) throws Exception { // OCUPADO
         boolean valido = false;
        try {
            String sql0 = "SELECT COUNT(*) FROM inscripcion WHERE idMateria = " + idMateria;
            consultarBase(sql0);
            if (resultado.next()) {
                int mate = resultado.getInt(1);
                if (mate == 0) {
                    String sql = "DELETE FROM materia WHERE idMateria = "
                            + idMateria;
                    modificarBase(sql);
                    System.out.println("Se eliminó la Materia");
                    valido = true;
                } else {
                    System.out.println("La Materia tiene inscripciones con alumnos.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar la materia");
            throw e;
        } finally {
            desconectarBase();
        }
        return valido;
    }

    // List<Materia> listarMaterias()
    public List<Materia> listarMaterias() throws Exception { // OCUPADO EN VISTA DE LISTAS
        Materia materia = null;
        List<Materia> materias = new ArrayList();

        try {
            String sql = "SELECT * FROM materia";
            consultarBase(sql);
            while (resultado.next()) {
                materia = new Materia();
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre"));
                materia.setAnioMateria(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
                materias.add(materia);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar las listas");
        } finally {
            desconectarBase();
        }
        return materias;
    }

}

    

