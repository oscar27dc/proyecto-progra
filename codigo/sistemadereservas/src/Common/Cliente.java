package Common;

public class Cliente {

    private String nombre;
    private String apellido;
    private String indentificacion;
    private String telefono;

    public Cliente(String nombre, String apellido, String indentificacion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.indentificacion = indentificacion;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getinformacion() {
        return "nombre: " + getNombre() + " apellido: " + getApellido() + " indentificacion: " + getIndentificacion();
    }

}
