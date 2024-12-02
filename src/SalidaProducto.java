public class SalidaProducto {
    private int SalidaID;
    private String SalidaFecha;
    private int Cantidad;
    private String ProductoID;
    
    public SalidaProducto() {
    }

    public SalidaProducto(int salidaID, String salidaFecha, int cantidad, String productoID) {
        SalidaID = salidaID;
        SalidaFecha = salidaFecha;
        Cantidad = cantidad;
        ProductoID = productoID;
    }

    public int getSalidaID() {
        return SalidaID;
    }

    public void setSalidaID(int salidaID) {
        SalidaID = salidaID;
    }

    public String getSalidaFecha() {
        return SalidaFecha;
    }

    public void setSalidaFecha(String salidaFecha) {
        SalidaFecha = salidaFecha;
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
