package ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class CineMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana García", "987654321", "Avenida Siempre Viva 742");

        Funcion funcion = new Funcion("Matrix", "18:00", 1, 10.50);

        Sala sala = new Sala(1, 10, 10);

        Asiento asiento1 = sala.obtenerAsiento(2, 3);
        Asiento asiento2 = sala.obtenerAsiento(2, 4);

        asiento1.reservar();
        asiento2.reservar();

        List<Asiento> asientosReservados = new ArrayList<>();
        asientosReservados.add(asiento1);
        asientosReservados.add(asiento2);

        Reserva reserva = new Reserva(cliente, funcion, asientosReservados);

        cliente.agregarReserva(reserva);

        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Película: " + reserva.getFuncion().getPelicula());
        System.out.println("Asientos reservados:");
        for (Asiento asiento : reserva.getListaAsientos()) {
            System.out.println("Fila: " + asiento.getFila() + ", Columna: " + asiento.getColumna() + ", Estado: " + asiento.getEstado());
        }

        reserva.comprar();


        reserva.comprar();

        System.out.println("Estado final de los asientos:");
        for (Asiento asiento : reserva.getListaAsientos()) {
            System.out.println("Fila: " + asiento.getFila() + ", Columna: " + asiento.getColumna() + ", Estado: " + asiento.getEstado());
        }
    }
}

