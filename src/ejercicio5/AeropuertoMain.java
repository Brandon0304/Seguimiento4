package ejercicio5;

public class AeropuertoMain {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", 150);

        Vuelo vuelo = new Vuelo("AB123", "Nueva York - Los Ángeles", "2024-09-15", "10:00", "13:00", avion);

        Pasajero pasajero = new Pasajero("Juan Pérez", "123456789", "3229095030");

        Asiento asiento = avion.obtenerAsiento(10);
        Reserva reserva = new Reserva(pasajero, vuelo, asiento);

        System.out.println("Reserva realizada:");
        System.out.println("INFORMACIÓN DEL PASAJERO");
        System.out.println("Pasajero: " + reserva.getPasajero().getNombre());
        System.out.println("ID: "+reserva.getPasajero().getIdentificacion());
        System.out.println("Contacto: "+reserva.getPasajero().getContacto());
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("INFORMACIÓN DEL VUELO");
        System.out.println("Vuelo: " + reserva.getVuelo().getNumero());
        System.out.println("Fecha del vuelo: "+reserva.getVuelo().getFecha());
        System.out.println("Ruta del vuelo: "+reserva.getVuelo().getRuta());
        System.out.println("Hora de salida: "+reserva.getVuelo().getHoraSalida() + " --- Hora de llegada: "+reserva.getVuelo().getHoraLlegada());
        System.out.println("Asiento: " + reserva.getAsiento().getNumero());
        System.out.println("Estado del asiento: " + reserva.getAsiento().getEstado());
    }
}

