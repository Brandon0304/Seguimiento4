package ejercicio3;

public class Boleto {
    private Cliente cliente;
    private Viaje viaje;
    private Asiento asiento;

    public Boleto(Cliente cliente, Viaje viaje, Asiento asiento) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.asiento = asiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}

