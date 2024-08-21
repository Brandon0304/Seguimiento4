package ejercicio1;

class Cliente extends Persona{
    private String historialcrediticio;
    private int ingresos;

    Cliente(String nombre, int identificacion, String direccion, String historialcrediticio, int ingresos){
        super(nombre, identificacion, direccion);
        this.historialcrediticio = historialcrediticio;
        this.ingresos = ingresos;
    }

    public String getHistorialcrediticio() {
        return historialcrediticio;
    }

    public void setHistorialcrediticio(String historialcrediticio) {
        this.historialcrediticio = historialcrediticio;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
}
