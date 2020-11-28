package pack;

import java.util.Date;
public class Tecnologico extends Producto{
    protected String paisDEoRIGEN;
    protected Date fechaFabricacion;
    protected Empresa fabricante;
    public Tecnologico(String codigo, String modelo, String paisOrigen , Date fechaFabricacion , Empresa fabricante){
        super(codigo, modelo);
        this.setPaisOrigen(paisOrigen);
        this.setFechaFabricacion(fechaFabricacion);
        this.setFabricante(fabricante);
    }
    public String getPaisOrigen() {
        return paisDEoRIGEN;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisDEoRIGEN = paisOrigen;
    }
    public Date getFechaFabricacion () {
        return fechaFabricacion;
    }
    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    public Empresa getFabricante() {
        return fabricante;
    }
    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }
    public String toString() {
        return "Tecnogico: " +
                "Pais de origen ='" + paisDEoRIGEN + '\'' +
                " Fecha de fabricacion =" + fechaFabricacion+
                ",= fabricante '" + fabricante + '\'' +
                ",= codigo '" + getCodigo() + '\'' +
                ",= producto '" + getModelo() + '\'' +
                '.';
    }
}
