package pack;
public class Monitor extends Alquilable {
    private String resolucionMaxima;
    public Monitor(String codigo , String modelo , double precioHora , String resolucionMaxima  ){
        super(codigo, modelo , precioHora);
        this.setResolucionMaxima(resolucionMaxima);
    }
    public Monitor(String s, double v, String s1) {
        super();
    }
    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }
    @Override
    public String toString() {
        return "Monitor{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                ", precioHora=" + precioHora +
                ",= codigo '" + getCodigo() + '\'' +
                ",= modelo '" + getModelo() + '\'' +
                '}';
    }
}
