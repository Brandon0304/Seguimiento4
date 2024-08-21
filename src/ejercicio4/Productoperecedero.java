package ejercicio4;

import java.time.LocalDate;

public class Productoperecedero extends Producto {
    private LocalDate fechaVencimiento;

    public Productoperecedero(String nombre, String descripcion, double precio, int stock, LocalDate fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de Vencimiento: " + fechaVencimiento;
    }
}

