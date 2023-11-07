package universidadulp.entidades;

public class Materia {

    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anio;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int anio, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anio;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id: " + idMateria + ", Nombre: " + nombre + ", Año: " + anioMateria + ", Estado: " + estado;
    }

}
