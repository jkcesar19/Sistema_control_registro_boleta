package entity;

public class Person {

    private int idpersona;
    private String nombre;
    private int num_dni;
    private String direccion;
    private String correo;
    private int telefono;
    private String es_civil;
    private String hijo;
    private int can_hijo;
    private String sexo;
    private String estado;

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_dni() {
        return num_dni;
    }

    public void setNum_dni(int num_dni) {
        this.num_dni = num_dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEs_civil() {
        return es_civil;
    }

    public void setEs_civil(String es_civil) {
        this.es_civil = es_civil;
    }

    public String getHijo() {
        return hijo;
    }

    public void setHijo(String hijo) {
        this.hijo = hijo;
    }

    public int getCan_hijo() {
        return can_hijo;
    }

    public void setCan_hijo(int can_hijo) {
        this.can_hijo = can_hijo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
