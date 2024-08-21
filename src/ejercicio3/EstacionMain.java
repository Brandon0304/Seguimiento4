package ejercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EstacionMain {
    public static void main(String[] args) {

        List<Asiento> asientosVagon1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            asientosVagon1.add(new Asiento(i));
        }

        Vagon vagon1 = new Vagon("Clase Premium", 10, asientosVagon1);
        List<Vagon> vagones = new ArrayList<>();
        vagones.add(vagon1);

        Tren tren1 = new Tren("T123", "Armenia - Manizales", vagones);

        LocalDateTime fechaViaje = LocalDateTime.of(2024, 8, 25, 10, 0);
        LocalDateTime horaSalida = LocalDateTime.of(2024, 8, 25, 10, 0);
        LocalDateTime horaLlegada = LocalDateTime.of(2024, 8, 25, 14, 0);
        Viaje viaje1 = new Viaje(fechaViaje, horaSalida, horaLlegada, tren1);

        Cliente cliente1 = new Cliente("Brandon Ortiz", "12345678", "Carrera 19 Norte");

        Asiento asientoReservado = vagon1.obtenerAsiento(3);
        if (asientoReservado != null && asientoReservado.getEstado().equals("disponible")) {
            asientoReservado.reservar();
        }

        Boleto boleto1 = new Boleto(cliente1, viaje1, asientoReservado);
        cliente1.agregarCompra(boleto1);
        System.out.println("INFORMACIÓN DEL CLIENTE");
        System.out.println("Cliente: " + boleto1.getCliente().getNombre());
        System.out.println("Identificación: "+cliente1.getIdentificacion());
        System.out.println("Dirección: "+cliente1.getDireccion());
        System.out.println(System.lineSeparator());
        System.out.println("INFORMACIÓN DEL VIAJE");
        System.out.println("Número del tren: "+tren1.getNumero());
        System.out.println("Viaje: " + boleto1.getViaje().getTren().getRuta());
        System.out.println("Fecha del viaje: "+viaje1.getFecha());
        System.out.println("Hora de salida: "+viaje1.getHoraSalida());
        System.out.println("Hora de llegada: "+viaje1.getHoraLlegada());
        System.out.println("Asiento: " + boleto1.getAsiento().getNumero());
        System.out.println("Estado del asiento: " + boleto1.getAsiento().getEstado());
    }
}

