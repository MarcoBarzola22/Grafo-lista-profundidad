import java.util.ArrayList;
import java.util.List;

public class GrafoAdcia {
    private List<VerticeAdyacencia> tablaAdyacencia;

    public GrafoAdcia(int numVertices) {
        tablaAdyacencia = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            tablaAdyacencia.add(new VerticeAdyacencia()); // Inicializa con vértices vacíos
        }
    }

    public void nuevoVertice(String nombre) {
        tablaAdyacencia.add(new VerticeAdyacencia(nombre)); // Agrega un nuevo vértice al final
    }

    public void nuevoArco(String origen, String destino) {
        int vOrigen = numVertice(origen);
        int vDestino = numVertice(destino);
        if (vOrigen != -1 && vDestino != -1) {
            tablaAdyacencia.get(vOrigen).agregarAdyacente(vDestino); // Agrega el arco
        }
    }

    public int numVertice(String nombreVertice) {
        for (int i = 0; i < tablaAdyacencia.size(); i++) {
            if (tablaAdyacencia.get(i).getNombre() != null && tablaAdyacencia.get(i).getNombre().equals(nombreVertice)) {
                return i;
            }
        }
        return -1;
    }

    public List<VerticeAdyacencia> getTablaAdyacencia() {
        return tablaAdyacencia;
    }
}