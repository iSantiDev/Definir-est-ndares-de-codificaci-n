public class StockProducto {
    
    private String ProductoID;
    private int StockProducto;
    
    public StockProducto() {
    }

    public StockProducto(String productoID, int stockProducto) {
        ProductoID = productoID;
        StockProducto = stockProducto;
    }

    public String getProductoID() {
        return ProductoID;
    }

    public void setProductoID(String productoID) {
        ProductoID = productoID;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(int stockProducto) {
        StockProducto = stockProducto;
    }

    
}
