package common;

public class Cliente {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    public Cliente(String nombre, String apellido, String identificacion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
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
    public String getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
        public String getinformacion() {
            return "nombre: " + getNombre() + " apellido " + getApellido() + " indentificacion: " + getIdentificacion();
        
            
    }
    
}
