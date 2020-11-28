package pack;
public class Discoduro extends Alquilable {
    private int capacidad;
    public Discoduro (String codigo, String modelo , double precioHora , int capacidad , Void reseatble){
        super(codigo, modelo, precioHora );
        this.setCapacidad(capacidad);
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
