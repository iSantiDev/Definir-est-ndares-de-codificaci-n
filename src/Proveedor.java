public class Proveedor {
    // Atributos
    private int ProveedorID;
    private String NombreProveedor;
    private String DireccionProveedor;
    private String ContactoProveedor;

    // Constructor sin parámetros

    public Proveedor(){

    }
    // Constructor con parámetros
    public Proveedor(int proveedorID, String nombreProveedor, String direccionProveedor, String contactoProveedor) {
        ProveedorID = proveedorID;
        NombreProveedor = nombreProveedor;
        DireccionProveedor = direccionProveedor;
        ContactoProveedor = contactoProveedor;
    }
    
    // Getters & Setters
    public int getProveedorID() {
        return ProveedorID;
    }
    public void setProveedorID(int proveedorID) {
        ProveedorID = proveedorID;
    }
    public String getNombreProveedor() {
        return NombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        NombreProveedor = nombreProveedor;
    }
    public String getDireccionProveedor() {
        return DireccionProveedor;
    }
    public void setDireccionProveedor(String direccionProveedor) {
        DireccionProveedor = direccionProveedor;
    }
    public String getContactoProveedor() {
        return ContactoProveedor;
    }
    public void setContactoProveedor(String contactoProveedor) {
        ContactoProveedor = contactoProveedor;
    }

    

}
