package entity;

public class Cliente {

    private int idc;
    private String razon_social;
    private String ruc;
    private String direccion;
    private int telefo;

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
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

    public int getTelefo() {
        return telefo;
    }

    public void setTelefo(int telefo) {
        this.telefo = telefo;
    }

    @Override
    public String toString() {
        return this.razon_social;
    }

}
