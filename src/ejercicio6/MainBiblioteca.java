package ejercicio6;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            String menu = "1. Agregar libro\n" +
                    "2. Eliminar libro\n" +
                    "3. Buscar libro por título\n" +
                    "4. Buscar libro por autor\n" +
                    "5. Listar libros\n" +
                    "6. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "BIBLIOTECA CUE AVH", JOptionPane.PLAIN_MESSAGE));

            switch (opcion) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
                    String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
                    String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
                    int añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación:"));

                    Libro libro = new Libro(titulo, autor, ISBN, añoPublicacion);
                    biblioteca.agregarLibro(libro);
                    JOptionPane.showMessageDialog(null, "Libro agregado con éxito.");
                    break;

                case 2:
                    String isbnEliminar = JOptionPane.showInputDialog("Ingrese el ISBN del libro para eliminar:");
                    biblioteca.eliminarLibro(isbnEliminar);
                    JOptionPane.showMessageDialog(null, "Libro eliminado.");
                    break;

                case 3:
                    String tituloBuscar = JOptionPane.showInputDialog("Ingrese el título del libro para buscar:");
                    Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscar);
                    if (libroEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Libro encontrado: \n" + libroEncontrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un libro con ese título.");
                    }
                    break;

                case 4:
                    String autorBuscar = JOptionPane.showInputDialog("Ingrese el autor del libro para buscar:");
                    ArrayList<Libro> librosAutor = biblioteca.buscarLibroPorAutor(autorBuscar);
                    if (!librosAutor.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Libros encontrados:\n");
                        for (Libro libroAutor : librosAutor) {
                            sb.append(libroAutor).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron libros de ese autor.");
                    }
                    break;

                case 5:
                    StringBuilder sb = new StringBuilder("Lista de libros en la biblioteca:\n");
                    ArrayList<Libro> libros = biblioteca.getLibros();
                    if (!libros.isEmpty()) {
                        for (Libro libroLista : libros) {
                            sb.append(libroLista).append("\n");
                        }
                    } else {
                        sb.append("No hay libros en la biblioteca.");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo..........");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
}

