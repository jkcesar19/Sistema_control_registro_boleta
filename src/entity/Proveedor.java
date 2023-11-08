
package entity;


public class Proveedor {
    private int idprove;
    private String razonsocial;
    private String ruc;
    private String direccion;
    private int telefono;

    public int getIdprove() {
        return idprove;
    }

    public void setIdprove(int idprove) {
        this.idprove = idprove;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.razonsocial;
    }
    
}
