package universidadulp.acceso;

import java.util.ArrayList;
import java.util.List;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Inscripcion;
import universidadulp.entidades.Materia;

/**
 *
 * @author johan
 */
public class InscripcionDAO extends Conexion {

     public void guardarInscripcion(Inscripcion ins) throws Exception { // OCUPADO

        try {
            if (ins == null) {
                throw new Exception("Debe indicar una Inscripcion");
            }
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES  ("
                    + ins.getNota() + ", " + ins.getAlumno().getIdAlumno() + "," + ins.getMateria().getIdMateria() + ");";
            modificarBase(sql);
            System.out.println("Inscripcion guardada");
        } catch (Exception e) {
            System.out.println("Error al crear la Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Inscripcion> listarInscripcion() throws Exception { // OCUPADO EN LISTAS
        Alumno alumno = null;
        Materia materia = null;
        Inscripcion ins = null;
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion ";
            consultarBase(sql);
            while (resultado.next()) {
                alumno = new Alumno();
                materia = new Materia();
                ins = new Inscripcion(0, 0, alumno, materia);
                ins.setIdInscripto(resultado.getInt("idInscripto"));
                ins.setNota(resultado.getInt("nota"));
                ins.getAlumno().setIdAlumno(resultado.getInt("idAlumno"));
                ins.getMateria().setIdMateria(resultado.getInt("idMateria"));
                inscripciones.add(ins);
            }

        } catch (Exception e) {
            System.out.println("Error al Listar las Inscripciones");
            throw e;
        } finally {
            desconectarBase();
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) throws Exception { // OCUPADO
        Alumno alumno = null;
        Materia materia = null;
        Inscripcion ins = null;
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion i JOIN alumno a ON i.idAlumno = a.idAlumno "
                    + "WHERE i.idAlumno = " + id + " ;";

            consultarBase(sql);
            while (resultado.next()) {
                alumno = new Alumno();
                materia = new Materia();
                ins = new Inscripcion(0, 0, alumno, materia);
                ins.setIdInscripto(resultado.getInt("idInscripto"));
                ins.setNota(resultado.getInt("nota"));
                ins.getAlumno().setIdAlumno(resultado.getInt("idAlumno"));
                ins.getMateria().setIdMateria(resultado.getInt("idMateria"));
                inscripciones.add(ins);
            }
            return inscripciones;
        } catch (Exception e) {
            System.out.println("Error al Listar las Inscripciones");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Materia> obtenerMateriaCursada(int id) throws Exception { // OCUPADO
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT materia.idMateria, materia.nombre, materia.año, materia.estado "
                    + "FROM Alumno "
                    + "JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno "
                    + "JOIN materia ON inscripcion.idMateria = materia.idMateria "
                    + "WHERE alumno.idAlumno = " + id + " AND materia.estado = true ;";
            consultarBase(sql);
            while (resultado.next()) {
                Materia m = new Materia();
                m.setIdMateria(resultado.getInt(1));
                m.setNombre(resultado.getString(2));
                m.setAnioMateria(resultado.getInt(3));
                m.setEstado(resultado.getBoolean(4));
                materias.add(m);
            }
            return materias;
        } catch (Exception e) {
            System.out.println("Error al Obtener las Materias");
            System.out.println(e.getMessage());
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Materia> obtenerMateriaNoCursada(int id) throws Exception { // OCUPADO
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT materia.idMateria, materia.nombre, materia.año, materia.estado "
                    + "FROM materia "
                    + "WHERE materia.idMateria NOT IN "
                    + "(SELECT inscripcion.idMateria FROM inscripcion WHERE inscripcion.idAlumno = " + id + ");";
            consultarBase(sql);
            while (resultado.next()) {
                Materia m = new Materia();
                m.setIdMateria(resultado.getInt(1));
                m.setNombre(resultado.getString(2));
                m.setAnioMateria(resultado.getInt(3));
                m.setEstado(resultado.getBoolean(4));
                materias.add(m);
            }
            return materias;
        } catch (Exception e) {
            System.out.println("Error al Obtener las Materias");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void borrarInscrpcionMateriaAlumno(int idAlumno, int idMateria) throws Exception {//Ocupado vistains
        try {
            String sql = " DELETE FROM inscripcion WHERE idMateria = " + idMateria
                    + " AND idAlumno = " + idAlumno + " ;";
            modificarBase(sql);
            System.out.println("Borrado exitoso");
        } catch (Exception e) {
            System.out.println("Error al eliminar Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarInscripcion(int idAlumno, int idMateria, double nota) throws Exception { // OCUPADO
        try {
            String sql = "UPDATE inscripcion SET nota = " + nota + " WHERE idAlumno = " + idAlumno
                    + " AND idMateria = " + idMateria;
            modificarBase(sql);
            System.out.println("Nota modificada");
        } catch (Exception e) {
            System.out.println("Error al realizar la Actualizacion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) throws Exception { // OCUPADO
        try {
            List<Alumno> alumnos = new ArrayList<>();
            Alumno a = null;
            String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre, "
                + "alumno.fechaNacimiento, alumno.estado "
                + "FROM Alumno "
                + "JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno "
                + "WHERE inscripcion.idMateria = " + idMateria 
                + " AND alumno.estado = 1";
            consultarBase(sql);
            while (resultado.next()) {
                a = new Alumno();
                a.setIdAlumno(resultado.getInt(1));
                a.setDni(resultado.getInt(2));
                a.setApellido(resultado.getString(3));
                a.setNombre(resultado.getString(4));
                a.setFechaNacimiento(resultado.getDate(5));
                a.setEstado(resultado.getBoolean(6));
                alumnos.add(a);
            } 
            return alumnos;
        } catch (Exception e) {
            System.out.println("Error al obtener los Alumnos");
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
