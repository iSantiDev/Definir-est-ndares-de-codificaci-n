public class DetallesPedido {
    private int PedidoID;
    private String ProductoID;
    private int Cantidad;
    private int ProveedorID;
    
    public DetallesPedido() {
    }

    public DetallesPedido(int pedidoID, String productoID, int cantidad, int proveedorID) {
        PedidoID = pedidoID;
        ProductoID = productoID;
        Cantidad = cantidad;
        ProveedorID = proveedorID;
    }

    public int getPedidoID() {
        return PedidoID;
    }

    public void setPedidoID(int pedidoID) {
        PedidoID = pedidoID;
    }

    public String getProductoID() {
        return ProductoID;
    }

    public void setProductoID(String productoID) {
        ProductoID = productoID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(int proveedorID) {
        ProveedorID = proveedorID;
    }

    
}
