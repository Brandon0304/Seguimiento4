package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Gestionarproductos {
    private List<Producto> inventario;

    public Gestionarproductos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        inventario.remove(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}

