package ejercicio6;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String ISBN) {
        libros.removeIf(libro -> libro.getISBN().equals(ISBN));
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> buscarLibroPorAutor(String autor) {
        ArrayList<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                librosAutor.add(libro);
            }
        }
        return librosAutor;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
