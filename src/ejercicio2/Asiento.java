package ejercicio2;

public class Asiento {
    private int fila;
    private int columna;
    private String estado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getEstado() {
        return estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            this.estado = "reservado";
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            this.estado = "ocupado";
        }
    }
}
