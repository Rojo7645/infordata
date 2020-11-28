package pack;

public class Cliente {
    private String CI;
    private String telefono;
    private String domicilio;
    public Cliente(String CI, String telefono, String domicilio) {
        this.CI = CI;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }
    public String getCI() {
        return CI;
    }
    public void setCI(String CI) {
        this.CI = CI;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
