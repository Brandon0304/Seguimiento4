package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Boleto> historialCompras;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.historialCompras = new ArrayList<>();
    }

    public List<Boleto> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<Boleto> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public void agregarCompra(Boleto boleto) {
        historialCompras.add(boleto);
    }
}
