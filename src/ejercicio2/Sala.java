package ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Sala(int numero, int filas, int columnas) {
        this.numero = numero;
        this.capacidad = filas * columnas;
        this.listaAsientos = new ArrayList<>(capacidad);
        inicializarAsientos(filas, columnas);
    }

    private void inicializarAsientos(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                listaAsientos.add(new Asiento(i, j));
            }
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.getFila() == fila && asiento.getColumna() == columna) {
                return asiento;
            }
        }
        return null;
    }
}
