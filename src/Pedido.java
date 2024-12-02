public class Pedido {
    private int PedidoID;
    private String FechaPedido;
    private String EstadoPedido;
    
    public Pedido() {
    }

    public Pedido(int pedidoID, String fechaPedido, String estadoPedido) {
        PedidoID = pedidoID;
        FechaPedido = fechaPedido;
        EstadoPedido = estadoPedido;
    }

    public int getPedidoID() {
        return PedidoID;
    }

    public void setPedidoID(int pedidoID) {
        PedidoID = pedidoID;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        FechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        EstadoPedido = estadoPedido;
    }
}
