public class CuentaUsuario {
    // Definición de atributos
    private String EmailUsuario;
    private String ContrasenaUsuario;
    private String CedulaUsuario;

    // Constructor sin atributos
    public CuentaUsuario(){

    }

    // Constructor con atributos
    public CuentaUsuario(String emailUsuario, String contrasenaUsuario, String cedulaUsuario){
        EmailUsuario = emailUsuario;
        ContrasenaUsuario = contrasenaUsuario;
        CedulaUsuario = cedulaUsuario;
    }

    // Getters & Setters
    public String getEmailUsuario() {
        return EmailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        EmailUsuario = emailUsuario;
    }

    public String getContrasenaUsuario() {
        return ContrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        ContrasenaUsuario = contrasenaUsuario;
    }

    public String getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        CedulaUsuario = cedulaUsuario;
    }
}