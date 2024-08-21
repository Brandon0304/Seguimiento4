package ejercicio1;

public class Persona {
    private String nombre;
    private int identificacion;
    private String direccion;

    public Persona(String nombre, int identificacion, String direccion){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

