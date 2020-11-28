package pack;

public class Producto {
    private String codigo;
    private String Modelo;
    private String velocidad;
    public Producto(String codigo, String modelo) {
        this.Modelo = modelo;
        this.codigo = codigo;
    }
    public Producto() {
    }
    protected String getCodigo() {
        return codigo;
    }
    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    protected String getModelo() {
        return Modelo;
    }
    protected void setModelo(String modelo) {
        Modelo = modelo;
    }
    @Override
    public String toString() {
        return "Producto: " +
                "codigo='" + codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '.';
    }
}
