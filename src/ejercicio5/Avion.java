package ejercicio5;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private int capacidad;
    private ArrayList<Asiento> listaAsientos;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            listaAsientos.add(new Asiento(i, "económica", "disponible"));
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
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

