package pack;

import java.util.Date;

public class Cpu extends Tecnologico {

    private int memoriaPrincipal;



    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal, Object o){
        super(codigo, modelo , paisOrigen , fechaFabricacion , fabricante );
        this.setMemoriaPrincipal(memoriaPrincipal);
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
    @Override
    public String toString() {
        return "Cpu: " +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", paisOrigen='" + null + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ",= codigo '" + getCodigo() + '\'' +
                ",= modelo '" + getModelo() + '\'' +

                '}';
    }
}
