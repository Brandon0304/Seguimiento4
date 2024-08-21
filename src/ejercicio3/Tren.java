package ejercicio3;

import java.util.List;

public class Tren {
    private String numero;
    private String ruta;
    private List<Vagon> listaVagones;

    public Tren(String numero, String ruta, List<Vagon> listaVagones) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = listaVagones;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public List<Vagon> getListaVagones() {
        return listaVagones;
    }

    public void setListaVagones(List<Vagon> listaVagones) {
        this.listaVagones = listaVagones;
    }

    public Vagon getVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.getTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }
}

