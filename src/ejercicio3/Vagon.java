package ejercicio3;

import java.util.List;

public class Vagon {
    private String tipo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Vagon(String tipo, int capacidad, List<Asiento> listaAsientos) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = listaAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(List<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public Asiento obtenerAsiento(int numero) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.getNumero() == numero) {
                return asiento;
            }
        }
        return null;
    }
}

