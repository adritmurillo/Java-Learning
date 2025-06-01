package gm.dominio;

public class Estudiante {
    // Aca ponemos los campos que creamos en la base de datos
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    // Constructor vacio para inicializar la clase sin pasar datos
    public Estudiante(){}

    // Constructor con el parametro de id para hacer funciones de busqueda, eliminar, etc.
    public Estudiante(int idEstudiante){
        this.idEstudiante = idEstudiante;
    }

    // Constructor para inicializar la clase pasando nombre, apellido, telefono y email

    public Estudiante(String nombre, String apellido, String telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    // Constructor para inicializar la clase pasando todos los campos

    public Estudiante(int idEstudiante,String nombre, String apellido, String telefono, String email){
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters para acceder a los campos de la clase

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo toString para mostrar los datos de la clase en un formato legible
    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
