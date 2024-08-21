package ejercicio5;

public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;


    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        asiento.reservar();
        pasajero.agregarReserva(this);
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}

