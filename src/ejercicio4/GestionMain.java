package ejercicio4;

import java.time.LocalDate;

public class GestionMain {
    public static void main(String[] args) {
        Gestionarproductos gestor = new Gestionarproductos();

        Producto prod1 = new Producto("Laptop", "Laptop HP victus", 3500000, 10);
        Productoperecedero prod2 = new Productoperecedero("Leche", "Leche entera", 3500, 50, LocalDate.of(2024, 8, 25));

        gestor.agregarProducto(prod1);
        gestor.agregarProducto(prod2);

        System.out.println("Inventario inicial:");
        gestor.mostrarInventario();

        Producto productoEncontrado = gestor.buscarProducto("Leche");
        if (productoEncontrado != null) {
            productoEncontrado.modificarStock(45);
            System.out.println("\nProducto modificado:");
            System.out.println(productoEncontrado);
        }

        gestor.eliminarProducto(prod1);

        System.out.println("\nInventario final:");
        gestor.mostrarInventario();
    }
}

