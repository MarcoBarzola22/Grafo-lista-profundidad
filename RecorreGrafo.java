import java.util.List;

public class RecorreGrafo {
    public static final int CLAVE = -1;

    public static int[] recorrerProf(GrafoAdcia g, String org) throws Exception {
        int v, w;
        PilaLista pila = new PilaLista();
        int[] m = new int[g.getTablaAdyacencia().size()];

        // Inicializa los vértices como no marcados
        v = g.numVertice(org);
        if (v == -1) {
            throw new Exception("Vértice origen no existe");
        }
        for (int i = 0; i < g.getTablaAdyacencia().size(); i++) {
            m[i] = CLAVE;
        }
        m[v] = 0; // Vértice origen queda marcado
        pila.insertar(v);

        while (!pila.pilaVacia()) {
            Integer cw = pila.quitar();
            w = cw.intValue();
            System.out.println("Vértice " + g.getTablaAdyacencia().get(w).getNombre() + " visitado");

            // Inserta en la pila los adyacentes de w no marcados
            List<Integer> adyacentes = g.getTablaAdyacencia().get(w).getAdyacentes();
            for (Integer k : adyacentes) {
                if (m[k] == CLAVE) {
                    pila.insertar(k);
                    m[k] = 1; // Vértice queda marcado
                }
            }
        }
        return m;
    }
}