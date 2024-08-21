package ejercicio1;

public class CreditoMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", 123456789, "Calle Falsa 123", "Bueno", 50000);
        SolicitudCredito solicitud = new SolicitudCredito(cliente, "hipotecario", 200000, 360, 3.5);

        Propiedad propiedad = new Propiedad("Calle Real 456", 250000);
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(solicitud, propiedad);

        creditoHipotecario.aprobar();

        System.out.println("Estado del crédito: " + creditoHipotecario.obtenerEstado());
        System.out.println("Dirección de la propiedad: " + creditoHipotecario.obtenerPropiedad().obtenerDireccion());
    }

}

