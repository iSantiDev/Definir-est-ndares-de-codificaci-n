public class Inventario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Cargando constructor sin parámetros
        DatosUsuario objDatosUsuario = new DatosUsuario();

        objDatosUsuario.setCedulaUsuario("1023163824");
        objDatosUsuario.setNombre("Kevin Santiago Sierra Rodriguez");
        objDatosUsuario.setEmail("santis.sierra6@gmail.com");
        objDatosUsuario.setContacto("3142942160");

        System.out.println("Los datos del usuario son \"usando constructor sin parámetros\": \n");
        System.out.println("Cédula de ciudadania del usuario: " + objDatosUsuario.getCedulaUsuario());
        System.out.println("Nombre del usuario: " + objDatosUsuario.getNombre());
        System.out.println("Email del usuario: " + objDatosUsuario.getEmail());
        System.out.println("Contacto del usuario: " + objDatosUsuario.getContacto() + "\n");


        // Cargando constructor con parámetros
        DatosUsuario objDatosUsuario2 = new DatosUsuario("1024567890", "Laura Martínez Hernández", "laura.martinez@example.com", "3109876543");

        System.out.println("Los datos del usuario son: \"usando constructor con parámetros\"\n");
        System.out.println("Cédula de ciudadania del usuario: " + objDatosUsuario2.getCedulaUsuario());
        System.out.println("Nombre del usuario: " + objDatosUsuario2.getNombre());
        System.out.println("Email del usuario: " + objDatosUsuario2.getEmail());
        System.out.println("Contacto del usuario: " + objDatosUsuario2.getContacto());
    }


}
