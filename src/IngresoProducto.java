public class IngresoProducto {
    private int IngresoID;
    private String IngresoFecha;
    private int Cantidad;
    private String ProductoID;
    
    public IngresoProducto() {
    }

    public IngresoProducto(int ingresoID, String ingresoFecha, int cantidad, String productoID) {
        IngresoID = ingresoID;
        IngresoFecha = ingresoFecha;
        Cantidad = cantidad;
        ProductoID = productoID;
    }

    public int getIngresoID() {
        return IngresoID;
    }

    public void setIngresoID(int ingresoID) {
        IngresoID = ingresoID;
    }

    public String getIngresoFecha() {
        return IngresoFecha;
    }

    public void setIngresoFecha(String ingresoFecha) {
        IngresoFecha = ingresoFecha;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getProductoID() {
        return ProductoID;
    }

    public void setProductoID(String productoID) {
        ProductoID = productoID;
    }

    

}
