public class Main {

    public static void main(String[] args) {
        GrafoAdcia grafo = new GrafoAdcia(7); // Crear grafo con 7 vértices

        // Agregar vértices
        grafo.nuevoVertice("X");
        grafo.nuevoVertice("Y");
        grafo.nuevoVertice("Z");
        grafo.nuevoVertice("W");
        grafo.nuevoVertice("P");
        grafo.nuevoVertice("Q");
        grafo.nuevoVertice("S");

        // Agregar arcos
        grafo.nuevoArco("X", "Y");
        grafo.nuevoArco("X", "Z");
        grafo.nuevoArco("Y", "W");
        grafo.nuevoArco("Z", "P");
        grafo.nuevoArco("P", "Q");
        grafo.nuevoArco("Q", "S");
        grafo.nuevoArco("S", "X");

        try {
            System.out.println("Recorrido en Profundidad desde el vértice 'X':");
            int[] marcados = RecorreGrafo.recorrerProf(grafo, "X");
            for (int i = 0; i < marcados.length; i++) {
                if (marcados[i] != RecorreGrafo.CLAVE) {
                    System.out.println("Vértice " + grafo.getTablaAdyacencia().get(i).getNombre() + " marcado con " + marcados[i]);
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}