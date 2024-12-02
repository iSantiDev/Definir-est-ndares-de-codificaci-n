public class Producto {
    
    // Atributos
    private String ProductoID;
    private String NombreProducto;
    private String DescripcionProducto;
    private Float PrecioProducto;
    private int ProveedorID;
    
    // Constructor sin parámetros
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(String productoID, String nombreProducto, String descripcionProducto, Float precioProducto, int proveedorID) {
        ProductoID = productoID;
        NombreProducto = nombreProducto;
        DescripcionProducto = descripcionProducto;
        PrecioProducto = precioProducto;
        ProveedorID = proveedorID;
    }

    // Getters & Setters
    public String getProductoID() {
        return ProductoID;
    }

    public void setProductoID(String productoID) {
        ProductoID = productoID;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        DescripcionProducto = descripcionProducto;
    }

    public Float getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        PrecioProducto = precioProducto;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(int proveedorID) {
        ProveedorID = proveedorID;
    }
}
