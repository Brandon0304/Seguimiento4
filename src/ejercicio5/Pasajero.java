package ejercicio5;

import java.util.ArrayList;

public class Pasajero extends Persona {
    private ArrayList<Reserva> historialReservas;

    public Pasajero(String nombre, String identificacion, String contacto) {
        super(nombre, identificacion, contacto);
        this.historialReservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(ArrayList<Reserva> historialReservas) {
        this.historialReservas = historialReservas;
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }
}

