package pack;
public class Alquilable extends Producto{
    protected double precioHora;
    public Alquilable(String codigo , String modelo , double precioHora){
        super(codigo , modelo);
        this.setPrecioHora(precioHora);
    }
    public Alquilable() {
        super();
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    @Override
    public String toString() {
        return "Alquilable : " +
                "precioHora" + precioHora +
                " ,codigo='" + getCodigo() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                '.';
    }
}
