package pack;
import java.util.Date;
public class Compra {
    private provedores provedores;
    private Producto producto;
    private Date fecha;
    private int cantidad;
    public Compra(provedores provedores, Producto producto, Date fecha, int cantidad) {
        this.setProvedor(provedores);
        this.setProducto(producto);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }
    public provedores getProvedor() {
        return provedores;
    }
    public void setProvedor(provedores provedores) {
        this.provedores = provedores;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
