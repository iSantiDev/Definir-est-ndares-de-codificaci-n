public class DatosUsuario {
    // Definición de atributos
    private String CedulaUsuario;
    private String Nombre;
    private String Email;
    private String Contacto;

    // Crear constructor sin parámetros
    public DatosUsuario(){
        
    }
    
    // Crear constructor con parámetros
    public DatosUsuario(String cedulaUsuario, String nombre, String email, String contacto) {
        CedulaUsuario = cedulaUsuario;
        Nombre = nombre;
        Email = email;
        Contacto = contacto;
    }

    // Métodos getters & setters
    public String getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        CedulaUsuario = cedulaUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    
}
