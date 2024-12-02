public class Usuario {
    // Atributos
    private String CedulaUsuario;
    private String Estado;

    // Constructor sin parámetros
    public Usuario() {

    }

    // Constructor con parámetros
    public Usuario(String cedulaUsuario, String estado) {
        CedulaUsuario = cedulaUsuario;
        Estado = estado;
    }

    // Getters & Setters
    public String getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        CedulaUsuario = cedulaUsuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    
}