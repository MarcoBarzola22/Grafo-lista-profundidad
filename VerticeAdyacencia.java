import java.util.ArrayList;
import java.util.List;

public class VerticeAdyacencia {
    private String nombre;
    private List<Integer> adyacentes;

    public VerticeAdyacencia() {
        this.adyacentes = new ArrayList<>();
    }

    public VerticeAdyacencia(String nombre) {
        this.nombre = nombre;
        this.adyacentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getAdyacentes() {
        return adyacentes;
    }

    public void agregarAdyacente(int vertice) {
        adyacentes.add(vertice);
    }
}