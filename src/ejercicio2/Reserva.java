package ejercicio2;
import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private List<Asiento> listaAsientos;
    private boolean comprada;

    public Reserva(Cliente cliente, Funcion funcion, List<Asiento> listaAsientos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;
        this.comprada = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public boolean esComprada() {
        return comprada;
    }

    public void comprar() {
        if (!comprada) {
            for (Asiento asiento : listaAsientos) {
                asiento.ocupar(); // Cambiar el estado a "ocupado"
            }
            comprada = true;
            System.out.println("Reserva comprada con éxito.");
        } else {
            System.out.println("La reserva ya ha sido comprada.");
        }
    }
}
