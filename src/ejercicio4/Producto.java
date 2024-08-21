package ejercicio4;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void modificarStock(int cantidad) {
        this.stock = cantidad;
    }

    public void modificarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Descripción: " + descripcion + ", Precio: " + precio + ", Stock: " + stock;
    }
}

